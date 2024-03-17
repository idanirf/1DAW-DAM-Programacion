package Exams2EV;

import java.util.Random;

public class SolucionJavi {

    public static void main (String[] args) {

        //Creamos la matriz "losalumnos"
        String [][] alumnos = new String [6][4];

        //Ahora vamos a generar los nombres de los alumnos
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                alumnos [i][j] = generandoelnombredelalumno();
            }
        }

        //Generar las columnas de los alumnos
        int elanchodecadacolumna = 30;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-" + elanchodecadacolumna + "s", alumnos[i][j]);
            }
            System.out.println();
        }
    }

    public static String generandoelnombredelalumno() {

        String[] nombres = {"Javier", "Daniel", "Juan", "Blanca", "Leticia", "Ángel"};

        String[] apellidos = {"Barquilla  Toboso", "Rodríguez Fernández", "Aguado Roldán", "Blasco Rodríguez", "Aranda Salazar", "Sanchez Rodríguez"};

        Random random = new Random();

        String nombre = nombres [random.nextInt(nombres.length)];

        String elapellido = apellidos [random.nextInt(apellidos.length)];

        return nombre + " " + elapellido;

    }

}