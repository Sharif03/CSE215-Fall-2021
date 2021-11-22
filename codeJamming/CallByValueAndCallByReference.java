package codeJamming;

import java.math.BigDecimal;
import java.util.Date;

public class CallByValueAndCallByReference {

	public static void main(String[] args) {
		Date a = new Date();
		System.out.println("Time: " + a.getMonth());
		// Call by Value
		int x = 10;
		// System.out.println("Before X value: " + x);
		int y = adddition(x);
		// System.out.println("After X value: " + x);
		// System.out.println("Y value: " + y);
		
	
		// Call by Reference
		Student std = new Student("Abir", 1111);
		System.out.println("Before Name: " + std.name);
		System.out.println("Beore Id: " + std.id);
		
		std.studentInfo(std);
		
		System.out.println("After Name: " + std.name);
		System.out.println("After Id: " + std.id);
	
		// Autoboxing
		int aa = 10;
		int bb = 20;
		mul(10, 20);
		
		// Unboxing
		Integer cc = 10;
		Integer dd = 20;
		subtract(10, 20);
		
		// Convert a String number to integer[Using Integer.valueOf() or Integer.parseInt() method]
		String v = "10";
		int value1 = Integer.valueOf(v);
		int value = Integer.parseInt(v);
		
		//BigInteger or BigDecimal
		//int v3 = 1111111111111111111111111111111111111 + 222222222222222222222222222222;
		BigDecimal bd = new BigDecimal("111111111111111111111111");
		
	}

	public static void mul(Integer a, Integer b) {  // Autoboxing
		
	}
	public static void subtract(int a, int b) {  // Unboxing
		
	}

	public static int adddition(int x) {
		int result = x + 40;
		return result; 
	}
}
class Box{
	public int height;
	public int length;
	public int depth;
	
	public Box() {
		
	}
	public Box(int height, int length, int depth){
		this.height = height;
		this.length = length;
		this.depth = depth;
	}
	public boolean compareTo(Box b1, Box b2) {
		if(b1.length> b2.length)
			return true;
		else
			return false;
	}
}

class ComputerCoveringBox extends Box {
	private String color;
	public String logo;
	public ComputerCoveringBox(int height, int length, int depth, String color, String logo){
		super(height, length, depth);
		this.color = color;
		this.logo = logo;
	}
	public void boxInfoShow(Box b1) {
		System.out.println("Height: " + super.height);
		System.out.println("Length: " + super.length);
		System.out.println("Depth: " + super.depth);
		System.out.println("Color: " + this.color);
		System.out.println("Logo: " + this.depth);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean compareTo(Box b1, Box b2) {
		if(b1.length< b2.length)
			return true;
		else
			return false;
	}
}

class Student {
	public String name;
	public int id;
	private float cgpa;
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public void studentInfo(Student s) {
		s.name = "NSU";
		s.id = 2222; 
	}
}
