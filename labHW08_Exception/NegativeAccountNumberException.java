package labHW08_Exception;

public class NegativeAccountNumberException extends Exception{
	NegativeAccountNumberException(String error){
		super(error);
	}
}