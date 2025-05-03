package OOPs;

public class Fd {

	public static void main(String[] args) {
		
		double principalAmount = 10000.0;
		
		int year = 3;
		
	    double RateofIntrest = 7.2/10000;
	    
	    double amount = principalAmount*(1+year*RateofIntrest); 

	    System.out.println("Total amount recieved by customer after maturity : "+amount);
	}

}
