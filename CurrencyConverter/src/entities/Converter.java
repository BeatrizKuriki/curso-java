package entities;

public class Converter {
	public static double dollar;
	public static double taxIOF = 0.06;
	public static double quantity;
	public static double result;
	
	
	public static double amountPaid() {
		result = dollar * quantity ;
		return result +(result*0.06);
	}
	

}
