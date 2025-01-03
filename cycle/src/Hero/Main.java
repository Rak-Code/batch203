package Hero;

public class Main {

	public static void main(String[] args) {
		
//		Cycle c = new Cycle();
		Hero h = new Hero();
		h.start();
		h.stop();
		h.foo();
		HeroMotorCycle h2 = new HeroMotorCycle();
		h2.start();
		h2.stop();
		h2.kickStart();
	
		h2.selfStart();
		h2.foo();
	}

}
