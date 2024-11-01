/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dieta {
    private int codDieta;
    private String nombreD;
    private List<MenuDiario> listMenuDiario;
    private Date fechaIni;
    private Date fechaFin;
    private float pesoInicial;
    private float pesoFinal;
    private boolean estado;
    private int totalCalorias;
    private Paciente paciente;
    private int idPaciente;
    
    public Dieta(){
    }

public Dieta(String nombreD, Date fechaIni, Date fechaFin, float pesoInicial, float pesoFinal, int totalCalorias, boolean estado) {
    this.nombreD = nombreD;
    this.fechaIni = fechaIni;
    this.fechaFin = fechaFin;
    this.pesoInicial = pesoInicial;
    this.pesoFinal = pesoFinal;
    this.totalCalorias = totalCalorias;
    this.estado = estado;
    this.listMenuDiario = new ArrayList<>();
}


    public Dieta(String nombreD, List<MenuDiario> listMenuDiario, Date fechaIni, Date fechaFin, float pesoInicial, float pesoFinal, boolean estado, int totalCalorias, Paciente paciente, int idPaciente) {
        this.nombreD = nombreD;
        this.listMenuDiario =  new ArrayList<>();
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
        this.totalCalorias = totalCalorias;
        this.paciente = paciente;
        this.idPaciente = idPaciente;
    }

    public Dieta(int codDieta, String nombreD, List<MenuDiario> listMenuDiario, Date fechaIni, Date fechaFin, float pesoInicial, float pesoFinal, boolean estado, int totalCalorias, Paciente paciente, int idPaciente) {
        this.codDieta = codDieta;
        this.nombreD = nombreD;
        this.listMenuDiario =  new ArrayList<>();
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
        this.totalCalorias = totalCalorias;
        this.paciente = paciente;
        this.idPaciente = idPaciente;
    }

    public int getCodDieta() {
        return codDieta;
    }

    public void setCodDieta(int codDieta) {
        this.codDieta = codDieta;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public List<MenuDiario> getListMenuDiario() {
        return listMenuDiario;
    }

    public void setListMenuDiario(List<MenuDiario> listMenuDiario) {
        this.listMenuDiario = listMenuDiario;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public float getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(float pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public float getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(float pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getTotalCalorias() {
        return totalCalorias;
    }

    public void setTotalCalorias(int totalCalorias) {
        this.totalCalorias = totalCalorias;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }


    public void cargarPesoInicial(float pesoInicial) {
        this.pesoInicial = pesoInicial;
    }


    // Método para calcular la diferencia de peso
    public float calcularDiferenciaPeso() {
        return this.pesoInicial - this.pesoFinal;
    }

    @Override
    public String toString() {
        return "Dieta{" + "codDieta=" + codDieta + ", NombreDieta=" + nombreD + ", Menus=" +  new ArrayList<>() + ", Fechainicio=" + fechaIni + ", Fechafin=" + pesoFinal + ", Estado=" + estado + ", Total de calorias=" + totalCalorias + ", paciente=" + paciente + '}';
    }
}
