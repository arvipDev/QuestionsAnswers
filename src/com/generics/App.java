package com.generics;

import java.util.LinkedList;

public class App {

    public static void main(String[] args) {

        testOne();
        testTwo();
        testThree();

    }
    private static void testOne() {
        LinkedList<Employee> listOfEmp = new LinkedList<>();
        listOfEmp.add(new Developer("Arvind", 15486, 29, 16));
        listOfEmp.add(new Tester("Alex", 89666, 38, 8));
        listOfEmp.add(new HumanResource("Bub", 14477, 47, 22));
        listOfEmp.add(new HumanResource("Dan", 45278, 45, 4));
        listOfEmp.add(new Developer("Laura", 45781, 23, 15));
        listOfEmp.add(new Tester("Shane", 14895, 28, 9));


        Organisation<Employee> memOfOrg = new Organisation<>();
        memOfOrg.setEmp(listOfEmp);
        memOfOrg.getEmp().get(2).applyLeave(3);
        System.out.println(memOfOrg.getEmp().get(2).leaves);
        System.out.println(memOfOrg.getRemainingLeaves(memOfOrg.getEmp().get(2)));
    }

    private static void testTwo(){
        Developer dev1 = new Developer("Arvind", 15486, 29, 16);
        Developer dev2 = new Developer("Alex", 14411, 58, 5);
        Developer dev3 = new Developer("Mathew", 25272, 25, 24);
        Developer dev4 = new Developer("Chris", 86868, 25, 13);
        Developer dev5 = new Developer("Ajay", 77373, 35, 18);

        LinkedList<Developer> developers = new LinkedList<>();
        developers.add(dev1);
        developers.add(dev2);
        developers.add(dev3);
        developers.add(dev4);
        developers.add(dev5);

        Organisation<Developer> devList = new Organisation<>();
        devList.setDev(developers);
        System.out.println(devList.getDev().toString());
        System.out.println(devList.getRemainingLeaves(devList.getDev()
                .get(devList.getDev().indexOf(dev3))));

    }

    private static void testThree(){
        Developer dev1 = new Developer("Arvind", 15486, 29, 16);
        HumanResource dev2 = new HumanResource("Alex", 14411, 58, 5);
        Developer dev3 = new Developer("Mathew", 25272, 25, 24);
        HumanResource dev4 = new HumanResource("Chris", 86868, 25, 13);
        Tester dev5 = new Tester("Ajay", 77373, 35, 18);

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(dev1);
        employees.add(dev2);
        employees.add(dev3);
        employees.add(dev4);
        employees.add(dev5);

        Organisation<Employee> empList = new Organisation<>();
        empList.setEmp(employees);
        System.out.println(empList.getAny(dev3).toString());

    }
}
