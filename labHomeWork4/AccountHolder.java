package labHomeWork4;
public class AccountHolder {
	public int acc_num;
	public String name;
	public int balance;
	public Nominee n;
	public Loan l;
	public static int unickAccountGeneratorkNumber = 12345;
	
	AccountHolder() {
		balance = 0;
		acc_num = unickAccountGeneratorkNumber + 5;
		name = null;
	}
	
	AccountHolder(String name, int balance, Nominee n, Loan l){
		this.name = name;
		this.balance = balance;
		this.n = n;
		this.l = l;
		this.acc_num = unickAccountGeneratorkNumber + 5;
		
	}
	
	public void checkbalance() {
		System.out.println("your balance is: " + balance);
	}
	
	public void deposit(int dep_amount) {
		balance = balance + dep_amount;
	}
	
	public void withdraw(int with_amount){
		if(with_amount < balance)
			balance = balance - with_amount;
		else
			System.out.println("you do not have sufficient balance");	
	}
	
	public boolean eligibleAccountHolder(int salary) {
		boolean b = l.isEligible(l.salary);
		return b;
	}
	public void loanAmmount() {
		if (eligibleAccountHolder(l.salary)) {
			System.out.println("Loan Ammount: " + l.amountgranted());
		}
		else {
			System.out.println("Not applicable for loan");
		}	
	}
	
	public void detailsOfMyNominee() {
		n.toString();
	}
	
	public String toString() {
		return name + " " + acc_num + " " + balance;
	}

}


