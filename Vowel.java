// Write a program to count vowels in a string.//

import java.util.*;
class Vowel
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENter String :");
		
		int i,vol =0,con=0;
		String s = sc.nextLine(); 		
		s = s.toUpperCase();                    

		for(i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);

			if(ch!=' ')                   
			{
			     if(ch =='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U')
			     {
				     vol ++;
			     }
			     else
			     {
				     con ++;
			     }
			}
		}
		System.out.println("Total Vowels =" + vol + "Total Consonants = "+ con);

	}	
}
