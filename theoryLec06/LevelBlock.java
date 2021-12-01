package theoryLec06;

public class LevelBlock {

	public static void main(String[] args) {
		boolean value = true;
		System.out.println("Start");
		adib:{
			System.out.println("Adib1");
			yash:{
				if (value == true) {
					break yash;
				}
				System.out.println("Yash1");	
				System.out.println("Yash2");	
				System.out.println("Yash3");	
				System.out.println("Yash3");	
			}
			System.out.println("Adib2");	
		}
		jim:{
			System.out.println("Jim");
			
		}
		
			
		
		System.out.println("End");
	}

}
