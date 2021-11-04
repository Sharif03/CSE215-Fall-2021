package theoryLec05;

public class NearestMethodMatching {

	public static void main(String[] args) {
		float a = 3;
		float b = 5;
		test(a, b);

	}
	public static void test(int a) {
		System.out.println("int parameter");
	}
	
	public static void test(float a) {
		System.out.println("Float parameter");
	}
	
	public static void test(float a, int b) {
		System.out.println("Float and Int parameter");
	}
	
	public static void test(double a, float b) {
		System.out.println("Double and Float parameter");
	}

}
