package hw04;

import java.util.Scanner;

public class AccountHolder {
	public int acc_num;
	public String name;
	public int balance;
	public Loan l;
	public Nominee n;
	public static int objectAccountNumber = 100;
	
	// AccountHolder(){}
	AccountHolder() {
		balance = 0;
		acc_num = ++objectAccountNumber;
		name = null;
	}
	
	AccountHolder(String name, int balance){
		this.acc_num =  ++objectAccountNumber; // (int)(Math.random() * 10000);
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
	
	// Method 1[Loan]
	// Method 2[Loan]
	// Method 3[Nominee]
	public void nomineeInfo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = input.nextLine();
		int age = input.nextInt();
		String relationship = input.nextLine();
		n = new Nominee();
		n.setinfo(name, age, relationship);
	}
	
	public String toString() {
		return name + " " + acc_num + " " + balance;
	}

}


