package com.pattern.strategy;

public class NoFly implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Não posso Voar");
	}
}
