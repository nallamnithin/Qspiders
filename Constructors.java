public class Constructors 
{
int modelyear;
String modelname;
	public Constructors(int year,String name) {
		modelyear = year;
		modelname = name;
	}
	public static void main(String[]args){
		Constructors myObj = new Constructors(2022,"Realme 10 pro 5G");
		System.out.println(myObj.modelyear+" " +myObj.modelname);
	}
}