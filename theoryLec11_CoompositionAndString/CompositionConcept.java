package theoryLec11_CoompositionAndString;

public class CompositionConcept {

	public static void main(String[] args) {
		// 3 Types
		// Association: 
		Car c = new Car("Audi", 30.00f);
		Driver d = new Driver("Josim", 30);
		System.out.println("Mr." + d.name + " drives the "+ c.model);
		
		
		// Aggregation:
		Medicine napa = new Medicine("Parasitamal", 12.50);
		Person yash = new Person("Yassh", 19, napa);
		System.out.println("Mr." + yash.name + " needs the "+ napa.name);
		
		// Composition:
		Heart heart = new Heart("Good", 110.00);
		Human adib = new Human("Adib", 20, heart);
		System.out.println("Mr." + adib.name + "'s heart condition is "+ heart.condition);
		

	}

}

// Association
class Car{
	String model;
	double price;
	public Car(String model, double price) {
		this.model = model;
		this.price = price;
	}	
}
class Driver{
	String name;
	double age;
	public Driver(String name, double age) {
		this.name = name;
		this.age = age;
	}
}

// Aggregation [Shadow Composition]
class Person{
	String name;
	double age;
	Medicine medicine;
	public Person(String name, double age, Medicine medicine) {
		this.name = name;
		this.age = age;
		this.medicine = medicine;
	}
}
class Medicine{
	String name;
	double price;
	public Medicine(String name, double price) {
		this.name = name;
		this.price = price;
	}	
}

// Composition [Truly Composition]
class Human{
	String name;
	double age;
	Heart heart;
	public Human(String name, double age, Heart heart) {
		this.name = name;
		this.age = age;
		this.heart = heart;
	}
}
class Heart{
	String condition;
	double pumpRate;
	public Heart(String condition, double pumpRate) {
		this.condition = condition;
		this.pumpRate = pumpRate;
	}	
}