import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.CarConfig;
import model.Kia;
import model.LazyBean;
import model.ProtoTypeBean;
import model.SingletonBean;

public class ScopeMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CarConfig.class);

		String[] beans = ctx.getBeanDefinitionNames();

		for (String name : beans) {
			System.out.println(name);
		}
		
		SingletonBean bean1=ctx.getBean(SingletonBean.class);
		System.out.println(bean1);
		
		SingletonBean bean2=ctx.getBean(SingletonBean.class);
		System.out.println(bean2);
		//兩個用相同的記憶體，Singleton=相同單一物件
		//例如一個String ="2025/03/08" 要轉成 Date date=util.parseDate(dateStr);
		//一般不需要第二個日期所以用Singleton即可
;		
		ProtoTypeBean protoTypeBean1=ctx.getBean(ProtoTypeBean.class);
		System.out.println(protoTypeBean1);
		
		ProtoTypeBean protoTypeBean2=ctx.getBean(ProtoTypeBean.class);
		System.out.println(protoTypeBean2);
		//兩個用不同的記憶體，ProtoType=不同物件
		
		System.out.println("==========Lazy====================");
		
		LazyBean lazyBean = ctx.getBean(LazyBean.class);
		//有呼叫才會產生建構式，如果沒加@Lazy，建構式會在Spring開啟便產生

	}

}
