package com.kodilla.collections.adv.maps.complex.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> classes = new ArrayList<>();

    public School(List<Double> classes){
        this.classes = classes;
    }

    public double getSum(){
        double sum = 0;
        for (double students : classes)
            sum +=students;
        return sum;
    }

    @Override
    public String toString() {
        return "School: " + classes;
    }
}
