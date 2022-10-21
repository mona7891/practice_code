import java.util.*;
class Linear_Search_String
{
	public static void main(String args[])
	{
		String arr[] = {"Sakshi","Yash","Akshay","Rohit"};

		String search = "Rohit";
		int temp =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(search))        //for search String
			{
				System.out.print("Item Present in At " +i+"th' Index Position ");
				temp = temp+1;
			}
		}
		if(temp==0)
		{
			System.out.print("Item NOT Present in Array");
		}
		System.out.println();
	}
}
