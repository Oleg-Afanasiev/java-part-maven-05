package com.telesens.academy.lesson18.dao.impl;

import com.telesens.academy.lesson15.hometask.Subscriber;
import com.telesens.academy.lesson18.dao.SubscriberDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SubscriberDAOImpl extends BaseDAO implements SubscriberDAO {

    private final String SQL_INSERT = "INSERT INTO subscriber (id, first_name, last_name, age, gender) VALUES(?, ?, ?, ?, ?)"; // id, age, first_name, gender, last_name\n";
    public SubscriberDAOImpl(String url) throws SQLException {
        super(url);
    }

    @Override
    public boolean save(Subscriber subscriber) {
        try {
            PreparedStatement statement = connection.prepareStatement(SQL_INSERT);
            statement.setLong(1, subscriber.getId());
            statement.setString(2, subscriber.getFirstName());
            statement.setString(3, subscriber.getLastName());
            statement.setInt(4, subscriber.getAge());
            statement.setString(5, "m");
            return statement.execute();
        } catch (SQLException e) {
            System.out.println("Warning: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean remove(Subscriber subscriber) {
        return false;
    }

    @Override
    public List<Subscriber> getAll() {
        return null;
    }

    @Override
    public Subscriber findById(long id) {
        return null;
    }
}
