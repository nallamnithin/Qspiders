import java.util.Scanner;
class Switching 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char num = sc.nextLine().charAt(0);
		switch(num){
			case 'A','E','I','O','U','a','e','i','o','u' :
				System.out.println(num  + " : is a vowel");
			break;
			default :
				System.out.println(num  + " :is not a vowel");
		}
		
	}
}
