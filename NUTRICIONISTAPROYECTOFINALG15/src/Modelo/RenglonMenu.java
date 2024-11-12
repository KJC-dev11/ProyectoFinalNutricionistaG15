package Modelo;

public class RenglonMenu {
    private int nroRenglon;
    private int codMenu;
    private int subtotalCalorias;
    private int codComida; 
    private double cantidadGramos;

    public RenglonMenu() {
    }

    public RenglonMenu(int nroRenglon, int codComida, double cantidadGramos, int subtotalCalorias) {
        this.nroRenglon = nroRenglon;
        this.codComida = codComida;
        this.cantidadGramos = cantidadGramos;
        this.subtotalCalorias = subtotalCalorias;
    }

    public RenglonMenu(int nroRenglon, int codMenu, int codComida, double cantidadGramos, int caloriasPorPorcion) {
        this.nroRenglon = nroRenglon;
        this.codMenu = codMenu;
        this.codComida = codComida;
        this.cantidadGramos = cantidadGramos;
        this.subtotalCalorias = calcularSubtotalCalorias(caloriasPorPorcion);
    }
    
        public RenglonMenu(int codMenu, int subtotalCalorias, int codComida, double cantidadGramos) {
        this.codMenu = codMenu;
        this.subtotalCalorias = subtotalCalorias;
        this.codComida = codComida;
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

    public int getCodComida() {
        return codComida;
    }

    public void setCodComida(int codComida) {
        this.codComida = codComida;
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
        return "RenglonMenu{" +
               "nroRenglon=" + nroRenglon +
               ", codMenu=" + codMenu +
               ", subtotalCalorias=" + subtotalCalorias +
               ", codComida=" + codComida +
               ", cantidadGramos=" + cantidadGramos +
               '}';
    }

    public int calcularSubtotalCalorias(int caloriasPorPorcion) {
        return (int) (this.cantidadGramos * caloriasPorPorcion / 100);
    }
}
