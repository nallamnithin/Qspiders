import java.util.Scanner;

class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println(num + " is divisable by both 3 and 5");
		} else if (num % 3 == 0) {
			System.out.println(num + "is divisable by 3");
		} else if (num % 5 == 0) {
			System.out.println(num + "is divisable by 5");
		} else {
			System.out.println(num + " is not divisable by both 3 and 5");
		}
	}
}
