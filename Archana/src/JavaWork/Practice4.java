package JavaWork;

import java.util.Scanner;

public class Practice4 
{
	public static void main(String[] args) 
	{
//		String s="l";
//		int M=2000;
//		String c="Blue";
//		if(s.equals("l") && M>=2000 && c.equals("Blue"))
//		{
//			System.out.println("You can buy the T-shirt");
//			
//		}
//		else
//		{
//			System.out.println("You can't buy the T-shirt");
//			
//		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		String size=sc.nextLine();
		System.out.println("Enter the Money");
		int money=sc.nextInt();
		System.out.println("Enter the color");
		String color=sc.next();
		if(size.equals("l") && money>=2000 && color.equals("Blue"))
			{
				System.out.println("You can buy the T-shirt");
				
			}
			else
			{
				System.out.println("You can't buy the T-shirt");
				
			}
	}
		
}
