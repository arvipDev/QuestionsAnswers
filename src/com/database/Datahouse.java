package com.database;

import java.sql.*;

public class Datahouse {

    public static void main(String[] args) {

        String url = "jdbc:mysql://127.0.0.1:3306/employee_database";
        try {
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement statement = conn.createStatement();
            statement.execute("select * from employees_tbl");
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
