package Employee;


import java.util.Scanner;

import CollegeManagementSystem.College;
import CollegeManagementSystem.Student;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name of college: ");
		String cn = sc.nextLine();
		
		
		System.out.println(cn+ "Enter name of location: ");
		String cl = sc.nextLine();
		
		
		
		
		System.out.println("Number of Student :");
		int count = sc.nextInt();
		sc.nextLine();
		
		College c1 = new College(cn,cl,count);
		
		for(int i = 0; i < count; i++) {
			System.out.println("Name of student:");
			String name = sc.nextLine();
			
			System.out.println("Name of id:"+name);
			int id  = sc.nextInt();
			sc.nextLine();
			
			
			System.out.println("Name of fees:");
			double fees = sc.nextDouble();
			c1.students[i] = new Student(id,name,fees);
				
		}
		
		for(Student i : c1.students) {
			System.out.println(i.getId());
			System.out.println(i.getName());
			System.out.println(i.getFees());
			
		}
		
		
		Teacher t1 = new Teacher(101,"Riya",10101,"Java");
		t1.greet();

	}

}
