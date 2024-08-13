//write a program to print the numbers from the Specfied starting number to specified ending number.
import java.util.Scanner;
class Alian 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting number");
		int a = sc.nextInt();
		System.out.println("Enter ending number");
		int b = sc.nextInt();
		if(a<b){
			for (int i=a;i<=b ;i++)
			{
				System.out.println(i);
			}
		}
		if (a>b)
		{
		
			for (int i=a;i>=b;i--)
			{
				System.out.println(i);
			}
		}
	}
		
}
