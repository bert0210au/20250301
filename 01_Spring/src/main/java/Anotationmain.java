import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import model.Toyota;

public class Anotationmain {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext();
		
		String[] beans = ctx.getBeanDefinitionNames();
		
		for(String name:beans)
		{
			System.out.println(name);
		}
		

	}

}
