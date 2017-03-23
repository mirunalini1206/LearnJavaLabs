package com.learn.labs.jdbc;

import com.learn.labs.jdbc.beans.GetFilmsResponse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by santoshdandey on 3/22/17.
 */
public class SakilaDAO {

    private static final String SQL_SELECT_SAKILA_FILM = "SELECT * from FILM";


    public List<GetFilmsResponse> getFilms(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        GetFilmsResponse getFilmsResponse = null;
        List<GetFilmsResponse> getFilmsResponseList = new ArrayList<>();
        try {
            connection = DBUtil.getConnection(DBType.MYSQLDB);
            preparedStatement = connection.prepareStatement(SQL_SELECT_SAKILA_FILM);
            resultSet = preparedStatement.executeQuery();

            if (resultSet != null) {
                while (resultSet.next()) {

                    getFilmsResponse = new GetFilmsResponse();
                    getFilmsResponse.setFilmId(resultSet.getInt("film_id"));
                    getFilmsResponse.setDescription(resultSet.getString("description"));
                    getFilmsResponse.setLanguageId(resultSet.getInt("language_id"));
                    getFilmsResponse.setRentalDuration(resultSet.getInt("rental_duration"));
                    getFilmsResponse.setRentalRate(resultSet.getDouble("rental_rate"));
                    getFilmsResponse.setTitle(resultSet.getString("title"));
                    getFilmsResponseList.add(getFilmsResponse);

                }
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {

            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return getFilmsResponseList;
    }

    public void printAllFilms(){

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DBUtil.getConnection(DBType.MYSQLDB);
            preparedStatement = connection.prepareStatement(SQL_SELECT_SAKILA_FILM);
            resultSet = preparedStatement.executeQuery();

            if (resultSet != null) {
                while (resultSet.next()) {

                    String result = "";
                    for (int i = 1; i <= 13; i++) {
                        result += resultSet.getString(i) + " | ";
                    }

                    System.out.println(result);
                }
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {

            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
