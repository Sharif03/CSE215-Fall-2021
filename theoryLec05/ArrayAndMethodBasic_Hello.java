package theoryLec05;

import java.util.Scanner;
public class ArrayAndMethodBasic_Hello {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int range = input.nextInt();
		System.out.print("Array a: ");
		int a[]= new int[range];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 10); //input.nextInt();
			System.out.print(a[i] + " ");
		}
		
		System.out.print("\nArray b: ");
		int b[]= new int[range];
		for (int i = 0; i < b.length; i++) {
			b[i] = (int)(Math.random() * 10); //input.nextInt();
			System.out.print(b[i] + " ");
		}
		
		int[] value = arrayAddition(a, b);
		for (int i = 0; i < value.length; i++) {
			System.out.print(value[i] + " ");
		}
			
	}
	
	public static int[] arrayAddition(int x[], int y[]) {
		System.out.print("\nArray result: ");
		int result[]= new int[x.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = x[i] + y[i];
		}
		return result;
	}
}