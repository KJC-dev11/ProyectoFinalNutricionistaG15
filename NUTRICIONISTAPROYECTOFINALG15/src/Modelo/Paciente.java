/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author MOON
 */
public class Paciente {
        private int idPaciente;
    private int edad;
    private double altura;
    private double pesoActual;
    private double pesoBuscado;
    private int dni;
    private String apellido;
    private String nombre;
    private boolean activo;

    public Paciente() {
    }

public Paciente(int edad, double altura, double pesoActual, double pesoBuscado, int dni, String apellido, String nombre, boolean activo) {
    setEdad(edad);
    setAltura(altura);
    this.pesoActual = pesoActual;
    this.pesoBuscado = pesoBuscado;
    this.dni = dni;
    this.apellido = apellido;
    this.nombre = nombre;
    this.activo = activo;
}


    public Paciente(int idPaciente, int edad, double altura, double pesoActual, double pesoBuscado, int dni, String apellido, String nombre, boolean activo) {
        this.idPaciente = idPaciente;
        this.edad = edad;
        this.altura = altura;
        this.pesoActual = pesoActual;
        this.pesoBuscado = pesoBuscado;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.activo = activo;
    }
    

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
            if (edad < 0) {
        throw new IllegalArgumentException("La edad no puede ser negativa.");
    }
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
            if (altura <= 0) {
        throw new IllegalArgumentException("La altura debe ser mayor a 0.");
    }
        this.altura = altura;
    }

    public double getPesoActual() {
        return pesoActual;
    }

public void setPesoActual(double pesoActual) {
    if (pesoActual <= 0) {
        throw new IllegalArgumentException("El peso actual debe ser mayor a 0.");
    }
    this.pesoActual = pesoActual;
}

    public double getPesoBuscado() {
        return pesoBuscado;
    }

public void setPesoBuscado(double pesoBuscado) {
    if (pesoBuscado <= 0) {
        throw new IllegalArgumentException("El peso buscado debe ser mayor a 0.");
    }
    this.pesoBuscado = pesoBuscado;
}


    public int getDni() {
        return dni;
    }

public void setDni(int dni) {
    if (dni <= 0) {
        throw new IllegalArgumentException("El DNI debe ser mayor a 0.");
    }
    this.dni = dni;
}

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

@Override
public String toString() {
    return "Paciente[ID: " + idPaciente + ", Nombre: " + nombre + " " + apellido + ", Edad: " + edad +
           ", Altura: " + altura + "m, Peso Actual: " + pesoActual + "kg, Estado: " + estado() + "]";
}
 
    
public double calcularIMC() {
    if (altura > 0) {
        return Math.round((pesoActual / (altura * altura)) * 100.0) / 100.0;
    } else {
        throw new IllegalStateException("La altura debe ser mayor a 0 para calcular el IMC.");
    }
}

public String estado() {
    return activo ? "Activo" : "Inactivo";
}

public double[] calcularPesoIdealRango() {
    if (altura > 0) {
        double pesoMinimo = 18.5 * (altura * altura);
        double pesoMaximo = 24.9 * (altura * altura);
        return new double[]{Math.round(pesoMinimo * 100.0) / 100.0, Math.round(pesoMaximo * 100.0) / 100.0};
    } else {
        throw new IllegalStateException("La altura debe ser mayor a 0 para calcular el peso ideal.");
    }
}

public String evaluarPesoActual() {
    double[] pesoIdealRango = calcularPesoIdealRango();
    double pesoMinimo = pesoIdealRango[0];
    double pesoMaximo = pesoIdealRango[1];
    
    return pesoActual < pesoMinimo ? "Por debajo del peso ideal" :
           pesoActual > pesoMaximo ? "Por encima del peso ideal" :
           "Dentro del peso ideal";
}


}


