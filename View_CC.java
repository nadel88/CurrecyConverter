/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package il.ac.hit.currency_converter;

import javax.swing.JOptionPane;

/**
 *
 * @author Nadav
 */
public class View_CC extends javax.swing.JFrame {
	
	private Model_CC mcc;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Sole constructor. (For invocation new object of type View_CC)
	 *
	 */
    public View_CC() {
    	setTitle("Currency Converter");
    	mcc = new Model_CC();
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * this method creates the view itself (components,layouts,panels...)
     * 
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        totalNIS = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        currAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] strings = { "USA-USD", "Great Britain-GBP", "JAPAN-JPY", "EMU-EUR", "Australia-AUD", "Canada-CAD", "Denmark-DKK", "Norway-NOK", "South Africa-ZAR", "Sweden-SEK", "Switzerland-CHF", "Jordan-JOD", "Lebanon-LBP", "Egypt-EGP", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
       // Model_CC model = new Model_CC();

        jLabel1.setText("Amount");

        jLabel2.setText("total in NIS");
        
        //table creation
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object [mcc.getLength()][3]
        , new String[]{ "COUNTRY", "CURRECYCODE", "RATE"}));
         
         
        for(int i = 0 ; i<mcc.getLength() ;i++)
        {
        	jTable1.setValueAt(mcc.getCOUNTRY(i), i, 0);
        	jTable1.setValueAt(mcc.getCURRENCYCODE(i), i, 1);
        	jTable1.setValueAt(mcc.getRateValue(i), i, 2);
        
        }
        	
        	
        	
        	
            jScrollPane2.setViewportView(jTable1);

            jLabel3.setText("Currencies Table");

            jLabel4.setText("these rates last update : ");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(currAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totalNIS, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane2))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(currAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(totalNIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18))
            );

            jLabel4.getAccessibleContext().setAccessibleName("");
            //get the latest update from bank of israel
            jLabel5.setText(mcc.getLastUpdate());

            pack();
        }
                        
    
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {    
        // TODO add your handling code here:
    	
    	if(!mcc.ConMsg.contains("connection")){
    		try {
				throw new MyCustomException("could not connect to URL");
			} catch (MyCustomException mce) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, mce.getMessage());
	            currAmount.requestFocus();   
			}
    	}
    		
        String currAmountText = currAmount.getText();
        
        //check for empty string
        try{
     	   if(currAmountText.isEmpty())
     		   throw new MyCustomException("not valid input plese enter number format input");
        }
        catch(MyCustomException mce){
     	   
     	   JOptionPane.showMessageDialog(this, mce.getMessage());
            currAmount.requestFocus();   
       
        }
        
         // Check for numbers only
       for(int i=0;i < currAmountText.length();i++)
       {
           if(!Character.isDigit(currAmountText.charAt(i)))
           {
        	   try{
        		   throw new MyCustomException("not valid input plese enter number format input");
        	   }
        	   catch(MyCustomException mce){
               JOptionPane.showMessageDialog(this, mce.getMessage());
               currAmount.requestFocus();
               
               return;
        	   }
           }
       }
       
       //get amount and convert according to selection
       if(!currAmountText.isEmpty()){
    	   
      // Model_CC mcc = new Model_CC();
       double amount = Double.parseDouble(currAmountText);
       double total = 0;
       int selected = 0;
       String totalStr;
       selected = jList1.getSelectedIndex();
       total = mcc.convertToNIS(mcc.getRateValue(selected), amount);
       totalStr =  mcc.toString(total);
       totalNIS.setText(totalStr);
       
       }
        
    }                                      

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View_CC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_CC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_CC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_CC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
        	/**
        	 * run method Creates and display the form 
        	 */
            public void run() {
                new View_CC().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JTextField currAmount;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    @SuppressWarnings("rawtypes")
	private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField totalNIS;
    // End of variables declaration                               
}
