package Motorcycle;

import cyclep.Cycle;

public abstract class MotorCycle implements Cycle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Hero MotorCycle start");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Hero MotorCycle start");
		
		
	}
	
	public abstract void selfStart();
	public abstract void kickStart();

}
