package File_Enum_ThisKeyword;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {

	public static void main(String[] args) {
		String path = "D:\\C & Java Programming\\All Java Code Volt\\Java-Programming\\Java\\A Fall2021 Java Theory\\src\\File_Enum_ThisKeyword\\Demo.txt";
		/*
		File f = new File(path);
		if (f.exists()) {
			System.out.println(f.getName());
			System.out.println(f.length());
			System.out.println("File Exist");
		} 
		else {
			try {
				f.createNewFile();
				System.out.println("File Created");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		*/
		
		
		// File Writer
		try {
			FileWriter fw = new FileWriter(path, true);
			for (int i = 0; i < 10; i++) {
				fw.write("Hello World");
				fw.write("\n");
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File Writer is not working");
		}
		
		// File Reader
		try {
			FileReader fr = new FileReader(path);
			Scanner input = new Scanner(fr);
			while (input.hasNextLine()) {
				String value = input.nextLine();
				System.out.println(value);
			}
			fr.close();
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File Reader is not working");
		} 
	}

}
