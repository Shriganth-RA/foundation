package Jdbc;

import java.sql.*;

public class Jdbc {

    public void databaseConnection (String url, String username, String password) {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected successfully...");
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

//    public void

    static void main() {
        String url = "jdbc:postgresql://localhost:5432/demoauthdb";
        String username = "shriganth";
        String password = "Shri@2002";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected successfully...");

            String sql = "SELECT * FROM users";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println(resultSet.getLong("id") + "  " + resultSet.getString("username") + "  " + resultSet.getString("role"));
            }

            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
