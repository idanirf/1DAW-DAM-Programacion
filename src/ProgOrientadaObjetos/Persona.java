package ProgOrientadaObjetos;

import java.util.Date;

public class Persona {
    // Atributos
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private int edad = 0;
    private String dni;
    private String direccion;

    // Constructor
    public Persona() {

    }

    // Métodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null && nombre.length() > 0){
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if(apellido != null && apellido.length() > 0){
            this.apellido = apellido;
        } else {
            System.out.println("El apellido no puede estar vacío");
        }
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        if(fechaNacimiento != null){
            // Restar 1 al mes para ajustarlo al rango de 0 a 11
            fechaNacimiento.setMonth(fechaNacimiento.getMonth() - 1);
            this.fechaNacimiento = fechaNacimiento;
        } else {
            System.out.println("La fecha de nacimiento no puede estar vacía");
        }
    }

    public int getEdad() {
        if(fechaNacimiento != null){
            Date fechaActual = new Date();
            long diferencia = fechaActual.getTime() - fechaNacimiento.getTime();
            long dias = diferencia / (1000 * 60 * 60 * 24);
            edad = (int) (dias / 365);
        }
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if(dni != null && dni.length() == 9){
            if(validatedDni(dni)){
                System.out.println("DNI válido");
                this.dni = dni;
            } else {
                System.out.println("DNI no válido");
            }
        }
    }

    private boolean validatedDni(String dni){
        boolean valido = false;
            int numero = Integer.parseInt(dni.substring(0, 8)); // Corregir para que el substring sea de 0 a 8 (8 excluido)
            char letra = dni.charAt(8); // Cambiar a posición 8 para obtener la letra
            char letraCalculada = calcularLetraDni(numero);
            if(letra == letraCalculada){
                valido = true;
            }
        return valido;
    }

    private char calcularLetraDni(int numero){
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[numero % 23];
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if(direccion != null && direccion.length() > 0){
            this.direccion = direccion;
        } else {
            System.out.println("La dirección no puede estar vacía");
        }
    }
}
