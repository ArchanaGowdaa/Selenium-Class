package JavaWork;

public class StrongNumber 
{
	public static void main(String[] args) 
	{
		//find the factorial of each digit and if u add it, u should get the same number...
		int num=145;
		int sum=0;
		int temp=num;
		while(temp>0)
		{
			int rem=temp%10;
			int fact=1;
			while(rem>0) 
			{
				fact=fact*rem--;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if (num==sum) 
		{
			System.out.println("Strong number");
		}
		else 
		{
			System.out.println("Not a strong number");
		}
		}
	}