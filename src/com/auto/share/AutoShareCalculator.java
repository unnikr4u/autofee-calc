package com.auto.share;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class AutoShareCalculator {

	public static Map<Person, Double> calculate(List<AutoTrip> trips) {

		Map<Person, Double> totals = new EnumMap<>(Person.class);

		for (AutoTrip trip : trips) {

			// ✅ Skip disabled trips
			if (!trip.isEnabled()) {
				continue;
			}

			double perPersonPerTrip = (double) trip.getAutoFee() / trip.getPersons().size();

			double perPersonTotal = perPersonPerTrip * trip.getNumberOfTrips();

			System.out.println("\nTrip Time: " + trip.getTripTime().getDisplay());
			System.out.println("Auto Fee: ₹" + trip.getAutoFee());
			System.out.println("Trips Count: " + trip.getNumberOfTrips());

			for (Person person : trip.getPersons()) {

				totals.put(person, totals.getOrDefault(person, 0.0) + perPersonTotal);

				System.out.println(person + " pays ₹" + perPersonPerTrip + " per trip, Total ₹" + perPersonTotal);
			}
		}
		return totals;
	}
}
