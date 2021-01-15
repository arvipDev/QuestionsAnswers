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
        excep();
        aaa();
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
