package dao;
import modelo.Campista;
import utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//Clase DAO para hacer CRUD sobre la tabla 'campista'

public class CampistaDAO {
    //Metodo para insertar un nuevo campista
    public boolean insertar(Campista c) {
        String sql = "INSERT INTO campista (nombre, documento, genero_nacimiento, activo) VALUES (?,?,?,?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, c.getNombre());
            stmt.setString(2, c.getDocumento());
            stmt.setString(3, c.getGeneroNacimiento());
            stmt.setBoolean(4, c.isActivo());

            int filas = stmt.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            System.err.println("Error insertado campista: " + e.getMessage());
            return false;
        }
    }

    public Campista buscarporId(int id) {
        String sql = "SELECT * FROM campista WHERE id_campista = ?";
        Campista campista = null;

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                campista = new Campista(
                        rs.getInt("id_campista"),
                        rs.getString("nombre"),
                        rs.getString("documento"),
                        rs.getString("genero_nacimiento"),
                        rs.getBoolean("activo")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error buscando campista: " + e.getMessage());

        }
        return campista;

    }

    public List<Campista> listarTodos() {
        List<Campista> lista = new ArrayList<>();
        String sql = "SELECT * FROM campista";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Campista c = new Campista(
                        rs.getInt("id_campista"),
                        rs.getString("nombre"),
                        rs.getString("documento"),
                        rs.getString("genero_nacimiento"),
                        rs.getBoolean("activo")
                );
                lista.add(c);
            }
        } catch (SQLException e) {
            System.err.println("Error lista el campista: " + e.getMessage());

        }
        return lista;

    }

    public boolean actualizar(Campista c) {
        String sql = "UPDATE campista set nombre= ?, documento=?, genero_nacimiento=?, activo=? WHERE id_campista=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, c.getNombre());
            stmt.setString(2, c.getDocumento());
            stmt.setString(3, c.getGeneroNacimiento());
            stmt.setBoolean(4, c.isActivo());
            stmt.setInt(5, c.getId());

            int filas = stmt.executeUpdate();
            return filas > 0;
        } catch (SQLException e) {
            System.err.println("Error lista el campista: " + e.getMessage());
            return false;

        }
    }
    public boolean eliminar(int id) {
        String sql = "DELETE FROM campista WHERE id_campista=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int filas = stmt.executeUpdate();
            return filas > 0;
        } catch (SQLException e) {
            System.err.println("Error lista el campista: " + e.getMessage());
            return false;

        }
    }
}
