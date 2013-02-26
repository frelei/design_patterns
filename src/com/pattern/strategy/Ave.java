package com.pattern.strategy;

public abstract class Ave {

	private FlyBehavior flyBehavior;
	
	public void som(){
		System.out.println("Avé assoviando!!!!");
	}
	
	public abstract void display();
	
	public void performedFly(){
		flyBehavior.fly();
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
}
