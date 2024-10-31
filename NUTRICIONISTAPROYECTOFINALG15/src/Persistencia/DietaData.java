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
    
         public void guardarDieta(Dieta dieta) {
        String sql = "INSERT INTO dietas (nombreD, fechaIni, fechaFin, pesoInicial, pesoFinal, estado, totalCalorias, idPaciente) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, dieta.getNombreD());
            statement.setDate(2, (java.sql.Date) new Date(dieta.getFechaIni().getTime()));
            statement.setDate(3, (java.sql.Date) new Date(dieta.getFechaFin().getTime()));
            statement.setFloat(4, dieta.getPesoInicial());
            statement.setFloat(5, dieta.getPesoFinal());
            statement.setBoolean(6, dieta.isEstado());
            statement.setInt(7, dieta.getTotalCalorias());
            statement.setInt(8, dieta.getIdPaciente());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                dieta.setCodDieta(rs.getInt(1));
            }
            JOptionPane.showMessageDialog(null, "Dieta guardada con éxito.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar dieta: " + ex.getMessage());
        }
    }
         
          public void actualizarDieta(Dieta dieta) {
        String sql = "UPDATE dietas SET nombreD = ?, fechaIni = ?, fechaFin = ?, pesoInicial = ?, pesoFinal = ?, estado = ?, totalCalorias = ? WHERE codDieta = ?";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, dieta.getNombreD());
            statement.setDate(2, new Date(dieta.getFechaIni().getTime()));
            statement.setDate(3, new Date(dieta.getFechaFin().getTime()));
            statement.setFloat(4, dieta.getPesoInicial());
            statement.setFloat(5, dieta.getPesoFinal());
            statement.setBoolean(6, dieta.isEstado());
            statement.setInt(7, dieta.getTotalCalorias());
            statement.setInt(8, dieta.getCodDieta());
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
            
             public Dieta buscarDieta(int codDieta) {
 String sql = "SELECT * FROM dietas WHERE codDieta = ?";
        Dieta dieta = null;
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, codDieta);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    dieta = new Dieta();
                    dieta.setCodDieta(resultSet.getInt("codDieta"));
                    dieta.setNombreD(resultSet.getString("nombreD"));
                    dieta.setFechaIni(resultSet.getDate("fechaIni"));
                    dieta.setFechaFin(resultSet.getDate("fechaFin"));
                    dieta.setPesoInicial(resultSet.getFloat("pesoInicial"));
                    dieta.setPesoFinal(resultSet.getFloat("pesoFinal"));
                    dieta.setEstado(resultSet.getBoolean("estado"));
                    dieta.setTotalCalorias(resultSet.getInt("totalCalorias"));
                    dieta.setIdPaciente(resultSet.getInt("idPaciente"));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar dieta: " + ex.getMessage());
        }
        return dieta;
    }
             
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
              
              public List<Dieta> obtenerDietas() {
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

}
