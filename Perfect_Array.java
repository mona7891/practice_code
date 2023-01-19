//Perfect_Array --{1,2,3,2,1}
/*Here we can see we have [1, 2, 3, 2, 1] 
if we reverse it we can find [1, 2, 3, 2, 1]
which is the same as before.
So, the answer is PERFECT.*/

import java.io.*;
class Perfect_Array
{
	public static void main(String args[])
	{
		int arr[] = {4,2,3,2,1};
		int n = 0;

		int start = 0;
		int end = n-1;

		while(start<=end)
		{
			if(arr[start]!=arr[end])
			{
				System.out.println("false");
				break;
			}
				start++;
				end--;
			
		}
		 System.out.println("True");
	}
};

