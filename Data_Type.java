/*
 *The first line contains an integer that you must sum with .
 *The second line contains a double that you must sum with .
 *The third line contains a string that you must concatenate with .
 */
import java.util.*;
import java.util.Scanner;
class Data_Type
{
	public static void main(String argc[])
	{
		int i = 4;
		double d = 4.0;
		String s = "Sakshi";

		Scanner scan = new Scanner(System.in);  //input

		int a = scan.nextInt();                // for int
		double b = scan.nextDouble();          // for double
			scan.nextLine();
		String c = scan.nextLine();            // for String 
		
	System.out.println(i+a);
	System.out.println(d+b);
	System.out.println(s+ " "+c);	              //concatinate
	
	}
}
