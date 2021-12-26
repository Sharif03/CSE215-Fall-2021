package theoryLecOnGenerics_Thread_Lambda_NestedClass;

public class ThreadBasicCocept {

	public static void main(String[] args) {
		MultiThread1 t1 = new MultiThread1();
		MultiThread2 t2 = new MultiThread2();
		t1.start();
		t1.setName("A");
		t2.start();
		t2.setName("B");
		
	}

}
class MultiThread1 extends Thread{
	
	public void run(){
		for (int i = 0; i < 5; i++) {
			Thread t = new Thread();
			System.out.println(t.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class MultiThread2 extends Thread{

	public void run(){
		for (int i = 0; i < 5; i++) {
			Thread t = new Thread();
			System.out.println(t.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}