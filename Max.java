import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is a max");
            } else {
                System.out.println(c + " is a max");
            }

        } else if (b > c) {
            System.out.println(b + " is a max");
        } else {
            System.out.println(c + " is a max");
        }
    }
}
