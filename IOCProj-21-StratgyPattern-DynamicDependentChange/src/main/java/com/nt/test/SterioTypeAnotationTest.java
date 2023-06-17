package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class SterioTypeAnotationTest {

	public static void main(String[] args) {
		// Create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get Target spring bean class object
		Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);
		// Invoke b method
		String msg = fpkt.Shoping(new String[] { "Shirt", "Trouser", "Belts" }, new double[] { 100.0, 500.0, 300.0 });
		System.out.println(msg);
		ctx.close();
	}

}
