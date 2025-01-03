package CollegeManagementSystem;

public class Main {

	public static void main(String[] args) {
		
		Student[] students = {
				new Student(01,"Raj",12000),
				new Student(02,"Abhishek",12000),
				new Student(03,"Vishal",12000),
				new Student(04,"Rak",12000)
					
		};
		
		for(Student i : students) {
			System.out.println(i.getId());
			System.out.println(i.getName());
			System.out.println(i.getFees());
			
		}
		
//		College c = new College(null, null);
//		
//		
//		
//		c.setLocation("bandra");
//		System.out.println(c.getLocation());
	}

}
