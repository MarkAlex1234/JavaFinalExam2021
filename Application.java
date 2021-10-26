
/**
*
* QUESTION 6
*
* Mark Alexander
*
* 20112145
*
* COMP503
*
* */


import java.util.Scanner;

public class Application
{
	private final static Integer MAX_VALUE = 3;
	static double[] array = new double[MAX_VALUE];
	private static double input = -1;
	private static int index;


	/**
	 *
	 * Useful method for producing array content output.
	 *
	 * **/
	private static String output(double[] array)
	{
		String out="";
		for(int i = 0;i<array.length;i++)
		{
			out+= array[i]+" ";
		}
		return out;
	}

	public static void compute() {
		Scanner scan = new Scanner(System.in);
		
		try{
			while(input != 0 || input > MAX_VALUE) {
			input = scan.nextDouble();
				if(input == 0) {
					break;
			}
				else {
					array[index] = input;
					System.out.println("Array: " + output(array));
					index++;
					if(index>=MAX_VALUE) {
						index = 0;}
				}
			}
			}catch(Exception e) { //Checks for input mismatch occurrences 
			scan.next();
			System.out.println("Array: " + output(array));
			compute();
		}
}
	/**
	 *
	 * Complete the main method. 
	 *
	 * */
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter 3 Double Values: ");
		Scanner scan = new Scanner(System.in);
		try {
			compute();
			}catch(Exception e) { //Checks at start if input mismatch occurs 
			scan.next();
			compute();
		}
	
	}
}
