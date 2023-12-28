package JavaWork;

public class FibonnaciSeries 
{
	public static void main(String[] args) 
	{
		//fibonnaci is sum of 2 numbers 1,1,2,3,5,8
		int n=7;
		int f=1,s=1,t;
		System.out.print(f+" ");
		System.out.print(s+" ");
		for(int i=3;i<=n;i++)
		{
			t=f+s;
			System.out.print(t+" ");
			f=s;
			s=t;
		}
		
	}

}
