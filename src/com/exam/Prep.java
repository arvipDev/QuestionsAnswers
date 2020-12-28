package com.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static java.lang.Integer.valueOf;

public class Prep {

    public static void main(String[] a) {
        q15();
    }
    private static void q1 () {

        int a = 100;
        System.out.println(-a++); // - is not assigned to a, it is only negating a while printing. Also, ++ will not be visible as
        // it is a post-incrementation.
        System.out.println("****************************");
        int num = 3;
        System.out.println(-num++);
        System.out.println(num);
        int val = 0;
        for (int i = 0; i <= 10; i++)
        {
            System.out.println(val);
            System.out.println(-val++);
        }
    }

    private static void q2 () {
        List<Character> list = new ArrayList<>();
        list.add(0, 'V'); // will add at 0th index
        list.add('T');                 // will add at 1st index
        list.add(1, 'E'); // will add at 1st index and move 1st index element to 2nd index
        list.add(3, 'O'); // will add at 3rd index

        if (list.contains('O'))
            list.remove('O');    // will take the ascii value of O = 79 as index. Throws index out of bound error.

        for (char c : list)
            System.out.println(c);
    }

    private static void q3 () {
        int[] arr = new int[] {2, 1, 0};
        for (int a : arr)
            System.out.println(arr[a]);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Arvind", 29));
        students.add(new Student("Arvind", 29));
        students.add(new Student("Sneha", 29));
        students.add(new Student("Arvind", 28));
        students.add(new Student("Arvind", 29));

        students.remove(new Student("Arvind", 29));

        for (Student student: students)
            System.out.println(student.toString());
    }

    private static void q4 () {
        List<LocalDate> localDates = new ArrayList<>();
        localDates.add(LocalDate.parse("2018-07-11"));
        localDates.add(LocalDate.parse("1919-02-25"));
        localDates.add(LocalDate.of(2020, 4, 8));
        localDates.add(LocalDate.of(1980, Month.DECEMBER, 3));

        localDates.removeIf(x -> x.getYear() < 2000);
        System.out.println(localDates);
        localDates.stream().forEach(System.out::println);
        System.out.println("*******************");
        localDates.removeIf(x -> x.isBefore(LocalDate.parse("2018-08-11")));
        localDates.stream().forEach(System.out::println);
    }

    private static void q5 () {
        new Student("a", 29);
        Student student = new Student("ab", 55);
        change(student);
        System.out.println("end of line");
    }
    private static void change(Student student){
        student = new Student("abc", 88);
    }

    private static void q6 () {
        LocalTime lc = LocalTime.of(16, 40);
        String amPm = lc.getHour() >= 12 ? (lc.getHour() == 12) ? "AM" : "PM": "PM";
        System.out.println(amPm);
    }

    private static void q7 (){
        do {
            System.out.println(100);
        } while (false);
        System.out.println("Out");
    }

    private static void q8 () {
        char var = 7;
        switch (var){
            case 7:
                System.out.println("Some var 7");
                break;
            default:
                System.out.println("Not print var");
        }
    }

    private static void q9 () {
        List<Character> list1 = new ArrayList<>();
        list1.add('A');
        list1.add('D');
        List<Character> list2 = new ArrayList<>();
        list2.add('B');
        list2.add('C');
        list1.addAll(1, list2);
        System.out.println(list1);
    }
    private static void q10 () {
        LocalDate ll = LocalDate.of(2020, 9, 31);
        System.out.println(ll);
    }

    private static void q11 () {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LocalDateTime obj = LocalDateTime.now();
            System.out.println(obj.getSecond());
        }
    }

    private static void q12 (){
        int i = 'm';
        m(i);
        char m = 'm';
        m(m);
    }

    private static void m (int m) {
        System.out.println(m);
        System.out.println("int version");
    }
    private static void m (char m) {
        System.out.println(m);
        System.out.println("char version");
    }

    private static void q13(){
        LocalDate neeYear = LocalDate.of(2018, 1, 1);
        LocalDate christmas = LocalDate.of(2018, 12, 25);
        Boolean f1 = neeYear.isAfter(christmas);
        Boolean f2 = neeYear.isBefore(christmas);
        System.out.println(f1 + " " + f2);
    }

    private static void q14(){
        Period per = Period.of(0, 0, 0);
        System.out.println(per);
    }
    private static void q15(){
        String[] arr = {"a", "Aaa", "AAA", "ABBA", "Bsw", "bss", "AaA"};
        Predicate<String> pred = s -> s.toUpperCase().startsWith("A");
        someTest(arr, pred);
    }

    private static void someTest (String[] arr, Predicate<String> predicate) {
        for (String s: arr){
            if (predicate.test(s))
                System.out.println(s);
        }
    }
}

interface Something {
    public void aaa();
    public void bbb();
}

abstract class Onething implements Something {
    @Override
    public void aaa() {}
}

class Everything extends Onething{
    @Override
    public void bbb() {}
}

