package theoryLec05;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a rang: ");
		int range = input.nextInt();
		for(int i=1; i<=range; i++) {
			if(i >= 2) {
				primeChecker(i);
			}
		}	
	}
	public static void primeChecker(int number) {
		int counter = 0;
		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				counter++;
				break;
			}
		}
		if(counter == 1) {
		}
		else {
			System.out.println(number);
		}
	
		counter = 0;
	}

}
