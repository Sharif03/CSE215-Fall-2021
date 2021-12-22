package thisKeyWord_6Types;

public class This01_InstanceVariable {

	public static void main(String[] args) {
		// this can be used to refer current class instance variable
		
		Student s1 = new Student("Abir", 123);
		s1.info();
	}
}

class Student{
	String name;
	int id;
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public void info() {
		System.out.println("Name : " + name + " " + " Id: " + id );
	}
}