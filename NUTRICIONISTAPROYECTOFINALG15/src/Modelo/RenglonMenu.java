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

    public RenglonMenu(int nroRenglon, int codMenu, int subtotalCalorias, String alimento, double cantidadGramos) {
        this.nroRenglon = nroRenglon;
        this.codMenu = codMenu;
        this.subtotalCalorias = subtotalCalorias;
        this.alimento = alimento;
        this.cantidadGramos = cantidadGramos;
    }

    public RenglonMenu(int codMenu, int subtotalCalorias, String alimento, double cantidadGramos) {
        this.codMenu = codMenu;
        this.subtotalCalorias = subtotalCalorias;
        this.alimento = alimento;
        this.cantidadGramos = cantidadGramos;
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
        this.cantidadGramos = cantidadGramos;
    }

    @Override
    public String toString() {
        return "RenglonMenu{" + "nroRenglon=" + nroRenglon + ", codMenu=" + codMenu + ", subtotalCalorias=" + subtotalCalorias + ", alimento=" + alimento + ", cantidadGramos=" + cantidadGramos + '}';
    }
    
    
    
}
