/* 0-1 Triangle 
 // Even =1
 // 0dd = 0
 
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1  
 
 */

import java.util.*;
class Zero_To_Triangle
{
	public static void main(String args[])
	{
		int n = 5;
 
       		for(int i=1; i<=n; i++) 
       		{
           	   for(int j=1; j<=i; j++) 
	   	   {
               		if((i+j) % 2 == 0) 
	       		{
                  	 	System.out.print(1+" ");
               		} 
			else 
	       		{
                   		System.out.print(0+" ");
               		}
           	   }
           	    System.out.println();
       	      	}
   	}
}

