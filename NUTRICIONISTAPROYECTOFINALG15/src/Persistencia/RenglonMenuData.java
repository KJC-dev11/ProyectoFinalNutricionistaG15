/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Conexion;
import Modelo.RenglonMenu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author MOON
 */
public class RenglonMenuData {
    
    private Connection con;
    
    public RenglonMenuData() {
        con = Conexion.getConexion();
    }
    
public void agregarRenglonMenu(RenglonMenu renglonMenu) {
        //String findMaxSql = "SELECT COALESCE(MAX(nroRenglon), 0) + 1 AS nuevoNroRenglon FROM renglonmenu";
        String insertSql = "INSERT INTO renglonmenu (nroRenglon, nombreRenglon, cantidadGramos, subtotalCalorias, nomComida1, nomComida2, nomComida3, tipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        /*try
             PreparedStatement findMaxStmt = con.prepareStatement(findMaxSql);
             ResultSet rs = findMaxStmt.executeQuery())

            if (rs.next()) {
                int nuevoNroRenglon = rs.getInt("nuevoNroRenglon");
                renglonMenu.setNroRenglon(nuevoNroRenglon);
            }*/

            try (PreparedStatement stmt = con.prepareStatement(insertSql)) {
                stmt.setInt(1, renglonMenu.getNroRenglon());
                stmt.setString(2, renglonMenu.getNombreRenglon());
                stmt.setInt(3, renglonMenu.getCantidadGramos());
                stmt.setInt(4, renglonMenu.getSubtotalCalorias());
                stmt.setString(5, renglonMenu.getNomComida1());
                stmt.setString(6, renglonMenu.getNomComida2());
                stmt.setString(7, renglonMenu.getNomComida3());
                stmt.setString(8, renglonMenu.getTipo());

                stmt.executeUpdate();
                System.out.println("RenglonMenu agregado correctamente.");
            }
         catch (SQLException e) {
            System.err.println("Error al agregar RenglonMenu: " + e.getMessage());
            e.printStackTrace();
        }
    }


    
    public RenglonMenu obtenerRenglonMenu(int nroRenglon) {
        String sql = "SELECT * FROM renglonmenu WHERE nroRenglon = ?";
        RenglonMenu renglonMenu = null;

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, nroRenglon);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                renglonMenu = new RenglonMenu(
                    rs.getInt("nroRenglon"),
                    rs.getString("nombreRenglon"),
                    rs.getInt("subtotalCalorias"),
                    rs.getInt("cantidadGramos"),
                    rs.getString("nomComida1"),
                    rs.getString("nomComida2"),
                    rs.getString("nomComida3"),
                    rs.getString("Tipo")
                 );
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener RenglonMenu: " + e.getMessage());
        }
        return renglonMenu;
    }
    
    public List<RenglonMenu> obtenerTodosLosRenglones() {
        List<RenglonMenu> renglones = new ArrayList<>();
        String sql = "SELECT * FROM renglonmenu";

        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                RenglonMenu renglon = new RenglonMenu(
                    rs.getInt("nroRenglon"),
                    rs.getString("nombreRenglon"),
                    rs.getInt("subtotalCalorias"),
                    rs.getInt("cantidadGramos"),
                    rs.getString("nomComida1"),
                    rs.getString("nomComida2"),
                    rs.getString("nomComida3"),
                    rs.getString("Tipo")
                );
                renglones.add(renglon);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener todos los RenglonesMenu: " + e.getMessage());
        }
        return renglones;
    }
    
    public void actualizarRenglonMenu(RenglonMenu renglonMenu) {
        String sql = "UPDATE renglonmenu SET nombreRenglon = ?, cantidadGramos = ?, subtotalCalorias = ?, nomComida1 = ?, nomComida2 = ?, nomComida3 = ? WHERE nroRenglon = ?";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setString(1, renglonMenu.getNombreRenglon());
                stmt.setInt(2, renglonMenu.getCantidadGramos());
                stmt.setInt(3, renglonMenu.getSubtotalCalorias());
                stmt.setString(4, renglonMenu.getNomComida1());
                stmt.setString(5, renglonMenu.getNomComida2());
                stmt.setString(6, renglonMenu.getNomComida3());
                stmt.setInt(7, renglonMenu.getNroRenglon());


            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar RenglonMenu: " + e.getMessage());
        }
    }
    
    public void eliminarRenglonMenu(String nombreRenglon) {
        String sql = "DELETE FROM renglonmenu WHERE nombreRenglon = ?";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, nombreRenglon);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar RenglonMenu: " + e.getMessage());
        }
    }
   
    public List<String> obtenerNombresComidas() {
        List<String> nombresComidas = new ArrayList<>();
        String sql = "SELECT nombreComida FROM alimentos";

        try (PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                nombresComidas.add(rs.getString("nombreComida"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener nombres de comidas: " + e.getMessage());
        }
        return nombresComidas;
    }
        
    public int obtenerCaloriasPorComida(String nombreComida) {
        int calorias = 0;
        String sql = "SELECT caloriasPorPorcion FROM alimentos WHERE nombreComida = ?";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, nombreComida);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    calorias = rs.getInt("caloriasPorPorcion");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener calorías de la comida: " + e.getMessage());
        }
        return calorias;
    }
            
    public RenglonMenu buscarRenglonPorNumero(int nroRenglon) {
        RenglonMenu renglonMenu = null;
        String sql = "SELECT * FROM RenglonMenu WHERE codMenu = ?"; 

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, nroRenglon);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    renglonMenu = new RenglonMenu(
                    rs.getInt("nroRenglon"),
                    rs.getString("nombreRenglon"),
                    rs.getInt("subtotalCalorias"),
                    rs.getInt("cantidadGramos"),
                    rs.getString("nomComida1"),
                    rs.getString("nomComida2"),
                    rs.getString("nomComida3"),
                    rs.getString("Tipo")
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar renglón por número: " + e.getMessage());
        }
        return renglonMenu;
    }
        
    public List<RenglonMenu> buscarRenglonPorNombre(String nombreRenglon) {
        String sql = "SELECT * FROM renglonmenu WHERE nombreRenglon LIKE ?";
        List<RenglonMenu> renglones = new ArrayList<>();
        try {
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, "%" + nombreRenglon + "%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                RenglonMenu renglon = new RenglonMenu(
                    resultSet.getInt("nroRenglon"),
                    resultSet.getString("nombreRenglon"),
                    resultSet.getInt("subtotalCalorias"),
                    resultSet.getInt("cantidadGramos"),
                    resultSet.getString("nomComida1"),
                    resultSet.getString("nomComida2"),
                    resultSet.getString("nomComida3"),
                    resultSet.getString("Tipo")
                    );
                renglones.add(renglon);
            }
        } catch (SQLException ex) {
            
        }
        return renglones;
    }
                
    public int obtenerCodigoComidaPorNombre(String nombreComida) {
    String sql = "SELECT codComida FROM alimentos WHERE nombreComida = ?";
    try (PreparedStatement stmt = con.prepareStatement(sql)) {
        stmt.setString(1, nombreComida);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getInt("codComida");
        } else {
            System.err.println("No se encontró un código para: " + nombreComida);
            return -1; 
        }
    } catch (SQLException e) {
        System.err.println("Error al obtener código de comida: " + e.getMessage());
        return -1;
    }
}
                
    public String obtenerNombreComidaPorCodigo(int codComida) {
    String nombreComida = "";
    String sql = "SELECT nombreComida FROM alimentos WHERE codComida = ?";

    try (PreparedStatement stmt = con.prepareStatement(sql)) {
        stmt.setInt(1, codComida);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                nombreComida = rs.getString("nombreComida");
            }
        }
    } catch (SQLException e) {
        System.err.println("Error al obtener código de comida: " + e.getMessage());
    }

    return nombreComida;
}

}
