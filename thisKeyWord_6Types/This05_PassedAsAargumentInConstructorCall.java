package thisKeyWord_6Types;

public class This05_PassedAsAargumentInConstructorCall {

	public static void main(String[] args) {
		// this can be passed as an argument in the another class Constructors
		
		HighSchoolTeacher hgt1 = new HighSchoolTeacher("Dr. Faiz Al Faysal", 123);
		hgt1.info();
	}

}

class Teacherss{
	String name;
	int id;
	HighSchoolTeacher highSchoolTeacher;
	
	public Teacherss(HighSchoolTeacher hgt) {
		System.out.println("I'm from Teachers constructor");
		highSchoolTeacher = hgt; 
	}
	public Teacherss(String name, int id) {		
		this.name = name;
		this.id = id;
	}
	
	public void info() {
		System.out.println("Name : " + highSchoolTeacher.name + " " + " Id: " + highSchoolTeacher.id );
	}
}
class HighSchoolTeacher{
	String name;
	int id;
	
	public HighSchoolTeacher(String name, int id) {	
		this.name = name;
		this.id = id;
		Teacherss t = new Teacherss(this);
	}
	public void info() {
		System.out.println("Name : " + name + " " + " Id: " + id );
	}	
}