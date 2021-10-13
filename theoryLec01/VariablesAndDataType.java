package theoryLec01;

public class VariablesAndDataType {

	public static void main(String[] args) {
		// Data Type && Range
        // 00000101 = -128(-2^7) -1 to 0 127(+2^7 -1) = 256[0-255]
		
		byte b = 127;  // 1000 - 256 // (-128 to +127)  // 2^8 = 256 [1 byte = 8 bit data]
	    System.out.println("Byte value: " + b);
		
		
		short s = (short)32768; // 32768 - 65536 =>Output: -32768 [2 byte = 16 bit data]
		System.out.println("Short value: " + s);
		
		
		int bValue = 214748368; // 214748368 - 4294967296 =>Output: -214748368
		System.out.println("Int value:" + bValue);
		// byte -> short -> int -> float -> long -> double
		// Primitive Data Type:
		// byte(1 byte = 8 bit)  =  2^8 = 256/2 = 128[-128 to  +127]=> -2^7 to +2^7-1
		// short(2 Byte = 16 bit) = 2^16 = 65536/2 = 32768[-32768 to +32767]=> -2^15 to +2^15-1
		// int(4 byte = 32 bit) = 2^32 = 4294967296/2 = 2147483648[-2147483648 to +2147483647]=> -2^31 to +2^31-1
		// long(8 byte = 64 bit) = -2^63 to + 2^63-1
		// float(4 byte = 32 bit) = -2^31 to + 2^31-1
		// double(8 byte = 64 bit) = -2^63 to + 2^63-1
		// char(2 byte = 16 bit) =  2^16 = 65536[0 to +65535]=> 
		
		
		//ASCII Value Table:  http://www.asciitable.com/
		char ch = 'A' + 25;
		System.out.println(ch);  //=> Output: Z
		
		char chForSmall = 'A' + 32; // => 97=a
		System.out.println(chForSmall);  //=> Output: a
		
		// boolean(true=1 / false=0), 
		boolean b1 = true;
		System.out.println(b1); 
		if(b1)
			System.out.println("Block a");
		else
			System.out.println("Block b");
		
		
		// User defined Object Type: String
		String str = "Hell1+oS!";  // 9*2 = 18 byte [18*8 =144 Bit]
		
		byte byteType = (byte)1000;   // 2^8  = 256 [-128 -1=>negative number] [0-127=> positive number] // -128 to +127
		System.out.println(byteType);
		
		short shortType = 1000;   // 2^16  = 65536  [-32768 -1=> negative number] [0-32767=> positive number]  // -32768 to +32767
		                                            
		System.out.println(byteType);
		
		// Variable [name, dataType-size(4 byte= 32 bit), value]
		int a = 10;   
		System.out.println(a);
		

	}

}
