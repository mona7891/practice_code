import java.util.*;
class Binary_Search
{
	public static void main(String args[])
	{
		int arr[] = {2,3,4,5,6,7,77,88,99};

		int search = 99;
		int li=0;
		int hi=arr.length-1;
		int mi=(li+hi)/2;
	    
	while(li<=hi)
	{
		if(arr[mi]==search)
		{
			System.out.print("Element Present At '" +mi+ "th' Index Position");
			break;
		}
		else if(arr[mi]<search)
		{
			li = mi+1;
		}
		else
		{
			hi = mi-1;
		}
		mi=(li+hi)/2;
 	}
	if(li>hi)
	{	
	      System.out.println("Element NOT Found ");
	}
	System.out.println();
   }
}
