package com.pattern.strategy;

public class Sabia extends Ave{

	
	public Sabia(){
	   setFlyBehavior(new FlyWings());
	}
	
	@Override
	public void display() {
		System.out.println("Sou um Sabia");
	}
}
