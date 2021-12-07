package labHW08_Exception;

public class NegativeBalanceException extends Exception{
	NegativeBalanceException(String error){
		super(error);
	}
}