package com.inheritance;

import com.database.Tester;
import com.prep.Tess;

import javax.naming.ServiceUnavailableException;
import java.io.*;
import java.time.Period;
import java.util.Objects;

public class App implements Tess {

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

    private static void inh(){
        Cla123 cl = new Cla123();
        cl.man();
        Cla3.man();
    }

    private static void mma() {
        int[] aaaa[] = new int[4][5];
        char aa = 97;
        System.out.println(aa);
        int vfv = aa;
        System.out.println(vfv);
        Character mn = '1';
        switch (mn){
            case '1':
                System.out.println("In " + mn);
                break;
            case 2:
                System.out.println("char " + mn);
                break;
        }
    }

    private static void sdf(){
        Sub su = new Sub();
        System.out.println(su.com);
        System.out.println(su.su);
        System.out.println(su.sb);

        Super sup = new Sub();
        System.out.println(sup.com);
        System.out.println(sup.su);

        Super supe = new Super();
        System.out.println(supe.com);
        System.out.println(supe.su);
        System.out.println("***************");

        su.orm();
        sup.orm();
        supe.orm();
        System.out.println("***************");
        su.norm();
        System.out.println("***************");
        su.snorm();
        sup.snorm();
        supe.snorm();
        System.out.println("***************");
        su.orm();
        sup.orm();
        supe.orm();
        System.out.println("***************");
        sup.orm();
        supe.orm();
        su.orm();
        supe.snorm();
        sup.snorm();
        su.snorm();
        System.out.println(su.su);
        System.out.println(sup.com);
    }

    private static void dfo(Byte bb){
        bb = 15;
        System.out.println(bb);
    }

    private static void dfo(byte... bb){
        bb[0] = 15;
        System.out.println(bb);
    }

    public static void main(String[] args) {
        //Super sup = new Super();
        //sup.orm();
        Period period = Period.of(2000, 10, 21);
        System.out.println(period);
    }

    private static void mmnnhh(){
        int ac = 'a';
        System.out.println(ac);
        char cc = 998;
        char var = 10;
        System.out.println(var);
        System.out.println(cc);
        int cca = 'a';
        System.out.println(cca);
    }

    private static void main () {

        //*********************************************
        Int3 in = new InterF();
        in.done();
        Int1.doo();
        //Int3.doo();
        Int2 inn = new InterF();
        inn.doo();
        InterF inter = new InterF();
        inter.doo();
        //InterF.doo();
        //*********************************************
        Mother mom = new Mother();
        Child child = new Child();
        Son son = new Son();
        mom.dumb();
        mom = child;
        System.out.println(mom.getClass());
        mom = son;
        System.out.println(mom.getClass());

        Mother m1 = new Child();
        Mother m2 = new Son();
        Child c1 = (Child) m1;
        System.out.println(c1.getClass());
        Son s1 = (Son) m2;
        System.out.println(s1.getClass());

        //******************************************

        Tess tess = new App();
        Tess.dd();
        tess.nand();
        int a = 10;
        int b = a = 20;
        Object[] aa = {"A", new Object()};
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
