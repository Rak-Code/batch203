package stringprojects;


class MySecondExpection extends Exception{

	public MySecondExpection(String msg){
		super(msg);
	}

	public MySecondExpection(String msg,Throwable cause) {
		super(msg,cause);
	}
	
}


public class Third {

	public static void main(String[] args) {
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
