package com.bean;

public class Main {

	public static void main(String[] args) {
		//User user=new User();
		
		//user.setName("");
		
		//建構式注入
		Toyota car1=new Toyota(new ToyotaEngine());
		Toyota car2=new Toyota(new BenzEngine());
		car1.move();
		car2.move();
		//setter注入
		Benz car3=new Benz();
		car3.setEngine(new BenzEngine());
		car3.move();

	}

}
