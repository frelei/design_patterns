package com.pattern.prototype;

public class Sheep implements Animal{

	public Sheep(){
		System.out.println("Sheep Made");	
	}
	
	@Override
	public Animal makeCopy() {
		System.out.println("sheep fazendo copy");
		
		Sheep object = null;
		
		try {
			object = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return object;
	}

	public String toString(){
		return "sheps to string";
		
	}
	
}
