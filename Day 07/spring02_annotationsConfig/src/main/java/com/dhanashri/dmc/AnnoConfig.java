package com.dhanashri.dmc;

import org.springframework.context.annotation.Bean;

public class AnnoConfig {
	
	@Bean
	public Box b1() {
		// setter based bean definition
		Box b11 = new Box();
		b11.setLength(5);
		b11.setBreadth(5);
		b11.setHeight(20);
		return b11;
	}
	
	@Bean
	public Box b2() {
	// constructor based bean definition
		Box b22 = new Box(10,20,30);
		return b22;
	
	}
	

}
