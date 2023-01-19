import java.util.*;
class String_rev
{
	public static void main(String args[])
	{
		String str = "Sakshi";
		String newstr = "";
		char ch;

		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);

			newstr = ch + newstr;
		}
		System.out.println("Rev String "+ newstr);
	}
}
