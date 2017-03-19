package com.learn.labs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by santoshdandey on 3/19/17.
 */
public class TestOracleDBConnection {

    static String dbUrl = "jdbc:oracle:thin:@localhost:49161:xe";
    static String user = "system";
    static String pass = "oracle";


    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl,user,pass);
            System.out.println("Successfully COnnected");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        finally {

            if(connection!= null){
                connection.close();
            }

        }

    }
}
