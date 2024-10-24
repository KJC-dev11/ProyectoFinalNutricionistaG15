/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author MOON
 */
public class Alimentos {
    private int codComida;
    private String nombreComida;
    private int caloriasPorPorcion;
    private String stipoComida;
    private String detalle;

    public Alimentos() {
    }

    public Alimentos(String nombreComida, int caloriasPorPorcion, String stipoComida, String detalle) {
        this.nombreComida = nombreComida;
        this.caloriasPorPorcion = caloriasPorPorcion;
        this.stipoComida = stipoComida;
        this.detalle = detalle;
    }

    public Alimentos(int codComida, String nombreComida, int caloriasPorPorcion, String stipoComida, String detalle) {
        this.codComida = codComida;
        this.nombreComida = nombreComida;
        this.caloriasPorPorcion = caloriasPorPorcion;
        this.stipoComida = stipoComida;
        this.detalle = detalle;
    }

    public int getCodComida() {
        return codComida;
    }

    public void setCodComida(int codComida) {
        this.codComida = codComida;
    }

    public String getNombreComida() {
        return nombreComida;
    }

    public void setNombreComida(String nombreComida) {
        this.nombreComida = nombreComida;
    }

    public int getCaloriasPorPorcion() {
        return caloriasPorPorcion;
    }

    public void setCaloriasPorPorcion(int caloriasPorPorcion) {
        this.caloriasPorPorcion = caloriasPorPorcion;
    }

    public String getStipoComida() {
        return stipoComida;
    }

    public void setStipoComida(String stipoComida) {
        this.stipoComida = stipoComida;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Alimentos{" + "codComida=" + codComida + ", nombreComida=" + nombreComida + ", caloriasPorPorcion=" + caloriasPorPorcion + ", stipoComida=" + stipoComida + ", detalle=" + detalle + '}';
    }
    
    
}
