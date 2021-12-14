package theoryLec10_AbstractionAndInterface;

public class AbstractConcept {

	public static void main(String[] args) {
		Shape s[] = new Shape[5];
		s[0] = new Circle(10, "Red");
		s[1] = new Square(10, "Violet");
		s[2] = new Circle(10, "Orange");
		s[3] = new Rectangle(10, "Pink", 15);
		s[4] = new Square(10, "Blue");
		 
		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}
	
	}
}
abstract class A{
	public abstract void m1();
	public abstract void m2();
}
abstract class B extends A{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}

abstract class Shape{
	int length;
	String color;
	public Shape() {
		
	}
	public Shape(int length, String color) {
		this.length = length;
		this.color = color;
	}
	public abstract void area();	
}

class Circle extends Shape{
	public Circle(){
		
	}
	public Circle(int length, String color) {
		super(length, color);
	}
	
	public void area() {
		int result = (int)(Math.PI * Math.pow(length, 2));
		System.out.println("Circel Area: " + result);
	}
}

class Square extends Shape {
	public Square(){
		
	}
	public Square(int length, String color) {
		super(length, color);
	}
	public void area() {
		System.out.println("Square Area: " + (int)Math.pow(length, length));
	}	
}

class Rectangle extends Shape {
	int height;
	public Rectangle(){
		
	}
	public Rectangle(int length, String color, int height) {
		super(length, color);
		this.height = height;
	}
	public void area() {
		System.out.println("Rectangle Area: " + (length*height));
	}	
}