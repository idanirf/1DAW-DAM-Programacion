package ProgOrientadaObjetos;

import java.util.Date;

public class MainPersonas {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setApellido("Perez");
        persona1.setFechaNacimiento(new Date(95, 6, 15));
        persona1.setEdad(0);
        persona1.setDni("12345678Z");
        persona1.setDireccion("Calle Falsa 123");




        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());
        System.out.println("Fecha de nacimiento: " + persona1.getFechaNacimiento());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("DNI: " + persona1.getDni());
        System.out.println("Dirección: " + persona1.getDireccion());

    }
}
