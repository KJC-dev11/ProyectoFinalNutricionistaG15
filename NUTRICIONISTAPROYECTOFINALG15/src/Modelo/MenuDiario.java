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
    private String dia;
    private int caloriasDelMenu;
    private String estado;
    private int codDieta;
    
    private List<RenglonMenu> renglones;

    public MenuDiario() {
    }

    public MenuDiario(String dia, int caloriasDelMenu, String estado, int codDieta) {
        this.dia = dia;
        this.caloriasDelMenu = caloriasDelMenu;
        this.estado = estado;
        this.codDieta = codDieta;
    }

    public MenuDiario(int codMenu, String dia, int caloriasDelMenu, String estado, int codDieta) {
        this.codMenu = codMenu;
        this.dia = dia;
        this.caloriasDelMenu = caloriasDelMenu;
        this.estado = estado;
        this.codDieta = codDieta;
    }

    public int getCodMenu() {
        return codMenu;
    }

    public void setCodMenu(int codMenu) {
        this.codMenu = codMenu;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getCaloriasDelMenu() {
        return caloriasDelMenu;
    }

    public void setCaloriasDelMenu(int caloriasDelMenu) {
        this.caloriasDelMenu = caloriasDelMenu;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodDieta() {
        return codDieta;
    }

    public void setCodDieta(int codDieta) {
        this.codDieta = codDieta;
    }

    @Override
    public String toString() {
        return "MenuDiario{" + "codMenu=" + codMenu + ", dia=" + dia + ", caloriasDelMenu=" + caloriasDelMenu + ", estado=" + estado + ", codDieta=" + codDieta + '}';
    }
    
    
    
}
