package theoryLecOnGenerics_Thread_Lambda_NestedClass;

public class ThreadBasicCocept_RunnableInterface_EvenAndOdd {

	public static void main(String[] args) {
		Evens t1 = new Evens();
		Odds t2 = new Odds();
		t1.start();
		t2.start();
		
	}

}
class Evens extends Thread{
	
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
class Odds extends Thread{

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