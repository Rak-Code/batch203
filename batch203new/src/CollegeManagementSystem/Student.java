package CollegeManagementSystem;

public class Student {
	
	private int id;
	private String name;
	private double fees;
	
	
public Student(int id, String name, double fees) {
		
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

//	getAttribute
	public int getId() {
		return id;
	}

	public double getFees() {
		return fees;
	}
	
	public String getName() {
		return name;
	}
	

//	setAttribute
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setFees(double fees) {
		this.fees = fees;
	}

//	Constructor
	

	

	

}
