package com.kodilla.exception.test;

public class FlightFinderMain {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("Warsaw", "Berlin");
        Flight flight2 = new Flight("London", "Tokyo");

        try {
            boolean isAvailable = flightFinder.findFlight(flight1);
            System.out.println("Flight from " + flight1.getDepartureAirport() +
                    " to " + flight1.getArrivalAirport() + " is available: " + isAvailable);
        } catch (RouteNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            boolean isAvailable = flightFinder.findFlight(flight2);
            System.out.println("Flight from " + flight2.getDepartureAirport() +
                    " to " + flight2.getArrivalAirport() + " is available: " + isAvailable);
        } catch (RouteNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
