package thisKeyWord_6Types;

public class This03_InvokeCurrentClassConstructor {

	public static void main(String[] args) {
		// this() can be used to invoke current class constructor
		Teacher t1 = new Teacher("FAF1", 111);
		t1.info();
		
		
	}

}
class Teacher{
	String name;
	int id;
	
	public Teacher(){
		System.out.println("No argument Constructor is called");
	}
	
	public Teacher(String name) {
		System.out.println("One argument Constructor is called");
		this.name = name;
	}
	public Teacher(String name, int id) {
		 //this();
		
		 this(name);
		System.out.println("Two argument Constructor is called");
		
		this.name = name;
		this.id = id;
	}
	
	public void info() {
		System.out.println("Name : " + name + " " + " Id: " + id );
	}
}