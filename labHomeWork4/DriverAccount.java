package labHomeWork4;
import java.util.Scanner;

public class DriverAccount {

	public static void main(String[] args) {
		
		AccountHolder[] bank = new AccountHolder[2];
		int balan, accnum;
		String name;
		Scanner in = new Scanner(System.in);
		Scanner ins = new Scanner(System.in);
		for(int iter=0; iter<bank.length;iter++) {
			System.out.println("Enter your name: ");
			name = in.nextLine();
			System.out.println("Enter your balance");
			balan = ins.nextInt();
			Nominee n = new Nominee();
			System.out.println("Enter Nominee age: ");
			int age = ins.nextInt();
			System.out.println("Enter Nominee relation with Account Holder: ");
			String rel = in.nextLine();
			n.setinfo(name, age, rel);
			System.out.println("Enter your salary");
			int salary = ins.nextInt();
			Loan l = new Loan(balan, salary);
			
			bank[iter]= new AccountHolder(name, balan, n, l);
		}
		
		for(AccountHolder a : bank) {
			System.out.println(a.toString());
			a.loanAmmount();
			a.detailsOfMyNominee();
		}
	}

}
