package com.exam;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Prep {

    public static void main(String[] args) {
        q5();
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
    // private static void q2 () {}
}
