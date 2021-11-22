package theoryLec08;

import java.util.Scanner;

public class InheritenceConcept {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student s = new Student("Adib", "201777", "017888", 3.7f, "NSU");
		s.personInfo();
		Person p = new Person("Yash", "1111", "0176");
	}
}
class Person{
	String name;
	String id;
	String mobileNumber;
	public Person(String name, String id, String mobileNumber) {
		this.name = name;
		this.id = id;
		this.mobileNumber = mobileNumber;
	}
	public String personInfo(String name) {
		return name;
	}
	public void personInfo() {
		System.out.println("Name" + name + " ID: " + id + " Mobile Number: " + mobileNumber);
	}
}
class Student extends Person{
	float cgpa;
	String Instititution;
	public Student(String newName, String newId, String newMobileNumber, float newCgpa, String Instititution) {
		super(newName, newId, newMobileNumber);
		this.Instititution = Instititution;
		cgpa = newCgpa;
	}
	public void personInfo() {
		System.out.println("Name: " + name + " ID: " + id + " Mobile Number: " + mobileNumber + " CGPA: "+ cgpa + " Inst: " + Instititution);
	}
}
class Employee extends Person{
	float salary;
	int workingHour;
	String designation;
	public Employee(String newName, String newId, String newMobileNumber, 
			float newSalary, int newWorkingHour, String newDesignation){
		super(newName, newId, newMobileNumber);
		salary = newSalary;
		workingHour = newWorkingHour;
		designation = newDesignation;
	}
	public void personInfo() {
		System.out.println("Name" + name + " ID: " + id + " Mobile Number: " + mobileNumber + " Salary: "+ salary + " Working Hour: " + workingHour + " Designation: " + designation);
	}
}
class Faculty extends Employee {
	String officeRoom;
	int numberOfResearch;	
	
	public Faculty(String newName, String newId, String newMobileNumber, 
			float newSalary, int newWorkingHour, String newDesignation, 
			String newOfficeRoom, int newNumberOfResearch){
		super(newName, newId, newMobileNumber, newSalary, newWorkingHour, newDesignation);
		
		officeRoom = newOfficeRoom;
		int numberOfResearch = newNumberOfResearch;	;	
	}
	public void personInfo() {
		System.out.println("Name" + name + " ID: " + id + " Mobile Number: " + mobileNumber + " Salary: "+ salary + " Working Hour: " + workingHour + " Designation: " + designation);
	}
}

