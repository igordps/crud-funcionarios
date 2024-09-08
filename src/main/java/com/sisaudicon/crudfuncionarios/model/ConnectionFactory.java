/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sisaudicon.crudfuncionarios.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;

/**
 *
 * @author igord
 */
public class ConnectionFactory {
    
    private static ConnectionFactory instance;
    private ConnectionFactory() {}

    public static Connection getConnection() throws SQLException {
        Properties props = new Properties();
        try (InputStream input = ConnectionFactory.class.getClassLoader().getResourceAsStream("config.properties")) {
            props.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String url = props.getProperty("db.url");
        String username = props.getProperty("db.username");
        String password = props.getProperty("db.password");

        return DriverManager.getConnection(url, username, password);
    }    
    
}
