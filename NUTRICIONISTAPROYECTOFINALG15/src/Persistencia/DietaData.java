/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Conexion;
import java.sql.Connection;
import Modelo.Dieta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
        String sql = "INSERT INTO dieta (nombreD, fechaIni, fechaFin, pesoInicial, pesoFinal, estado, totalCalorias, idPaciente) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, dieta.getNombreD());
            statement.setDate(2, new java.sql.Date(dieta.getFechaIni().getTime()));
            statement.setDate(3, new java.sql.Date(dieta.getFechaFin().getTime()));
            statement.setFloat(4, dieta.getPesoInicial());
            statement.setFloat(5, dieta.getPesoFinal());
            statement.setBoolean(6, dieta.isEstado());
            statement.setInt(7, dieta.getTotalCalorias());
            statement.setInt(8, dieta.getIdPaciente());
            statement.executeUpdate();
            System.out.println("Dieta guardada con éxito.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
         
          public void actualizarDieta(Dieta dieta) {
        String sql = "UPDATE dieta SET nombreD = ?, fechaIni = ?, fechaFin = ?, pesoInicial = ?, pesoFinal = ?, estado = ?, totalCalorias = ? WHERE codDieta = ?";
        try {
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, dieta.getNombreD());
            statement.setDate(2, new java.sql.Date(dieta.getFechaIni().getTime()));
            statement.setDate(3, new java.sql.Date(dieta.getFechaFin().getTime()));
            statement.setFloat(4, dieta.getPesoInicial());
            statement.setFloat(5, dieta.getPesoFinal());
            statement.setBoolean(6, dieta.isEstado());
            statement.setInt(7, dieta.getTotalCalorias());
            statement.setInt(8, dieta.getCodDieta());
            statement.executeUpdate();
            System.out.println("Dieta actualizada con éxito.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
          
            public void eliminarDieta(int codDieta) {
        String sql = "DELETE FROM dieta WHERE codDieta = ?";
        try {
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, codDieta);
            statement.executeUpdate();
            System.out.println("Dieta eliminada con éxito.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
            
             public Dieta buscarDieta(int codDieta) {
        String sql = "SELECT * FROM dieta WHERE codDieta = ?";
        Dieta dieta = null;
        try {
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, codDieta);
            ResultSet resultSet = statement.executeQuery();
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
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return dieta;
    }
             
              public List<Dieta> listarDietas() {
        List<Dieta> dietas = new ArrayList<>();
        String sql = "SELECT * FROM dieta";
        try {
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
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
            ex.printStackTrace();
        }
        return dietas;
    }
}
