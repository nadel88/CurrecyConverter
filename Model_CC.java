package il.ac.hit.currency_converter;

import java.io.IOException;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
/**
 * A class that Creates new form Model_CC
 * class Model_CC establishes connection to a XML file 
 * from bank of israel site and stores data to private members of this class
 * @author Nadav
 */
public class Model_CC extends javax.swing.JFrame implements ImodelInterface{
	
	InputStream is = null;
    HttpURLConnection con = null;
    URL url;
    private NodeList RATES;
    private NodeList LastUpdate;
    private NodeList COUNTRY;
    private NodeList CURRENCYCODE;
    private int length;
    public String ConMsg = "connection";
    
   /**
    *  Return the Last Update "Date" to object LastUpdate of type String
    *  and parse it into string 
    * @return the Last Update Date of the current data to String type object
    */
   public String getLastUpdate(){
	   return LastUpdate.item(0).getTextContent();
   }
   
   /**
    * Return currency rates from the XML file from bank of israel file 
    * into RATES variable of type NodeList 
    * @return  NodeList type RATES 
    */
    
    public NodeList getRATES() {
		return RATES;
	}
    
    public NodeList getCOUTRY() {
		return COUNTRY;
	}
    
    public NodeList getCURRENCYCODE() {
		return CURRENCYCODE;
	}
    
   
    /**
     * Returns the value of a double type object from index i location in RATES list of type NodeList
     * this method declaration is found in ImodInterface 
     * @return double type object into value 
     * @see ImodInterface.java
     */
    public double getRateValue(int i){
    	String str = RATES.item(i).getFirstChild().getNodeValue();
    	double value = Double.parseDouble(str);
    	return value;
    }
    
	
	public Model_CC() {
		/**
		 * Sole constructor. (For invocation new object of type Model_CC)
		 *
		 */
    	 try
         {
             url = new URL("http://www.boi.org.il/currency.xml");
             con = (HttpURLConnection)url.openConnection();
             con.setRequestMethod("GET");
             con.connect();
             is = con.getInputStream();
             DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
             DocumentBuilder builder = factory.newDocumentBuilder();
             Document doc = builder.parse(is);
             RATES = doc.getElementsByTagName("RATE");
             COUNTRY = doc.getElementsByTagName("COUNTRY");
             CURRENCYCODE = doc.getElementsByTagName("CURRENCYCODE");
             LastUpdate = doc.getElementsByTagName("LAST_UPDATE");
             
             length = RATES.getLength();
         }
    	 
         catch(IOException e)
         {
           e.printStackTrace();
           JOptionPane.showMessageDialog(this, "could not connect to URL");
         }
         catch(ParserConfigurationException e)
         {
             e.printStackTrace();
        	
         }
         catch(SAXException e)
         {
             e.printStackTrace();
        	 
         }
    	 finally
         {
           if(is!=null)
           {
               try
               {
                   is.close();
               }
               catch(IOException e)
               {
                   e.printStackTrace();
                  
               }
           }
           if(con!=null)
           {
               con.disconnect();
           }
         }
	}
    
	
	
	public int getLength() {
		return length;
	}

	public String getCOUNTRY(int i) {
		 String str = COUNTRY.item(i).getFirstChild().getNodeValue();
		 return str;
	}

	public String getCURRENCYCODE(int i) {
		String str = CURRENCYCODE.item(i).getFirstChild().getNodeValue();
		return str;
	}

	@Override
	/**
	 * this method overrides a method declared in ImodInterface 
	 * @see ImodInterface.java 
	 */
	public double convertToNIS(double fc, double amount) {
	
		// TODO Auto-generated method stub
		return fc*amount;
	}
	/**
	 * This method is a utility method to convert Double to String
	 * This method Returns String object converted from Double object total
	 * @param total
	 * @return String type object converted from Double type object 
	 */
	public String toString(double total){
		return Double.toString(total);
	}
	
	
}
