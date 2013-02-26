package com.pattern.strategy;

public class Rocket implements FlyBehavior{
	
	@Override
	public void fly() {
		System.out.println("Rápido como um foguete!!!!");
	}
}
