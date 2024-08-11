import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check is it prime :");
        int number = sc.nextInt();
        if (isprime(number)) {
            System.out.println(number + ": It is a prime number");
        } else {
            System.out.println(number + ": It ia not a prime number");
        }
        sc.close();
    }

    public static boolean isprime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}