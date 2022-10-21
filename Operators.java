/* Example
 meal cost = 100
 tip percent = 15
 tax percent = 8

*A tip of 15% * 100 = 15, 
*and the taxes are 8% * 100 = 8. 
*Print the value  123 and return from the function

-> The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent

*/

import java.util.*;
import java.io.*;
import java.math.*;

class Result
{	
	public static void solve(double meal_cost,int tip_per,int tax_per)
	{
		//meal cost is given so we find tip OR tax
		long total = 0;
	       double tip,tax;
       	
		tip = (tip_per*meal_cost)/100;
 		tax = (tax_per*meal_cost)/100;
		
		total = Math.round(tip+tax+meal_cost);

		System.out.println(total);		

	}
}
class  Operators
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

		int tip_per = Integer.parseInt(bufferedReader.readLine().trim());

		int tax_per = Integer.parseInt(bufferedReader.readLine().trim());

		Result.solve(meal_cost,tip_per,tax_per);

		bufferedReader.close();
	}

}
