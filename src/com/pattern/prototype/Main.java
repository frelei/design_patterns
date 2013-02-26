package com.pattern.prototype;

public class Main {

	public static void main(String[] args) {
		Sheep sheep = new Sheep();
		CloneFactory cf = new CloneFactory();
		Sheep s = (Sheep) cf.getClone(sheep);
		
		System.out.println(sheep.hashCode());
		System.out.println(s.hashCode());

	}

}
