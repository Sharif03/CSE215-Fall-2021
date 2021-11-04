package theoryLec05;

import java.util.Scanner;

public class MethodDetails {

	public static String addition(String v1, String v2) {
		String c = v1 + " " + v2;
		return c;
	}
	public static float addition(int v1, float v2) {
		float c = v1 + v2;
		return c;
	}
	public static float addition(int v1, float v2, int v3) {
		float c = v1 + v2;
		return c;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String a = "Hello";
		String b = "Nsuer";
		
		
		System.out.println(addition(a, b));
		
		
		
		
		
		
		
		
		/*
		// int type parameter
		int a = 10;
		int b = 20;
		int c = addition(a, b);
		//System.out.println("Sum: " + c);
		
		
		// int type parameter
		int x = 40;
		int y = 50;
		int z = addition(x, y);
		//System.out.println("Sum: " + z);
		
		
		// float type parameter
		float f1 = 20.34f;
		float f2 = 30.24f;
		float f3 = addition(f1, f2);
		
		float f4 = addition((int)f1, f2, f3);
		
		// Empty parameter
		welcomeMessage();
		
		// String parameter
		System.out.println("Enter your fvrt place name: ");
		String visitingPlace = input.nextLine();
		myFvrtvisitingPlace(visitingPlace);
		*/
		
	}
	
	
	/*
	public static int addition(int value1, int value2) {  // 10 20
		int result = value1 + value2;  // result = 10 + 20;
		return result;	
	}
	
	public static float addition(float value1, float value2) {  // 10 20
		float result = value1 + value2;  // result = 10 + 20;
		return result;	
	}
	
	public static float addition(int value1, float value2, float value3) {  // 10 20 30
		float result = value1 + value2 + value3;  // result = 10 + 20;
		return result;	
	}
	
	public static void myFvrtvisitingPlace(String placeName) {
		System.out.println("My fvrt visiting place name is: " + placeName);
		
	}
	
	public static void welcomeMessage() {
		System.out.println("Hello People");
		
	}
	*/

}
