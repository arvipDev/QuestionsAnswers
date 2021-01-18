package com.inheritance;

import java.io.*;

public class App {

    static int an = 10;
    int some = 10 + an;
    private int ddd(){
        System.out.println(this.an);
        System.out.println(an);
        System.out.println(App.an);
        an += 25;
        System.out.println(an);
        return some;
    }

    public static void main(String[] args) {
        t4();
        try {
            t1();
        } catch (FileNotFoundException e){
            System.out.println(e);
        }
    }

    private static void t4() {
        File file = new File("D:\\Mine/DS");
        try(FileReader reader = new FileReader(file); BufferedReader r = new BufferedReader(reader)) {
            String s = r.readLine();
            while (s != null){
                System.out.println(s);
                s = r.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void t1() throws NullPointerException, FileNotFoundException{
        System.out.println("t1");
        t2();
    }


    private static void t2() throws FileNotFoundException {
        System.out.println("t2");
        t3();
    }

    private static void t3() throws FileNotFoundException {
        System.out.println("t3");
        throw new FileNotFoundException();
    }

    private static int test3(){
        int result = 0;
        try{
            result = 18/0;
            return result;
        } catch (ArithmeticException e){
            try{
                result = 10/0;
            } catch (ArithmeticException e1){
                System.out.println("Catch-try");
                System.out.println(e1.toString());
            }
            System.out.println(result);
            System.out.println(e);
            return -1;
        } finally {
            System.out.println("Here in finally");
            // this return overrides return from try-catch blocks
            // return 0;
        }
    }

    private static void test2(){
        try{
            System.out.println("In Outer TC block");
            try {
                System.out.println("In Inner TC block");
                String s = null;
                System.out.println(s.length());
            }catch (NullPointerException e){
                System.out.println(e);
            }
            System.out.println("In Outer TC block");
            int[] a = new int[3];
            System.out.println(a[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("Exiting...");
        }
    }

    private static void excep(){
        File f = new File("");
        try {
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String s = bf.readLine();
            while (!s.isEmpty()){
                System.out.println(s);
                s = bf.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void test(){
        // Class and its child. Instance variable is of type Mother (class) hence static method is accessed using instance variable.
        // No overriding methods in child class therefore Son.dumb() calls the static method of its parent class Mother.
        Mother mom = new Son();
        mom.dumb();
        Son.dumb();

        Mother mother = new Mother();
        mother.dumb();

        // Interface and its implementation. Instance variable is of type Parent (interface). Since interfaces can not be instantiated,
        // instance variable can not be used to access static method in interface. But it can be directly accessed using Parent.dumb()
        Parent par = new Daughter();
        //par.dumb();
        Parent.dumb();
        //Daughter.dumb();

        // Mother class extended by child Son2 and static method is overridden. But the parent's instance variable still calls the
        // parent static method and not the overridden method. Child class method can be called using Child class name - Son2.dumb()
        Mother m1 = new Son2();
        m1.dumb();
        Son2.dumb();

        Parent pa = new Daughter2();
        //pa.dumb();
        Parent.dumb();

        Daughter da = new Daughter();
        //da.dumb();
        //Daughter.dumb();
    }

    private static void staticCall(){
        // static variable in interface being accessable using reference variable
        Z z = new XYZ();
        System.out.println(z.name);
    }

    private void staticVariableCall(){
        System.out.println(this.an);
    }

    private static void aaa () {
        int aa = 10;
        double bb = 20;
        aa = (int)bb;
        System.out.println(aa);
        byte vv = 8;
        short xx = 10;
        xx = vv;
        System.out.println(xx);
        xx = 1500;
        System.out.println(xx);
        vv = (byte)xx;
        System.out.println(vv);
    }

    private static void bbb(String... arg) {
        for (String c : arg)
        System.out.println(c);
    }
}
