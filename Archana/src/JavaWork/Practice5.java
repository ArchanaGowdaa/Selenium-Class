package JavaWork;

public class Practice5 
{
	public static void main(String[] args) 
	{
		int[] arr= {123,678,654,345,237,872};
		int sum=0;
		for(int number:arr)
		{
			int lastDigit= number%10;
			sum=sum+lastDigit;
		}
		System.out.println("Sum of last Digit:"+sum);
		
	}

}
