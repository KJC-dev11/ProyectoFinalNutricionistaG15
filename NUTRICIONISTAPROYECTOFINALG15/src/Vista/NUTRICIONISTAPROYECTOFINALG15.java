/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import Modelo.Paciente;
import Persistencia.PacienteData;
import Modelo.Conexion;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import java.sql.Connection;
import javax.swing.JFrame;
/**
 *
 * @author MOON
 */
public class NUTRICIONISTAPROYECTOFINALG15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Connection con;
        //con = Conexion.getConexion();
        //PacienteData pacienteData = new PacienteData();

        //System.out.println("---- Agregar Paciente ----");
        //Paciente paciente = new Paciente("Perez", "Juan", 30, 12345678, 1.75, 80.0, 75.0);
        //try {
            //pacienteData.guardarPaciente(paciente);
            //System.out.println("Paciente agregado con ID: " + paciente.getIdPaciente());
        //} catch (RuntimeException e) {
            //System.out.println("Error al agregar paciente: " + e.getMessage());
        //}

        //System.out.println("---- Buscar Paciente ----");
        //Paciente pacienteBuscado = pacienteData.buscarPaciente(paciente.getIdPaciente());
        //if (pacienteBuscado != null) {
         //   System.out.println("Paciente encontrado: " + pacienteBuscado);
        //} else {
          //  System.out.println("No se encontró el paciente.");
        //}

       //System.out.println("---- Modificar Paciente ----");
       // paciente.setNombre("Juan Carlos");
       // paciente.setPesoActual(78.0);
        //try {
         //   pacienteData.modificarPaciente(paciente);
           // System.out.println("Paciente modificado: " + pacienteData.buscarPaciente(paciente.getIdPaciente()));
        //} catch (RuntimeException e) {
         //  System.out.println("Error al modificar paciente: " + e.getMessage());
       // }
        
        //System.out.println("---- Listar Pacientes Activos ----");
        //try {
         //   for (Paciente p : pacienteData.listarPacientes()) {
         //       System.out.println(p);
        //    }
        //} catch (RuntimeException e) {
        //    System.out.println("Error al listar pacientes: " + e.getMessage());
       // }

       // System.out.println("---- Baja Lógica Paciente ----");
       // try {
         //   pacienteData.eliminarPaciente(paciente.getIdPaciente());
         //   System.out.println("Paciente dado de baja.");
       // } catch (RuntimeException e) {
       //     System.out.println("Error al dar de baja al paciente: " + e.getMessage());
       // }
        
       // System.out.println("---- Buscar Paciente Dado de Baja ----");
       // Paciente pacienteBaja = pacienteData.buscarPaciente(paciente.getIdPaciente());
        //if (pacienteBaja == null) {
        //    System.out.println("El paciente fue dado de baja y no está disponible.");
        //} else {
        //    System.out.println("Paciente encontrado (debería haber sido dado de baja): " + pacienteBaja);
       // }
       
        FlatGitHubIJTheme.setup();
       
        Nutricionista ventana = new Nutricionista();
        
        ventana.setSize(1000, 700);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
}
