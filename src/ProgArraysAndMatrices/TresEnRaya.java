package ProgArraysAndMatrices;

import java.util.Scanner;

public class TresEnRaya {

        char[][] tablerodetresenraya;
        char jugadorqueletocajugarahora;

        public TresEnRaya() {
            tablerodetresenraya = new char[][]{
                    {' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}

            };
            jugadorqueletocajugarahora = 'X';
        }

        public void vamosajugaraltresenraya() {
            mostrartablerodeltresenraya();

            for (int i = 0; i < 9; i++) {
                vamosarealizarlajugada();
                mostrartablerodeltresenraya();

                if (yahaganadounjugador()) {
                    System.out.println("¡El jugador " + jugadorqueletocajugarahora + " ha ganado la partida de tres en raya!");
                    return;
                }

                if (hasurgidounempateenlapartida()) {
                    System.out.println("¡Ha habido un empate!");
                    return;
                }

                cambiodeturno();
            }
        }

        public void mostrartablerodeltresenraya() {
            System.out.println("  0 1 2");
            for (int i = 0; i < 3; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablerodetresenraya[i][j]);
                    if (j < 2) System.out.print("|");
                }
                System.out.println();
                if (i < 2) System.out.println("  ---------");
            }
            System.out.println();
        }

        public void vamosarealizarlajugada() {
            Scanner scanner = new Scanner(System.in);
            int recorrerlafila, recorrerlacolumna;

            do {
                System.out.print("El jugador " + jugadorqueletocajugarahora + ", debe introducir un numero de fila entre (0-2): ");
                recorrerlafila = scanner.nextInt();
                System.out.print("El jugador " + jugadorqueletocajugarahora + ", debe introducir un numero de columna entre (0-2): ");
                recorrerlacolumna = scanner.nextInt();
            } while (!lajugadaescorrecta(recorrerlafila, recorrerlacolumna) || !lacasillaestavacia(recorrerlafila, recorrerlacolumna));

            tablerodetresenraya[recorrerlafila][recorrerlacolumna] = jugadorqueletocajugarahora;
        }

        public boolean lajugadaescorrecta(int recorrerlafila, int recorrerlacolumna) {
            return recorrerlafila >= 0 && recorrerlafila < 3 && recorrerlacolumna >= 0 && recorrerlacolumna < 3;
        }

        public boolean lacasillaestavacia(int recorrerlafila, int recorrerlacolumna) {
            return tablerodetresenraya[recorrerlafila][recorrerlacolumna] == ' ';
        }

        public void cambiodeturno() {
            jugadorqueletocajugarahora = (jugadorqueletocajugarahora == 'X') ? 'O' : 'X';
        }

        public boolean yahaganadounjugador() {
            for (int i = 0; i < 3; i++) {
                if (tablerodetresenraya[i][0] == jugadorqueletocajugarahora && tablerodetresenraya[i][1] == jugadorqueletocajugarahora && tablerodetresenraya[i][2] == jugadorqueletocajugarahora) {
                    return true;
                }
                if (tablerodetresenraya[0][i] == jugadorqueletocajugarahora && tablerodetresenraya[1][i] == jugadorqueletocajugarahora && tablerodetresenraya[2][i] == jugadorqueletocajugarahora) {
                    return true;
                }
            }


            if (tablerodetresenraya[0][0] == jugadorqueletocajugarahora && tablerodetresenraya[1][1] == jugadorqueletocajugarahora && tablerodetresenraya[2][2] == jugadorqueletocajugarahora) {
                return true;
            }
            if (tablerodetresenraya[0][2] == jugadorqueletocajugarahora && tablerodetresenraya[1][1] == jugadorqueletocajugarahora && tablerodetresenraya[2][0] == jugadorqueletocajugarahora) {
                return true;
            }

            return false;
        }

        public boolean hasurgidounempateenlapartida() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tablerodetresenraya[i][j] == ' ') {
                        return false;
                    }
                }
            }
            return true;
        }

        public static void main(String[] args) {
            TresEnRaya juego = new TresEnRaya();
            juego.vamosajugaraltresenraya();
        }
}

