//write a program to perform addition operator for two numbers for exactly 3 times using scanner class by using while loop
import java.util.Scanner;
class Main3
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int i =1;                     //initalization
		while(i<=3)                   //condition
		{
		System.out.println("Enter first number");
		int a =sc.nextInt();
		System.out.println("Enter second number");
		int b =sc.nextInt();
		int res=a+b;
		System.out.println("Res:"+ res);
			i++;                      //updation
		}
	}
}
