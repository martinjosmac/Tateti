package repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tateti {
//example without other classes
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        char[][] tateti = new char[3][3];//I create an array of type char 3 by 3

//Vamos a realizar el típico juego del 3 en raya,
//donde habrá dos jugadores que tengan que hacer el 3 en raya, los signos serán el X y el O, 
//cuando haya una posición vacía habrá un –
//El tablero de juego, será una matriz de 3×3 de char.
//El juego termina cuando uno de los jugadores hace 3 en raya o si no hay más posiciones que poner.
//
//El juego debe pedir las posiciones donde el jugador actual quiera poner su marca, 
//esta debe ser validada y por supuesto que no haya una marca ya puesta.
//Realízalo de forma modular, como en el anterior, puedes reutilizar funciones 
//o crear nuevas versiones de ellas.
        crearTateti(tateti);
        mostrarJuego(tateti);
        System.out.println("Ingrese nombre Jugador");
        String j1 = leer.next();
        System.out.println("Ingrese nombre Jugador");
        String j2 = leer.next();
        while (matrizCompleta(tateti) == false) {//make a loop that will carry foward the game 
            jugadorX(tateti, leer);//method for player x/1 to play
            mostrarJuego(tateti);//show the board
            if (mostrarGanador(tateti)) {//condition, if it is fullfiled the game is over, if not the game continue
                System.out.println("Winner player 1 (X) " + j1);
                break;
            }
            if (matrizCompleta(tateti)) {//condition, if the board is full the game is over
                break;
            }
            jugadorO(tateti, leer);
            mostrarJuego(tateti);
            if (mostrarGanador(tateti)) {
                System.out.println("Ganador jugador jugador 2(0) " + j2);
                break;
            }
        }
        if (matrizCompleta(tateti)) {//if the board is full, this message is printed
            System.out.println("El tablero esta lleno");

        } else {
            System.out.println("---------------");
            System.out.println("Fin del juego");
            mostrarJuego(tateti);
        }
    }
//fill the array with the char '-'

    private static void crearTateti(char[][] tateti) {
        for (int i = 0; i < tateti.length; i++) {
            for (int j = 0; j < tateti.length; j++) {
                tateti[i][j] = '-';
            }
        }
    }

    private static void jugadorX(char[][] tateti, Scanner leer) {
        System.out.println("ingrese la fila y columna,jugador 1(X)");
        System.out.println("fila");
        int x = leer.nextInt();
        System.out.println("columna ");
        int y = leer.nextInt();
        for (int i = 0; i < tateti.length; i++) {
            for (int j = 0; j < tateti.length; j++) {
                if (tateti[i][j] != '-' && i == x && j == y) {
                    System.out.println("La posicion esta ocupada, ingrese otra");
                    jugadorX(tateti, leer);

                } else {
                    if (i == x && j == y) {
                        tateti[i][j] = 'X';
                    }

                }
            }
        }
    }

    private static void jugadorO(char[][] tateti, Scanner leer) {
        System.out.println("ingrese la fila y columna jugador 2 (O)");
        System.out.println("fila");
        int x = leer.nextInt();
        System.out.println("columna");
        int y = leer.nextInt();
        for (int i = 0; i < tateti.length; i++) {
            for (int j = 0; j < tateti.length; j++) {
                if (tateti[i][j] != '-' && i == x && j == y) {
                    System.out.println("La posicion esta ocupada, ingrese otra");
                    jugadorO(tateti, leer);
                } else {
                    if (i == x && j == y) {
                        tateti[i][j] = 'O';
                    }
                }
            }
        }
    }
//I show the array, matrix

    private static void mostrarJuego(char[][] tateti) {
        for (int i = 0; i < tateti.length; i++) {
            for (int j = 0; j < tateti.length; j++) {
                System.out.print("|" + tateti[i][j]);
            }
            System.out.println(" ");
        }
    }
//I loop through the array to see if all spaces were filled

    private static boolean matrizCompleta(char[][] tateti) {
        int cont = 0;
        for (int i = 0; i < tateti.length; i++) {
            for (int j = 0; j < tateti.length; j++) {
                if (tateti[i][j] != '-') {
                    cont++;
                }
            }
        }
        return cont == 9;
    }

    private static boolean mostrarGanador(char[][] tateti) {
        //it would be good to find a way to apply the conditions in a simpler way. I tried some different ways
        //but they didn´t work. But the important thing is that the game works
        if (tateti[0][0] == 'O' && tateti[0][1] == 'O' && tateti[0][2] == 'O') {
            return true;
        }
        if (tateti[1][0] == 'O' && tateti[1][1] == 'O' && tateti[1][2] == 'O') {
            return true;
        }
        if (tateti[2][0] == 'O' && tateti[2][1] == 'O' && tateti[2][2] == 'O') {
            return true;
        }
        if (tateti[0][0] == 'O' && tateti[1][1] == 'O' && tateti[2][2] == 'O') {
            return true;
        }
        if (tateti[0][2] == 'O' && tateti[1][1] == 'O' && tateti[2][0] == 'O') {
            return true;
        }
        if (tateti[0][1] == 'O' && tateti[1][1] == 'O' && tateti[2][1] == 'O') {
            return true;
        }
        if (tateti[0][2] == 'O' && tateti[1][2] == 'O' && tateti[2][2] == 'O') {
            return true;
        }
        if (tateti[0][0] == 'O' && tateti[1][0] == 'O' && tateti[2][0] == 'O') {
            return true;
        }
        if (tateti[0][0] == 'X' && tateti[0][1] == 'X' && tateti[0][2] == 'X') {
            return true;
        }
        if (tateti[1][0] == 'X' && tateti[1][1] == 'X' && tateti[1][2] == 'X') {
            return true;
        }
        if (tateti[2][0] == 'X' && tateti[2][1] == 'X' && tateti[2][2] == 'X') {
            return true;
        }
        if (tateti[0][0] == 'X' && tateti[1][1] == 'X' && tateti[2][2] == 'X') {
            return true;
        }
        if (tateti[0][2] == 'X' && tateti[1][1] == 'X' && tateti[2][0] == 'X') {
            return true;
        }
        if (tateti[0][0] == 'X' && tateti[1][0] == 'X' && tateti[2][0] == 'X') {
            return true;
        }
        if (tateti[0][1] == 'X' && tateti[1][1] == 'X' && tateti[2][1] == 'X') {
            return true;
        }
        if (tateti[0][2] == 'X' && tateti[1][2] == 'X' && tateti[2][2] == 'X') {
            return true;
        } else {
            return false;
        }
    }
}
