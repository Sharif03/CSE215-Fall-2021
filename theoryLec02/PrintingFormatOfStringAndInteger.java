package theoryLec02;

public class PrintingFormatOfStringAndInteger {

	public static void main(String[] args) {
		int value1 = 10;
		int value2 = 20;
		
		int result = value1 + value2;
		System.out.println("The Addition is " + result + ". I do it by myself");

		System.out.println("The Addition is: " + value1 + value2); // 1020
		
		System.out.println("The Addition is: " + value1 + " " + value2); // 10 20

		System.out.println(value1 + value2 + " is addition result");
		
		System.out.println(value1 + value2 + " is addition result " + value1 + value2);
		
		System.out.println("Addition is: " +  (value1 + value2));
	}
}
