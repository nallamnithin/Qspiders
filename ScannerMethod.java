import java.util.Scanner;

public class ScannerMethod {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = s.nextLine();
        System.out.println("Enter Age");
        int age = s.nextInt();
        System.out.println("Enter Salary");
        double sal = s.nextDouble();
        System.out.println("Enter MobileNo");
        long mobileNo = s.nextLong();
        System.out.println("Enter Gender");
        char gender = s.next().charAt(0);
        System.out.println("Enter Single?");
        boolean single = s.nextBoolean();
        System.out.println("===========================================================================");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("salary: " + sal);
        System.out.println("Molbile number: " + mobileNo);
        System.out.println("Gender: " + gender);
        System.out.println("Single/Commited: " + single);
    }
}