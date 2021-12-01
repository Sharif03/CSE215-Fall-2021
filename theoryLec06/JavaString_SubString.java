package theoryLec06;

import java.util.Scanner;

public class JavaString_SubString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Self-study link: https://www.javatpoint.com/java-string
		
		String s = "Abir"; // Abir
		int lastIndex = s.length(); // We'll find Length through this method
		
		
		//System.out.println("Enter User name: ");  
		String searchContent = input.next();
		int firstIndex = 0;
		boolean check = s.subSequence(firstIndex, lastIndex).equals(searchContent);
		if(check == true)
			System.out.println("User already here");  // True or False check
		else
			System.out.println("You have to sign-up");
		
		
		//      H e l l o   w o r l d
		//      0 1 2 3 4 5 6 7 8 9 10
	
		String st = "Hello World";
		//System.out.println(st.substring(0, 5).equals("hello"));     //Begin index = 2; End index = 7  7-2 = 5
		//System.out.println(st.subSequence(2, 7)); 
		
		
		

		// String to Char array convert through method
		char[] c1 = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
		char[] c2 = new char[] {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
		
		char[] c = st.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' )
				continue;
			//System.out.print(c[i] + " ");
		}
		
		
		// String Concatanation
		String s1 = "Hello";
		String s2 = s1 + " World";
		//System.out.println(s2);
		//System.out.println(s1);
		
		
		// String Immutable(Concept of String pool)
		String ss1 = "Java"; // 8 byte 
		String ss2 = ss1.intern(); // Java   
		String ss3 = "java" + " Hello"; // 8 byte
		//System.out.println(ss1);
		//System.out.println(ss2);
		String ss4 = new String("java");
		
		if(ss1.equals(ss2))
			System.out.println("Block 1");
		else
			System.out.println("Block 2");
		
		
	
		
		
	    String str1 = "helloo";
	    String str2 = "heLLo";
	    //System.out.println(str1.length());   // 5
	    //System.out.println(str1.charAt(3));  // o
	    //System.out.println(str1.toUpperCase());   // HELLO
	    //System.out.println(str2.toLowerCase());   // hello
	    //System.out.println(str1.compareTo(str2)); // == 0,  > 1,  < -1
	    //System.out.println(str1.equals(str2));  // == true  != false
	    //System.out.println(str1.replace('o', '*'));  // hell**
	    
	    
	    //System.out.println();
	    String message = new String("We love our java class");
	    //System.out.println(message.length());  // Length: 22 
	                            
	    String[] splitMessage = message.split(" ");
	    for (int i = 0; i < splitMessage.length; i++) {
	    	//splitMessage[i] = splitMessage[i] + " Love";
			//System.out.println(splitMessage[i] + " ");
		}
	   
	    //System.out.println(message.substring(0));
	    //System.out.println(message.substring(6));
	    System.out.println(message.substring(4, 6));  
	    //System.out.println(message.substring(2, 6));  
	    
		String str = "This is a demo of the getChars method.";
		int start = 10;
		int end = 14;
		char buf[] = new char[end - start];
		str.getChars(start, end, buf, 0);
		System.out.println(buf);
	}

}
