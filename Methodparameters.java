
// public class Methodparameters {
//     public static void myMethod(String fname, int age, char gender) {
//         System.out.println(fname + "  " + "is" + " " + age + "  " + gender);
//     }

//     public static void main(String[] args) {
//         myMethod("Nithin", 23, 'M');
//         myMethod("Ammu", 18, 'F');

//     }

// }
public class Methodparameters {

    public static void checkage(int age) {

        if (age < 18) {
            System.out.println("your are not elgible");
        } else {
            System.out.println("your are elgible");
        }
    }

    public static void main(String[] args) {
        checkage(23);
    }

}