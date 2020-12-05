package com.exceptions;

import java.util.*;

public class MyCollections {
    //Arrays, ArrayList, LinkedList
    public static void main(String[] args) {
        //testOne();
        //testTwo();
        //testThree();
        testFour();
    }

    private static void testOne () {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("I");
        alist.add("am");
        alist.add("Arvind");
        alist.add("Purushotham");
        alist.add("Age");
        alist.add("29");
        System.out.println(alist.indexOf("Arvind"));
        //alist.remove(2);
        alist.iterator().forEachRemaining(s -> System.out.println(s));
        System.out.println(alist.iterator().hasNext());
        System.out.println(alist.iterator().next());
        System.out.println(alist.toString());
        for(String name: alist){
            System.out.println(name);
        }
    }

    private static void testTwo () {
        LinkedList<String> alist = new LinkedList<>();
        alist.add("I");
        alist.add("am");
        alist.add("Arvind");
        alist.add("Purushotham");
        alist.add("Age");
        alist.add("29");
        //System.out.println(alist.indexOf("Arvind"));
        //System.out.println(alist.element());
        //System.out.println(alist.offer("years"));
        //alist.iterator().forEachRemaining(s -> System.out.println(s));
        //alist.remove();
        //alist.iterator().forEachRemaining(s -> System.out.println(s));
        //alist.addAll(6, alist);
        System.out.println("*****************");
        //alist.iterator().forEachRemaining(s -> System.out.println(s));

        LinkedList<String> blist = new LinkedList<>(alist);
        System.out.println(blist.toString());
        blist.removeAll(alist);
        System.out.println(blist.isEmpty());
        blist.addAll(alist);
        System.out.println(alist.toString());
        blist.removeFirst();
        blist.removeLast();
        blist.remove("Age");
        System.out.println(blist.toString());
        alist.retainAll(blist);
        System.out.println(alist.toString());
        System.out.println(alist.equals(blist));

    }
    private static void testThree(){
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Arvind");
        names.add("Purushotham");
        names.add("Sneha");
        names.add("Bilinti");
        names.add("Bilinti");
        names.add("Bilinti");
        names.iterator().forEachRemaining(s -> System.out.println(s));
        // if a custom object is assigned as type for LinkedHashSet, then the custom class must define toString, equals and
        // hashCode.
    }

    private static void testFour(){
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("Arvind", 29, 1354));
        students.add(new Student("Sneha", 29, 1324));
        students.add(new Student("Alex", 35, 6684));
        students.add(new Student("Pat", 19, 2114));
        students.add(new Student("Linda", 23, 1687));
        students.add(null);
        students.add(null);

        System.out.println(students.size());
        System.out.println(students.toString());
        LinkedList<Student> list = new LinkedList<Student>(students);
        Collections.sort(list);
        System.out.println(list);
    }

}
