package model;

public class kia {
	
	
	private Integer price;
	
	private Engine engine;

	public kia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public kia(Integer price, Engine engine) {
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
		return "kia [getPrice()=" + getPrice() + ", getEngine()=" + getEngine() + "]";
	}

	
}
