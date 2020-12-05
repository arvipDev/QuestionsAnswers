package com.exceptions;

import java.util.Map;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private int rollNo;

    public Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public int hashCode() {
        int mul = 413;
        mul += mul + age + rollNo + name.hashCode();
        return mul;
    }

    @Override
    public String toString() {
        return ("Name " + this.name + " ,Age " + this.age + " ,rollNo " + this.rollNo);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return (this.name.equals(student.name) || this.rollNo == student.rollNo || this.age == student.age);
    }

    @Override
    public int compareTo(Student o) {
        if (o == null) return 0;
        if (this.age < o.age) return 1;
        if (this.age > o.age) return -1;
        return 0;
    }
}
