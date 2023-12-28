package JavaWork;

import java.io.File;
import java.io.IOException;

public class Fibonanci 
{
	public static void main(String[] args) throws IOException
	{
		File file=new File("ArchanaFile.txt");
		if(!file.exists())
		{
			System.out.println("File is created");
			file.createNewFile();
		}
		else
		{
			System.out.println("file is already created");
		}
		int a=1;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=10;i++)
		{
			c=a+b;
			System.out.println(c);
		}
		a=b;
		
		
		
		
		
	}

}
