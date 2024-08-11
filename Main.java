class OuterClass {
	int a = 23;
}

class InnerClass {
	int b = 18;
}

public class Main {
	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		InnerClass myInner = new InnerClass();
		System.out.println(myInner.b + myOuter.a);
	}
}
