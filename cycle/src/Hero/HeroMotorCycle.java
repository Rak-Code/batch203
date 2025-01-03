package Hero;

import Motorcycle.MotorCycle;

public class HeroMotorCycle extends MotorCycle {

	@Override
	public void selfStart() {
		System.out.println("Hero MotorCycle start");
		
	}

	@Override
	public void kickStart() {
		System.out.println("Hero MotorCycle kick");
		
	}
	
	

}
