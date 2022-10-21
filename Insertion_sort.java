import java.util.*;

class Insertion_sort
{
	public static void PrintArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	System.out.println();
    }
	public static void main(String args[])
	{
		int arr[] = {7,8,3,2,1};
		
		//insertion sort
		for(int i=0;i<arr.length; i++)
		{
			int current = arr[i];       //current elemets
			int j = i-1;                // sorted part of of last index

			while(j >=0 && current < arr[j])  //j>=0 loop madhe firnar jo part 0 det nahi to part / cuurent peksha chota aahe to part firnar..
			{
				arr[j+1] = arr[j];    // 1,3,7,8 | 2
				j--;		      // jo part place hot nahi part 
			}			       // 1,2,3,7,8
			//place
			arr[j+1] = current;            // condition unsatisfind zali ki print
		}
	PrintArray(arr);

	}
}

