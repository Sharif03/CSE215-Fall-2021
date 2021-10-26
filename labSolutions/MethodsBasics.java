<<<<<<< HEAD
package codeJamming;
=======

>>>>>>> ccc8c9264d8c17ab27a0ee17a25461388d6e440a

import java.util.Scanner;
public class MethodsBasics {

	public static void main(String[] args) {
		
		System.out.println("starting of program");
		int balance=1000;
		//calling a method
		checkBalance(balance);
		
		Scanner in= new Scanner(System.in);
		System.out.println("please enter the deposit amount");
		int dep= in.nextInt();
		
		balance=deposit(dep,balance);
		checkBalance(balance);
		
		System.out.println("please enter the withraw amount");
		int withd= in.nextInt();
		
<<<<<<< HEAD
		balance=withdaw(balance, withd);
		checkBalance(balance);
		
		System.out.println("please enter the salary amount");
		int salary= in.nextInt();
		
		boolean elig = eligibilityOftakingLoanMethod(balance, salary);
		if (elig == true) {
			System.out.println("Eligiabale for Loan");
		}
		else {
			System.out.println("Not Eligiabale for Loan");
		}
		System.out.println("end of program");
	}
	
	
=======
		balance=withdaw(withd,balance);
		checkBalance(balance);
		System.out.println("end of program");
		
		//boolean elig;
		
	}
	
>>>>>>> ccc8c9264d8c17ab27a0ee17a25461388d6e440a
	//defining a method
	public static void checkBalance(int balance) {
		System.out.println("your balance is:"+balance);
	}
	
	public static int deposit(int depo, int balan){
		balan = balan +depo;
		return balan;
	}
	
<<<<<<< HEAD
	
	//at this point you can define withdraw method
	/*you will take withdraw amount from user
	 * pass that through parameter and then update balance
	 * do not forget the conditions for withdrae
	 */
	public static int withdaw(int balan, int withd){
=======
	public static int withdaw(int withd, int balan){
>>>>>>> ccc8c9264d8c17ab27a0ee17a25461388d6e440a
		if (withd<balan && withd>=0) {
			balan = balan - withd;
		}
		else {
			System.out.println("Withraw is not possible");
		}
		return balan;
	}
		
<<<<<<< HEAD
	
	
	/*
	 * Think about a EligibilityOftakingLoanMethod
=======
	//at this point you can define withdraw method
	/*you will take withdraw amount from user
	 * pass that through parameter and then update balance
	 * do not forget the conditions for withdrae
	 */
	
	/*
	 * Think about a EgibilityOftakingLoanMethod
>>>>>>> ccc8c9264d8c17ab27a0ee17a25461388d6e440a
	 * 1. You need balance greater than 50,000
	 * 2. You need to have a salary of minimum 30,000
	 * if you can fulfill these conditions then you will
	 * be able to take a loan
	 * 
	 * salary will be user input
	 * return type boolean
	 * then you will finally print if the user is eligible for
	 * loan in the main method
	 * 
	 * (if true then eligible for loan)
	 * 
	 * public static boolean methodname(parameterlist)
	 */
<<<<<<< HEAD
	public static boolean eligibilityOftakingLoanMethod(int balence, int salary) {
		if(balence>50000 && salary>=30000)
			return true;
		else
			return false;
	}
=======
>>>>>>> ccc8c9264d8c17ab27a0ee17a25461388d6e440a
	

}
