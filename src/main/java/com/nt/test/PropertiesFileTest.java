package com.nt.test;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.sbeans.Employee;

public class PropertiesFileTest {

	public static void main(String[] args) {

		// Create application container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		// get Spring bean class objects
		Employee emp = ctx.getBean(Employee.class);
		// Display Spring bean class object data
		System.out.println("Emp data::" + emp);

		Environment env = ctx.getEnvironment();
		System.out.println(env.getProperty("emp.id"));
		System.out.println(env.getProperty("emp.name"));
		System.out.println(env.getProperty("emp.address"));

		System.out.println(System.getProperties());
		System.out.println("======================");
		Date date = ctx.getBean("dt", Date.class);
		System.out.println(date);
		// close the container
		ctx.close();

	}

}
