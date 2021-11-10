package theoryLec07;

import java.util.Scanner;
public class PersonDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Person p1 = new Person("Yasha", "0176666");
		System.out.println("Name: " + p1.getName() + ". Contact Number: " + p1.getContactNumber());
		
	}
}

class Person{
	private String name;
	private String contactNumber;
	
	public Person() {
		
	}
	public Person(String name, String contactNumber){
		setName(name);
		this.contactNumber = contactNumber;
	}
	
	public void setName(String name) {
		String[] acceptedList = new String[]{"Adib", "Jim", "Yash", "Fahim"};
		for (int i = 0; i < acceptedList.length; i++) {
			if(acceptedList[i].equalsIgnoreCase(name))
				this.name = name;
		}
	}
	public String getName() {
		return name;
	}
	
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getContactNumber() {
		return contactNumber;
	}
}