package theoryLecOnGenerics_Thread_Lambda_NestedClass;

public class ThreadBasicCocept_EvenAndOdd {

	public static void main(String[] args) {
		Even even = new Even();
		Odd odd = new Odd();
		Thread t1 = new Thread(even);
		Thread t2 = new Thread(odd);
		t1.start();
		t2.start();	
		
	}
}
class Even implements Runnable{

	@Override
	public void run(){
		for (int i = 0; i <=10; i++) {
			if (i%2== 0) {
				System.out.println("Even: " + i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}
class Odd implements Runnable{

	@Override
	public void run(){
		for (int i = 0; i <=10; i++) {
			if (i%2 != 0) {
				System.out.println("Odd: " + i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}