package com.nt.sbeans;

public final class FirstFlight implements Courier {
	public FirstFlight() {
		System.out.println("FirstFlight::0 param constructor");
	}

	@Override
	public String deliver(int oid) {
		return oid + "Order id assigned to firstFlight for delivery";
	}

}
