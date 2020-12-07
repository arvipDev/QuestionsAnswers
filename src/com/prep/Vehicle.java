package com.prep;

import java.util.Objects;

public class Vehicle {

    private String make;
    private String modle;
    private double price;
    private int age;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModle() {
        return modle;
    }

    public void setModle(String modle) {
        this.modle = modle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", modle='" + modle + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.price, price) == 0 &&
                age == vehicle.age &&
                Objects.equals(make, vehicle.make) &&
                Objects.equals(modle, vehicle.modle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, modle, price);
    }
}
