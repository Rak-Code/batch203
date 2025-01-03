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
		
//		Implementor im = new Implementor();
//		im.start();
//		Implementor im2 = new Implementor();
//		im2.start();
//		Implementor im3 = new Implementor();
//		im3.start();
//		Implementor im4 = new Implementor();
//		im4.start();
		
		
		class Runa implements Runnable{

			@Override
			public void run() {
				new Simple();
				
			}
			
		}
//		Simple obj = new Simple();
//		Simple obj2 = new Simple();
//		Simple obj3 = new Simple();
//		Simple obj4 = new Simple();
		

//		Thread t3 = new Thread(()->{
//			new Simple();
//		});
//		
//		t3.start();
//		
//		
//		Thread t4 = new Thread(()->{
//			new Simple();
//		});
//		
//		t4.start();
//		
		Thread t5 = new Thread(()->{
			for(int i =0;i<6;i++) {
				count();
			}
		});
	
		
		Thread t51 = new Thread(()->{
			for(int i =0;i<6;i++) {
				count();
			}
		});
		
		
		Thread t52 = new Thread(()->{
			for(int i =0;i<6;i++) {
				count();
			}
		});
		t5.start();
		t51.start();
		t52.start();
		
	}

	
	
	static int count = 0;
	synchronized static void count() {
		count++;
		System.out.println(count);
	}
}
