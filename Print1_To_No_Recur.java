// Print 1 to N Without loop recursion //

import java.util.*;
class Print1_To_No_Recur
{
	public static void PrintNos(int N)
	{
		if(N==0)
		{
			return ;
		}
		PrintNos(N-1);
		System.out.print(N+" ");
	}
	public static void main(String args[])
	{
		int N=10;

		PrintNos(N);
	}
}
