// class Locigal_Operators{
// public static void main(String args[]){
// int a = 10, b = 20, c = 20, d = 0;
// System.out.println("Logical & Operator:");
// System.out.println("var1 = " + a);
// System.out.println("var2 = " + b);
// System.out.println("var3 = " + c);

// if(a<b && b==c){
// d = a + b + c ;
// System.out.println("The sum is: " + d);
// }else
// System.out.println("False conditions: ");

// System.out.println("\n");
// System.out.println("Logical || Operator:");
// int e = 10, f = 1, g = 10, h = 30;
// System.out.println("Var4 = " + e);
// System.out.println("Var5 = " + f);
// System.out.println("Var6 = " + g);
// System.out.println("Var7 = " + h);
// if(e>f || g==h)
// System.out.println("One or the both the conditions are true");
// else
// System.out.println("Both the conditions are false");

// System.out.println("\n");
// System.out.println("Logical ! Operator:");
// int i = 10, j = 14, k = 15;
// if((i > k) || (j < k)){
// System.out.println("Inside if");
// }else
// System.out.println("Value of j: " +j);
// }
// }

public class Logical_Opreators {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        // Using OR operator
        if (c < a || c < b) {
            System.out.println("At least one condition is true.");
        } else {
            System.out.println("Both conditions are false.");
        }
    }
}