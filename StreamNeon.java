
/**
 *
 * QUESTION 2
 *
 * Mark Alexander
 *
 * 20112145
 *
 * COMP503
 *
 * */


public class StreamNeon {

	private String emailAddress;
	private int numOfMonths;
	private double amountOfMoneyOwed;

	public StreamNeon(String email){
		
		this.emailAddress = email;
		this.numOfMonths = 24;
		this.amountOfMoneyOwed = 4.99;
		
	   }

	public double computeCustomerPay(){
		double total=this.numOfMonths*this.amountOfMoneyOwed;
		return total;
	   }

}
