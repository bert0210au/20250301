package model;

public class Tesla {
	public Engine engine;

	public Tesla() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tesla(Engine engine) {
		super();
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Tesla [engine=" + engine + "]";
	}
	
	public void move() {
		engine.start();
		System.out.println("Tesla移動中");
	}
}
