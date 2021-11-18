package theoryLec09;

import java.util.Scanner;

public class PolymorphismConcept {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Animal aa[] = new Animal[3];
		// aa[0] = new Dog("Homi");
		// aa[1] = new Cat("Orin");
		// aa[2] = new Duck("Jinku");
		for (int i = 0; i < aa.length; i++) {
			System.out.print("1. Dog Object Creation: ");
			System.out.print("2. Cat Object Creation: ");
			System.out.print("3. Duck Object Creation: ");
			int option = input.nextInt();
			if (option == 1) {
				System.out.print("Enter Name: ");
				String name = input.next();
				aa[i] = new Dog(name);
			}
			else if (option == 2) {
				System.out.print("Enter Name: ");
				String name = input.next();
				aa[i] = new Cat(name);
			}
			else if (option == 3) {
				System.out.print("Enter Name: ");
				String name = input.next();
				aa[i] = new Duck(name);
			}
		}
		for (int i = 0; i < aa.length; i++) {
			System.out.print(aa[i].name + ": ");
			aa[i].speak();
		}
		System.out.println("\n\n");
		
		
		Animal a = new Cat("Boby");  // Upcasting 
		a.speak();
        ((Cat) a).eat(); // Downcasting
		System.out.println(a.name);
		
		Cat c = new Cat("Miku");
		c.speak();
		c.eat();
		System.out.println(c.name);
		
	    Animal b = new Dog("Baby");
	    b.speak();
	    
	    
	    Duck dd1 = new Duck("Huscal");
	    Cat cc = new Cat("Chiku");
	    Dog dd2 = new Dog("Piku");
	    cc.compareName(dd1, dd2);

	}

}

class Animal{
	String name;
	public Animal(String name) {
		this.name = name;
	}
	public void speak() {
		System.out.println("Animel make sounds");
	}
	
	public void compareName(Animal a, Animal b) {
		if (a.name.equalsIgnoreCase(b.name)) {
			System.out.println("Name Same");
		}
		else {
			System.out.println("Name Not Same");
		}
	}
}
class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	public void speak() {
		System.out.println("Meaw Meaw");
	}
	public void eat() {
		System.out.println("Cat takes milk");
	}
	
}
class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	public void speak() {
		System.out.println("Baw Baw");
	}
}
class Duck extends Animal{
	public Duck(String name) {
		super(name);
	}
	public void speak() {
		System.out.println("Pek Pek");
	}
}


class BangladeshBank{
	String name;
	String location;
	
	public BangladeshBank(String name, String location) {
		this.name = name;
		this.location = location;
	}
	public void interestCalculation(float ammount) {
		float totalInterest = ammount + (ammount*(5/100));
	}
}

class SouthEastBank extends BangladeshBank{
	public SouthEastBank(String name, String location) {
		super(name, location);
	}
	public void interestCalculation(float ammount) { // Overriding Occurred
		float totalInterest = ammount + (ammount*(10/100));
	}
}

class UCBBank extends BangladeshBank{
	public UCBBank(String name, String location) {
		super(name, location);
	}
	public void interestCalculation(float ammount) {  // Overriding Occurred
		float totalInterest = ammount + (ammount*(15/100));
	}
}








