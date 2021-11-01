package theoryLec04;

import java.util.Scanner;
public class ArrayBasic_Hello {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int range = input.nextInt();
		
		int a[][] = new int[range][range];
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a.length; j++) {
				a[i][j] = (int)(Math.random() * 10); //a[0]=3  //a[1]=5 //a[2]=7
			}
		}
		
		System.out.println("\nNormal Array: ");
		for (int i = 0; i < a.length; i++) {  // i = 1;
			for (int j = 0; j < a.length; j++) {  // j = 0
				System.out.print(a[i][j] + " ");   // a[i][j]  1 2 3 4
			}
			System.out.println();
		}
		
		System.out.println("\nReveresed Array: ");
		for (int i = a.length-1; i >=0; i--) {  // i = 1;
			for (int j = a.length-1; j >=0; j--) {  // j = 0
				System.out.print(a[i][j] + " ");   // a[i][j]  1 2 3 4
			}
			System.out.println();
		}
		
		System.out.println("\nReveresed Array: Row: ");
		for (int i = a.length-1; i >=0; i--) {  // i = 1;
			for (int j = 0; j<a.length; j++) {  // j = 0
				System.out.print(a[i][j] + " ");   // a[i][j]  1 2 3 4
			}
			System.out.println();
		}
		
		System.out.println("\nReveresed Array: Column: ");
		for (int i = 0; i<a.length; i++) {  // i = 1;
			for (int j = a.length-1; j>=0; j--) {  // j = 0
				System.out.print(a[i][j] + " ");   // a[i][j]  1 2 3 4
			}
			System.out.println();
		}
		
		
		int totalSum = 0;
		for (int i = 0; i < a.length; i++) {  // i = 1;
			int sum = 0;
			for (int j = 0; j < a.length; j++) {  // j = 0
				sum = sum + a[i][j];
			}
			totalSum = totalSum+ sum;
			System.out.println(sum);
		}
		System.out.println("Total: " + totalSum);
		
		System.out.println("\nRight Diagonal Sum: ");
		int diagonalSum = 0;
		for (int i = 0; i < a.length; i++) {  // i = 1;
			for (int j = 0; j < a.length; j++) {  // j = 0
				if(i==j)
					diagonalSum = diagonalSum + a[i][j];
			}
		}
		System.out.println("Diagonal Sum: " + diagonalSum);
		
		
		int s = 0;
		for (int i[] : a) {
			for (int j : i) {
				s = s + j;
				System.out.print(j + " ");
			}
		}
		System.out.println(s);
		
		            // 4 * 5 = 20 Byte
		
		
			
	}
}
