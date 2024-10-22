/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author MOON
 */
public class PacienteData {
    private Connection conexion;
    
    public PacienteData(Connection conexion){
        this.conexion = conexion;
    }
    
public void agregarPaciente(Paciente paciente) {
        String sql = "INSERT INTO Pacientes (nombreCompleto, edad, altura, pesoActual, pesoBuscado, activo) VALUES (?, ?, ?, ?, ?, 1)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, paciente.getNombreCompleto());
            statement.setInt(2, paciente.getEdad());
            statement.setDouble(3, paciente.getAltura());
            statement.setDouble(4, paciente.getPesoActual());
            statement.setDouble(5, paciente.getPesoBuscado());
            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar paciente: " + e.getMessage());
        }
    }

    public void actualizarPaciente(Paciente paciente) {
        String sql = "UPDATE Pacientes SET nombreCompleto = ?, edad = ?, altura = ?, pesoActual = ?, pesoBuscado = ? WHERE idPaciente = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, paciente.getNombreCompleto());
            statement.setInt(2, paciente.getEdad());
            statement.setDouble(3, paciente.getAltura());
            statement.setDouble(4, paciente.getPesoActual());
            statement.setDouble(5, paciente.getPesoBuscado());
            statement.setInt(6, paciente.getIdPaciente());
            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar paciente: " + e.getMessage());
        }
    }

    public Paciente buscarPaciente(int id) {
        Paciente paciente = null;
        String sql = "SELECT * FROM Pacientes WHERE idPaciente = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    paciente = new Paciente(
                        resultSet.getInt("idPaciente"),
                        resultSet.getString("nombreCompleto"),
                        resultSet.getInt("edad"),
                        resultSet.getDouble("altura"),
                        resultSet.getDouble("pesoActual"),
                        resultSet.getDouble("pesoBuscado")
                    );
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar paciente: " + e.getMessage());
        }
        return paciente;
    }

    public void bajaLogicaPaciente(int id) {
        String sql = "UPDATE Pacientes SET activo = 0 WHERE idPaciente = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al realizar baja lógica: " + e.getMessage());
        }
    }

    public void altaLogicaPaciente(int id) {
        String sql = "UPDATE Pacientes SET activo = 1 WHERE idPaciente = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al realizar alta lógica: " + e.getMessage());
        }
    }

    public void eliminarPaciente(int id) {
        String sql = "DELETE FROM Pacientes WHERE idPaciente = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar paciente: " + e.getMessage());
        }
    }

    public List<Paciente> listarPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        String sql = "SELECT * FROM Pacientes WHERE activo = 1";
        try (PreparedStatement statement = conexion.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Paciente paciente = new Paciente(
                    resultSet.getInt("idPaciente"),
                    resultSet.getString("nombreCompleto"),
                    resultSet.getInt("edad"),
                    resultSet.getDouble("altura"),
                    resultSet.getDouble("pesoActual"),
                    resultSet.getDouble("pesoBuscado")
                );
                pacientes.add(paciente);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar pacientes: " + e.getMessage());
        }
        return pacientes;
    }
}
