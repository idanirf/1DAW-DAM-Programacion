package ProgCondicionales;

public class Condicionales {
    public static void main(String[]args) {
      // Condicional if
        int edad = 20;
        final int EDAD_MINIMA = 18;
        if(edad>= EDAD_MINIMA){
            System.out.println("Es mayor de edad");
        }

        // Condicional if-else
        int edad2 = 15;
        if(edad2>= EDAD_MINIMA){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }

        // Condicional if-else if-else
        int nota = 6;
                if(nota<5){
                    System.out.println("Insuficiente");
                } else if (nota >= 5 && nota < 6) {
                    System.out.println("Suficiente");
                } else if (nota >= 6 && nota < 7) {
                    System.out.println("Bien");
                } else if (nota >= 7 && nota < 9) {
                    System.out.println("Notable");
                } else if (nota >= 9 && nota <= 10) {
                    System.out.println("Sobresaliente");
                } else {
                    System.out.println("Nota no valida");
                }

        // Condicional switch
        int diaSemana = 1;
                String nombreDia;
                switch (diaSemana) {
                    case 1:
                        nombreDia = "Lunes";
                        System.out.println(nombreDia);
                        break;
                    case 2:
                        nombreDia = "Martes";
                        System.out.println(nombreDia);
                        break;
                    case 3:
                        nombreDia = "Miercoles";
                        System.out.println(nombreDia);
                        break;
                    case 4:
                        nombreDia = "Jueves";
                        System.out.println(nombreDia);
                        break;
                    case 5:
                        nombreDia = "Viernes";
                        System.out.println(nombreDia);
                        break;
                    case 6:
                        nombreDia = "Sabado";
                        System.out.println(nombreDia);
                        break;
                    case 7:
                        nombreDia = "Domingo";
                        System.out.println(nombreDia);
                        break;
                    default:
                        nombreDia = "Dia no valido";
                        System.out.println(nombreDia);
                        break;
                }

        // Condicional for ascendente
        for (int i = 4; i <= 10; i++) {
            System.out.println("Valor de i: " + i);
        }

        // Condicional for descendente
        for (int i = 10; i >= 4; i--) {
            System.out.println("Valor de i: " + i);
        }

        // Condicional while
        int i = 4;
        while (i <= 10) {
            System.out.println("Valor de i: " + i);
            i++;
        }

        /*
         * EJERCICIO 1
         * Tenemos que si una cuenta bancaria tiene un saldo mayor o igual a 1000€, se trata de un cliente VIP.
         */
int saldo = 1000;
        if(saldo>=1000){
            System.out.println("Es cliente VIP");
        }else{
            System.out.println("No es cliente VIP");
        }

        /*
         * EJERCICIO 2
         * Tenemos que si una cuenta bancaria tiene un saldo mayor o igual a 1000€, se trata de un cliente VIP.
         * Si no, se trata de un cliente normal.
         */
int saldo2 = 1000;
        if(saldo2>=1000){
            System.out.println("Es cliente VIP");
        }else{
            System.out.println("Es cliente normal");
        }

        /*
         * EJERCICIO 3
         * Tenemos que si una cuenta bancaria tiene un saldo mayor o igual a 1000€, se trata de un cliente VIP.
         * Si no, si el saldo es mayor o igual a 500€, se trata de un cliente normal.
         * Si no, se trata de un cliente no VIP.
         */
int saldo3 = 1000;
        if(saldo3>=1000){
            System.out.println("Es cliente VIP");
        }else if(saldo3>=500){
            System.out.println("Es cliente normal");
        }else{
            System.out.println("Es cliente no VIP");
        }

        /*
         * EJERCICIO 4
         * Tenemos que si una cuenta bancaria tiene un saldo mayor o igual a 1000€, se trata de un cliente VIP.
         * Si no, si el saldo es mayor o igual a 500€, se trata de un cliente normal.
         * Si no, si el saldo es mayor o igual a 100€, se trata de un cliente no VIP.
         * Si no, se trata de un cliente no VIP.
         */
int saldo4 = 1000;
        if(saldo4>=1000){
            System.out.println("Es cliente VIP");
        }else if(saldo4>=500){
            System.out.println("Es cliente normal");
        }else if(saldo4>=100){
            System.out.println("Es cliente no VIP");
        }else{
            System.out.println("Es cliente no VIP");
        }

        /*
         * EJERCICIO 5
         * Crea un programa que al introducir un numero abra un menu con las siguientes opciones:
         * 1. Crear archivo 2. Eliminar archivo 3. Salir
         */
int numero = 1;
        switch (numero) {
            case 1:
                System.out.println("Crear archivo");
                break;
            case 2:
                System.out.println("Eliminar archivo");
                break;
            case 3:
                System.out.println("Salir");
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

        /*
         * EJERCICIO 6
         * Crea un programa que al introducir un numero abra un menu con las siguientes opciones:
         * 1. Crear archivo 2. Eliminar archivo 3. Salir
         * Si se introduce una opcion no valida, se mostrara un mensaje de error.
         */
int numero2 = 1;
        switch (numero2) {
            case 1:
                System.out.println("Crear archivo");
                break;
            case 2:
                System.out.println("Eliminar archivo");
                break;
            case 3:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
