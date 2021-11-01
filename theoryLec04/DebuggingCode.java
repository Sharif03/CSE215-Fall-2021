package theoryLec04;

public class DebuggingCode {

	public static void main(String[] args) {
		int sum = 0;
		int counter = 0;
		for (int i = 1; i <= 5; i++) {
			sum = sum + addition(i);
			counter++;
		}
		System.out.print("Sum: " + sum);
	}
	public static int addition(int i) {
		int sum = i + 5;
		return sum;
	}
}
