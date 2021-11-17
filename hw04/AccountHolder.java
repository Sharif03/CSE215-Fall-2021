package hw04;

import java.util.Scanner;

public class AccountHolder {
	public int acc_num;
	public String name;
	public int balance;
	public Nominee n;
	public Loan l;
	public static int objectAccountNumber = 100;
	
	AccountHolder() {
		balance = 0;
		acc_num = ++objectAccountNumber;
		name = null;
	}
	
	AccountHolder(String name, int balance){
		this.acc_num =  ++objectAccountNumber; 
		this.name = name;
		this.balance = balance;
	}
	
	public void checkbalance() {
		System.out.println("your balance is: " + balance);
	}
	
	public void deposit(int dep_amount) {
		balance = balance + dep_amount;
	}
	
	public void withdraw(int with_amount){
		if(with_amount < balance)
			balance = balance - with_amount;
		else
			System.out.println("you do not have sufficient balance");	
	}
	
	public void elgibleForLoan() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Slary: ");
		int salary = input.nextInt();
		boolean r = l.isEligible(salary);
		System.out.println("Eligible for loan: " + r);
	}
	
	public void grantLoanAmmountOnBalance() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Slary: ");
		int salary = input.nextInt();
		int r = l.amountgranted(salary, balance);
		System.out.println("Eligible for loan Ammount: " + r);
	}
	
	public void nomineeInfo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Nominee Name: ");
		String name = input.nextLine();
		System.out.println("Enter Nominee Age: ");
		int age = input.nextInt();
		System.out.println("Enter Nominee Relation with Accont Holder: ");
		String relationship = input.nextLine();
		n = new Nominee();
		n.setinfo(name, age, relationship);
	}
	
	public String toString() {
		return name + " " + acc_num + " " + balance;
	}

}


