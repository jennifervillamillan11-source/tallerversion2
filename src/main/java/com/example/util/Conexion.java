package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/universidad?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "Samir2003";

    public static Connection getConexion() throws Exception {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}   
