package JavaWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkingOnFileHandling 
{
	public static void main(String[] args) throws IOException
	//if we don't have file it throws exception..
	//to postpone file handling task....
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
		FileOutputStream fos=new FileOutputStream(file);//its using to write the data in the file
		String s1="I'am an automation test engineer";
		//System.out.println(s1.getBytes());
		fos.write(s1.getBytes());//we are using getBytes write() accepts byte[]
		
		FileInputStream fis=new FileInputStream(file);//its used read the data from the file means
		//fetching the data from the file...
		
		int i=fis.read();////this read() returns ascii value of a character
		//read() will fetch byte[] and converted into integer...
		//here we have stored the string in byte formate and here we converted into int
		//it will return integer we have to convert into character
		//here we need to perform narowing
		while(i!=-1)//after reading string there is no words so its returns -1
		{
			System.out.print((char)i);
			i=fis.read();
		}	
		
	}

}
