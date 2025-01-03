package oops;

class Dept{
	String name;
	void dept() {
		System.out.println("My Department is "+ name);
	}
}

class Emp{
	String name;
	void greet2() {
		System.out.println("Hello I'm " + name);
	}
}

public class Third {
	

	String name;
	void greet() {
		System.out.println("Hello I'm " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp e = new Emp();
		e.name = "Rak";
		e.greet2();
		
		Third obj = new Third();
		obj.name = "Abhishek";
		obj.greet();
		
		Dept d = new Dept();
		d.name = "Testing";
		d.dept();                                                                                                                             
	}

}
