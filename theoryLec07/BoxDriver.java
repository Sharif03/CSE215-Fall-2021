package theoryLec07;

public class BoxDriver {

	public static void main(String[] args) {
		Box b1 = new Box(5, 4, 6);
		Box b2 = new Box(4, 3, 7);
		System.out.println();
		b2.compareTo(b1);
		
		Box bx = b1.objectCreation(b2); // 4 3 7
		System.out.println(bx.height);
		System.out.println(bx.length);
		System.out.println(bx.depth);

	}
	public static void method1(int a) {	
	}
}
class Box{
	int height;
	int length;
	int depth;
	
	public Box() {
		
	}
	public Box(int height, int length, int depth) {
		this.height = height;
		this.length = length;
		this.depth = depth;	
	}
	private void compareTo(Box b) {
		if (this.height > b.height) {
			System.out.println("Max height is: " + this.height);
		}
		else {
			System.out.println("Max height is: " + b.height);
		}
	}
	public Box objectCreation(Box b) {  // 4 3 7
		//Box box = new Box(b.height+1, b.length+3, b.depth-1);  // 5 6 6
		return new Box(b.height+1, b.length+3, b.depth-1);
	}
	
}