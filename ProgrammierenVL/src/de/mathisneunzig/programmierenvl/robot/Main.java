package de.mathisneunzig.programmierenvl.robot;

public class Main {
	
	public static void main(String[] args) {
		
		EV3 r1 = new EV3("EV3");
		r1.moveForward();
		r1.setSpeed(5);
		System.out.println(r1.getMotorCount());
		System.out.println(r1.getSpeed());
		System.out.println(r1.getSmallMotorCount());
		r1.test();
		
		NXT r2 = new NXT("NXT");
		r2.moveForward();
		r2.setSpeed(4);
		System.out.println(r2.getMotorCount());
		System.out.println(r2.getSpeed());
		r2.moveArmTo(90);
		System.out.println(r2.getCurrentArmAngle());
		
	}

}
