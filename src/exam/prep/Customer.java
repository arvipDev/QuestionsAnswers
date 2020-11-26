package exam.prep;

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
}
