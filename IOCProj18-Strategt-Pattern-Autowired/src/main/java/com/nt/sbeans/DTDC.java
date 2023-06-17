package com.nt.sbeans;

public final class DTDC implements Courier {
	public DTDC() {
		System.out.println("0 param constructor");
	}

	@Override
	public String deliver(int oid) {
		return oid + "Order is assigned to DTDC for delivery::";
	}

}
