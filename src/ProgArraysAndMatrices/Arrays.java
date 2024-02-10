package ProgArraysAndMatrices;

public class Arrays {
    public static void main(String[] args){
        // Declaracion de un array/listas
        int[] numeros = new int[] {1,2,3,4,5};
        String[] nombres = new String[]{"Juan", "Pedro", "Maria", "Luisa"};
        double[] decimales = new double[]{1.1, 1.2, 1.3, 1.4, 1.5};
        char[] letras = new char[]{'a', 'b', 'c', 'd', 'e'};

        // Acceso a un elemento de un array/lista
        System.out.println("Numeros[0]: " + numeros[0]);
        System.out.println("Nombres[1]: " + nombres[1]);
        System.out.println("Decimales[2]: " + decimales[2]);
        System.out.println("Letras[3]: " + letras[3]);

        // Modificacion de un elemento de un array/lista
        nombres[3]="Martin";
        System.out.println("Nombres[3]: " + nombres[3]);

        // Recorrido de un array/lista
        for(int i=0; i<nombres.length; i++){
            System.out.println("Nombres[" + i + "]: " + nombres[i]);
        }

        // Longitud del array/lista
        System.out.println("Longitud de numeros: " + numeros.length);

        // Media, total, maximo y minimo de un array/lista
        int[] numeros2 = new int[] {1,2,3,4,6};
        int total = 0;
        for (int numero : numeros2) {
            total += numero;
        }
        System.out.println("Total: " + total);
        double media = (double) total / numeros2.length;
        System.out.println("Media: " +media);

        int maximo = numeros2[0];
        int minimo = numeros2[0];
        for (int numero : numeros2) {
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
        }
        System.out.println("Maximo: " + maximo);
        System.out.println("Minimo: " + minimo);

        // Cipiar un array/lista
        int[] numeros3 = new int[numeros2.length];
        for (int i = 0; i < numeros2.length; i++) {
            numeros3[i] = numeros2[i];
        }
        for (int numero : numeros3) {
            System.out.println("Numero: " + numero);
        }

        // Copia por referencia numeros2 en numeros4 de un array/lista
        int[] numeros4 = numeros2;
        for (int numero : numeros4) {
            System.out.println("Numero: " + numero);
        }

        // Comparar arrays/listas
        int[] numeros5 = new int[] {1,2,3,4,5};
        int[] numeros6 = new int[] {1,2,3,4,5};
        /*boolean sonIguales = ArraysAndMatrices.Arrays.equals(numeros5, numeros6);
        if (sonIguales) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
        */

        // Ordenar arrays/listas
        int[] numeros7 = new int[] {5,4,3,2,1};
       /* ArraysAndMatrices.Arrays.sort(numeros7);
        for (int numero : numeros7) {
            System.out.println("Numero: " + numero);
        }

        */

    }

}
