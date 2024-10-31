/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Paciente;
import Modelo.Conexion;
import java.sql.Connection;
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
public class PacienteData {
    
    private Connection conn = null;
    
    public PacienteData(){
        conn = Conexion.getConexion();
    }
    
     public void guardarPaciente(Paciente paciente) {
    String sql = "INSERT INTO pacientes (edad, altura, pesoActual, pesoBuscado, dni, apellido, nombre, activo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    try {
        try (PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, paciente.getEdad());
            ps.setDouble(2, paciente.getAltura());
            ps.setDouble(3, paciente.getPesoActual());
            ps.setDouble(4, paciente.getPesoBuscado());
            ps.setInt(5, paciente.getDni());
            ps.setString(6, paciente.getApellido());
            ps.setString(7, paciente.getNombre());
            ps.setBoolean(8, paciente.isActivo());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                paciente.setIdPaciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paciente añadido con éxito. ID: " + paciente.getIdPaciente());
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener el ID del paciente.");
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar el paciente: " + ex.getMessage());
    }
    }
     
       public void actualizarPaciente(Paciente paciente) {
        String sql = "UPDATE pacientes SET edad = ?, altura = ?, pesoActual = ?, pesoBuscado = ?, dni = ?, apellido = ?, nombre = ?, activo = ? WHERE idPaciente = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, paciente.getEdad());
            ps.setDouble(2, paciente.getAltura());
            ps.setDouble(3, paciente.getPesoActual());
            ps.setDouble(4, paciente.getPesoBuscado());
            ps.setInt(5, paciente.getDni());
            ps.setString(6, paciente.getApellido());
            ps.setString(7, paciente.getNombre());
            ps.setBoolean(8, paciente.isActivo());
            ps.setInt(9, paciente.getIdPaciente());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
        }
    }
       
        public void borrarPaciente(int idPaciente) {
        String sql = "DELETE FROM pacientes WHERE idPaciente = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idPaciente);

            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
        }
    }

         public List<Paciente> obtenerTodosLosPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        String sql = "SELECT * FROM pacientes";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setEdad(rs.getInt("edad"));
                paciente.setAltura(rs.getDouble("altura"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoBuscado(rs.getDouble("pesoBuscado"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setActivo(rs.getBoolean("activo"));

                pacientes.add(paciente);
            }
            ps.close();
        } catch (SQLException e) {
        }
        return pacientes;
    }
         
   public List<Paciente> obtenerPacientes() {
    List<Paciente> pacientes = new ArrayList<>();
    String sql = "SELECT idPaciente, nombre, apellido FROM pacientes";

    try (PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            Paciente paciente = new Paciente();
            paciente.setIdPaciente(rs.getInt("idPaciente"));
            paciente.setNombre(rs.getString("nombre"));
            paciente.setApellido(rs.getString("apellido"));
            pacientes.add(paciente);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener pacientes: " + e.getMessage());
    }

    return pacientes;
}


}
