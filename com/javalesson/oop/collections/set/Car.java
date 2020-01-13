package com.javalesson.oop.collections.set;

import java.util.Objects;

public class Car implements Comparable<Car> {

    private final String carBrand;
    private final String carModel;
    private final Integer pricePerDay;

    public Car(String carBrand, String carModel, int pricePerDay) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.pricePerDay = pricePerDay;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carBrand, car.carBrand) &&
                Objects.equals(carModel, car.carModel) &&
                Objects.equals(pricePerDay, car.pricePerDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, carModel, pricePerDay);
    }

    @Override
    public int compareTo(Car car) {
        if (pricePerDay < car.getPricePerDay()) {
            return -1;
        }
        if (pricePerDay > car.getPricePerDay()) {
            return +1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return carBrand + " "+carModel +" " + pricePerDay ;
    }
}
