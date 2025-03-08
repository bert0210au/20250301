package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import model.Kia;
import model.KiaEngine;
import model.Tesla;
import model.ToyotaEngine;


@Configuration
@ComponentScan(basePackages = {"model"})
public class CarConfig {
	
	@Bean
	public Kia kia() {
		return new Kia(new KiaEngine());
	}
	
	@Bean(name="Bmw")
	public Tesla tesla() {
		return new Tesla(new ToyotaEngine());
	}

}
