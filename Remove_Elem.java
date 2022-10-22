// Remove Duplicate Elements from Array //

import java.util.*;
class Remove_Elem
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,4,5,5,6,7,8,8,8,8,};
		
		int j=0;  //count the unic elem

		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])   //1! = 1 = go next
			{
				arr[j++]= arr[i];   //1,2,3
			}
		}
		arr[j++] = arr[arr.length-1];

		for(int k=0;k<j;k++)
		{
			System.out.print(arr[k]+ " ");
		}
		System.out.println();
	}
}
