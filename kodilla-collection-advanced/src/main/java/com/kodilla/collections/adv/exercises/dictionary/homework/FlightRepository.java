package com.kodilla.collections.adv.exercises.dictionary.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTables(){
        List<Flight> flightList = new ArrayList<>();

        flightList.add(new Flight("Lodz", "Warszawa"));
        flightList.add(new Flight("Paryz", "Warszawa"));
        flightList.add(new Flight("Malmo", "Warszawa"));
        flightList.add(new Flight("Bern", "Gdansk"));
        flightList.add(new Flight("Berlin", "Barcelona"));

        return flightList;
    }
}
