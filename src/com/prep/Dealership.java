package com.prep;

public class Dealership {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.setName("Tim");
        cust1.setAddress("1234 at Monroe Way");
        cust1.setCashInHand(12000);

        Customer cust2 = new Customer();
        cust2.setName("Tim");
        cust2.setAddress("1234 at Monroe Way");
        cust2.setCashInHand(12000);

        System.out.println("Comparing customers " + cust1.equals(cust2));

        Vehicle vehicle = new Vehicle();
        vehicle.setMake("BMW");
        vehicle.setModle("2020");
        vehicle.setPrice(10000);
        Employee emp = new Employee();

        cust1.purchaseCar(vehicle, emp, false);

    }
}
