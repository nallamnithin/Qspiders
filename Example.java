class Demo{
 int number;  
 String name; 
 Demo(){
System.out.println("Default Constructor:");
}
Demo(int number,String name){
this.number=number;
this.name = name;
System.out.println("Parameterized constructor of Demo");
}
public int add(int a, int b){
int sum=a+b;
return sum; 
}
class Example{
public static void main(String args[]){
Demo d = new Demo();
d.add(10,20);
}
}
}