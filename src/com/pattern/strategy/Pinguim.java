package com.pattern.strategy;

public class Pinguim extends Ave{

	public Pinguim(){
		setFlyBehavior(new NoFly());
	}
	
	
	@Override
	public void display() {
		System.out.println("Eu sou um pinguim");
		
	}

}
