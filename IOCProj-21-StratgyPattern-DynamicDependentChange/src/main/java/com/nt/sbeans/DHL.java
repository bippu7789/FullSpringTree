package com.nt.sbeans;

public final class DHL implements Courier{
	public DHL() {
		System.out.println("DHL 0- param constructor");
	}

	@Override
	public String deliver(int oid) {
		return oid+"Order id assigned to DHL for delivery";
	}

}
