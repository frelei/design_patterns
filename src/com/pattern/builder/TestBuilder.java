package com.pattern.builder;

public class TestBuilder {

	
	public static void main(String[] args) {
	
		RobotBuilder old = new OldRobotBuilder();
		RobotBuilder old2 = new OldRobotBuilder();
		DirectorBuilder director = new DirectorBuilder(old);
		director.makeRobot();
		Robot robo = director.getRobot();
		director = new DirectorBuilder(old2);
		director.makeRobot();
		Robot robo2 = director.getRobot();
		System.out.println(robo.toString());
		System.out.println(robo2.toString());
		
	}

}
