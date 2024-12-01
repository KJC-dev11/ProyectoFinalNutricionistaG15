/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.Connection;
import Modelo.Alimentos;
import Modelo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MOON
 */
public class AlimentoData {
    
    private Connection con = null;
    
        public AlimentoData(){
        con = Conexion.getConexion();
    }
    
        public void guardarAlimento(Alimentos alimento) {
    String sql = "INSERT INTO alimentos (codComida, nombreComida, caloriasPorPorcion, tipoComida, detalle) VALUES (?, ?, ?, ?, ?)";
    try (PreparedStatement statement = con.prepareStatement(sql)) {
        statement.setInt(1, alimento.getCodComida());
        statement.setString(2, alimento.getNombreComida());
        statement.setInt(3, alimento.getCaloriasPorPorcion());
        statement.setString(4, alimento.getStipoComida());
        statement.setString(5, alimento.getDetalle());
        statement.executeUpdate();
        System.out.println("Alimento guardado con exito.");
    } catch (SQLException ex) {
    }
    }
        
        public void actualizarAlimento(Alimentos alimento) {
    String sql = "UPDATE alimentos SET nombreComida = ?, caloriasPorPorcion = ?, tipoComida = ?, detalle = ? WHERE codComida = ?";
    try (PreparedStatement statement = con.prepareStatement(sql)) {
        statement.setString(1, alimento.getNombreComida());
        statement.setInt(2, alimento.getCaloriasPorPorcion());
        statement.setString(3, alimento.getStipoComida());
        statement.setString(4, alimento.getDetalle());
        statement.setInt(5, alimento.getCodComida());
        statement.executeUpdate();
        System.out.println("Alimento actualizado con éxito.");
    } catch (SQLException ex) {
    }
    }
        
         public void eliminarAlimento(int codComida) {
        String sql = "DELETE FROM alimentos WHERE codComida = ?";
        try {
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, codComida);
            statement.executeUpdate();
            System.out.println("Alimento eliminado con éxito.");
        } catch (SQLException ex) {
        }
    }
         
         public Alimentos buscarAlimento(String nombreComida) {
        String sql = "SELECT * FROM alimentos WHERE nombreComida = ?";
        Alimentos alimento = null;
        try {
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, nombreComida);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                alimento = new Alimentos();
                alimento.setCodComida(resultSet.getInt("codComida"));
                alimento.setNombreComida(resultSet.getString("nombreComida"));
                alimento.setCaloriasPorPorcion(resultSet.getInt("caloriasPorPorcion"));
                alimento.setStipoComida(resultSet.getString("tipoComida"));
                alimento.setDetalle(resultSet.getString("detalle"));
            }
        } catch (SQLException ex) {
        }
        return alimento;
    }
         
         public List<Alimentos> listarAlimentos() {
    List<Alimentos> alimentos = new ArrayList<>();
    String sql = "SELECT * FROM alimentos";
    try (PreparedStatement statement = con.prepareStatement(sql);
         ResultSet resultSet = statement.executeQuery()) {
        while (resultSet.next()) {
            Alimentos alimento = new Alimentos();
            alimento.setCodComida(resultSet.getInt("codComida"));
            alimento.setNombreComida(resultSet.getString("nombreComida"));
            alimento.setCaloriasPorPorcion(resultSet.getInt("caloriasPorPorcion"));
            alimento.setStipoComida(resultSet.getString("tipoComida"));
            alimento.setDetalle(resultSet.getString("detalle"));
            alimentos.add(alimento);
        }
    } catch (SQLException ex) {
    }
    return alimentos;
    }
}
