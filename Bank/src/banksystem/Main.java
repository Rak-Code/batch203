package banksystem;

public class Main {

	
	
	
	
	public static void main(String[] args) {
		
		Bank b = new Bank();
		Axis a = new Axis();
		Kotak k = new Kotak();
		double a1 = b.getROI();
		System.out.println("Choices of banks are ....");
		System.out.println(k.getROI());
		System.out.println(a.getROI());
		System.out.println(a1);

	}

}
