/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.josejavier.sistema_bancario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ROOT
 */
public class connectDatabase {
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_bancario";
    private static final String USER = "root";
    private static final String PASSWORD = "sasa";

    private Connection con;

    public void conn(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connection successful");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            System.err.println("Cannot connect to database");           
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            if (con != null) {
                con.close();
                System.out.println("Database connection closed");
            }
        } catch (SQLException e) {
            System.err.println("Error closing database connection");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
