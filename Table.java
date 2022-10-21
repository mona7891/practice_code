// print the table of a number input by the user //
import java.util.*;
class Table 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();                   
		
		System.out.println("Table are "+n);
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*n);
		}
	}
}

