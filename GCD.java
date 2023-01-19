import java.io.*;

class GCD
{
	public static void main(String args[])
	{
		int A = 3;
		int B = 6;

		while(B!=0)
		{
			int rem = A%B;
			A=B;
			B=rem;
		}
		System.out.println(A);
	}
}
