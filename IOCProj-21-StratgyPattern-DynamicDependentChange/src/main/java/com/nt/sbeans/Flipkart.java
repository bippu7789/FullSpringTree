package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	@Autowired
	@Qualifier("dPartner")
	Courier courier;

	// Has a properties
	public Flipkart() {
		System.out.println("0- Param constructor::");
	}

	public String Shoping(String[] itoms, double[] prices) {
		System.out.println("Flipcart shoping");
		// Calculate business amount
		double billAmt = 0.0;
		for (double p : prices) {
			billAmt += p;
		}
		// generate order ID
		int oid = new Random().nextInt(100000);
		// use courier
		String msg = courier.deliver(oid);
		return Arrays.deepToString(itoms) + "Are perchaged having bill amount" + billAmt + "--->" + msg;

	}

}
