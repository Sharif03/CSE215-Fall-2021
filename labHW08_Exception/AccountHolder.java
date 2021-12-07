package labHW08_Exception;


public class AccountHolder {
	public int acc_num;
	public String name;
	public int balance;
	public Nominee n;
	public Loan l;
	
	/*AccountHolder()
	{}*/
	AccountHolder() {
		balance =0;
		acc_num =0;
		name=null;
	}
	
	AccountHolder(int acc_num, String name,int balance) throws NegativeBalanceException, NegativeAccountNumberException
	{
		checkAccountIsNegative(acc_num);
		this.name = name;
		checkBalanceIsNegative(balance);
	}

	
	public void checkbalance() 
	{
		System.out.println("your balance is: "+balance);
	}
	
	public void deposit(int dep_amount) 
	{
		balance = balance + dep_amount;
	}
	
	public void withdraw(int with_amount) 
	{
		if(balance>with_amount) {
			balance = balance - with_amount;
		}
		else {
			System.out.println("you do not have sufficient balance");
			
		}
	}
	
	public void checkAccountIsNegative(int acc_num) throws NegativeAccountNumberException {
		if(acc_num<0) {
			throw new NegativeAccountNumberException("Negative Account Number");
		}
		else {
			this.acc_num = acc_num;
		}
	}
	public void checkBalanceIsNegative(int balance) throws NegativeBalanceException {
		if(balance < 0) {
			throw new NegativeBalanceException(" Negative Balance");
		}
		else {
			this.balance = balance;
		}
	}
	
	
	public String toString() 
	{
		return name + " "+ acc_num+" "+balance;
	}

}


