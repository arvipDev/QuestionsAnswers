package com.prep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MyGenerics<R, S> {

    private R teacher;
    private S student;

    public R getTeacher() {
        return teacher;
    }

    public void setTeacher(R teacher) {
        this.teacher = teacher;
    }

    public S getStudent() {
        return student;
    }

    public void setStudent(S student) {
        this.student = student;
    }

    public <T> HashSet<T> pplInClass (HashSet<T> students, HashSet<T> teachers) {
        HashSet<T> pplInClass = new HashSet<>(students);
        pplInClass.addAll(teachers);

        return pplInClass;
    }




}
