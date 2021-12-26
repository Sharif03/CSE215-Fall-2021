package theoryLecOnGenerics_Thread_Lambda_NestedClass;

public class NestedClassConcept {

	public static void main(String[] args) {

	}
}
class Outer{
	int a;
	int b;
	
	Inner in;
	public void m2() {
		in.c = a;
	}
	class Inner{
	    int c;
		public void m1() {
			a = c;
		}
	}
}