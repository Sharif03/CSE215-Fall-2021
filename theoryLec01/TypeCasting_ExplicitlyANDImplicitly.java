package theoryLec01;

public class TypeCasting_ExplicitlyANDImplicitly {

	public static void main(String[] args) {
		// ASCII Value: https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
		// Type casting Explicitly & Implicitly or Type conversion
	
		byte b1 = 10;   // 1 byte = 8 bit
		int i1 = b1;    // 4 byte = 32 bit  [Implicitly]
		b1 =  (byte)i1; // Explicitly 
		
		
		byte byteNumber = 24;
		int intNumber = byteNumber;     // [Implicitly]
		long longNumber = intNumber;    // [Implicitly]
		longNumber = byteNumber;        // [Implicitly]
		byteNumber = (byte)intNumber;   // Explicitly 
		byteNumber = (byte)longNumber;  // Explicitly 
		
		
		short a = 10;      // Short = 2 byte 
		byte b = (byte)a;  // Byte = 1 byte   // Explicitly 
		
		
		int aa = 20;           // Int = 4 byte(32 bit)      
		                       // 20 => 00000000000000000000000000010100
		                                                          
		short bb = (short)aa;  // Short = 2 byte (16 bit)
		                       // 20 =>  0000000000010100
		
		
		int newInt = 20;     // Int   = 4 byte
		float ff = newInt;   // Float = 4 byte 
		
		
		int aaa = 10;   // Int   = 4 byte
		float floatValue = aaa;  // Float = 4 byte  
		aaa = (int)floatValue;
		  
		double dd = 23.3;       // Double = 8 byte
		float fff = (float)dd;  // Float = 4 byte 
		
		
		byte bValue = 30;
		int iValue = bValue;
		float fValue = bValue;
		fValue = iValue;
		
		iValue = (int) fValue;
		System.out.println(iValue);
		
		bValue = (byte)iValue;
		bValue = (byte)fValue;	
		
		byte xx = 5; //00000101
		byte yy = 2;
		byte pp = (byte)(xx + yy);   //00000000000000000000000000000101
		short ssss = 2;
		ssss = (short)(ssss + 2);
		
	}

}
