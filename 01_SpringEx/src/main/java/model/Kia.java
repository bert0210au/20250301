package model;

public class Kia {
	private Integer price;
	private Engine engine;

	public Kia() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Kia(Engine engine) {
		super();
		this.price = price;
		this.engine = engine;
	}

	public Kia(Integer price, Engine engine) {
		super();
		this.price = price;
		this.engine = engine;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Kia [price=" + price + ", engine=" + engine + "]";
	}
	
	public void move() {
		engine.start();
		System.out.println("Kia移動中");
	}
	
}
