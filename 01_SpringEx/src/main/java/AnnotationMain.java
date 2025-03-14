import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.CarConfig;
import model.Benz;
import model.Kia;
import model.Tesla;

public class AnnotationMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CarConfig.class);
		
		String[] beans=ctx.getBeanDefinitionNames();
		
		for(String name:beans) {
			System.out.println(name);
		}
		
		Kia kia=ctx.getBean(Kia.class);
		kia.move();
		System.out.println(kia);
		
		Tesla tesla=(Tesla)ctx.getBean("Bmw");
		tesla.move();
		System.out.println(tesla);
		
		Benz benz= (Benz) ctx.getBean("benz");
		benz.move();
		System.out.println(benz);
	}

}
