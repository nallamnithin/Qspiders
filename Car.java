//Inheritance
class Vechicle
{
	protected String brand = "Honda";
	public void hunk(){
		System.out.print ln("Helo guys recently i brought!");
	}
}
class Car extends Vechicle
{
	public String modelname = "Amaze";
	public static void main(String[]args){
		Car myCar = new Car();
		myCar.hunk();
		System.out.println(myCar.brand +" " +myCar.modelname);
	}
}