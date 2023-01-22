package com.kodilla.jacoco;

public class Year {
    int leapYear;

    public Year(int leapYear) {
        this.leapYear = leapYear;
    }

    public boolean isLeap() {
        return this.leapYear % 4 == 0 && this.leapYear % 100 != 0 || this.leapYear % 400 == 0;
    }
}
