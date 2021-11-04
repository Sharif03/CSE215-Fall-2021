package theoryLec05;

import java.util.Scanner;

public class Array1D_AddSubMul {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Array(1D) Addition && Subtraction && Multiplication
		

		System.out.print("Enter range: ");
		int range = input.nextInt();  // 5
		
		int[] a = new int[range];   
		System.out.println("Value of a: ");
		for (int i = 0; i < a.length; i++) {
			a[i] =(int) (Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		
		int[] b = new int[range]; 
		System.out.println("\n\nValue of b: ");
		for (int i = 0; i < b.length; i++) {
			b[i] =(int) (Math.random() * 100);
			System.out.print(b[i] + " ");
		}
		
		
		// Addition
		int[] c = new int[range];
		for (int i = 0; i < c.length; i++) {
			c[i] =  a[i] + b[i];
		}
		
		System.out.println("\n\nAddition result of a & b: ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		
		// Subtraction
		int[] d = new int[range];
		for (int i = 0; i < d.length; i++) {
			d[i] =  a[i] - b[i];
		}
		
		System.out.println("\n\nSubtraction result of a & b: ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(d[i] + " ");
		}
		
		
		// Multiplication
		                           
		
	}

}
