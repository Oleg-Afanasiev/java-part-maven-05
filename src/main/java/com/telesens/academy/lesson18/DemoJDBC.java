package com.telesens.academy.lesson18;

import com.telesens.academy.lesson15.hometask.Subscriber;
import com.telesens.academy.lesson16.PropertyDemo;
import com.telesens.academy.lesson18.dao.SubscriberDAO;
import com.telesens.academy.lesson18.dao.impl.SubscriberDAOImpl;

import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // insert();
        insertDao();
        select();
    }

    private static void insertDao() {
        Subscriber subscriber = new Subscriber(666L, "test_firstName", "test_lastName", 18, "");
        Subscriber subscriber2 = new Subscriber(667L, "test_firstName2", "test_lastName2", 18, "");
        // 1- способ
        SubscriberDAO subsDao = null;
        try {
            subsDao = new SubscriberDAOImpl(PropertyDemo.readProperty("jdbc.url"));
            subsDao.save(subscriber);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                subsDao.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // 2- способ (connection закроется автоматически)
        try(SubscriberDAO subsDao2 = new SubscriberDAOImpl(PropertyDemo.readProperty("jdbc.url"))) {
            subsDao2.save(subscriber2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void select() {
        try {
            Connection conn = DriverManager.getConnection(PropertyDemo.readProperty("jdbc.url"));
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM SUBSCRIBER");// id, age, first_name, gender, last_name
            while(resultSet.next()) {
                long id = resultSet.getLong("id");
                int age = resultSet.getInt("Age");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String gender = resultSet.getString("gender");

                System.out.println("id: " + id + " age: " + age + " firstName: " + firstName);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insert() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(PropertyDemo.readProperty("jdbc.url"));
            Statement statement = conn.createStatement();
            statement.executeUpdate(
                    "INSERT INTO subscriber VALUES(342, 35, 'Агнесса', 'f', 'Александрова')"); // id, age, first_name, gender, last_name
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
