package com.javalesson.oop.oop;

public enum Size {

    VERY_SMALL("XS)"), SMALL("S)"), MEDIUM("M"), BIG("L)"), VERY_BIG("XL"), UNDEFINED("");

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    private String abbreviation;

    public String getAbbreviation() {
        return abbreviation;
    }

}
