package exam.prep;

public class Dealership {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.setName("Tim");
        cust1.setAddress("1234 at Monroe Way");
        cust1.setCashInHand(12000);

        Vehicle vehicle = new Vehicle();
        vehicle.setMake("BMW");
        vehicle.setModle("2020");
        vehicle.setPrice(10000);
        Employee emp = new Employee();

        cust1.purchaseCar(vehicle, emp, false);

    }
}
