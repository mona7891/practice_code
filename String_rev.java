import java.util.*;
class String_rev
{
	public static void main(String args[]) throws Exception 
	{
		String str = "Sakshi";
		String newstr="";
		char ch;
		
		for(int i=0;i<str.length();i++)
		{
			try{
			ch = str.charAt(i);
			 newstr = ch + newstr;
			}catch(StringIndexOutOfBoundsException e)
			{	
			
				System.out.println("Reverse String :"+ newstr);
			}
		}
	}
}

