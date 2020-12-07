package com.prep;

import java.util.Objects;

public class Customer {

    private String name;
    private double cashInHand;
    private String address;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setCashInHand(double cashInHand){
        this.cashInHand = cashInHand;
    }

    public double getCashInHand(){
        return this.cashInHand;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return this.address;
    }


    public void purchaseCar (Vehicle vehicle, Employee emp, Boolean financeNeeded) {
        emp.handleCustomer(this, vehicle, financeNeeded);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer cust = (Customer) o;
        return Objects.equals(cust.address, this.address) &&
                Objects.equals(cust.name, this.name) &&
                Double.compare(cust.cashInHand, this.cashInHand) == 0;

    }
}
