package theoryLec05;

import java.util.Scanner;

public class Array1D_AddSubMul_IntoMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Array(1D) Addition && Subtraction && Multiplication with method
		
		System.out.print("Enter range: ");
		int range = input.nextInt();  // 5  10
		
		int[] a = new int[range];   
		System.out.println("Value of a: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt(); //(int) (Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		
		int[] b = new int[range]; 
		System.out.println("\n\nValue of b: ");
		for (int i = 0; i < b.length; i++) {
			b[i] = input.nextInt(); // (int) (Math.random() * 100);
			System.out.print(b[i] + " ");
		}
		
		// Addition
		int[] add = arrayAddition(a, b, range);
		for (int i = 0; i < add.length; i++) {
			System.out.print(add[i] + " ");
		}
		
		// Subtraction
		int[] sub = arraySubtraction(a, b, range);
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i] + " ");
		}
		
		// Multiplication
		
		
	}
	
	public static int[] arrayAddition(int[] ar1, int[] ar2, int range) {
		// Addition
		int[] c = new int[range];
		for (int i = 0; i < c.length; i++) {
			c[i] = ar1[i] + ar2[i];
		}
		
		// How array addition works internally
		//         1 3 4 5 6
		// ar1[i]= 0 1 2 3 4
		
		//         3 4 2 4 1
		// ar2[i]= 0 1 2 3 4
		
		//         4 7 6 9 7
		//   c[i]= 0 1 2 3 4
		return c;		
	}
	public static int[] arraySubtraction(int[] ar1, int[] ar2, int range) {
		// Subtraction
		int[] c = new int[range];
		for (int i = 0; i < c.length; i++) {
			c[i] = ar1[i] - ar2[i];
		}
		
		// How array subtraction works internally
		//         4 7 4 5 6
		// ar1[i]= 0 1 2 3 4
		
		//         3 4 2 1 1
		// ar2[i]= 0 1 2 3 4
		
		//         1 3 2 4 5
		//   c[i]= 0 1 2 3 4
		return c;		
	}

}
