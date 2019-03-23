package com.javagda21.wzorce.creational.abstractfactory.zad2;

public class Bike {
    private String manufacturer;
    private int seats;
    private int gears;
    private BikeType bikeType;

    public Bike(String manufacturer, int seats, int gears, BikeType bikeType) {
        this.manufacturer = manufacturer;
        this.seats = seats;
        this.gears = gears;
        this.bikeType = bikeType;
    }
}
