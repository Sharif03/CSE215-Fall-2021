package theoryLec07;

import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 10;
		int b = 20;
		int c = 5;
		int d = 15;
		int[] aa = new int[4]; 
		aa[0] = 10;
		aa[1] = 20;
		aa[2] = 5;
		aa[3] = 10;
		for (int i = 0; i < aa.length; i++) {
			//aa[i] = input.nextInt();
		}
		for (int i = 0; i < aa.length; i++) {
			System.out.println(aa[i] + " ");
		}
		System.out.println();
		
		int numberOfEmployee = 4;
		Employee[] emp = new Employee[numberOfEmployee]; 
		emp[0] = new Employee("Adib", 1000);
		emp[1] = new Employee("Fahim", 1500);
		emp[2] = new Employee("Yash", 1200);
		emp[3] = new Employee("Jim", 900);
		
		int maxSalary = emp[0].salary;
		int tracker = 0;
		for (int i = 1; i < emp.length; i++) {
			if (maxSalary < emp[i].salary) {
				maxSalary = emp[i].salary;
				tracker = i;
			}
		}
		System.out.println("Maximum Salary holder info:");
		System.out.println("Name: " + emp[tracker].name + " Salary: " + emp[tracker].salary);
		
		System.out.println("\nEmployes List: ");
		int sumSalary = 0;
		for (int i = 0; i < emp.length; i++) {
			sumSalary = sumSalary + emp[i].salary;
			emp[i].employeeInfoPrint();
			//System.out.println("Name: " + emp[i].name + ". Salary: " + emp[i].salary);
		}
		System.out.println("\nTotal Salary: " + sumSalary);
		
		// Value taken from user to create object and store it in Employee array
		System.out.println("\nEnter number of employee: ");
		int n = input.nextInt();
		Employee[] employes = new Employee[n];
		for (int i = 0; i < employes.length; i++) {
			System.out.println("Enter Employee name: ");
			String name= input.next();
			System.out.println("Enter Employee salary: ");
			int salary = input.nextInt();
			emp[i] = new Employee(name, salary);
		}
		for (int i = 0; i < employes.length; i++) {
			emp[i].employeeInfoPrint();
		}

	}
}

class Employee{
	String name;
	int salary;
	
	public Employee() {
		
	}
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void employeeInfoPrint() {
		System.out.println("Name: " + name + " Salary: " + salary);
	}
}