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
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author MOON
 */
public class RenglonMenuData {
    
    private Connection con = null;
    
    public RenglonMenuData(){
        con = Conexion.getConexion();
    }
    
        public void agregarRenglonMenu(RenglonMenu renglonMenu) {
        String sql = "INSERT INTO renglonmenu (codMenu, subtotalCalorias, alimento, cantidadGramos) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, renglonMenu.getCodMenu());
            ps.setInt(2, renglonMenu.getSubtotalCalorias());
            ps.setString(3, renglonMenu.getAlimento());
            ps.setDouble(4, renglonMenu.getCantidadGramos());
            ps.executeUpdate();
            System.out.println("Renglón de menú agregado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al agregar renglón de menú: " + e.getMessage());
        }
    }
        
         public List<RenglonMenu> obtenerRenglonesPorMenu(int codMenu) {
        List<RenglonMenu> renglones = new ArrayList<>();
        String sql = "SELECT * FROM renglonmenu WHERE codMenu = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, codMenu);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    RenglonMenu renglon = new RenglonMenu();
                    renglon.setNroRenglon(rs.getInt("nroRenglon"));
                    renglon.setCodMenu(rs.getInt("codMenu"));
                    renglon.setSubtotalCalorias(rs.getInt("subtotalCalorias"));
                    renglon.setAlimento(rs.getString("alimento"));
                    renglon.setCantidadGramos(rs.getDouble("cantidadGramos"));
                    renglones.add(renglon);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener renglones de menú: " + e.getMessage());
        }
        return renglones;
    }
         
         public RenglonMenu buscarRenglonPorNumero(int nroRenglon) {
        RenglonMenu renglon = null;
        String sql = "SELECT * FROM renglonmenu WHERE nroRenglon = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, nroRenglon);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    renglon = new RenglonMenu();
                    renglon.setNroRenglon(rs.getInt("nroRenglon"));
                    renglon.setCodMenu(rs.getInt("codMenu"));
                    renglon.setSubtotalCalorias(rs.getInt("subtotalCalorias"));
                    renglon.setAlimento(rs.getString("alimento"));
                    renglon.setCantidadGramos(rs.getDouble("cantidadGramos"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar renglón de menú: " + e.getMessage());
        }
        return renglon;
    }
         
          public void actualizarRenglonMenu(RenglonMenu renglonMenu) {
        String sql = "UPDATE renglonmenu SET codMenu = ?, subtotalCalorias = ?, alimento = ?, cantidadGramos = ? WHERE nroRenglon = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, renglonMenu.getCodMenu());
            ps.setInt(2, renglonMenu.getSubtotalCalorias());
            ps.setString(3, renglonMenu.getAlimento());
            ps.setDouble(4, renglonMenu.getCantidadGramos());
            ps.setInt(5, renglonMenu.getNroRenglon());
            ps.executeUpdate();
            System.out.println("Renglón de menú actualizado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al actualizar renglón de menú: " + e.getMessage());
        }
    }
          
              public void eliminarRenglonMenu(int nroRenglon) {
        String sql = "DELETE FROM renglonmenu WHERE nroRenglon = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, nroRenglon);
            ps.executeUpdate();
            System.out.println("Renglón de menú eliminado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al eliminar renglón de menú: " + e.getMessage());
        }
    }
}
