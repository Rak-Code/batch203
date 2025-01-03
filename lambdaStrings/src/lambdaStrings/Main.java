package lambdaStrings;

class Add implements Calc,Times{

	@Override
	public double claculate(int a, int b) {
		
		return a + b;
	}

	@Override
	public double times(double num) {
		// TODO Auto-generated method stub
		return num;
	}
	
}

class Sub implements Calc{

	@Override
	public double claculate(int a, int b) {
		
		return a - b;
	}
	
}

class Mul implements Calc{

	@Override
	public double claculate(int a, int b) {
		
		return a * b;
	}
	
}

class Div implements Calc{

	@Override
	public double claculate(int a, int b) {
		
		return a % b;
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		Add a = new Add();
		Sub s = new Sub();
		Mul m = new Mul();
		Div d = new Div();
		
		System.out.println(a.claculate(1, 3));
		System.out.println(s.claculate(10, 3));
		System.out.println(m.claculate(1, 3));
		System.out.println(d.claculate(15, 3));
		
		Calc NewSub = new Calc() {
			public double claculate(int a, int b) {
				
				return a - b;
			}
			
		};
		System.out.println(NewSub.claculate(5, 2));
		
		
		Calc mul = (c,b) -> c*b;
		
		System.out.println(mul.claculate(2, 2));
		
		Times doub = times(2);
	}
		static Times times(int num) {
			Times obj = (a) -> a*num;
			return obj;
		
		
		

	}

}
