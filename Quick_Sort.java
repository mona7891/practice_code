import java.util.*;
class Quick_Sort
{
	public static void quickSort(int arr[],int low,int high)
	{
		if(low < high)
		{
			int pidx = partition(arr,low,high);

			quickSort(arr,low,pidx-1);            //pivot index
			quickSort(arr,pidx+1,high);

		}
	}
	public static int  partition(int arr[],int low,int high)     //partition idx = statc int 
	{
		int pivot = arr[high];      //arr last element

		int i = low-1;

		for(int j=low; j<high; j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				//swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}
		}
		i++;
		//pivot index 
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		return i;

	}
	public static void main(String args[])
	{
		int arr[] = {6,3,9,5,2,8};

		quickSort(arr,0,arr.length-1);                    //arr,low,how        
	
	        for(int i=0; i<arr.length; i++) 
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}
