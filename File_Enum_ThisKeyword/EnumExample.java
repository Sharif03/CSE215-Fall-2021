package File_Enum_ThisKeyword;

public class EnumExample {
	enum PackagePrice{
		Tk500, Tk700, Tk1000
	}
	enum Level{
		High, Medium, Low 
	}
	enum Week{
		Sat, Sun, Mon, Tue, Wed, Thu, Fri  
	}
	enum Month{
		January, February, March, April, May, June, July, August, September, October, November, December  
	}

	public static void main(String[] args) {
		Level l = Level.High;

		Week w = Week.Mon;
		switch (w) {
		case Fri: 
			System.out.println("Friday");
			break;
		case Tue: 
			System.out.println("Tuesday");
			break;
		case Sat: 
			System.out.println("Tuesday");
			break;
		case Mon: 
			System.out.println("Monday");
			break;
		default:
			System.out.println("No match");
			break;
		}
		
		Employee e = new Employee("Name", 40000.0f, Type.FullTime);
	}
}

enum Type{
	FullTime, PartTime
}
class Employee{
	String name;
	float salary;
	Type type;
	public Employee(String name, float salary, Type type) {
		this.name = name;
		this.salary = salary;
		this.type = type;
	}	
}



