package theoryLec02;

public class OperatorsAndOperand {

	public static void main(String[] args) {
		//a) Arithmetic Operators [+ - * / %]
		int val1 = 10;
		int val2 =3 ;
		int result1 = val1 + val2 ;
		result1 = val1 - val2;
		
		
	    //b) Assignment Operators [= += -= *= /= %=] // Short hand operator
		int result2 = 10;
		result2 += val1; // result2 = result2 + val1; // result2 = 20
		result2 -= val1; // result2 = result2 - val1; // result2 = 10
		result2 /= val1; // result2 = result2 / val1; // result2 = 1
		result2 %= val1; // result2 = result2 % val1; // result2 = 0
		
		
		//c) Unary Operators [+ - ++ -- !]
		int result3 = +10;
		int result4 = -10;
		int result5 = val1++;
		int result6 = val1--;
		
		boolean value = true;
		if(value)
			System.out.println("Block A");
		else
			System.out.println("Block B");
			
		
	    //d) Equality and Relational (Comparison) Operators [== != > >= < <=]
		if(val1 == val2)
			System.out.println("Value is: " + (val1+val2));
		else if(val1 != val2)
			System.out.println("Value is: " + (val1-val2));
		else if(val1 > val2)
			System.out.println("Value is: " + (val1/val2));
		else if(val1 >= val2)
			System.out.println("Value is: " + (val1/val2));
		else if(val1 < val2)
			System.out.println("Value is: " + (val1*val2));
		else if(val1 <= val2)
			System.out.println("Value is: " + (val1*val2));
		
		
	    //e) Conditional (Logical) Operators [&& || !]
		boolean a = true;
		boolean b = true;
		
		// If & Else-If
		if(a == true && b == true)
			System.out.println("Block1");
		else if(a == true || b == false)
			System.out.println("Block2");
		else if(!a == false)
			System.out.println("Block3");
		
		
	    //f) Bitwise Bit Shift Operators [& | ~ ^ << >> <<< >>>] Example: [5(101) << 3 = 5* 2^3 = 5*8 =40[101000] && 40(101000) >> 3 = 40 / 2^3 = 40/8 = 5[101]
		int val3 = 101;
		int result7 = 101 << 3;  
		             //1  0  1 0 0 0
		             //32 16 8 4 2 1  = 40
		//System.out.println(result7);
		
	}
}
