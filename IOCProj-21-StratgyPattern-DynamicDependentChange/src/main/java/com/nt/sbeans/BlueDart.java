package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("blueDart")
public final class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart 0- param constructor");
	}

	@Override
	public String deliver(int oid) {
		return oid + "order id assigned to BlueDart for delivery";
	}

}
