//****
//*  *
//*  *
//****

class HS_pattern
{
	public static void main(String args[])
	{
		int n = 5;
		int m = 4;

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==m-1 || j==0 || j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
