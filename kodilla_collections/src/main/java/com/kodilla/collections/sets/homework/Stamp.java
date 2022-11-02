package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampDimension;
    private boolean stamped;

    public Stamp(String stampName, double stampDimension, boolean stamped) {
        this.stampName = stampName;
        this.stampDimension = stampDimension;
        this.stamped = stamped;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampDimension() {
        return stampDimension;
    }

    public boolean isStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stamped == stamp.stamped
                && Objects.equals(stampName, stamp.stampName)
                && Objects.equals(stampDimension, stamp.stampDimension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampDimension, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampDimension='" + stampDimension + '\'' +
                ", stamped=" + stamped +
                '}';
    }
}
