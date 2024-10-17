package com.dhanashri.dmc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProgram {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AnnoConfig.class);
	    
		Box b1 = (Box) ctx.getBean("b1");
		System.out.println("b1 volume :" + b1.calculateVolume());
		
		Box b2 = (Box) ctx.getBean("b2");
		System.out.println("b2 volume : " + b2.calculateVolume());
		
	}

}
