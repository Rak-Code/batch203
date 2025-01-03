package Employee;

public class Employee {

	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		
		
	}
	void greet() {
		System.out.println("My name is "+ name);
	}
	
	
}
