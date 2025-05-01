package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> availableAirports = new HashMap<>();
        availableAirports.put("Warsaw", true);
        availableAirports.put("Berlin", true);
        availableAirports.put("Paris", false);
        availableAirports.put("New York", true);

        if (!availableAirports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Airport " + flight.getArrivalAirport() + " not found in the database.");
        }

        return availableAirports.get(flight.getArrivalAirport());
    }
}
