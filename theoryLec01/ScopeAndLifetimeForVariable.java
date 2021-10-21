package theoryLec01;

public class ScopeAndLifetimeForVariable {

	public static void main(String[] args) {
		int t = 10;
		{
			int s = 20;
		    t = s;
		}
	
		int x = 10;
		if(x==10) {
			int y = 20;
			x = y + x;
		}
		
		// y = 30;  // error
		x = 40;
		
		//System.out.println(y); // error
		System.out.println(x);
		
		{
			int z = 50;
			x = z + x;
			// x = z + x + y; // error
		}
		// z = 56; // error
		// System.out.println(z); // error
	}
	

}
