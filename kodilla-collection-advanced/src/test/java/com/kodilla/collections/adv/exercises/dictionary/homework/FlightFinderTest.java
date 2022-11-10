package com.kodilla.collections.adv.exercises.dictionary.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTest {

    @Test
    void findFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        //given
        flightFinder.findFlightsFrom("Lodz");
        flightFinder.findFlightsFrom("Malmo");
        flightFinder.findFlightsFrom("Paryz");
        flightFinder.findFlightsFrom("Malmo");
        flightFinder.findFlightsFrom("Pyrzowice");
        flightFinder.findFlightsFrom("Berlin");
        // when
        List<Flight> result = flightFinder.findFlightsFrom("Berlin");
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Berlin", "Barcelona"));
        assertEquals(expectedList, result);
    }

    @Test
    void findFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        //given
        flightFinder.findFlightsTo("Warszawa");
        //when
        List<Flight> result = flightFinder.findFlightsTo("Warszawa");
        //then
        assertEquals(3, result.size());
    }
}