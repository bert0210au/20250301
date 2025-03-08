package model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class KiaEngine implements Engine{

	@Override
	public void start() {
		System.out.println("Kia引擎發動");
		
	}
	
}
