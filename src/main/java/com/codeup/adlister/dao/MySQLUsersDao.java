package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users {

    private final Connection connection;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }


    @Override
    public User findByUsername(String username){
        User registeredUser = null;
        String query = "Select * From users Where username = ?";
        try{
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                registeredUser = new User(
                        rs.getLong("id"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("password")
                );

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return registeredUser;
    }


    @Override
    public Long insert (User user){
        String query = "INSERT INTO users (username, email, password) VALUES(?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error adding a user.", e);
        }


    }
}

//    public static void main(String[] args) {
//        Users userDao = new MySQLUsersDao(new Config());
//        System.out.println(userDao.findByUsername("asdf")));
//        User user = new User("asdf", "t@email.com", "strongpassword");
//        long lastInsertedId = userDao.insert(user);
//    }