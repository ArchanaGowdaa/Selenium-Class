package JavaWork;

public class PracticePrime
{
	public static boolean isPrimeNo(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
	return true;
	}
	public static void getPrimeNumbers(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(isPrimeNo(i))
			{
						System.out.println(i);
			}
		}
		
	}
	public static void main(String[] args)
	{
		
		getPrimeNumbers(20);
	}
}
