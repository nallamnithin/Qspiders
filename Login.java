import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username1 = "Nithin";
        long password1 = 29062001l;
        System.out.println("Enter username");
        String un = sc.nextLine();
        System.out.println("Enter password");
        long psw = sc.nextLong();
        if (username1.equals(un) && password1 == psw) {
            System.out.println("Login Sucessfull");
        } else {
            System.out.println("Login failed");
        }
    }
}