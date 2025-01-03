package stringprojects;


class MyException extends Exception{

	public MyException(String msg) {
		super(msg);
	}
	
}


public class Second {
	
	static double calsal(double sal,double pf) throws MyException {
		if(sal < 0 || pf < 0) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
			throw new MyException("Sal or pf can;t be negative");
		}
		else if(pf > 0.12*sal){
				throw new MyException("Sal or pf can;t be negative");
			}
		double result = sal - pf;
		return result;
		
}

	public static void main(String[] args) {
		
		try {
		System.out.println(calsal(12004,1200));
//			throw new MyException("This is Exception");
		} catch (Exception e) {
			System.out.println("Catch " + e);
		}

	}

}
