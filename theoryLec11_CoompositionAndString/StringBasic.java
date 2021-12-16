package theoryLec11_CoompositionAndString;

public class StringBasic {

	public static void main(String[] args) {
		// More learn about string visit here: https://www.javatpoint.com/java-string
		String text = "Today is our victory day.";
		System.out.println(text + " " + "\nThe date is 16 December.");
		
		char[] charArray = text.toCharArray();
		int tCount = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 't' || charArray[i] == 'T')
				tCount++;
			System.out.print(charArray[i] + "@ ");
		}
		System.out.println("Number of T: " + tCount);
		
		String charArrayToText = new String(charArray);
		System.out.println(charArrayToText);
		System.out.println(charArrayToText.toLowerCase());
		System.out.println(charArrayToText.toUpperCase());
		System.out.println(charArrayToText.length());
		System.out.println(charArrayToText.charAt(10));
		
		String str1 = "Text";
		String str2 = "Text";
		String str3 = new String("Text");
		String str4 = str1.intern();
		str1 = "Text" + "New Text";
		System.out.println(str4);
		System.out.println(str1);
		System.out.println(str2);
		
		
		System.out.println("Hello".compareTo("HEllo"));
		System.out.println("Hello".compareToIgnoreCase("HEllo"));
		System.out.println("Hello".equals("Hello"));
		
		String newText = "Today is our victory day.";
		System.out.println(newText.startsWith("Today"));
		System.out.println(newText.endsWith("day."));
		System.out.println(newText.contains("16"));
		
		String newStringText = "Today is our victory day";
		String replacedText1 = newStringText.replace("is", "IS");
		System.out.println(replacedText1);
		String replacedText2 = newStringText.replace('i', 'I');
		System.out.println(replacedText2);
		
		
		String newString1 = "Today is our victory day";
		String[] stringArray = newString1.split(" ");
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		
		String newString2 = "           Today is our victory day               ";
		System.out.println(newString2.trim());
		
		
		String message = "Today is our victory day";
		//                0123456789
		String subMessage1 = message.substring(4);
		System.out.println(subMessage1);
		
		String subMessage2 = message.substring(2, 5);
		System.out.println(subMessage2);	
		
	}
}
