package com.pattern.builder;

public class OldRobotBuilder implements RobotBuilder{

	private Robot robot;
	
	public OldRobotBuilder(){
		this.robot = new Robot();
	}
	
	
	@Override
	public void buildRobotHead() {
		robot.setRobotHead("cabe�a pequena");
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Tronco");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Bra�os");
		
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Pernas");
		
	}
	
	public Robot getRobot(){
		return robot;
	}
	

}
