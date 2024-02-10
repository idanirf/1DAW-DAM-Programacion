package ProgFuncional;

public class Funciones {
    /*
    ¿Qué es una función?
    Una función es como una regla que nos dice qué hacer con los números. En matemáticas, escribimos una función como f(x) o y = f(x)
    para mostrar que está relacionada con un número al que llamamos x. Podemos utilizar otra letra para representar este número.
    Si usamos la letra m la función se escribiría como f(m) o si usamos la letra p, la función se escribiría como f(p).
     */
    public static void main(String[] args) {
        // Llamada a la funcion
        int resultado = suma(5, 6);
        System.out.println("Resultado: " + resultado);
        int resultado2 = resta(5, 6);
        System.out.println("Resultado: " + resultado2);
        int resultado3 = multiplicacion(5, 6);
        System.out.println("Resultado: " + resultado3);
    }

    // Declaracion de la funcion
    public static int suma(int a, int b) {
        return a + b;
    }

    public  static int resta(int a, int b){
        return a - b;
    }

    public static int multiplicacion(int a, int b){
        return a * b;
    }
}
