//Polymorphism
class Animal 
{
	public void animalsound(){
	System.out.println("The animal makes the sound!");
	}
}
class Pig extends Animal
{
	public void animalsound(){
		System.out.println("The pig says: wee wee");
}
}
class Dog  extends Pig 
{
	public void animalsound(){
		System.out.println("The dog says: bow bow");
	}
}
class Main1
{
	public static void main(String[] args) 
	{
		Animal myAnimal = new Animal();
		Animal myPig = new Pig();
		Animal myDog = new Dog();
		myAnimal.animalsound();
		myPig.animalsound();
		myDog.animalsound();
	}
}
