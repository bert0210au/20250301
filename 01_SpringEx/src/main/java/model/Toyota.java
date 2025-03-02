package model;

public class Toyota{
	Engine engine;
	
	
	
	public Toyota() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Toyota(Engine engine) {
		this.engine=engine;
	}

	public void move() {
		// Toyota要能夠移動，必須要有可以啟動的引擎
		/*
		ToyotaEngine toyotaEngine=new ToyotaEngine();
		toyotaEngine.start();
		System.out.println("Toyota移動");
		*/
		/*
		start();
		System.out.println("(繼承)Toyota移動");
		*/
		
		engine.start();
		System.out.println("Toyota移動");
	}

}
