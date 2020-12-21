package com.functions;

import java.util.Objects;

public class Car {
    private int price;
    private String color;
    private int make;
    private String brand;

    public Car(int price, String color, int make, String brand) {
        this.price = price;
        this.color = color;
        this.make = make;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", make=" + make +
                ", dof='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price &&
                make == car.make &&
                color.equals(car.color) &&
                brand.equals(car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color, make, brand);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMake() {
        return make;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
