package theoryLec06;

public class RecursionProblem {

	public static void main(String[] args) {
		// 5! = 5*4*3*2*1
		int result = factorial(5);
		System.out.println(result);   // F-15   
	}
	public static int factorial(int n) {  // n=5, n=4, n=3, n=2, n=1
		if(n == 1)
			return 1;
		else
			return n * factorial(n-1);
	}
	// 5 + factorial(4)
	// 5 + 4 + factorial(3)
	// 5 + 4 + 3 + factorial(2)
	// 5 + 4 + 3 + 2 + factorial(1)
	// 5 + 4 + 3 + 2 + 1
	
	
	
	

}
