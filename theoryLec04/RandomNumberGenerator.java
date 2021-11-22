package theoryLec04;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		int randomValue = (int)(Math.random() * 100);
		System.out.println(randomValue);
		
		int min = 60;
		int max = 100;

		// Inclusive 
		int inclusiveValue = (int) (min+Math.random() * (max-min+1));
		System.out.println(inclusiveValue);
		
		// Exclusive
		int exclusiveValue = (int) (min+Math.random() * (max-min-1));
		System.out.println(exclusiveValue);
		
		
		
		// Random number in normal mood(Double type)
		// 0.650771291935203 
		// 0.5273759342194437
		// 0.7587023132553588
		
		
		//OTP Generator Type1
		int minNumber = 111111;
		int maxNumber = 999999;
		int newRandomValue = (int) (minNumber+Math.random() * (maxNumber-minNumber+1));
		System.out.println(newRandomValue);
		
		//OTP Generator Type2
		System.out.println("OTP: ");
		for (int i = 0; i < 7; i++) {
			int otp = (int)(Math.random()*10);
			System.out.print(otp);
		}	
	}
}
