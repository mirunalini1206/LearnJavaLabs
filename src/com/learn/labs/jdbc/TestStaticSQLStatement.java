package com.learn.labs.jdbc;

import com.learn.labs.jdbc.beans.GetFilmsResponse;

import java.util.List;

/**
 * Created by santoshdandey on 3/22/17.
 */
public class TestStaticSQLStatement {

    private static final String SQL_SELECT_SAKILA_FILM = "SELECT * from FILM";

    public static void main(String[] args) {

        SakilaDAO sakilaDAO = new SakilaDAO();
        List<GetFilmsResponse> getFilmsResponseList = sakilaDAO.getFilms();
        getFilmsResponseList.forEach(getFilmsResponse -> System.out.println(getFilmsResponse));
        //sakilaDAO.printAllFilms();
    }

}
