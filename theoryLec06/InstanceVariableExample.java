package theoryLec06;

public class InstanceVariableExample {

	 String a = "Instance Variable";

	public static void main(String[] args) {
		InstanceVariableExample obj1 = new InstanceVariableExample();
		InstanceVariableExample obj2 = new InstanceVariableExample();
		InstanceVariableExample obj3 = new InstanceVariableExample();
		
		//All three display "Instance Variable"
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(obj3.a);
		
		//Change the value of Instance variable using obj2
		obj2.a ="Changed Text";
		
		//Only obj2 display "Changed Text", rest display "Instance Variable"
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(obj3.a);		

	}

}
