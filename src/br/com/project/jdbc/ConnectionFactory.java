package br.com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 
 * @author Flavio Cavalcante
 */
public class ConnectionFactory {

    public Connection getConnection() {

        try {

            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bdvendas", "root", "12345");

        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }

    }


}