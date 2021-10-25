package theoryLec03;

public class JumpStatements_BreakAndContinueAndLevelBlock {

	public static void main(String[] args) {
		// c) Jump: break, continue & level-block(Level Name: { })
		
		
		// Jump Statement(Break && Continue && Level-block)
		// Break
		int i;
		for(i=0; i<5; i++) {
			if(i == 3) {  
				break;
			}
			System.out.println(i); // 0 1 2
		}
		//System.out.println(i);
		
		
		
		
		// Continue
		int j;
		// Initializer; Condition; Increment/Decrement
		for(j=0; j<5; j++) {
			if(j == 3) {
				continue;
			}
			System.out.println(j); // 0 1 2 4
		}
		System.out.println(j);
		
		
		
		
		// Level-block
		boolean value = true;
		System.out.println("Hello");
		levelA:{
			System.out.println("Block A-First");
			
			levelB:{
				System.out.println("Block B-First");
				
				 levelC:{
					value = false;
					if(value == false) {
						break levelB;
					}
					System.out.println("Block C");
					
				 }
			     System.out.println("Block B-Second");
			 
		    }
		    System.out.println("Block A-Second");
		}
		System.out.println("Normal");
	}
}
