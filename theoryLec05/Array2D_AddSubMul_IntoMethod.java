package theoryLec05;

import java.util.Scanner;

public class Array2D_AddSubMul_IntoMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Array(2D) Addition && Subtraction && Multiplication with method
 
		
		System.out.print("Enter Row: ");
		int row = input.nextInt();   // 3
		
		System.out.print("Enter Column: ");
		int column = input.nextInt();  // 3
		 
		int[][] a = new int[row][column];  // 3 * 3
		System.out.println("Value of a: ");
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {  
				a[i][j] = (int)(Math.random() * 100);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] b = new int[row][column];  // 3 * 3
		System.out.println("\n\nValue of b: ");
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {  
				b[i][j] = (int)(Math.random() * 100);
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		// Addition
		System.out.println("\n\nAddition result of a & b: ");
		int[][] addResult = summationOf2DArray(a, b, row, column);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(addResult[i][j] + " ");
			}
			System.out.println();
		}
		
		// Subtraction
		System.out.println("\n\nSubtraction result of a & b: ");
		int[][] subResult = subtractionOf2DArray(a, b, row, column);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(subResult[i][j] + " ");
			}
			System.out.println();
		}
		
		// Multiplication
		System.out.println("\n\nMultiplication result of a & b: ");
		int[][] multResult =  multiplicationOf2DArray(a, b, row, column);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(multResult[i][j] + " ");
			}
			System.out.println();
		}
				
		
	}
	public static int[][] summationOf2DArray(int[][] a, int[][] b, int row, int column) {
		int[][] c = new int[row][column];  // 3 * 3
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {  
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
	
	public static int[][] subtractionOf2DArray(int[][] a, int[][] b, int row, int column) {
		int[][] c = new int[row][column]; 
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {  
				c[i][j] = a[i][j] - b[i][j];
			}
		}
		return c;
	}
	
	public static int[][] multiplicationOf2DArray(int a[][], int b[][], int row, int column) {
		int e[][] = new int[row][column];   
		for (int i=0; i<row; i++) {         
			for (int j=0; j<column; j++) { 
				
				int sum = 0;                
				for(int k=0; k<3; k++) {    
					sum = 0 +  a[i][k] * b[k][j]; 
				}
				e[i][j] = sum;
			}
		}
		return e;
	}

}
