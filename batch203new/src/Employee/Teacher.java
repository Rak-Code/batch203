package Employee;

public class Teacher extends Employee {

	String subject;
	
	public Teacher(int id, String name, double salary,String subject) {
		super(id, name, salary);
		this.subject = subject;
		
		
	}

}
