package oops;

class A{
	int id ;
	int sal;
	public A(int id,int sal){
		this.id = id;
		this.sal = sal;     
	}
	
	int  calSal(int did ,int ot) {
		return this.sal+ot - did;
	}

}

public class Addition {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj = new A(100, 10000);
		A obj1 = new A(101, 12000);
		
		System.out.println(obj.id + " "+obj.sal);
		System.out.println(obj1.id + " "+obj1.sal);
		
		int result = obj.calSal(1000, 500);
		System.out.println(result);
		
	}

}
