package com.kodilla.collections.adv.exercises.dictionary.homework;

import java.util.*;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure){
        List<Flight> departureTable = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTables()) {
            if (flight.getDeparture().equals(departure)){
                departureTable.add(flight);
            }
        }
        return departureTable;
    }


    public List<Flight> findFlightsTo(String arrival){
        List<Flight> arrivalTable = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTables()){
            if (flight.getArrival().equals(arrival)){
                arrivalTable.add(flight);
            }
        }
        return arrivalTable;
    }
}
