//Loop -->A loop is used for executing of statements repeatedly until a particular condition is satisfied.
//     -->A loop consists of an initialization statement,a test condition and an increment statement.
//
// Types of Loop -->1.While Loop 
//               -->2.Do-while Loop
//               -->3.for Loop
 
class Loop
{
	public static void main(String args[])
	{
		for(int i=0;i<=5;i++)          
		{
			System.out.println(i);                                    //For loop
		}
		System.out.println("---------------------");
		
		int j=0;                                			//While loop
		while(j<=5)
		{
			System.out.println(j);
		}
		System.out.println("------------------------");               //Do-While Loop
		
		int i=0;
		do
		{
			System.out.print(i);
			i++;
		}
		while(i<=5);

		
	}
}
