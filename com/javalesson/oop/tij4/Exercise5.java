package com.javalesson.oop.tij4;

public class Exercise5 {

    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        Dog testDog = new Dog();

        spot.name = "Spot";
        spot.says = "Ruff-ruff!";

        scruffy.name = "Scruffy";
        scruffy.says = "Wurf-wurf!";

        spot.bark(spot.name, spot.says);
        scruffy.bark(scruffy.name, scruffy.says);

        testDog = spot;

        if (testDog == spot) {
            System.out.println("Dogs are equal ==");
        } else {
            System.out.println("Dogs are NOT equal ==");
        }

        if (testDog.equals(spot)) {
            System.out.println("Dogs are EQUAL");
        } else {
            System.out.println("Dogs are NOT EQUAL");
        }

    }


}


