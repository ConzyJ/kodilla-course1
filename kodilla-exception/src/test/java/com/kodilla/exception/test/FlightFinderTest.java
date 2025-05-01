package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    void testFindFlight_existingAirport() {
        // Given
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Warsaw", "Berlin");

        // When & Then
        assertDoesNotThrow(() -> {
            boolean isAvailable = flightFinder.findFlight(flight);
            assertTrue(isAvailable);
        });
    }

    @Test
    void testFindFlight_nonExistingAirport() {
        // Given
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("London", "Tokyo");

        // When & Then
        assertThrows(RouteNotFoundException.class, () -> flightFinder.findFlight(flight));
    }
}
