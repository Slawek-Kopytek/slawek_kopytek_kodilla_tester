package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Józef Bem", 3, true));
        stamps.add(new Stamp("Stanisław Koniecpolski", 2.5, true));
        stamps.add(new Stamp("Jeremi Wiśniowiecki", 2, false));
        stamps.add(new Stamp("Stanisław Żółkiewski", 2.5, false));
        stamps.add(new Stamp("Józef Bem", 3, true));
        stamps.add(new Stamp("Józef Bem", 1, true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
