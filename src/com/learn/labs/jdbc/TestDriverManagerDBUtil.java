package com.learn.labs.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by santoshdandey on 3/19/17.
 */
public class TestDriverManagerDBUtil {

    public static void main(String[] args) throws SQLException {

        try (Connection mysqlConnection = DBUtil.getConnection(DBType.MYSQLDB)){

            System.out.println("Successfully connected to Mysql Database");
        }
        catch (SQLException e) {
        System.err.println(e.getMessage() + "  " + e.getLocalizedMessage());
        }

        try (Connection oracleConnection = DBUtil.getConnection(DBType.ORADB)){
            System.out.println("Succesfully connected to Oracle Database");
        }
        catch (SQLException e){
            System.err.println(e.getMessage() + "  " + e.getLocalizedMessage());
        }
    }
}
