package com.pattern.strategy;

public class Rocket implements FlyBehavior{
	
	@Override
	public void fly() {
		System.out.println("R�pido como um foguete!!!!");
	}
}
