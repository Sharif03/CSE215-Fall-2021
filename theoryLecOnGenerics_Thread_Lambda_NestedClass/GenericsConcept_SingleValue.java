package theoryLecOnGenerics_Thread_Lambda_NestedClass;

public class GenericsConcept_SingleValue {

	public static void main(String[] args) {
		AnyValuePinting<Integer> intValue = new AnyValuePinting(10);
		intValue.printValue();
		
		AnyValuePinting<Double> doubleValue = new AnyValuePinting(10.55);
		doubleValue.printValue();
		
		AnyValuePinting<String> stringValue = new AnyValuePinting("Hello");
		stringValue.printValue();
		
	}
}
class AnyValuePinting<T>{
	T value;
	public AnyValuePinting(T value) {
		this.value = value;
	}
	public void printValue() {
		System.out.println("Value is: " + value);
	}	
}
