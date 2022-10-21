import java.util.*;
import java.io.*;
class  Switch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		
		switch(button)
		{

			case 1:
				System.out.println("Hello");
				break;
			case 2: 
				System.out.println("Nasmaste");
				break;
			case 3: 
				System.out.println("Bonjour");
				break;
			case 4:
				System.out.println("INVALID BUTTON");
		

		}
	}
}

