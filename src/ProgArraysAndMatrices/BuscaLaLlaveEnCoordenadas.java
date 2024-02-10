package ProgArraysAndMatrices;

import java.util.Random;

public class BuscaLaLlaveEnCoordenadas {
    private int[][] fondoMarino;


    // Constructor
    public BuscaLaLlaveEnCoordenadas(int filas, int columnas) {
        fondoMarino = new int[filas][columnas];
        inicializarFondoMarino();
    }

    // Método para inicializar el fondo marino con valores aleatorios (0 o 1)
    private void inicializarFondoMarino() {
        Random random = new Random();

        for (int i = 0; i < fondoMarino.length; i++) {
            for (int j = 0; j < fondoMarino[i].length; j++) {
                fondoMarino[i][j] = random.nextInt(2); // Genera 0 o 1
            }
        }
    }

    // Método para buscar llaves en las coordenadas proporcionadas
    public void buscarLlaves(int[] coordenadas) {
        int fila = coordenadas[0];
        int columna = coordenadas[1];

        if (fila >= 0 && fila < fondoMarino.length && columna >= 0 && columna < fondoMarino[0].length) {
            int valor = fondoMarino[fila][columna];
            System.out.println("Buscando en coordenadas (" + fila + ", " + columna + "):");

            if (valor == 1) {
                System.out.println("¡Encontraste una llave!");
            } else {
                System.out.println("No hay llaves en esta ubicación.");
            }
        } else {
            System.out.println("Coordenadas fuera de los límites del fondo marino.");
        }
    }

    // Método para imprimir el fondo marino en la consola
    public void imprimirFondoMarino() {
        System.out.println("Fondo Marino:");

        for (int i = 0; i < fondoMarino.length; i++) {
            for (int j = 0; j < fondoMarino[i].length; j++) {
                System.out.print(fondoMarino[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BuscaLaLlaveEnCoordenadas busqueda = new BuscaLaLlaveEnCoordenadas(5, 5);

        busqueda.imprimirFondoMarino();

        // Prueba de búsqueda en coordenadas específicas
        busqueda.buscarLlaves(new int[]{2, 3});
        busqueda.buscarLlaves(new int[]{0, 0});
        busqueda.buscarLlaves(new int[]{4, 4});

    }
}