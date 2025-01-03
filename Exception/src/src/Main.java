package src;

class First{
	double divide(int a,int b) throws ArithmeticException {
		return a / b;
	}
	
	
}
public class Main {

	public static void main(String[] args) {
	
		System.out.println("Hi...");
		
		
//		try {
//			
//			System.out.println(1/0);
//		}catch (Exception e) {
//			System.out.println(e);
//		}finally {
//			System.out.println("Hello");
//		}
//		
//		System.out.println("world");
		
		
//		int[] arr = {1,2,3,4,5};
//		
//		try {
//			for(int i =1;i < arr.length;i++) {
//				                                                                                                                                                                                                                         
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}

		
		
		First f = new First();
		System.out.println(f.divide(1, 3));
	}

}
