import java.util.Scanner;
import java.util.*;
class One
{
	static int a,b,c;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i=0;
		System.out.print("You have only three Attempt\n ");
		while(i!=3)
			{
						System.out.print("Enter value of a ");
						a=sc.nextInt();
						System.out.print("Enter value of b ");
						b=sc.nextInt();
				try
				{
						
						
						c=a/b;
						System.out.println("the vaklue of c is " +c);
						break;
				}
		
			catch(ArithmeticException e)
			{
				System.out.println(e);
				i++;
				System.out.println("Attempt  "+(3-i) );
			}
			// catch(InputMismatchException e)
			// {
			// 	System.out.println("Not a number");
			// 	i++;
			// }
			
		}
		System.out.println("I am out");
	}
}