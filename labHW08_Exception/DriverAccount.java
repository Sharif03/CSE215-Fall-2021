package labHW08_Exception;

import java.util.Scanner;
public class DriverAccount {

	public static void main(String[] args) throws NegativeBalanceException, NegativeAccountNumberException {		
		AccountHolder[] bank = new AccountHolder[2];
		
		int balan = 0,accnum = 0;
		String name = null;
		Scanner in = new Scanner(System.in);
		Scanner ins = new Scanner(System.in);
		for(int iter=0; iter<bank.length;iter++) {
			System.out.println("enter your name: ");
			try {
				name = in.nextLine();
			} catch (Exception e) {
				System.out.println("Name Empty");
			}
			System.out.println("enter your acc_num");
			try {
				accnum = ins.nextInt();
			} catch (Exception e) {
				
			}
			
			System.out.println("enter your balance");
			try {
				balan = ins.nextInt();
			} catch (Exception e) {
				
			}
			bank[iter]= new AccountHolder(accnum, name, balan);
		}
		
		System.out.println(bank[1].toString());
		
		for(AccountHolder a:bank) {
			System.out.println(a);
		}
	}
}

