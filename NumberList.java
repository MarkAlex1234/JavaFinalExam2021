/**
*
* QUESTION 5
*
* Mark Alexander
*
* 20112145
*
* COMP503
*
* */


public class NumberList
{

	static public double average(int[] numbers)
	{
		double avg=0.0;

		if(numbers.length <= 0) {
			return -1.0;
		}
		
		else {
			for(int i=0;i<numbers.length;i++) {
				avg = numbers[i] + avg;
			}
			avg = avg/numbers.length;		
			return avg;
		}
	}

	static public int max(int[] numbers)
	{
		if(numbers.length <= 0) {
			return -1;
		}
		else {
			int maxNum=0;
			
			for(int i=0; i<numbers.length;i++) {
				for(int j=i+1; j<numbers.length; j++) {
					if(numbers[i] > numbers[j]) {
					maxNum = numbers[i];
				}
			}
		}
			return maxNum;
	}
			
}

	static public int[] reverse(int[] numbers)
	{
		if(numbers.length <= 0) {
			return null;
		}
		else {
			for(int i = 0; i < numbers.length / 2; i++)
			{
			    int temp = numbers[i];
			    numbers[i] = numbers[numbers.length-i-1];
			    numbers[numbers.length-i-1] = temp;
			}
			return numbers;
		}
	}

	static public int[] pad(int[] numbers,int p)
	{
		if(numbers.length < 2) {
			return null;
		}
		else {
			int[] array = new int[numbers.length*(p+1)];
			
			for(int insert=0;insert<array.length;insert++) {
				array[insert] = 0;
				}
			
			int i=1;
			int index = 1;
			array[0] = numbers[0];
			while(i<numbers.length) {
				array[index+p] = numbers[i];
				index=index+p+1;
				i++;
			}
			return array;
		}
	}

	static public int frequency(int[] numbers, int n)
	{
		int count = 0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i] == n) {
				count++;
			}
		}
		return count;
	}

	static public String output(int[] array)

	{

		if(array == null)
		{
			return "";
		}
		
		
		if(array.length==0)
		{
			return "[]";
		}

		String out = "";
		
		for(int i=0;i<array.length;i++)
		{
			out+=array[i]+",";
		}

		out = out.substring(0,out.length()-1);

		return "["+out+"]";
	}

	public static void main(String[] args)
	{

		int[] input = new int[] {2,5,1};

		System.out.println(average(input));

		System.out.println(max(input));

		System.out.println(max(new int[]{}));

		System.out.println(output(reverse(input)));

		System.out.println(output(pad(input,3)));

		System.out.println(output(pad(input,5)));

		System.out.println(frequency(new int[]{2,2,4,5,5,2},2));

		System.out.println(frequency(new int[]{2,2,4,5,5,2},5));

	}

}
