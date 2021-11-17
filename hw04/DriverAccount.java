package hw04;
import java.util.Scanner;
/*
1. Change the program such a way that the account number increments as the objects are created 
   resulting in unique numbers for each objects.

2 & 3. Add two methods that uses Loan in AccountHolder class. 
       You can add or customize more methods using your own ideas and creativity.

4. Add a method that uses Nominee in AccountHolder class. 
   You can add or customize more methods using your own ideas and creativity.
*/

public class DriverAccount {

	public static void main(String[] args) {
		AccountHolder[] bank = new AccountHolder[2];
		int balan, accnum;
		String name;
		Scanner input = new Scanner(System.in);
		for(int iter=0; iter<bank.length;iter++) {
			System.out.println("Enter your name: ");
			name = input.nextLine();
			System.out.println("Enter your balance");
			balan = input.nextInt();
			input.nextLine();
			bank[iter]= new AccountHolder(name, balan);
		}
		for(AccountHolder a : bank) {
			System.out.println(a);
			a.elgibleForLoan();
			a.nomineeInfo();
		}
		

	}

}
