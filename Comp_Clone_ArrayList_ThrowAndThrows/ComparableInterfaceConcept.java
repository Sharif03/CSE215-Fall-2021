package Comp_Clone_ArrayList_ThrowAndThrows;

public class ComparableInterfaceConcept {

	public static void main(String[] args) {
		
		Car c1 = new Car(20, "Audi- A");
		Car c2 = new Car(20, "Audi- E");
		//int result = c1.compareTo(c2);
		System.out.println(c1.compareTo(c2));
		
	}
}

class Car implements Comparable<Car>{
	int price;
	String model;
	public Car(int price, String model) {
		this.price = price;
		this.model = model;
	}
	@Override
	public int compareTo(Car c) {
		if (this.price > c.price)
			return 1;
		else if (this.price < c.price)
			return -1;
		else
			return 0;
	}
}