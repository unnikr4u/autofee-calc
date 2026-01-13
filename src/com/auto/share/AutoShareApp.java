package com.auto.share;

import java.util.List;
import java.util.Map;

public class AutoShareApp {

	public static void main(String[] args) {

		List<AutoTrip> trips = List.of(

				// ✅ ENABLED
				new AutoTrip(true, TripTime.AM_7, 300, 20, List.of(Person.SARANG, Person.PALLAVI, Person.NORAH)),

				// ✅ ENABLED
				new AutoTrip(true, TripTime.AM_8, 250, 20, List.of(Person.SMRITHI, Person.IVANSHI)),

				//  ✅ ENABLED
				new AutoTrip(true, TripTime.PM_3_30, 300, 20,
						List.of(Person.SARANG, Person.PALLAVI, Person.NORAH, Person.IVANSHI)),

				// ❌ DISABLED
				new AutoTrip(false, TripTime.PM_1, 300, 5, List.of(Person.SARANG, Person.PALLAVI, Person.NORAH)));

		Map<Person, Double> totals = AutoShareCalculator.calculate(trips);

		System.out.println("\n===== FINAL TOTAL =====");

		double subTotal = 0.0;

		for (Map.Entry<Person, Double> entry : totals.entrySet()) {
		    System.out.println(entry.getKey() + " TOTAL = ₹" + entry.getValue());
		    subTotal += entry.getValue();
		}

		System.out.println("--------------------------");
		System.out.println("SUB TOTAL = ₹" + subTotal);

	}
}
