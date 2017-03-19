package com.learn.labs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by santoshdandey on 3/19/17.
 */
public class TestMysqlConnection {

    static String username = "smiru";
    static String password = "smiru";
    static String jdbcUrl = "jdbc:mysql://localhost:3306/sakila";


    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(jdbcUrl,username,password);
            System.out.println("Successfully COnnected");

            System.out.println(connection.getSchema());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        finally {

            if(connection != null){
                connection.close();
            }

        }


    }
}
