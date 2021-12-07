package exceptionHandling;

public class StudentDriver {

	public static void main(String[] args) throws NameLengthCheckException, IdCheckException, AgeCheckException {
		Student s = new Student("Abid Arham", 10, 18);
		s.nameLengthChecker(s.name);
		s.idCheck(s.id);
	}
}

class NameLengthCheckException extends Exception{
	public NameLengthCheckException(String errorMessage) {
		super(errorMessage);
	}
}
class IdCheckException extends Exception{
	public IdCheckException(String errorMessage) {
		super(errorMessage);
	}
}
class AgeCheckException extends Exception{
	public AgeCheckException(String errorMessage) {
		super(errorMessage);
	}
}
class Student{
	String name;
	int id;
	int age;
	
	public Student(String name, int id, int age) throws AgeCheckException{
		this.name = name;
		this.id = id;
		setAge(age);
	}
	
	public void nameLengthChecker(String name) throws NameLengthCheckException{
		if (name.length() < 5) {
			 throw new NameLengthCheckException("Name length should be gretter than 5");
		}
	}
	public void idCheck(int id) throws IdCheckException{
		if (id < 15) {
			 throw new IdCheckException("Id should be gretter than 15");
		}
	}
	public void setAge(int age) throws AgeCheckException{
		if (age < 20) {
			 throw new AgeCheckException("Age should be gretter than 20");
		}
		else {
			this.age = age;
		}
	}
}
