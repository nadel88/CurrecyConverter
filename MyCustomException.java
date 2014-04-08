package il.ac.hit.currency_converter;

public class MyCustomException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyCustomException(){
		
	}
	
	public MyCustomException(String Msg){
		
		super(Msg);
	}

}
