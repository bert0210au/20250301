import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Toyota;

public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		String[] beans = ctx.getBeanDefinitionNames();
		
		for(String name:beans)
		{
			System.out.println(name);
		}
		
		Toyota car = ctx.getBean(Toyota.class);
				
		car.move();
	}

}
