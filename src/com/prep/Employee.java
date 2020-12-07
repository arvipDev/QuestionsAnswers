package com.prep;

public class Employee {
    private String emplName;
    private String empId;

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void handleCustomer(Customer customer, Vehicle vehicle, Boolean financeNeeded){
        if (financeNeeded){
            double financeAmount = vehicle.getPrice() - customer.getCashInHand();
            runCreditCheck(customer, financeAmount);
        } else if(vehicle.getPrice() < customer.getCashInHand()){
            processTransaction(customer, vehicle);
        } else System.out.println("Get more cash to purchase this car.");

    }

    public void runCreditCheck(Customer customer, double doubleAmount){
        System.out.println("Ran credit history - Status:approved");
    }

    public void processTransaction(Customer customer, Vehicle vehicle){
        System.out.println("You now own: " + vehicle + " for " + vehicle.getPrice());
    }
}
