package labHW08_Exception;


public class Loan {

	int balance;
	int limit;
	int salary;
	
	Loan(int balance, int salary)
	{
		this.balance = balance;
		this.salary = salary;
	}
	
	public boolean isEligible()
	{
		if(salary>50000 && balance>80000)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}	
	
	public int amountgranted()
	{
		if(isEligible())
		{
			if(salary>100000)
			{
				limit = 500000;
				return limit;
			}
			else if(salary>60000)
			{
				limit = 300000;
				return limit;
			}
			else
			{
				limit = 200000;
				return limit;
			}
		}
		else
		{
			limit =0;
			return limit;
		}
	}
}
