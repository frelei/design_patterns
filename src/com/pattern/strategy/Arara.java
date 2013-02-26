package com.pattern.strategy;

public class Arara extends Ave{

	
	public Arara(FlyBehavior fly){
		setFlyBehavior(fly);
	}
	
	@Override
	public void display() {
		System.out.println("Sou uma Arara");
		
	}

}
