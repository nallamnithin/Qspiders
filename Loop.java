import java.util.Scanner;
class Loop 
{
	public static void main(String[] args) 
	{
		for (int i =1;i<=2;i++)
		{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int a =sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		int res = a*b;
		System.out.println(res);
	}
  }
}
