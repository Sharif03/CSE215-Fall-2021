package thisKeyWord_6Types;

public class This04_PassedAsAargumentInMethodCall {

	public static void main(String[] args) {
		// this can be passed as an argument in the method call as an Instance of that particular class
		Teachers t1 = new Teachers("SfR1", 111);
		//t1.info();
	}

}
class Teachers{
	String name;
	int id;
	
	public Teachers() {
		
	}
	public Teachers(String name, int id) {
		this.name = name;
		this.id = id;
		this.teacherIdentity(this);
	}
	public void teacherIdentity(Teachers t) {
		System.out.println("Name: " + t.name + " Id: " + t.id);
	}
	
	public void info() {
		System.out.println("Name : " + name + " " + " Id: " + id );
	}
}