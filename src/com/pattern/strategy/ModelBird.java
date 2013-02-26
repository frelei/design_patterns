package com.pattern.strategy;

public class ModelBird extends Ave{

	/* Comportamento inicial */
	public ModelBird(){
		setFlyBehavior(new NoFly());
	}
	
	@Override
	public void display() {
		System.out.println("Sou uma ave comum");		
	}

}
