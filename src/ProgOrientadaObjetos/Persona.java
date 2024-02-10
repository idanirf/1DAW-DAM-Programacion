package ProgOrientadaObjetos;

import java.util.Date;

public class Persona {
    // Atributos
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private int edad;
    private String dni;
    private String direccion;

    // Constructor
    public Persona(String nombre, String apellido, Date fechaNacimiento, int edad, String dni, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.dni = dni;
        this.direccion = direccion;
    }
}
