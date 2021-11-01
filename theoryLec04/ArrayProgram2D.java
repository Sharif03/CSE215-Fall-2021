package theoryLec04;

import java.util.Scanner;

public class ArrayProgram2D {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		System.out.print("Enter Row: ");
		int row = input.nextInt();
		
		System.out.print("Enter Column: ");
		int column = input.nextInt();
		int a[][] = new int[row][column];  // 3 * 3
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {  
				a[i][j] = (int)(Math.random() * 100); 
			}
			
		}
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) { 
				System.out.print(a[i][j] + " "); 
			}
			System.out.print("\n");
		}
		
		
		System.out.println();
		// Enhanced for loop or For each loop
		int sum = 0;
		for(int x[] : a) {
			for(int y : x) {
				System.out.print( y + " ");
				sum = sum + y;
			}
			System.out.print("\n");
		}
		System.out.print(sum);
		*/
		
		// For 3d Array
		int[][][] t = new int[3][3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					t[i][j][k] = (int)(Math.random() * 100); 
				}
			}
		}
		
		for(int x[][] : t) {
			for(int y[] : x) {
				for(int z : y) {  
					System.out.print( z + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();	
	}
}
