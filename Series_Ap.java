/*Series_Ap
/A1=1
A2=2
N=10
Output:
10
Explanation:
The series is1,2,3,4,5,6,7,8,9,10,11..
Thus,10th term is 10.
*/

import java.io.*;
class Series_Ap
{
	public static void main(String args[])
	{
		int a,b=0;
	        int N=4;
		int A1=2;
		int A2=3;
		
		a = A2-A1;
		b = A1+(N-1)*a;

		System.out.println(b);

	}
}
