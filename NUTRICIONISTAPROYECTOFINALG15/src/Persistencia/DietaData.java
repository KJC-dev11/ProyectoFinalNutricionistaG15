/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Conexion;
import Modelo.Dieta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author MOON
 */
public class DietaData {
    
        private Connection con = null;
    
        public DietaData(){
        con = Conexion.getConexion();
    }
    
         public boolean guardarDieta(Dieta dieta) {
        String sql = "INSERT INTO dietas (codDieta, nombreDieta, lunes, martes, miercoles, jueves, viernes, fechaInicio, fechaFin, nombrePaciente, totalCalorias, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setInt(1, dieta.getCodDieta());
            statement.setString(2, dieta.getNombreDieta());
            statement.setString(3, dieta.getLunes());
            statement.setString(4, dieta.getMartes());
            statement.setString(5, dieta.getMiercoles());
            statement.setString(6, dieta.getJueves());
            statement.setString(7, dieta.getViernes());
            statement.setDate(8, (java.sql.Date) new Date(dieta.getfInicio().getTime()));
            statement.setDate(9, (java.sql.Date) new Date(dieta.getfFin().getTime()));
            statement.setString(10, dieta.getNombrePaciente());
            statement.setInt(11, dieta.getTotalCalorias());
            statement.setBoolean(12, dieta.isEstado());
            statement.executeUpdate();
        System.out.println("Menú diario agregado correctamente.");
        return true;
    } catch (SQLException e) {
        System.err.println("Error al agregar menú diario: " + e.getMessage());
        return false;
    }
}
    
   
          public void actualizarDieta(Dieta dieta) {
        String sql = "UPDATE dietas SET nombreDieta = ?, lunes = ?, martes = ?, miercoles = ?, jueves = ?, viernes = ?, fechaInicio = ?, fechaFin = ?, nombrePaciente = ? ,totalCalorias = ? , estado = ? WHERE codDieta = ?";
        try (PreparedStatement statement = con.prepareStatement(sql)) {;
            statement.setString(1, dieta.getNombreDieta());
            statement.setString(2, dieta.getLunes());
            statement.setString(3, dieta.getMartes());
            statement.setString(4, dieta.getMiercoles());
            statement.setString(5, dieta.getJueves());
            statement.setString(6, dieta.getViernes());
            statement.setDate(7, (java.sql.Date) new Date(dieta.getfInicio().getTime()));
            statement.setDate(8, (java.sql.Date) new Date(dieta.getfFin().getTime()));
            statement.setString(9, dieta.getNombrePaciente());
            statement.setInt(10, dieta.getTotalCalorias());
            statement.setBoolean(11, dieta.isEstado());
            statement.setInt(12, dieta.getCodDieta());
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dieta actualizada con éxito.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar dieta: " + ex.getMessage());
        }
          }

   
          
            public void eliminarDieta(int codDieta) {
        String sql = "DELETE FROM dietas WHERE codDieta = ?";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, codDieta);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dieta eliminada con éxito.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar dieta: " + ex.getMessage());
        }
    }
     
    public List<Dieta> buscarRenglonPorNombre(String nombreDieta) {
        String sql = "SELECT * FROM dietas WHERE nombreDieta LIKE ?";
        List<Dieta> dietas = new ArrayList<>();
        try {
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, "%" + nombreDieta + "%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Dieta dieta = new Dieta();
            dieta.setCodDieta(resultSet.getInt("codDieta"));
            dieta.setNombreDieta(resultSet.getString("nombreDieta"));
            dieta.setLunes(resultSet.getString("lunes"));
            dieta.setMartes(resultSet.getString("martes"));
            dieta.setMiercoles(resultSet.getString("miercoles"));
            dieta.setJueves(resultSet.getString("jueves"));
            dieta.setViernes(resultSet.getString("viernes"));
            dieta.setfInicio(resultSet.getDate("fechaInicio"));
            dieta.setfFin(resultSet.getDate("fechaFin"));
            dieta.setNombrePaciente(resultSet.getString("nombrePaciente"));
            dieta.setTotalCalorias(resultSet.getInt("totalCalorias"));
            dieta.setEstado(resultSet.getBoolean("estado"));
            dietas.add(dieta);
            }
        } catch (SQLException ex) {
            
        }
        return dietas;
    }
     /*        
              public List<Dieta> listarDietas() {
         List<Dieta> dietas = new ArrayList<>();
        String sql = "SELECT * FROM dietas";
        try (PreparedStatement statement = con.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Dieta dieta = new Dieta();
                dieta.setCodDieta(resultSet.getInt("codDieta"));
                dieta.setNombreD(resultSet.getString("nombreD"));
                dieta.setFechaIni(resultSet.getDate("fechaIni"));
                dieta.setFechaFin(resultSet.getDate("fechaFin"));
                dieta.setPesoInicial(resultSet.getFloat("pesoInicial"));
                dieta.setPesoFinal(resultSet.getFloat("pesoFinal"));
                dieta.setEstado(resultSet.getBoolean("estado"));
                dieta.setTotalCalorias(resultSet.getInt("totalCalorias"));
                dieta.setIdPaciente(resultSet.getInt("idPaciente"));
                dietas.add(dieta);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar dietas: " + ex.getMessage());
        }
        return dietas;
    }
    */          
    public List<Dieta> obtenerDietas() {
    List<Dieta> dietas = new ArrayList<>();
    String sql = "SELECT * FROM dietas";
    try (PreparedStatement statement = con.prepareStatement(sql);
         ResultSet resultSet = statement.executeQuery()) {
        while (resultSet.next()) {
            Dieta dieta = new Dieta();
            dieta.setCodDieta(resultSet.getInt("codDieta"));
            dieta.setNombreDieta(resultSet.getString("nombreDieta"));
            dieta.setLunes(resultSet.getString("lunes"));
            dieta.setMartes(resultSet.getString("martes"));
            dieta.setMiercoles(resultSet.getString("miercoles"));
            dieta.setJueves(resultSet.getString("jueves"));
            dieta.setViernes(resultSet.getString("viernes"));
            dieta.setfInicio(resultSet.getDate("fechaInicio"));
            dieta.setfFin(resultSet.getDate("fechaFin"));
            dieta.setNombrePaciente(resultSet.getString("nombrePaciente"));
            dieta.setTotalCalorias(resultSet.getInt("totalCalorias"));
            dieta.setEstado(resultSet.getBoolean("estado"));
            dietas.add(dieta);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al listar dietas: " + ex.getMessage());
    }
    return dietas;
}
    
    public List<String> obtenerPacientes() {
        List<String> pacientes = new ArrayList<>();
        String sql = "SELECT apellido FROM pacientes";

        try (PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                pacientes.add(rs.getString("apellido"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener nombres pacientes: " + e.getMessage());
        }
        return pacientes;
    }
    
    public List<String> obtenerMenus() {
        List<String> menus = new ArrayList<>();
        String sql = "SELECT nombreMenu FROM menudiario";

        try (PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                menus.add(rs.getString("nombreMenu"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener menus: " + e.getMessage());
        }
        return menus;
    }

}
