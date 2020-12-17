package com.database;

import java.sql.*;

public class Datahouse {

    public static void main(String[] args) {
        testOne();
    }

    private static void testOne () {

        // retrieve data from MySQL database, table employees_tbl
        String url = "jdbc:mysql://192.168.1.100:3306/employee_database";
        try {
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement statement = conn.createStatement();
            statement.execute("select * from employees_tbl");
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void testTwo () {

        //Inserting a record(row) into table.
        String url = "jdbc:mysql://127.0.0.1:3306/employee_database";
        int value;

        try {
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement statement = conn.createStatement();
            value = statement.executeUpdate("insert into employees_tbl (id, name, dept, salary) " +
                    "values(1245, 'Arvind', 'Science', 25000)");
            if (value == 1)
                System.out.println("Successfully inserted a record into the table");
        } catch (SQLException e) {
            System.out.println("Error trying to insert a record into the table");
            e.printStackTrace();
        }
    }

    private static void testThree () {

        //Removing a record(row) from table.
        String url = "jdbc:mysql://127.0.0.1:3306/employee_database";
        int value;

        try {
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement statement = conn.createStatement();
            value = statement.executeUpdate("delete from employees_tbl where name='alex'");
            System.out.println("removing row " + value);
        } catch (SQLException e) {
            System.out.println("Error trying to insert a record into the table");
            e.printStackTrace();
        }
    }

    private static void testFour () {

        //Removing a (attribute)column from table.
        String url = "jdbc:mysql://127.0.0.1:3306/employee_database";
        int value;

        try {
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement statement = conn.createStatement();
            value = statement.executeUpdate("alter table employees_tbl drop column name");
            System.out.println("removing column " + value);
        } catch (SQLException e) {
            System.out.println("Error trying to insert a record into the table");
            e.printStackTrace();
        }
    }

}
