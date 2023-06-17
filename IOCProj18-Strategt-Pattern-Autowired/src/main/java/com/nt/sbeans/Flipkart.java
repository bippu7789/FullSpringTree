package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public final class Flipkart {
	@Autowired
	Courier courier;

	@Autowired
	@Qualifier("bDart")
	public void setCourier(Courier courier) {
		System.out.println("FlipCart set courier");
		this.courier = courier;
	}

	// Has a property
	public Flipkart() {
		System.out.println("0- param constructor::");
	}

	public String shoping(String itoms[], double prices[]) {
		System.out.println("Flipkart shoping::");
		double billAmount = 0.0;
		for (double p : prices) {
			billAmount += p;
		}
		// generate orderId
		int orderId = new Random().nextInt(100000);
		// use courier
		String msg = courier.deliver(orderId);
		return Arrays.toString(itoms) + "are perchaging havinng bill amount" + billAmount + "---->" + msg;
	}

}
