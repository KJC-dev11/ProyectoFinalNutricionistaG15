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
    String sql = "INSERT INTO menudiario (codMenu, nombreMenu, desayuno, almuerzo, merienda, cena) VALUES (?, ?, ?, ?, ?, ?)";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, menuDiario.getCodMenu());
        ps.setString(2, menuDiario.getNombreMenu());
        ps.setString(3, menuDiario.getDesayuno());
        ps.setString(4, menuDiario.getAlmuerzo());
        ps.setString(5, menuDiario.getMerienda());
        ps.setString(6, menuDiario.getCena());
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
                menu.setNombreMenu(rs.getString("nombreMenu"));
                menu.setDesayuno(rs.getString("desayuno"));
                menu.setAlmuerzo(rs.getString("almuerzo"));
                menu.setMerienda(rs.getString("merienda"));
                menu.setCena(rs.getString("cena"));
                menus.add(menu);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener los menús diarios: " + e.getMessage());
        }
        return menus;
    }

public List<String> obtenerDesayunos() {
        List<String> desayunos = new ArrayList<>();
        String sql = "SELECT nombreRenglon FROM renglonmenu WHERE tipo LIKE 'Desayuno'";

        try (PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                desayunos.add(rs.getString("nombreRenglon"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener nombre de renglon: " + e.getMessage());
        }
        return desayunos;
    }
    
public List<String> obtenerAlmuerzos() {
        List<String> almuerzos = new ArrayList<>();
        String sql = "SELECT nombreRenglon FROM renglonmenu WHERE tipo LIKE 'Almuerzo'";

        try (PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                almuerzos.add(rs.getString("nombreRenglon"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener nombre de renglon: " + e.getMessage());
        }
        return almuerzos;
    }
    
public List<String> obtenerMeriendas() {
        List<String> meriendas = new ArrayList<>();
        String sql = "SELECT nombreRenglon FROM renglonmenu WHERE tipo LIKE 'Merienda'";

        try (PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                meriendas.add(rs.getString("nombreRenglon"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener nombre de renglon: " + e.getMessage());
        }
        return meriendas;
    }
    
public List<String> obtenerCenas() {
        List<String> cenas = new ArrayList<>();
        String sql = "SELECT nombreRenglon FROM renglonmenu WHERE tipo LIKE 'Cena'";

        try (PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                cenas.add(rs.getString("nombreRenglon"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener nombre de renglon: " + e.getMessage());
        }
        return cenas;
    }
        
public List<MenuDiario> buscarMenuDiarioPorNombre(String nombreMenu) {
        String sql = "SELECT * FROM menudiario WHERE nombreMenu LIKE ?";
        List<MenuDiario> menus = new ArrayList<>();
        try {
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, "%" + nombreMenu + "%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                MenuDiario menu = new MenuDiario();
                menu.setCodMenu(resultSet.getInt("codMenu"));
                menu.setNombreMenu(resultSet.getString("nombreMenu"));
                menu.setDesayuno(resultSet.getString("desayuno"));
                menu.setAlmuerzo(resultSet.getString("almuerzo"));
                menu.setMerienda(resultSet.getString("merienda"));
                menu.setCena(resultSet.getString("cena"));
                menus.add(menu);
            }
        } catch (SQLException ex) {
            
        }
        return menus;}

public boolean actualizarMenuDiario(MenuDiario menuDiario) {
    String sql = "UPDATE menudiario SET nombreMenu = ?, desayuno = ?, almuerzo = ?, merienda = ?, cena = ? WHERE codMenu = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, menuDiario.getNombreMenu());
        ps.setString(2, menuDiario.getDesayuno());
        ps.setString(3, menuDiario.getAlmuerzo());
        ps.setString(4, menuDiario.getMerienda());
        ps.setString(5, menuDiario.getCena());
        ps.setInt(6, menuDiario.getCodMenu());

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
}

