package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoteElgibilityCheckingService;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		// create container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get spring bean class object ref
		VoteElgibilityCheckingService service = ctx.getBean("voting", VoteElgibilityCheckingService.class);
		// Invoke the business method
		String result = service.checkVotingEligiblity();
		System.out.println("Result" + result);
		// close the container
		ctx.close();

	}

}
