package theoryLecOnGenerics_Thread_Lambda_NestedClass;

public class GenericsConcept_ArrayValue {

	public static void main(String[] args) {
		AnyArrayPinting<Integer> intArray = new AnyArrayPinting(5);
		Integer[] a = new Integer[] {10, 20, 30, 40, 50};
		//intArray.printArrayValue(a);
		
		AnyArrayPinting<Float> floatArray = new AnyArrayPinting(4);
		Float b[] = new Float[] {10.11f, 20.22f, 30.33f, 40.44f};
		//floatArray.printArrayValue(b);
		
		AnyArrayPinting<String> stringArray = new AnyArrayPinting(3);
		String c[] = new String[] {"Hi", "Hello", "Hola"};
		//stringArray.printArrayValue(c);
		
		
		AnyArrayPinting<Double> doubleArray = new AnyArrayPinting(2);
		doubleArray.addObject(20.13);
		doubleArray.addObject(23.33);
		doubleArray.printArrayValue();
		
		AnyArrayPinting<Student> studentArray = new AnyArrayPinting(4);
		studentArray.addObject(new Student("Jim", 1));
		studentArray.addObject(new Student("Adib", 2));
		studentArray.addObject(new Student("Fahim", 3));
		studentArray.addObject(new Student("Yash", 4));
		studentArray.printArrayValue();
	}
}
class AnyArrayPinting<T>{
	int[] a = new int[5];
	T[] value;
	int indexNumber = -1;
	public AnyArrayPinting() {
		value = (T[]) new Object[10];
	}
	public AnyArrayPinting(int numberOfElements) {
		value = (T[]) new Object[numberOfElements];
	}
	public void printArrayValue(T[] value) {
		for (int i = 0; i < value.length; i++) {
			System.out.print(value[i] +" ");
		}
		System.out.println();
	}
	
	public void addObject(T item) {
		this.value[++indexNumber] = item;
	}
	public void printArrayValue() {
		for (int i = 0; i < value.length; i++) {
			System.out.print(value[i].toString() + " ");
		}
		System.out.println();
	}
}

class Student{
	String name;
	int id;
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
}