package Comp_Clone_ArrayList_ThrowAndThrows;

public class CloneableInterfaceConcept {

	public static void main(String[] args) throws CloneNotSupportedException {
		// Shallow Copy
		System.out.println("Shallow Copy");
		Student s1 = new Student("Adib", 10);
		Student s2 = s1;
		s2.name = "Yash";
		System.out.println(s1.name);
		System.out.println(s2.name);
		
		// Deep Copy
		System.out.println("\nDeep Copy");
		Student std1 = new Student("Adib", 10);
		Student std2 = (Student)std1.clone();
		std2.name = "Yash";
		System.out.println(std1.name);
		System.out.println(std2.name);
	}
}

class Student implements Cloneable{
	String name;
	int roll;
	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	} 
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
