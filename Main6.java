 //Multiple interfaces
 interface Animal  //first class
{
	public  void animalsound(); //interface method
}
interface Pig       //second class
{
	public void sleep();     //interface method
}
class Dog implements Animal,Pig //Dog implements Animal and Pig
{
	public void animalsound(){ //have body
		System.out.println("Pig says: wee wee");
}
public void sleep(){        //have body
	System.out.println("zzz");
}
public void animal(){     //have body
	System.out.println("Then pig will getup and go for bath");
}
}
class Main6
{
	public static void main(String[]args){
		Dog myDog = new Dog(); //create object for Dog
		myDog.animalsound();
		myDog.sleep();
		myDog.animal();
	}
}
