import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.CarConfig;
import model.LifeCycleBean;
import model.SingletonBean;

public class LifeCycleMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CarConfig.class);
		//只有AnnotationConfigApplicationContext才有close方法
		String[] beans = ctx.getBeanDefinitionNames();

		for (String name : beans) {
			System.out.println(name);
		}
		
		LifeCycleBean bean1=ctx.getBean(LifeCycleBean.class);
		bean1.setName(null);
		
		
		System.out.println("Spriing要被關了~~~");
		ctx.close();
	}

}
