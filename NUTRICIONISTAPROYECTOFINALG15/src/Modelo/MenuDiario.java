/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;

/**
 *
 * @author MOON
 */
public class MenuDiario {
    private int codMenu;
    private String nombreMenu;
    private String desayuno;
    private String almuerzo;
    private String merienda;
    private String cena;
    
    private List<RenglonMenu> renglones;

    public MenuDiario() {
    }

    public MenuDiario(int codMenu, String nombreMenu, String desayuno, String almuerzo, String merienda, String cena) {
        this.codMenu = codMenu;
        this.nombreMenu = nombreMenu;
        this.desayuno = desayuno;
        this.almuerzo = almuerzo;
        this.merienda = merienda;
        this.cena = cena;
    }

    public MenuDiario(String nombreMenu, String desayuno, String almuerzo, String merienda, String cena) {
        this.nombreMenu = nombreMenu;
        this.desayuno = desayuno;
        this.almuerzo = almuerzo;
        this.merienda = merienda;
        this.cena = cena;
    }

    public int getCodMenu() {
        return codMenu;
    }

    public void setCodMenu(int codMenu) {
        this.codMenu = codMenu;
    }

    public String getNombreMenu() {
        return nombreMenu;
    }

    public void setNombreMenu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    public String getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(String desayuno) {
        this.desayuno = desayuno;
    }

    public String getAlmuerzo() {
        return almuerzo;
    }

    public void setAlmuerzo(String almuerzo) {
        this.almuerzo = almuerzo;
    }

    public String getMerienda() {
        return merienda;
    }

    public void setMerienda(String merienda) {
        this.merienda = merienda;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "MenuDiario{" + "codMenu=" + codMenu + ", nombreMenu=" + nombreMenu + ", desayuno=" + desayuno + ", almuerzo=" + almuerzo + ", merienda=" + merienda + ", cena=" + cena + '}';
    }



       
    
}
