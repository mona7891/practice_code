//write a program to reverse a number. (input: 100 should also work).
//    100=001

import java.util.*;
class Reverse_no
{
	public static void main(String args[])
	{
		int n = 100,r;

		while(n>0)        
		{
			r=n%10;     
			System.out.print(r);

			n=n/10;
		}
	}
}
