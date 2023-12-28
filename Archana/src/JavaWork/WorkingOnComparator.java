package JavaWork;

public class WorkingOnComparator 
//implements Comparable<String>
{
	//to compare two things we need compareTo(),compareTo() is present in comparable interface,if u want to use the method u should implements 
	//interface(comparable)-usuaully use it in collection framework...
	static String s1="Archana";//since its written main method,u have to make its as a static//i need to call it in class..
	public static void main(String[] args)
	
		//comparator is used to swap the value and positions(two values for 
		//comparable (we need to give one value and its will take second value defaultly and it will compare)
		
		{
			
			System.out.println(s1.compareTo("Archana"));
			
		}
		


	//@Override
	//public int compareTo(String o) {
		//if(this.s1.equals(o))
		//return 0;
		//else
		//return 1;
	}


