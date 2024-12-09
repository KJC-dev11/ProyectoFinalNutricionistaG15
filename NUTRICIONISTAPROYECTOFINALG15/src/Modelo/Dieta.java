/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;


public class Dieta {
    private int codDieta;
    private String nombreDieta;
    private String lunes;
    private String martes;
    private String miercoles;
    private String jueves;
    private String viernes;
    private Date fInicio;
    private Date fFin;
    private String nombrePaciente;
    private int totalCalorias;
    private boolean estado;
    
    public Dieta(){
    }

    public Dieta(int codDieta, String nombreDieta, String lunes, String martes, String miercoles, String jueves, String viernes, Date fInicio, Date fFin, String nombrePaciente, int totalCalorias, boolean estado) {
        this.codDieta = codDieta;
        this.nombreDieta = nombreDieta;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.fInicio = fInicio;
        this.fFin = fFin;
        this.nombrePaciente = nombrePaciente;
        this.totalCalorias = totalCalorias;
        this.estado = estado;
    }

    public Dieta(String nombreDieta, String lunes, String martes, String miercoles, String jueves, String viernes, Date fInicio, Date fFin, String nombrePaciente, int totalCalorias, boolean estado) {
        this.nombreDieta = nombreDieta;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.fInicio = fInicio;
        this.fFin = fFin;
        this.nombrePaciente = nombrePaciente;
        this.totalCalorias = totalCalorias;
        this.estado = estado;
    }

    public int getCodDieta() {
        return codDieta;
    }

    public void setCodDieta(int codDieta) {
        this.codDieta = codDieta;
    }

    public String getNombreDieta() {
        return nombreDieta;
    }

    public void setNombreDieta(String nombreDieta) {
        this.nombreDieta = nombreDieta;
    }

    public String getLunes() {
        return lunes;
    }

    public void setLunes(String lunes) {
        this.lunes = lunes;
    }

    public String getMartes() {
        return martes;
    }

    public void setMartes(String martes) {
        this.martes = martes;
    }

    public String getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(String miercoles) {
        this.miercoles = miercoles;
    }

    public String getJueves() {
        return jueves;
    }

    public void setJueves(String jueves) {
        this.jueves = jueves;
    }

    public String getViernes() {
        return viernes;
    }

    public void setViernes(String viernes) {
        this.viernes = viernes;
    }

    public Date getfInicio() {
        return fInicio;
    }

    public void setfInicio(Date fInicio) {
        this.fInicio = fInicio;
    }

    public Date getfFin() {
        return fFin;
    }

    public void setfFin(Date fFin) {
        this.fFin = fFin;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public int getTotalCalorias() {
        return totalCalorias;
    }

    public void setTotalCalorias(int totalCalorias) {
        this.totalCalorias = totalCalorias;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dieta{" + "codDieta=" + codDieta + ", nombreDieta=" + nombreDieta + ", lunes=" + lunes + ", martes=" + martes + ", miercoles=" + miercoles + ", jueves=" + jueves + ", viernes=" + viernes + ", fInicio=" + fInicio + ", fFin=" + fFin + ", nombrePaciente=" + nombrePaciente + ", totalCalorias=" + totalCalorias + ", estado=" + estado + '}';
    }


}
