import java.util.Scanner;
public class Looping {

	public static void main(String[] args) {
		
		// WHILE Loop
		//---------------------------------------------
		System.out.println("-----WHILE Loop-----");
		  int Value = 0;
		  while (Value <3)
		{
			System.out.println("Value : " + Value);
			Value++;
		}
		
		//FOR Loop
		//-------------------------------------------------
		System.out.println("-----FOR Loop-----");
		  int noOfRow;
		Scanner row = new Scanner(System.in);
		System.out.print("Enter the Row of pyramid:");
		noOfRow= row.nextInt();
		
		for (int i=1;i<=noOfRow;i++)
		{ 
			for(int j=1; j<=i;j++)
			{
			System.out.print("*");
			}
			System.out.print("\n");
		}
		
		//DO-WHILE Loop
		//---------------------------------------------------
		System.out.println("-----DO-WHILE Loop-----");
		Scanner num = new Scanner(System.in);
		int Number;
		do
		{
			System.out.print("Enter the Number:");
			 Number= num.nextInt();
		}
		while(Number !=5);
			{
				System.out.print("Yeahh.... Got 5 !");
			}
	}

}
