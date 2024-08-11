//Relational Operators:
import java.util.Scanner;
class Arithetic_Operators{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the First Number");
int num1 = sc.nextInt();

System.out.println("Enter Second Number");
int num2 = sc.nextInt();

int sum = num1 + num2;
int difference = num1 - num2;
int product = num1 * num2;
int quotient = num1 / num2;
int modulus = num1 % num2;

System.out.println("The Sum of the Two Numbers is:"+sum);
System.out.println("The difference of the Two Numbers is:"+difference);
System.out.println("The product of the Two Numbers is:"+product);
System.out.println("The quotient of the Two Numbers is:"+quotient);
System.out.println("The modulus of the Two Numbers is:"+modulus);
}
}