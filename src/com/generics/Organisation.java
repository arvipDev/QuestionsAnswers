package com.generics;

import java.util.LinkedList;

public class Organisation<T extends Employee> {

    private LinkedList<T> emp;
    private LinkedList<Developer> dev;

    public Organisation (){}

    public void setEmp (LinkedList<T> emp){
        this.emp = emp;
    }

    public void setDev (LinkedList<Developer> dev){
        this.dev = dev;
    }

    public LinkedList<T> getEmp() {
        return emp;
    }

    public LinkedList<Developer> getDev() {
        return dev;
    }

    public int getRemainingLeaves (T emp) {
        return emp.leaves;
    }

    public T getAny (T any){
        return emp.get(emp.indexOf(any));
    }
}
