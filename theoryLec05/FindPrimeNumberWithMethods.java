package theoryLec05;

import java.util.Scanner;

public class FindPrimeNumberWithMethods {

	public static void main(String[] args) {
		// 2. Write a program to find out whether an integer number is Prime or not.
		// Theory: If a number is only divided by 1 and itself then it's called prime number 
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int value = input.nextInt();
		
		findMyPrimeNumber(value);
		

	}
	public static void findMyPrimeNumber(int number) {
		boolean isPrime = true;
		for(int i=2; i<number; i++) {
			if(number%i == 0) {
				isPrime = false;
				break;	
			}
		}
		if(isPrime == true)
			System.out.println("It's a prime");	
		else
			System.out.println("It's not a prime");	
	}
}
