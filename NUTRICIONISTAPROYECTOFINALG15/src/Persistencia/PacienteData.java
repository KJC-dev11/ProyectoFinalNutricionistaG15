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
    
    private Connection con = null;
    
    public PacienteData(){
        con = Conexion.getConexion();
    }
    
      public void guardarPaciente(Paciente paciente) {
        String sql = "INSERT INTO pacientes (apellido, nombre, edad, dni, altura, pesoActual, pesoBuscado) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, paciente.getApellido());
            ps.setString(2, paciente.getNombre());
            ps.setInt(3, paciente.getEdad());
            ps.setInt(4, paciente.getDni());
            ps.setDouble(5, paciente.getAltura());
            ps.setDouble(6, paciente.getPesoActual());
            ps.setDouble(7, paciente.getPesoBuscado());

            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    paciente.setIdPaciente(rs.getInt(1));
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Error al guardar paciente: " + ex.getMessage(), ex);
        }
    }
     
      public Paciente buscarPaciente(int id) {
        String sql = "SELECT * FROM pacientes WHERE idPaciente = ? AND activo = 1";
        Paciente paciente = null;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    paciente = new Paciente();
                    paciente.setIdPaciente(rs.getInt("idPaciente"));
                    paciente.setApellido(rs.getString("apellido"));
                    paciente.setNombre(rs.getString("nombre"));
                    paciente.setEdad(rs.getInt("edad"));
                    paciente.setDni(rs.getInt("dni"));
                    paciente.setAltura(rs.getDouble("altura"));
                    paciente.setPesoActual(rs.getDouble("pesoActual"));
                    paciente.setPesoBuscado(rs.getDouble("pesoBuscado"));
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Error al buscar paciente: " + ex.getMessage(), ex);
        }
        return paciente;
    }
     
     public List<Paciente> listarPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        String sql = "SELECT * FROM pacientes WHERE activo = 1";
        try (PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setEdad(rs.getInt("edad"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setAltura(rs.getDouble("altura"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoBuscado(rs.getDouble("pesoBuscado"));
                pacientes.add(paciente);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Error al listar pacientes: " + ex.getMessage(), ex);
        }
        return pacientes;
    }
     
      public void modificarPaciente(Paciente paciente) {
        String sql = "UPDATE pacientes SET apellido = ?, nombre = ?, edad = ?, dni = ?, altura = ?, pesoActual = ?, pesoBuscado = ? WHERE idPaciente = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, paciente.getApellido());
            ps.setString(2, paciente.getNombre());
            ps.setInt(3, paciente.getEdad());
            ps.setInt(4, paciente.getDni());
            ps.setDouble(5, paciente.getAltura());
            ps.setDouble(6, paciente.getPesoActual());
            ps.setDouble(7, paciente.getPesoBuscado());
            ps.setInt(8, paciente.getIdPaciente());

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas == 0) {
                throw new RuntimeException("Paciente no encontrado para modificación.");
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Error al modificar paciente: " + ex.getMessage(), ex);
        }
    }
      
       public void eliminarPaciente(int id) {
        String sql = "UPDATE pacientes SET activo = 0 WHERE idPaciente = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas == 0) {
                throw new RuntimeException("Paciente no encontrado para eliminación.");
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Error al eliminar paciente: " + ex.getMessage(), ex);
        }
    }
}
