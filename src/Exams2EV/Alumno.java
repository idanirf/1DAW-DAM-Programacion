package Exams2EV;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno {
    private Integer id;
    private String dni;
    private String nombre;
    private String apellidos;
    private String email;
    private double calificacion;
    private boolean presentado;
    private LocalDateTime fechaRegistro;

    // Constructor
    public Alumno(Integer id, String dni, String nombre, String apellidos, String email, double calificacion, boolean presentado, LocalDateTime fechaRegistro) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.calificacion = calificacion;
        this.presentado = presentado;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (validarEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("El email no tiene un formato válido");
        }    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public boolean isPresentado() {
        return presentado;
    }

    public void setPresentado(boolean presentado) {
        this.presentado = presentado;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    private boolean validarEmail(String email) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Método para validar el formato del DNI
    public static boolean validarDNI(String dni) {
        String regex = "\\d{8}[a-zA-Z]";
        return dni.matches(regex);
    }

    // Método toString para imprimir los detalles del alumno
    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", calificacion=" + calificacion +
                ", presentado=" + presentado +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }

    public static void main(String[] args) {
        // Crear instancias de alumnos
        Alumno alumno1 = new Alumno(1, "12345678A", "Juan", "Pérez", "juan@example.com", 12.5, true, LocalDateTime.now());
        Alumno alumno2 = new Alumno(2, "87654321B", "María", "López", "maria@example.com", 11.2, true, LocalDateTime.now());
        Alumno alumno3 = new Alumno(3, "13579246C", "Pedro", "González", "pedro@example.com", 14.0, false, LocalDateTime.now());
        Alumno alumno4 = new Alumno(4, "98765432D", "Ana", "Martínez", "ana@example.com", 9.8, true, LocalDateTime.now());

        // Imprimir detalles de los alumnos
        System.out.println(alumno1);
        System.out.println(alumno2);
        System.out.println(alumno3);
        System.out.println(alumno4);
    }
}
