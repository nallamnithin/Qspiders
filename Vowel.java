import java.util.Scanner;
class Vowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		System.out.println("Enter any character");
		char c =sc.next().charAt(0);
		if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
			System.out.println("It is a vowel");
		}else{
			System.out.println("Not a vowel");
			}
		
    }
}