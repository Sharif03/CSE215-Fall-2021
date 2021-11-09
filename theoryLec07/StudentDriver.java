package theoryLec07;

import java.util.Scanner;
public class StudentDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
     	Student student1 = new Student();
     	student1.name = "Adib";
     	student1.id ="20111";
     	student1.cgpa = 3.6F;
     	student1.studentInfoPrint();
     	Student.myInstitutionalIdentity("NSU");
     	
     	Student student2 = new Student();
     	student2.name = "Jim";
     	student2.cgpa = 3.7F;
     	student2.id ="20112";
     	student2.studentInfoPrint();
     	Student.myInstitutionalIdentity("Brack");
     	
     	Student student3 = new Student("Fahim", "20113", 3.6f);
     	student3.studentInfoPrint();

     	String n = "Yash";
     	String i = "20113";
     	Student student4 = new Student(n, i);
     	student4.studentInfoPrint();
     	
     	// User input
     	Student student5 = new Student();
     	student5.name = input.next();
     	student5.id = input.next();
     	student5.cgpa = input.nextFloat();
     	student5.studentInfoPrint();
     	
     	
     	Student student6 = new Student();
     	String studentName = input.next();
     	student6.name = studentName;
     	
     	String studentId = input.next();
     	student6.id = studentId;
     	
     	float studentCGPA = input.nextFloat();
     	student6.cgpa = studentCGPA;
     	student6.studentInfoPrint();
     	
     	System.out.println("Total Object created: " + Student.objectCounter);

	}
}

class Student {
	// Student Has A name
	// Field/Property
	String name; // Instance Variable
	String id;   // Instance Variable
	float cgpa;  // Instance Variable
    static int objectCounter = 0;  // Class Variable
	
    public Student() {
    	objectCounter++;
    	name = "Unknown";
		id = "Un-identified";
		cgpa =  5.00f;
	}
    public Student(String newName) {  // Local Variable
    	objectCounter++;
		name = newName;
	}
    public Student(String newName, String newId) {
    	objectCounter++;
		name = newName;
		id = newId;
		cgpa =  3.8f;
	}
	public Student(String newName, String newId, float newCgpa) {
		objectCounter++;
		name = newName;
		id = newId;
		cgpa = newCgpa;
	}
	
	// Method[Normal Method & Constructor]
	public void studentInfoPrint() {
		System.out.println("Name: " + name + " Id: " + id + " CGPA: " + cgpa);
	}
	
	public static void myInstitutionalIdentity(String institutionName) {
		System.out.println("I'm the student of " + institutionName);
	}
}


