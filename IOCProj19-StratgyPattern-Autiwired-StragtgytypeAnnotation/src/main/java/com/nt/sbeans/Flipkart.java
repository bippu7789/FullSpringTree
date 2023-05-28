package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	@Autowired
	@Qualifier("bDart")
	Courier courier;
	
	

	// Has a property
	public Flipkart() {
		System.out.println("0- param constructor::");
	}

	public String shoping(String[] itom, double[] prices) {
		System.out.println("Flipkart shoping::");
		// calculate maounnt
		double billAmount = 0.0;
		for (double p : prices) {
			billAmount += p;
		}
		// Generate order id
		int oid = new Random().nextInt(1000000);
		// use courier
		String msg = courier.deliver(oid);
		return Arrays.toString(itom) + "Are perchaging having bill amount::" + billAmount + "" + msg;
	}

}
