package theoryLec01;
import java.util.Scanner;
// Adib Khalid Jim Yash
public class PrintfAndScanOfJava {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final float PI_VALUE = 3.1416f;
		final float NEW_PI_VALUE = 3.1416f;
		
		
		final int MAX_VALUE = 10;
		// String- Full text		
		System.out.println("Enter a String: ");
		String str2 = input.nextLine(); // Hello World 
		System.out.println(str2);
		System.lineSeparator();
		
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
		char cr = input.next().charAt(0);  // H e l l o
		System.out.println(cr);            // 0 1 2 3 4  => Output: H
		
		// String- First word
		System.out.println("Enter a String: ");
		String str1 = input.next();  // Hello World  => Output: Hello
		System.out.println(str1);
		System.out.println();
		
	}
}

 