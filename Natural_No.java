// Print the Sum of First N Natural Numbers //

import java.util.*;
class Natural_No
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum =0;

		for(int i=1;i<=n;i++)
		{
			sum = sum +i;
		}
		System.out.println(sum);

	}
}
