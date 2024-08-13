import java.util.Scanner;
class Main4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter staring number");
		int a =sc.nextInt();
	    System.out.println("Enter ending number");
		int b =sc.nextInt();
		if (a<b)
		{
			//int i = a;
			while (a<=b)
			{
			System.out.println(a);
			
			a++;
			}
		}
		if(a>b){
			int i =a;
			while (i>=b)
			{
			System.out.println(i);
			
		i--;
	  }
	}
 }
}
