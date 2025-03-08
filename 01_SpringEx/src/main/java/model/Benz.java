package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Benz {
	@Autowired
	@Qualifier("toyotaEngine") //要用bean的名稱
	Engine engine;
	
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	
	
	
	@Override
	public String toString() {
		return "Benz [engine=" + engine + "]";
	}



	public void move() {
		engine.start();
		System.out.println("Benz移動");
	}
}
