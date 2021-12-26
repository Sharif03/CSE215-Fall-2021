package theoryLecOnGenerics_Thread_Lambda_NestedClass;

public class InstanceofKeyWord {

	public static void main(String[] args) {
		Cat c = new Cat("Tom");
		Hullo h = new Hullo("Tomy");
		
		if (h instanceof Cat)
			System.out.print("True");
		else
			System.out.print("False");
	}
}
class Cat{
	String name;
	public Cat(String name) {
		this.name = name;
	}
}
class Hullo extends Cat{
	public Hullo(String name) {
		super(name);
	}
}
