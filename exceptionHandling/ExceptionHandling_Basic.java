package exceptionHandling;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling_Basic {
	
	public static void main(String[] args) {
		// Check Exception
		/*
		File f = new File("");
		try {
			f.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		*/
		// Un-check Exception
		// int x = 10/0;
		System.out.println("Start");
		int arr[] = new int[5];
		String str1 = null;
		String str2 = "Hello";
		try {
			  arr[3]  = 10;
			  int a = 10/0;
			  System.out.println(str1.length());
			  System.out.println(str2.charAt(10));
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Error Occured");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NullPointer Error Occured");
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBounds Error Occured");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Arithmetic Error Occured");
			e.printStackTrace();
		} finally {
			System.out.println("Must Block");
		}
		System.out.println("End");
		
		// Try-Catch block(ArithmeticException)
		try {
			  System.out.println(str2.charAt(10));
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Error Occured");
			e.printStackTrace();
		}
		
		// Try-Catch block(ArithmeticException)
		try {
			  System.out.println(str2.charAt(10));
		} catch (NullPointerException e) {
			System.out.println("NullPointer Error Occured");
			e.printStackTrace();
		}

		
		// Multiple Exception in one catch block
		try {
			
		} catch (ArithmeticException | NullPointerException | IndexOutOfBoundsException e){
			
		}
		
		// Combination of Try-Catch
		try {
			
		} catch (Exception e){
			
		}
		
		// Combination of Try-Finally
		try {
			
		} finally {
			
		}

		// Combination of Try-Catch-Finally
		try {
			
		} catch (Exception e){
			
		} finally {
			
		}

	}

}

class Person{
	
}