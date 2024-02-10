package ProgArraysAndMatrices;

public class Matrices {
    public static void main(String[] args) {
        // Declaracion de una matriz
        int[][] numeros = new int[][]
                // [FILA][COLUMNA]
                        {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        String[][] nombres = new String[][]
                        {{"Juan", "Pedro", "Maria", "Martin", "Luisa"},
                        {"Pedro", "Maria", "Martin", "Luisa", "Juan"},
                        {"Maria", "Martin", "Luisa", "Juan", "Pedro"},
                        {"Martin", "Luisa", "Juan", "Pedro", "Maria"},
                        {"Luisa", "Martin", "Pablo", "Maria", "Juan"}};
        double[][] decimales = new double[][]
                        {{1.1, 1.2, 1.3},
                        {1.4, 1.5, 1.6},
                        {1.7, 1.8, 1.9}};
        char[][] letras = new char[][]
                {{'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}};

        // Acceso a un elemento de una matriz
        System.out.println("Numeros[0][1]: " + numeros[0][1]);
        System.out.println("Nombres[1][2]: " + nombres[1][2]);
        System.out.println("Decimales[2][1]: " + decimales[2][1]);
        System.out.println("Letras[1][2]: " + letras[1][2]);

        // Modificacion de un elemento de una matriz
        nombres[3][2] = "Diego";

        // Recorrido de una matriz
        recorrerMatriz(nombres);

        // Longitud de una matriz
        System.out.println("Longitud de numeros: " + longitudMatriz(numeros));

        // Media, total, maximo y minimo de una matriz
        System.out.println("Media: " + mediaMatriz(numeros));
        System.out.println("Longitud: " + longitudMatriz(numeros));
        System.out.println("Maximo: " + maximoMatriz(numeros));
        System.out.println("Minimo: " + manimoMatriz(numeros));
        System.out.println("Total: " + totalMatriz(numeros));


        // Funcion imprimir matriz
        imprimirMatriz(nombres);

    }

    public static void imprimirMatriz(String[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                if (j != matriz[i].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }

    // Funcion para recorrer una matriz
    public static void recorrerMatriz(String[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Fila: " + i);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Columna: " + j);
                System.out.println("Valor: " + matriz[i][j]);
            }
        }
    }

    // Funcion que calcule la longitud de una matriz
    public static int longitudMatriz(int[][] matriz){
        int longitud = 0;
        for (int[] fila : matriz) {
            longitud += fila.length;
        }
        return longitud;
    }

    // Funcion que calcule la media de una matriz
    public static double mediaMatriz(int[][] matriz){
        int total = 0;
        for (int[] fila : matriz) {
            for (int numero : fila) {
                total += numero;
            }
        }
        return (double) total / (matriz.length * matriz[0].length);
    }

    // Funcion que calcule el maximo de una matriz
    public static int maximoMatriz(int[][] matriz){
        int maximo = matriz[0][0];
        for (int[] fila : matriz) {
            for (int numero : fila) {
                if (numero > maximo) {
                    maximo = numero;
                }
            }
        }
        return maximo;
    }

    // Funcion que calcule el maximo de una matriz
    public static int manimoMatriz(int[][] matriz){
        int minimo = matriz[0][0];
        for (int[] fila : matriz) {
            for (int numero : fila) {
                if (numero < minimo) {
                    minimo = numero;
                }
            }
        }
        return minimo;
    }

    //Funcion que calcula el total de una matriz
    public static int totalMatriz(int[][] matriz){
        int total = 0;
        for (int[] fila : matriz) {
            for (int numero : fila) {
                total += numero;
            }
        }
        return total;
    }

    // Funcion que modifique el valor de una posicion de una matriz
    public static void modificarMatriz(int[][] matriz, int fila, int columna, int valor){
        matriz[fila][columna] = valor;
    }

}
