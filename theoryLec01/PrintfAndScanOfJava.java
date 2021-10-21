package theoryLec01;

import java.util.Scanner;

public class PrintfAndScanOfJava {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final float PI_VALUE = 3.1416f;
		
		// Integer
		System.out.println("Enter a number: ");
		int value1 = input.nextInt();
		System.out.println(value1);
		
		// Floating
		System.out.println("Enter a floating number: ");
		float value2 = input.nextFloat();
		System.out.println(value2);
		
		// Double
		System.out.println("Enter a double number: ");
		double value3 = input.nextDouble();
		System.out.println(value3);
		
		// Character 
		System.out.println("Enter a Character: ");
		char cr = input.next().charAt(0);  // Hello
		System.out.println(cr);            // 01234  => Output: H
		
		// String- First word
		System.out.println("Enter a String: ");
		String str1 = input.next();  // Hello World  => Output: Hello
		System.out.println(str1);
		System.out.println();
		
		// String- Full text		
		System.out.println("Enter a String: ");
		String str2 = input.nextLine(); // Hello World 
		System.out.println(str2);
		
	}
}

 