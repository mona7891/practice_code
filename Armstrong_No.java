// Armstrong No --> 1 = 1^1  IS ARMSTONG
// 		  123 = 1^3 + 2^3 + 3^3
// 		      =  1*1*1 + 2*2*2 + 3*3*3 
//                    = 1 + 8 + 27
//		      = 36 NOT ARMSTRONG
//		  153 = 1^3 + 5^3 + 3^3
//		     = 1*1*1 + 5*5*5 + 3*3*3
//		     = 1  + 125 + 27
//		 153 = 153  IS ARMSTONG


import java.util.*;
class Armstrong_No
{
	public static void main(String args[])
	{
		int no = 153;     
		int t = no;
		//Find the length 123 = length = 3
		
		int length = 0;

		while(t!= 0)
		{
			length = length+1;

			t = t/10;
		}
		int t1 = no;
		int arm = 0;                       //Reverser logic
		int rem ;
		
		while(t1!=0)
		{
			int mul=1;                //1*1*1 = 
			 rem = t1%10;

			for(int i=1;i<=length;i++)
			{
				mul = mul*rem;   
			}
			arm = arm+mul;            //result
			t1 = t1/10;               //check next no 
		}
		if(arm==no)
		{
			System.out.println( no + " IS ARMSTRONG ");
		}
		else
		{
			System.out.println( no + " IS NOT ARMSTRONG ");
		}

	}
}
