package com.nt.beans;

import java.util.Date;

public class VoteElgibilityCheckingService {
	private String name;
	private int age;
	private Date verifiedOn;

	public VoteElgibilityCheckingService() {
		System.out.println("VoteElgibilityCheckingService:: 0 param constructor");
	}

	public void setName(String name) {
		System.out.println("VoteElgibilityCheckingService:: setName");
		this.name = name;

	}

	public void setAge(int age) {
		System.out.println("VoteElgibilityCheckingService:: setAge");
		this.age = age;
	}

	// Init lifecycle method
	public void myInit() {
		System.out.println("VoteElgibilityCheckingService::myInit()");
		verifiedOn = new Date();// Initialization of left over property who are not in injection
		if (name == null || age < 0) { // validation on injected value
			throw new IllegalArgumentException("Invalid input name or age");
		}

	}

	// Destroy Lifecycle method
	public void myDestroy() {
		System.out.println("VoteElgibilityCheckingService:: destroy()");
		name = null;
		age = 0;
		verifiedOn = null;
	}

	// bisuness method
	public String checkVotingEligiblity() {
		System.out.println("VoteElgibilityCheckingService.checkvotingEligility()::" + verifiedOn);
		if (age > 18) {
			return "Mr./Mrs./Miss." + name + "you are eligible for voting";
		} else {
			return "Mr./Mrs./Miss." + name + "you are not eligible for voting";

		}
	}

}
