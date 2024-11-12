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
    String findMaxSql = "SELECT MAX(nroRenglon) FROM renglonmenu";
    String insertSql = "INSERT INTO renglonmenu (nroRenglon, codMenu, cantidadGramos, subtotalCalorias, codComida) VALUES (?, ?, ?, ?, ?)";
    
    try (
        Statement findMaxStmt = con.createStatement();
        ResultSet rs = findMaxStmt.executeQuery(findMaxSql)
    ) {
        int nuevoNroRenglon = 1;

        if (rs.next()) {
            int maxNroRenglon = rs.getInt(1);
            nuevoNroRenglon = maxNroRenglon + 1;
        }

        renglonMenu.setNroRenglon(nuevoNroRenglon);

        try (PreparedStatement stmt = con.prepareStatement(insertSql)) {
            stmt.setInt(1, renglonMenu.getNroRenglon());
            stmt.setInt(2, renglonMenu.getCodMenu());
            stmt.setDouble(3, renglonMenu.getCantidadGramos());
            stmt.setInt(4, renglonMenu.getSubtotalCalorias());
            stmt.setInt(5, renglonMenu.getCodComida());

            stmt.executeUpdate();
        }
    } catch (SQLException e) {
        System.out.println("Error al agregar RenglonMenu: " + e.getMessage());
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
                    rs.getInt("codMenu"),
                    rs.getInt("codComida"),
                    rs.getDouble("cantidadGramos"),
                    rs.getInt("subtotalCalorias")
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
                    rs.getInt("codMenu"),
                    rs.getInt("codComida"),
                    rs.getDouble("cantidadGramos"),
                    rs.getInt("subtotalCalorias")
                );
                renglones.add(renglon);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener todos los RenglonesMenu: " + e.getMessage());
        }
        return renglones;
    }
    
    public void actualizarRenglonMenu(RenglonMenu renglonMenu) {
        String sql = "UPDATE renglonmenu SET codMenu = ?, cantidadGramos = ?, subtotalCalorias = ?, codComida = ? WHERE nroRenglon = ?";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, renglonMenu.getCodMenu());
            stmt.setDouble(2, renglonMenu.getCantidadGramos());
            stmt.setInt(3, renglonMenu.getSubtotalCalorias());
            stmt.setInt(4, renglonMenu.getCodComida());
            stmt.setInt(5, renglonMenu.getNroRenglon());

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar RenglonMenu: " + e.getMessage());
        }
    }
    
    public void eliminarRenglonMenu(int nroRenglon) {
        String sql = "DELETE FROM renglonmenu WHERE nroRenglon = ?";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, nroRenglon);
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
                            rs.getInt("codMenu"),
                            rs.getInt("codComida"),
                            rs.getDouble("cantidadGramos"),
                            rs.getInt("subtotalCalorias")
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar renglón por número: " + e.getMessage());
        }
        return renglonMenu;
    }
                
                public int obtenerCodigoComidaPorNombre(String nombreComida) {
    int codigoComida = -1;
    String sql = "SELECT codComida FROM alimentos WHERE nombreComida = ?";

    try (PreparedStatement stmt = con.prepareStatement(sql)) {
        stmt.setString(1, nombreComida);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                codigoComida = rs.getInt("codComida");
            }
        }
    } catch (SQLException e) {
        System.err.println("Error al obtener código de comida: " + e.getMessage());
    }

    return codigoComida;
}

}
