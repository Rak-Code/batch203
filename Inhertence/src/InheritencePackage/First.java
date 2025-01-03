package InheritencePackage;

public class First {

	public int add (int...  a) {
		int sum = 0;
		for(int i = 0;i < a.length;i++) {
			sum += a[i];
		}
		return sum ;
		
		
	}
	
	public double add(double a ,double b) {
		return a + b;
		
	}
	public String add(String a,double b) {
		System.out.println("method");
		return a + b;
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Done memeory is free");
	}
}
