package com.auto.share;

import java.util.List;

public class AutoTrip {

	private boolean enabled;
	private TripTime tripTime;
	private int autoFee;
	private double numberOfTrips;
	private List<Person> persons;

	public AutoTrip(boolean enabled, TripTime tripTime, int autoFee, double numberOfTrips, List<Person> persons) {

		this.enabled = enabled;
		this.tripTime = tripTime;
		this.autoFee = autoFee;
		this.numberOfTrips = numberOfTrips;
		this.persons = persons;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public TripTime getTripTime() {
		return tripTime;
	}

	public int getAutoFee() {
		return autoFee;
	}

	public double getNumberOfTrips() {
		return numberOfTrips;
	}

	public List<Person> getPersons() {
		return persons;
	}
}
