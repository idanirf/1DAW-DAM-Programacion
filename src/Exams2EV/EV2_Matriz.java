package Exams2EV;

import java.util.Random;

public class EV2_Matriz {
    public static void main(String[] args) {
        // Definir la matriz de alumnos
        String[][] alumnos = new String[6][4];


        // Generar nombres de alumnos automáticamente
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                alumnos[i][j] = generarNombreAlumno();
            }
        }
        // Opcional: Mostrar la matriz de alumnos en la consola formateado
        // Mostrar la matriz de alumnos con un ancho fijo para cada columna
        int anchoColumna = 20;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-" + anchoColumna + "s", alumnos[i][j]);
            }
            System.out.println();
        }

        System.out.println("Total de alumnos: " + contarAlumnos(alumnos));
    }

    // Método para generar nombres de alumnos automáticamente
    public static String generarNombreAlumno() {
        String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis", "Laura", "Diego", "Sofía", "Carlos", "Elena"};
        String[] apellidos = {"González", "Rodríguez", "Fernández", "López", "Martínez", "Sánchez", "Pérez", "Gómez", "Martín", "Jiménez"};
        Random rand = new Random();
        String nombre = nombres[rand.nextInt(nombres.length)];
        String apellido = apellidos[rand.nextInt(apellidos.length)];
        return nombre + " " + apellido;
    }

    // Total de alumnos en la matriz
    public static int contarAlumnos(String[][] alumnos) {
        int contador = 0;
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < alumnos[i].length; j++) {
                if (alumnos[i][j] != null) {
                    contador++;
                }
            }
        }
        return contador;
    }



}

