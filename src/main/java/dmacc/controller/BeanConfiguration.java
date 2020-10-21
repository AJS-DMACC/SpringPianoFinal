package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import dmacc.beans.Piano;

@Configuration
public class BeanConfiguration {

	@Bean
	public Piano piano() {
		Piano bean = new Piano();
		bean.setIsElectric(true);
		bean.setBrand("Casio");
		bean.setNumKeys(44);
		bean.setSerialNum(514583487);
		return bean;
	}
}
