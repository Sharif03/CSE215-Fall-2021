package theoryLec02;

public class IncrementANDDecrement {

	public static void main(String[] args) {
		// Increment & Decrement
		int a = 10;
		a = a + 5;
		a = a - 4;
		
		int aaa = 10;
		int bbb = 20;
		int ccc;
		
		ccc = aaa++; // Post increment
		System.out.println(ccc);   //Output =>10   
		System.out.println(aaa);   //Output =>11   
		
		aaa = 10;
		bbb = 20;
		ccc = ++bbb; // Pre increment
		System.out.println(ccc);   //Output =>21 
		System.out.println(bbb);   //Output =>21 
		

		int t = 5;
		int s = t++;
		// System.out.println("S:" + s  + "\nT:" + t ); // S = 5  & T: 6
		
		
		// Pre-Increment & Post-Increment
		int b = 20;
		int c;
		c = ++b;
		c = b++;
		//System.out.println(c);
		//System.out.println(b);
		
		
		// Pre-Decrement & Post-Decrement
		int x = 25;
		int y;
		y = --x;
		y = x--;
		//System.out.println(y);
		//System.out.println(x);
		
		
		int p = 21;
		int q;
		int r;
		
		r = p++;         // r:21   p:22
		p = --r;         // p:20   r:20
		
		p = p++;         // p:20   p:21
		r = --r + 2;     // r:21   r:21
		q =  ++p + --r;  // q:41   p:21   r:20
		
		System.out.println("P: " + p);  
		System.out.println("Q: " + q);  
		System.out.println("R: " + r);  
		
		
		
		int dd = 5;
		int xyz = dd++ + ++dd;   //<----// right to left(Unary post-fix and  pre-fix)
		System.out.println(xyz);  // 12
		System.out.println(dd);   // 7
		
	}

}
