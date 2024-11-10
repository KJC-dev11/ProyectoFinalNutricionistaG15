/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author MOON
 */
public class RenglonMenu {
    private int nroRenglon;
    private int codMenu;
    private int subtotalCalorias;
    private String alimento;
    private double cantidadGramos;

    public RenglonMenu() {
    }

public RenglonMenu(int nroRenglon, int codMenu, String alimento, double cantidadGramos, int caloriasPorPorcion) {
    this.nroRenglon = nroRenglon;
    this.codMenu = codMenu;
    this.alimento = alimento;
    this.cantidadGramos = cantidadGramos;
    this.subtotalCalorias = calcularSubtotalCalorias(caloriasPorPorcion);
}


    public RenglonMenu(int codMenu, int subtotalCalorias, String alimento, double cantidadGramos) {
        this.codMenu = codMenu;
        this.subtotalCalorias = subtotalCalorias;
        this.alimento = alimento;
        this.cantidadGramos = cantidadGramos;
    }

    public RenglonMenu(int codMenu, String alimento, double cantidad, int subCalorias) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNroRenglon() {
        return nroRenglon;
    }

    public void setNroRenglon(int nroRenglon) {
        this.nroRenglon = nroRenglon;
    }

    public int getCodMenu() {
        return codMenu;
    }

    public void setCodMenu(int codMenu) {
        this.codMenu = codMenu;
    }

    public int getSubtotalCalorias() {
        return subtotalCalorias;
    }

    public void setSubtotalCalorias(int subtotalCalorias) {
        this.subtotalCalorias = subtotalCalorias;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public double getCantidadGramos() {
        return cantidadGramos;
    }

public void setCantidadGramos(double cantidadGramos) {
    if (cantidadGramos > 0) {
        this.cantidadGramos = cantidadGramos;
    } else {
        throw new IllegalArgumentException("La cantidad de gramos debe ser positiva.");
    }
}

    @Override
    public String toString() {
        return "RenglonMenu{" + "nroRenglon=" + nroRenglon + ", codMenu=" + codMenu + ", subtotalCalorias=" + subtotalCalorias + ", alimento=" + alimento + ", cantidadGramos=" + cantidadGramos + '}';
    }
    
    public int calcularSubtotalCalorias(int caloriasPorPorcion) {
    return (int) (this.cantidadGramos * caloriasPorPorcion / 100);
}

    
}
