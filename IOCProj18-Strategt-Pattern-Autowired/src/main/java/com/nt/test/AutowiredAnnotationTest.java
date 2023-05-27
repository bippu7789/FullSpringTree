package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class AutowiredAnnotationTest {

	public static void main(String[] args) {
// Create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get target spring bean class objects
		Flipkart flkt = ctx.getBean("fpkt", Flipkart.class);
		// invoke
		String msg = flkt.shoping(new String[] { "shirt", "trouser", "bealt" }, new double[] { 100.0, 400.0, 500.0 });
		System.out.println(msg);
	}

}
