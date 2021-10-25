package theoryLec03;

import java.util.Scanner;

public class SelectionStatement_IfElse_Switch_TernaryOperator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		// a) Selection: if, if-else, if else-if else, Nested if-else, switch(expression){case: default:}, Ternary operator (int a = (2>a) ? 2 : a ;) ?:
		
		// if
		int value = 10;
		if(value == 10) {
			System.out.println("It's ok to Access");
		}
		
		
		// if-else
		int value1 = 10;
		int value2 = 6;
		if(value1 > value2)
			System.out.println("Max number is: " + value1);	
		else
			System.out.println("Min number is: " + value2);
			
		
		// if - else if - else
		int month = 5;
		if(month == 1)
			System.out.println("January");	
		else if(month == 2)
			System.out.println("February");	
		else if(month == 3)
			System.out.println("March");
		else if(month == 4)
			System.out.println("April");
		else if(month == 5)
			System.out.println("May");
		else
			System.out.println("Not Match");
			
			
		// Nested if-else	
		int s = 10;
		int t = 20;
		t = s + t;
		
		if (t == 30) {
			if (s == 10) {
				System.out.println(s);
			}
			else {
				System.out.println(t);
			}
		}
		*/
		
		
		/*
		//switch(expression){case: default:} // Expression= mon++ + 1 + mon/2; // mon = 1 + ++mon%5
		int mon = 1;
		switch(mon) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");	  
		case 3:
			System.out.println("March");
			break;
		default:
			System.out.println("Not Match");  
		}
		System.out.println(mon);
		*/
		
		
		
		
		// Ternary operator (int a = (2>a) ? 2 : a ;) ?:
		int a = 1;
		int b = 6;
		int max;
		
		// If-else
		if(a>b)
			max = a;
		else
			max = b;
		
		// Ternary
		String result = (a != b) ? "Yes" : "No";
		//System.out.println(result);
		
		
		int number = 10;
		String res = (number%2 == 0) ? "Even" : "Odd";
		//System.out.println(res);
		
		
		System.out.print("Enter a message: ");
		String message = input.nextLine();  // Hello
		String fullMessage = (message.equalsIgnoreCase("Hello")) ? "Hello" : "Hello Java";
		System.out.println(fullMessage);
			
		input.close();
	}
}
