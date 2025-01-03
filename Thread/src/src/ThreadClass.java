package src;



class Simple{

	public Simple() {
		String mystr = new String("Hello World");
		for (int i = 0; i < 100_000; i++) {
			mystr = new String(i + mystr);
		}
		System.out.println("object Created");
	}
	
	
}




public class ThreadClass {

	public static void main(String[] args) {
		
		
		class Implementor extends Thread{
			public void run() {
				Simple obj1 = new Simple();
			}
		}
		
		Implementor im = new Implementor();
		im.start();
		Implementor im2 = new Implementor();
		im2.start();
		Implementor im3 = new Implementor();
		im3.start();
		Implementor im4 = new Implementor();
		im4.start();
		
//		Simple obj = new Simple();
//		Simple obj2 = new Simple();
//		Simple obj3 = new Simple();
//		Simple obj4 = new Simple();
		

	}

}
