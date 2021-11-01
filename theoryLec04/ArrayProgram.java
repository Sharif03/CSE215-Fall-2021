package theoryLec04;

import java.util.Scanner;

public class ArrayProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Array => Same type data collection
		// 1D Array
		System.out.print("Enter array range: ");
		int range = input.nextInt();
		int[]  arr = new int[range];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		// For loop
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// Enhanced for loop
		for(int value : arr) {
			System.out.print(value + " ");
		}
		
		
		// 2D Array
		int row = 3;
		int col = 3;
		int[][]  arr1 = new int[row][col];
		for (int i = 0; i < row; i++) { //i = 0
			for (int j = 0; j < col; j++) { //j = 0
				arr1[i][j] = (int)(Math.random()* 50); //00
			}	
		}
		for (int i = 0; i < 3; i++) { //i = 2
			for (int j = 0; j < 3; j++) { //j = 2
				System.out.print(arr1[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		for(int[] value : arr1) {
			for(int x : value) {
				System.out.print(x + " ");
			}
			System.out.print("\n");
		}		
		
		
		
		               
		
		
		
		
		// 1D array
		System.out.println("Enter array range for 1D");
		int rng = input.nextInt();  // 10
		int x[] = new int[rng];
		            // 4 byte * 10 integer elements= 40 byte memory space in  Heap memory
		int sum = 0;
		for (int i = 0; i <x.length; i++) {
			x[i] = (int)(Math.random() * 100);
			sum = sum + x[i];
		}
		System.out.println();
		System.out.println("Summation: " + sum);
		
		for (int i = 0; i <x.length; i++) {
			System.out.print(x[i]+ " ");
		}
		
		// Reveres order
		System.out.println("\nArray print in Reveres order");
		for (int i = x.length-1; i >=0; i--) {
			System.out.print(x[i]+ " ");
		}
		
		// Enhanced for loop for 1D // 10, 20, 30
		for(int value : x) {
			System.out.print(value + " ");
		}	
		
		
		// 2D Array
		System.out.println("Enter array range for 2D");
		int rngg = input.nextInt();  // 10 * 10
		int xx[][] = new int[rngg][rngg];
		            // 4 byte * 100 integer elements= 400 byte memory space in  Heap memory
		int summ = 0;
		for (int i = 0; i <xx.length; i++) {
			for (int j = 0; j < xx.length; j++) {
				xx[i][j] = (int)(Math.random() * 100);
				summ = summ + xx[i][j];
			}
		}
		
		System.out.println();
		System.out.println("Summation: " + summ);
		
		for (int i = 0; i <xx.length; i++) {
			for (int j = 0; j < xx.length; j++) {
				System.out.print(xx[i][j]+ " ");
			}
			System.out.println();
		}
		
		// Reveres order
		System.out.println("\nArray print in Reveres order");
		for (int i = xx.length-1; i >= 0; i--) {
			for (int j = xx.length-1; j  >= 0; j--) {
				System.out.print(xx[i][j]+ " ");
			}
			System.out.println();
		}
		
		// Enhanced for loop for 1D // 10, 20, 30
		                            // 30, 23, 35
									// 30, 21, 31
		for(int value1[] : xx) {
			for(int value2 : value1) {
				System.out.print(value2+ " ");
			}
			System.out.println();
		}
		
	
		
		
		
		
		
		
		
		
		
		/*
		
		// 1D Array
		System.out.println("Enter range for this array: ");
		int range = input.nextInt();
		int a[] = new int[5];      // [2^32 = 4294967296 = -2147483648 To +2147483647]
		                               //       = -2^31 To +2^31-1
		
		for (int i = 0; i <a.length ; i++) {
			System.out.println("Enter a number: ");
			a[i] = input.nextInt();
		} 
		 
		for (int i = 0; i <a.length ; i++) {
			System.out.print(a[i] + " ");
		}
		
		// Array declare and initialization 
		int[] b = {10, 20, 30, 40, 50}; 
		
		int []c = new int[] {10, 20, 30, 40, 50}; 
		                  // 0   1    2  3   4
		int sum = 0;
		for (int i = 0; i < c.length; i++) { //depends on location
			sum = sum + c[i];	
		}
		System.out.println(sum);
		
		int newSum = 0;
		for(int x : c) {  // Not depends on location
			newSum = newSum + x;
		}
		
		*/
		      

	}

}
