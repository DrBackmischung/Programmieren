package de.mathisneunzig.programmierenvl.robot;

public class Robot {
	
	private int motorCount = 0;
	private int motorSpeed = 0;
	private String name;
	
	public Robot(String name) {
		
		this.name = name;
		
	}
	
	public void setSpeed(int speed) {
		this.motorSpeed = speed;
	}
	
	public void moveForward() {
		System.out.println("Roboter "+name+" bewegt sich.");
	}
	
	public int getSpeed() {
		return this.motorSpeed;
	}
	
	public void setMotorCount(int count) {
		this.motorCount = count;
	}
	
	public int getMotorCount() {
		return this.motorCount;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

}
