package labHomeWork4;
public class Nominee {
	String name;
	int age;
	String relationwithAccHolder;
	
	public void setinfo(String name, int age, String rel) {
		this.name = name;
		this.age = age;
		relationwithAccHolder = rel;
	}
    public void relationShipOfNominee() {
    	System.out.println("Relationship: " + relationwithAccHolder);
    }
	public String toString() {
		return name + " " + age + " " + relationwithAccHolder;
	}
}
