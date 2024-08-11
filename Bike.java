abstract class Bike{
abstract void run();
}
class honda4 extends Bike{
void run(){
System.out.println("good condition");
}
public static void main(String[]args){
Bike Obj = new honda4();
Obj.run();
}
}