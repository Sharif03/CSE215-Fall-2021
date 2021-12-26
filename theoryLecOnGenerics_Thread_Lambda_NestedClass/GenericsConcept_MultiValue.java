package theoryLecOnGenerics_Thread_Lambda_NestedClass;

public class GenericsConcept_MultiValue {

	public static void main(String[] args) {
		AnyTwoValuePinting<String, Double> multiValue = new AnyTwoValuePinting("Hello", 10.33);
		multiValue.printValue();
			
	}
}
class AnyTwoValuePinting<T, U>{
	T value1;
	U value2;
	public AnyTwoValuePinting(T value1, U value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	public void printValue() {
		System.out.println("Value1 is: " + value1);
		System.out.println("Value2 is: " + value2);
	}	
}
