package de.mathisneunzig.programmierenvl.robot;

public class NXT extends Robot {
	
	private int motorCount = 3;
	private int currentArmAngle = 0;
	
	public NXT(String name) {
		super(name);
	}
	
	public void moveArmTo(int angle) {
		System.out.println("Ich bewege mich zu "+angle);
		this.currentArmAngle = angle;
	}
	
	public int getCurrentArmAngle() {
		return this.currentArmAngle;
	}
	
//	@Override
//	public void setMotorCount(int count) {
//		super.setMotorCount(count);
//	}
	
	@Override
	public int getMotorCount() {
		return this.motorCount;
	}

}
