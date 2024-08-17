enum  Level  
{
	BLACK,
	RED,
	YELLOW,
	GREEN,
}
	public class Level1
	{
	public static void main(String[] args) 
	{
		for(Level myVar : Level.values()){
		System.out.println(myVar);	
	
		//switch(myVar){
		//	case BLACK:
		//		System.out.println("colour is black");
		//	break;
		//	case RED:
		//		System.out.println("colour is red");
		//	break;
		//	case YELLOW:
		//		System.out.println("colour is yellow");
		//	break;
		//	case GREEN:
		//		System.out.println("colour is green");
		}
	}
}
   
