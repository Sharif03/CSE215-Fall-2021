package theoryLec06;

public class StringBasic {

	public static void main(String[] args) {
		/*
		String text = "Hello Java. Here we want to learn String detals";
		System.out.println(text.length()); 
		
		System.out.println(text.contains("Java"));
		System.out.println(text.charAt(2));
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		System.out.println(text.substring(0, 11));
		
		String[] stringCollection = text.split(" ");
		for(String str : stringCollection){
			System.out.println("@ " + str + " @");
		}
		*/
		
		/*
		String shortStory = "Once Upon a Time there is a short story written by South African Nadine Gordimer and published in her collection titled Jump and Other Stories";
		String summary;
		if(shortStory.length()< 30)
			summary = shortStory;
		else
			summary = shortStory.substring(0, 31) + " See more....";
		System.out.println(summary);
		
		System.out.println(shortStory.startsWith("Upon"));
		System.out.println(shortStory.endsWith("Stories"));
		*/
		
		// String Constant Pool concept
		String str1 = "Hello";
		String str2 = str1;
		String str3 = new String("Hello").intern();
		String str4 = new String("Hello"); // Memory allocate
		
		String msg = "     HEllo Java    ";
		System.out.println("Replacing: " + msg.replace('E', '*'));  
		System.out.println("Trimed: " + msg.trim());
		int vowelCounter =0;
		char[] c = msg.toLowerCase().toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u')
				vowelCounter++;	
		}
		System.out.println(vowelCounter);
		
		// String Immutable(Unchangeable) example1
		String s1 = "Hello";
		System.out.println(s1);
		s1.concat(" World");
		System.out.println(s1);
	
	    // String Immutable(Unchangeable) example2
		String s2 = "Hello";
		System.out.println(s2);
		System.out.println(s2 + " World");
		System.out.println(s2);
	}

}
