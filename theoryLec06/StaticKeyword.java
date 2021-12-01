package theoryLec06;

public class StaticKeyword {

	public static void main(String[] args) {
		StaticExample s = new StaticExample();   // 
		System.out.println(s.cal());
		StaticExample.math();
	}
}

class StaticExample{
	static int a;
	static int b;
	
	StaticExample(){
		System.out.println("Hi");
	}
	static {
		System.out.println("Hello");
		a = 7;
		b = 10;
	}
	int cal() {
		return a*b;
	}
	static void math() {
		System.out.println("Math");
	}
}