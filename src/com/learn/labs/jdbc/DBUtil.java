package com.learn.labs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by santoshdandey on 3/19/17.
 */
public class DBUtil {

    private static final String ORACLE_DBURL = "jdbc:oracle:thin:@localhost:49161:xe";
    private static final String ORACLE_USER = "system";
    private static final String ORACLE_PASS = "oracle";

    private static final String MYSQL_DBURL = "jdbc:mysql://localhost:3306/sakila";
    private static final String MYSQL_USER = "smiru";
    private static final String MYSQL_PASS = "smiru";

    public static Connection getConnection(DBType dbType) throws SQLException {

        switch (dbType) {
            case MYSQLDB:
                return DriverManager.getConnection(MYSQL_DBURL, MYSQL_USER, MYSQL_PASS);
            case ORADB:
                return DriverManager.getConnection(ORACLE_DBURL, ORACLE_USER, ORACLE_PASS);

            default:
                return null;
        }
    }


}
