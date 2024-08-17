import java.time.LocalDateTime; //import the LocalDateTime class
import java.time.format.DateTimeFormatter; //import the DateTimeFormatter class
class DateFormatted
{
	public static void main(String[]args){
		LocalDateTime myObj = LocalDateTime.now();
		System.out.println("Before Formating:");
		
		DateTimeFormatter myObj1=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = myObj.format(myObj1);
		System.out.println("After formating: " + formattedDate);
	}
}