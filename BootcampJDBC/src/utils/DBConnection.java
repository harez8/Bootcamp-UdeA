package utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;

public class DBConnection {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    static{
        try {
            InputStream input = DBConnection.class.getClassLoader().getResourceAsStream("db.properties");
            Properties props = new Properties();
            props.load(input);

            url = props.getProperty("db.url");
            user = props.getProperty("db.user");
            password = props.getProperty("db.password");
            driver = props.getProperty("db.driver");

            Class.forName(driver);
        } catch (Exception e){
                System.err.println("Error cargando configuracion de la base de datos: "+ e.getMessage());
            }
        }
        public static Connection getConnection() throws SQLException{
            return DriverManager.getConnection(url, user, password);
        }
    }

