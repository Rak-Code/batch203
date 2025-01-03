package CollegeManagementSystem;

public class College {

	private String name;
	private String location;
	public Student[] students ; 
	
//	constructor
	public College(String name, String location,int studentCount) {
		
		this.name = name;
		this.location = location;
		this.students = new Student[studentCount];
	}
				
		
//	name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	location
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

	}
	
	
	

