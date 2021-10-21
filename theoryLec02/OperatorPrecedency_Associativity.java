package theoryLec02;

public class OperatorPrecedency_Associativity {

	public static void main(String[] args) {
		int a=5;
		int x = a++ + ++a;   // <---- right to left(Unary post-fix and  pre-fix)
		
		//System.out.println(x);
		//System.out.println(a);
		
		
		int value1 =  20 / 5 % 3 * 7;   // 4%3*7 // 1*7 // 7
		System.out.println(value1);
		
		int value2 =  20 * 5 / 4 % 7;  // 100/4%7 // 25%7 // 4 
		System.out.println(value2);
		
		int value3 =  7 + 3 + (3 + 9) - 20 * 5 / 4 % 7;   
		// 7 + 3 + 12 - 20 * 5 / 4 % 7
		// 7 + 3 + 12 - 100 / 4 % 7
		// 7 + 3 + 12 - 25 % 7
		// 7 + 3 + 12 - 4
		// 10 + 12 -4
		// 22 - 4
		// 18
		System.out.println(value3);
		
		int value4 =  7 % 4 + 2 * 3 + (3 + 9) / 6 - 20 + 7;  
		// 7 % 4 + 2 * 3 + 12 / 6 - 20 + 7  
		// 7 % 4 + 2 * 3 + 12 / 6 - 20 + 7    
		// 3 + 2 * 3 + 12 / 6 - 20 + 7 
		// 3 + 6 + 12 / 6 - 20 + 7
		// 3 + 6 + 2 - 20 + 7 
		// 9 + 2 - 20 + 7 
		// 11 - 20 + 7
		// -9 + 7
		// -2
		System.out.println(value4);

	}

}
