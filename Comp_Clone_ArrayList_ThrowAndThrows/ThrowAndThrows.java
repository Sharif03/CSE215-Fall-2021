package Comp_Clone_ArrayList_ThrowAndThrows;

public class ThrowAndThrows {

	public static void main(String[] args) throws Exception {
		int value = 5;
		System.out.println("Start");
		if (value < 10) {
			throw new Exception();
		}
		System.out.println("End");
	}
}

