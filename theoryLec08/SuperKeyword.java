package theoryLec08;

public class SuperKeyword {

	public static void main(String[] args) {
		C obj = new C();
	}
}

class A{
	public A() {
		System.out.println("A");
	}
}
class B extends A{
	public B() {
		super();
		System.out.println("B");
	}
}
class C extends B{
	public C() {
		super();
		System.out.println("C");
	}
}