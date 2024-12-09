package Modelo;

public class RenglonMenu {
    private int nroRenglon;
    private String nombreRenglon;
    private int subtotalCalorias;
    private int cantidadGramos;
    private String nomComida1; 
    private String nomComida2; 
    private String nomComida3; 
    private String tipo;

    public RenglonMenu() {
    }

    public RenglonMenu(int nroRenglon, String nombreRenglon, int subtotalCalorias, int cantidadGramos, String nomComida1, String nomComida2, String nomComida3, String tipo) {
        this.nroRenglon = nroRenglon;
        this.nombreRenglon = nombreRenglon;
        this.subtotalCalorias = subtotalCalorias;
        this.cantidadGramos = cantidadGramos;
        this.nomComida1 = nomComida1;
        this.nomComida2 = nomComida2;
        this.nomComida3 = nomComida3;
        this.tipo = tipo;
    }

    public RenglonMenu(String nombreRenglon, int subtotalCalorias, int cantidadGramos, String nomComida1, String nomComida2, String nomComida3, String tipo) {
        this.nombreRenglon = nombreRenglon;
        this.subtotalCalorias = subtotalCalorias;
        this.cantidadGramos = cantidadGramos;
        this.nomComida1 = nomComida1;
        this.nomComida2 = nomComida2;
        this.nomComida3 = nomComida3;
        this.tipo = tipo;
    }

    public int getNroRenglon() {
        return nroRenglon;
    }

    public void setNroRenglon(int nroRenglon) {
        this.nroRenglon = nroRenglon;
    }

    public String getNombreRenglon() {
        return nombreRenglon;
    }

    public void setNombreRenglon(String nombreRenglon) {
        this.nombreRenglon = nombreRenglon;
    }

    public int getSubtotalCalorias() {
        return subtotalCalorias;
    }

    public void setSubtotalCalorias(int subtotalCalorias) {
        this.subtotalCalorias = subtotalCalorias;
    }

    public int getCantidadGramos() {
        return cantidadGramos;
    }

    public void setCantidadGramos(int cantidadGramos) {
        this.cantidadGramos = cantidadGramos;
    }

    public String getNomComida1() {
        return nomComida1;
    }

    public void setNomComida1(String nomComida1) {
        this.nomComida1 = nomComida1;
    }

    public String getNomComida2() {
        return nomComida2;
    }

    public void setNomComida2(String nomComida2) {
        this.nomComida2 = nomComida2;
    }

    public String getNomComida3() {
        return nomComida3;
    }

    public void setNomComida3(String nomComida3) {
        this.nomComida3 = nomComida3;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nombreRenglon;
    }

    


}
