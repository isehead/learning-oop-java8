package com.javalesson.oop.inheritance;

public class ElectricCar extends Auto {

    private int batteryVolume;
    private int passengersNumbers;

    public ElectricCar(String producer, String model, int batteryVolume, int passengersNumbers) {
        super(producer, model, new Engine());
        this.batteryVolume = batteryVolume;
        this.passengersNumbers = passengersNumbers;
    }

    private void charge() {
        System.out.println("Battery is charging");
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }

    public int getPassengersNumbers() {
        return passengersNumbers;
    }

    public void setPassengersNumbers(int passengersNumbers) {
        this.passengersNumbers = passengersNumbers;
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("eCar is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("eCar has stopped");
    }

    @Override
    public void energize() {
        charge();
    }

}
