package be.jadv.db;

import be.jadv.model.User;

import java.sql.*;
import java.util.ArrayList;

public class UserDAO {

    public static ArrayList<User> findAll() {
        ArrayList<User> users = new ArrayList<>();

        Connection connection = null;
        try {
            String URL = "jdbc:mysql://dt5.ehb.be/1920PRGR022";
            String USER = "1920PRGR022";
            String PASSWORD = "28643715";
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from users");

            // use resultset

            while (resultSet.next()) {
                long id = resultSet.getLong(1);
                String username = resultSet.getString("username");
                users.add(new User(id, username));
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            // Always close the connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                }
            }
        }
        return users;
    }
}




