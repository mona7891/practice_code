//Write a program to count frequency of each character in a string.//

import java.util.*;
class Frequency_Cha
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Sentence :");

		String s = sc.nextLine();    //user sentence
		s = s.toLowerCase();        //lower case convert
		
		System.out.println("Character / Frequency");

		for(char ch='a'; ch<='z'; ch++)                   //loop a to z
		{
			int count =0;                          //COUNT
			for(int i=0; i<s.length(); i++)          //string traverse 
			{
				if(ch==s.charAt(i))    //string 
				count++;
			}
			System.out.println(ch + "\t" + count);
		}
	}
}
