package com.generics;

public class Developer extends Employee {

    public Developer (String name, int id, int age, int leaves) {
        super.id = id;
        super.name = name;
        super.age = age;
        super.leaves = leaves;
    }

    public void setId (int id){
        super.id = id;
    }
    public void setName (String name){
        super.name = name;
    }
    public void setAge (int age){
        super.age = age;
    }
    public void setLeaves (int leaves){
        super.leaves = leaves;
    }

    public String getName () {
        return super.name;
    }
    public int getId () {
        return super.id;
    }
    public int getAge () {
        return super.age;
    }
    public int getLeaves () {
        return super.leaves;
    }

    @Override
    public void applyLeave(int noOfLeaves) {
        this.leaves -= noOfLeaves;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Developer dev = (Developer) obj;
        return dev.age == this.age && dev.name.equals(this.name) && dev.id == this.id && dev.leaves == this.leaves;
    }

    @Override
    public String toString() {
        return ("Name: " + this.name + " ID: " + this.id + " Age: " + this.age + " Leaves: " + this.leaves);
    }
}
