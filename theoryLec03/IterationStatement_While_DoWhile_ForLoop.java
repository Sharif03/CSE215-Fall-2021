package theoryLec03;

import java.util.Scanner;

public class IterationStatement_While_DoWhile_ForLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// b) Iteration: While + Do-While + For loop [Extra: for-each loop/ enhanced for loop] && Sentinel Value
		
		/*
		// While Loop
		System.out.println("Enter number: ");	
		int value = 1;
		while(value < 10) {   // Condition chech => true or false
			System.out.println(value);
			value++;
		}
		*/
		
		
		// Do-While Loop
		int j = 10;
		do {
			System.out.println("You Entered in Loop");
		} while(j<5);
		
		
		// Difference between while and do-while
		while(j<5) {   // while(j<5);
			System.out.println("You Entered in Loop");
		}
		
		
		
		// For Loop
		for(int i=0; i<5; i++) {   // for(i=0; i<5; i++);  
			System.out.println(i); // 0 1 2 3 4
		}

		int k = 0;
		// For loop is looking as like while loop
		for(;k<5; ) {   // for(i=0; i<5; i++);  
			System.out.println(k);
			k++;
		}
		
	}
}
