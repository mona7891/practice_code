//Party_of_Couples-->
/*N = 11
arr = {1, 2, 3, 5, 3, 2, 1, 4, 5, 6, 6}
Output: 4
Explaination: 4 is the only single.*/

class Party_of_Couples
{
	public static void main(String args[])
	{
		int arr[] = {1, 2, 3, 5, 3, 2, 1, 4, 5, 6, 6};
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(arr[i]);
			}
		}
		
	}
}
