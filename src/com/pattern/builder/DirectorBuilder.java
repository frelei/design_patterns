package com.pattern.builder;


public class DirectorBuilder {

	private RobotBuilder robotBuilder;
	
	public DirectorBuilder(RobotBuilder robotBuilder){
		this.robotBuilder = robotBuilder;
	}
	
	
	public Robot getRobot(){
		return this.robotBuilder.getRobot();
	}
	
	public void makeRobot(){
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotLegs();
		this.robotBuilder.buildRobotTorso();
	}	
}
