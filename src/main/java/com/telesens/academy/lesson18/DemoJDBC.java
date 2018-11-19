package com.telesens.academy.lesson18;

import com.telesens.academy.lesson16.PropertyDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(PropertyDemo.readProperty("jdbc.url"));
            Statement statement = conn.createStatement();
            statement.executeUpdate(
                    "INSERT INTO subscriber VALUES(342, 35, 'Агнесса', 'f', 'Александрова')"); // id, age, first_name, gender, last_name
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
