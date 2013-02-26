package com.pattern.strategy;

public class Main {

	public static void main(String[] args) {
		
		Ave bird = new ModelBird();
		bird.display();
		bird.performedFly();
		
		System.out.println("Ação do usuário");
		
		bird.setFlyBehavior(new Rocket());
		bird.performedFly();
		
		
	}

}
