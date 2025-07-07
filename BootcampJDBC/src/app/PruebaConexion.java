package app;

import utils.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;

public class PruebaConexion {
    public static void main(String[] args) {
        try(Connection conn = DBConnection.getConnection()){
            System.out.println("Conexion exitosa a la base de datos. ");
        } catch (SQLException e){
            System.err.println("Error de conexion: "+ e.getMessage());
        }
    }
}
