//Given a sorted array Arr of size N and a value X, find the number of array elements less than or equal to X and elements more than or equal to X. 
/*N = 7, X = 0
Arr[] = {1, 2, 8, 10, 11, 12, 19}
Output: 0 7
Explanation: There are no elements less or
equal to 0 and 7 elements greater or equal
to 0. */

class Smaller_Larger
{
	public static void main(String args[])
	{
		int arr[] = {1, 2, 8, 10, 11, 12, 19};
		int X = 5;
		int N = 7;
		int get[] = {0,0};
		for(int i=0;i<arr.length;i++)
		{
			if(X<=arr[i])
			{
				get[1]++;
			}
			if(X>=arr[i])
			{
				get[0]++;
			}
		}
		System.out.println(get[0]+" "+get[1]);
	}
}
