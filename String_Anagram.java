// write a program to check if two strings are anagram of each other. //
// s1 => abac
// s2 => aabc
// sort String s1 => aabc
//             s2 => aabc
//  is String are equal s1 = s2 than its Anagrams
// Arc = Car   is Anagram 
//
import java.util.*;
class String_Anagram
{
	public static boolean isAnagram(String s1 , String s2)
	{
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		if(Arrays.toString(c1).equals(Arrays.toString(c2)))
			return true;
		return false;

	}

	public static void main(String args[])
	{
		String s1 = "arc";
		String s2 = "car";

		boolean checkAnagram = isAnagram(s1,s2);

		if(checkAnagram)
			System.out.println("Both String are Anagram");
		else
			System.out.println("Both String are Not Anagram");

	}

}
