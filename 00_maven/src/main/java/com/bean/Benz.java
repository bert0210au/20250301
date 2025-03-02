package com.bean;

public class Benz {
	Engine engine;
	
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	
	public void move() {
		engine.start();
		System.out.println("Benz移動");
	}
}
