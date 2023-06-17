package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Flipkart;

/**
 * Hello world!
 *
 */
public class SterioTypeAnotationTest {
	public static void main(String[] args) {
		// Create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
		// Get target spring bean class object
		Flipkart flpkt = ctx.getBean("fpkt", Flipkart.class);
		// Invoke b method
		String msg = flpkt.shoping(new String[] { "shhirt", "trouser", "belt" },
				new double[] { 1000.0, 5000.0, 1900.0 });
		System.out.println(msg);
		ctx.close();
	}
}
