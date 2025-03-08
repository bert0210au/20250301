package model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyBean {

	public LazyBean() {
		super();
		System.out.println("Lazy建構式");
	}
	

}
