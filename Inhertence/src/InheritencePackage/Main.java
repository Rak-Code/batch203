package InheritencePackage;

public class Main {

	public static void main(String[] args) {
	First obj = new First();
	
	System.out.println(obj.add(1, 2));
	System.out.println(obj.add(1.2, 2.5));
	System.out.println(obj.add(1, 2.2 ));
	obj = null;
	System.gc();
	
	}
}


