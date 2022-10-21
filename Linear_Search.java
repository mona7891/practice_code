//Write a program to find an element using linear search.


import java.util.*;
class Linear_Search
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6};
		int search = 2;                 
		
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==search)
				{
					System.out.print("Element Is Present AT '"+i+"th' Index Position");
				}
			}	System.out.println();

	}
}
