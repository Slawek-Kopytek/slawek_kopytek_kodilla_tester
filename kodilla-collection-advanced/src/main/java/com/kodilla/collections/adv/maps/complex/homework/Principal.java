package com.kodilla.collections.adv.maps.complex.homework;

import java.util.Objects;

public class Principal {
    private String lastname;
    private String schoolName;

    public Principal(String lastname, String schoolName) {
        this.lastname = lastname;
        this.schoolName = schoolName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(lastname, principal.lastname)
                && Objects.equals(schoolName, principal.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, schoolName);
    }

    @Override
    public String toString() {
        return "Principal " + lastname + " " + schoolName;
    }
}
