/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Conexion;
import Modelo.MenuDiario;
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
public class MenuDiarioData {
    
    private Connection con = null;
    
        public MenuDiarioData() {
        con = Conexion.getConexion();
    }
        
public boolean agregarMenuDiario(MenuDiario menuDiario) {
    if (menuDiario.getCodDieta() == 0) {
        System.err.println("Error: El código de dieta no puede ser 0.");
        return false;
    }
    if (!existeDieta(menuDiario.getCodDieta())) {
        System.err.println("Error: El código de dieta " + menuDiario.getCodDieta() + " no existe en la tabla 'dietas'.");
        return false;
    }
    String sql = "INSERT INTO menudiario (dia, caloriasDelMenu, estado, codDieta) VALUES (?, ?, ?, ?)";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, menuDiario.getDia());
        ps.setInt(2, menuDiario.getCaloriasDelMenu());
        ps.setString(3, menuDiario.getEstado());
        ps.setInt(4, menuDiario.getCodDieta());
        ps.executeUpdate();
        System.out.println("Menú diario agregado correctamente.");
        return true;
    } catch (SQLException e) {
        System.err.println("Error al agregar menú diario: " + e.getMessage());
        return false;
    }
}

            
                public List<MenuDiario> obtenerTodosLosMenusDiarios() {
        List<MenuDiario> menus = new ArrayList<>();
        String sql = "SELECT * FROM menudiario";
        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                MenuDiario menu = new MenuDiario();
                menu.setCodMenu(rs.getInt("codMenu"));
                menu.setDia(rs.getString("dia"));
                menu.setCaloriasDelMenu(rs.getInt("caloriasDelMenu"));
                menu.setEstado(rs.getString("estado"));
                menu.setCodDieta(rs.getInt("codDieta"));
                menus.add(menu);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener los menús diarios: " + e.getMessage());
        }
        return menus;
    }
                
                    public MenuDiario buscarMenuDiarioPorId(int codMenu) {
        MenuDiario menu = null;
        String sql = "SELECT * FROM menudiario WHERE codMenu = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, codMenu);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    menu = new MenuDiario();
                    menu.setCodMenu(rs.getInt("codMenu"));
                    menu.setDia(rs.getString("dia"));
                    menu.setCaloriasDelMenu(rs.getInt("caloriasDelMenu"));
                    menu.setEstado(rs.getString("estado"));
                    menu.setCodDieta(rs.getInt("codDieta"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar menú diario: " + e.getMessage());
        }
        return menu;
    }
                    
    public boolean actualizarMenuDiario(MenuDiario menuDiario) {
    if (!existeDieta(menuDiario.getCodDieta())) {
        System.err.println("Error: El código de dieta " + menuDiario.getCodDieta() + " no existe en la tabla 'dietas'.");
        return false;
    }
    String sql = "UPDATE menudiario SET dia = ?, caloriasDelMenu = ?, estado = ?, codDieta = ? WHERE codMenu = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, menuDiario.getDia());
        ps.setInt(2, menuDiario.getCaloriasDelMenu());
        ps.setString(3, menuDiario.getEstado());
        ps.setInt(4, menuDiario.getCodDieta());
        ps.setInt(5, menuDiario.getCodMenu());

        int filasActualizadas = ps.executeUpdate();
        if (filasActualizadas > 0) {
            System.out.println("Menú diario actualizado correctamente.");
            return true;
        } else {
            System.out.println("No se encontró el menú diario con el código proporcionado.");
            return false;
        }
    } catch (SQLException e) {
        System.err.println("Error al actualizar menú diario: " + e.getMessage());
        return false;
    }
    }
    
    public boolean eliminarMenuDiario(int codMenu) {
        String sql = "DELETE FROM menudiario WHERE codMenu = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, codMenu);
            
            int filasEliminadas = ps.executeUpdate();
            return filasEliminadas > 0;
        } catch (SQLException e) {
            System.err.println("Error al eliminar menú diario: " + e.getMessage());
            return false;
        }
    }
                            
    public List<MenuDiario> obtenerMenusPorCalorias(int minCalorias, int maxCalorias) {
    List<MenuDiario> menus = new ArrayList<>();
    String sql = "SELECT * FROM menudiario WHERE caloriasDelMenu BETWEEN ? AND ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, minCalorias);
        ps.setInt(2, maxCalorias);
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                MenuDiario menu = new MenuDiario();
                menu.setCodMenu(rs.getInt("codMenu"));
                menu.setDia(rs.getString("dia"));
                menu.setCaloriasDelMenu(rs.getInt("caloriasDelMenu"));
                menu.setEstado(rs.getString("estado"));
                menu.setCodDieta(rs.getInt("codDieta"));
                menus.add(menu);
            }
        }
    } catch (SQLException e) {
        System.err.println("Error al obtener menús por calorías: " + e.getMessage());
    }
    return menus;
}
    
    public boolean existeDieta(int codDieta) {
    String sql = "SELECT 1 FROM dietas WHERE codDieta = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, codDieta);
        try (ResultSet rs = ps.executeQuery()) {
            return rs.next();
        }
    } catch (SQLException e) {
        System.err.println("Error al verificar existencia de codDieta: " + e.getMessage());
        return false;
    }
}


}
