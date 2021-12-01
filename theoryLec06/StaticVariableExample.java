package theoryLec06;

public class StaticVariableExample {
	     static String myClassVar = "Xafor";
 
	public static void main(String[] args) {

		StaticVariableExample obj1 = new StaticVariableExample();
		StaticVariableExample obj2 = new StaticVariableExample();
		StaticVariableExample obj3 = new StaticVariableExample();
		
		
		//All three display "Class or static Variable"
		System.out.println(obj1.myClassVar);  // 
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
		
		//Change the value of static variable using obj2
		System.out.println();
		obj2.myClassVar="Hello";
		obj3.myClassVar="World";
		
		//All three display "Changed Text"
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);	

		
	}

}
