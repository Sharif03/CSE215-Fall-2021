package theoryLec02;

public class MathClass {

	public static void main(String[] args) {
		double value = Math.pow(2, 3); //2^3  = 8
		System.out.println(value);
		
		float floorValue = (float)Math.floor(2.99);
		System.out.println(floorValue);
		
		float ceilValue = (float)Math.ceil(2.01);
		System.out.println(ceilValue);
		
		
		final float PI = 3.14F;  // Constant Variable
		int a = 10;
		
		int result = (int) (Math.pow(a, 2));
		System.out.println(result);
		
		int r = 3;
		double radious =  Math.PI * Math.pow(r, 2);
		System.out.println("The Radious is: " + radious);
		
		System.out.println(Math.PI);
		
		System.out.println("Absoluate value is: " + Math.abs(-10));
		
		System.out.println("Max value is: " + Math.max(5, 19));
		
		System.out.println("Min value is: " + Math.min(5, 19));
		
		System.out.println("Square root of 25 is: " + (int)Math.sqrt(25));
		
		System.out.println("Floor value is: " + (int)Math.floor(2.99));
		
		System.out.println("Ceiling value is: " + (int)Math.ceil(2.01));
		
	}
}
