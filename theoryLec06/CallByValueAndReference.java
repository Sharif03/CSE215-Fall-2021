package theoryLec06;

public class CallByValueAndReference {

	public static void main(String[] args) {
		/*
		// Call by value
		int a = 10;
		//System.out.println(a);
		//System.out.println(addMethod(a));
		//System.out.println(a);
		
		// Call by reference
		int[] arr1 = new int[]{10, 20, 30, 40, 50};
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");  // 10, 20, 30, 40, 50
		}
		
		System.out.println();
		int[] arr2 = arrayCalculation(arr1);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");  // 15, 25, 35, 45, 55
		}
		
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");  // 10, 20, 30, 40, 50
		}
		*/	
		
		

	}
	public static int[] arrayCalculation(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr1[i] + 5;
		}
		return arr1;
	}
	
	public static int addMethod(int a) {
		return a + 10;
	}

}
