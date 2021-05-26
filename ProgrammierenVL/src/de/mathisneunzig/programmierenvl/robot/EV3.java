package de.mathisneunzig.programmierenvl.robot;

public class EV3 extends Robot {
	
	private int motorCount = 2;
	private int smallMotorCount = 1;

	public EV3(String name) {
		super(name);
	}
	
	public void closeClaw() {
		
	}
	
	public void openClaw() {
		
	}
	
//	@Override
//	public void setMotorCount(int count) {
//		this.motorCount = count;
//	}
	
	@Override
	public int getMotorCount() {
		return this.motorCount;
	}
	
	public void setSmallMotorCount(int count) {
		this.smallMotorCount = count;
	}
	
	public int getSmallMotorCount() {
		return this.smallMotorCount;
	}
	
	public void test() {
		System.out.println("========================");
		System.out.println(this.getMotorCount());
		System.out.println(super.getMotorCount());
		System.out.println("========================");
	}

}
