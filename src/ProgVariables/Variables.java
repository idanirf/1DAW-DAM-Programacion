package ProgVariables;

public class Variables {
    public static void main(String[] args) {
        // Variables.Variables numericas
        int edad = 25;
        long edad2 = 35L;
        byte edad3 = 5;
        double edad4 = 5.5;
        float edad5 = 5.5F;

        // Variables.Variables de texto
        String nombre = "Juan";
        char inicial = 'J';

        // Variables.Variables logicas
        boolean esAdulto = true;

        // Constantes
        final int EDAD_MINIMA = 18;


        System.out.println("Edad: " + edad);
        System.out.println("Edad2: " + edad2);
        System.out.println("Edad3: " + edad3);
        System.out.println("Edad4: " + edad4);
        System.out.println("Edad5: " + edad5);
        System.out.println("Nombre: " + nombre);
        System.out.println("Inicial: " + inicial);
        System.out.println("Es adulto: " + esAdulto);
        System.out.println("Edad minima: " + EDAD_MINIMA);
    }
}