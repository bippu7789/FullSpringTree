package com.nt.sbeans;

public final class DTDC implements Courier {
	public DTDC() {
		System.out.println("DTDC::0 - param constructor");
	}

	@Override
	public String deliver(int oid) {
		return oid + "Order id assigned to DTDC for deliver";
	}

}
