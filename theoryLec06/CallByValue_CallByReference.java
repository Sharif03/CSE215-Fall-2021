package theoryLec06;

import java.util.Scanner;

public class CallByValue_CallByReference {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Call By Value
		int number = 20;
		System.out.println("Befor calling Method: " + number);  // 20
		
		int result = CallByValue(number);
		System.out.println("Calling Method: " + result);  //  40
		
		System.out.println("Befor calling Method: " + number); // 20
		
		
		// Call By Reference
		int intArray[] = {10, 20, 30};
		System.out.println("Value of a: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		
		int b[] = CallByReference(intArray);  // Address of a = 2345A
		System.out.println("\nValue of b: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.println("\n\nAgain Value of a: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}
	
	public static int CallByValue(int value) {
		return  value + 20;
	}
	
	public static int[] CallByReference(int v[]) {  // address of intArray
		for (int i = 0; i < v.length; i++) {
			v[i] = v[i] + 5 ;
		}
		return v;
	}
}
