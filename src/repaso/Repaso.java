/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Scanner;
import javax.swing.JOptionPane;
import static sun.misc.MessageUtils.where;

/**
 *
 * @author marti
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //        int x = 5;
        //        int y = 9;
        //        if (x > y) {
        //            System.out.println(" el numero " + x + " es mayor que " + y);
        //
        //        } else {
        //            System.out.println(" el numero " + y + " es mayor que " + x);
        //
        //        }

        //Crear un programa que dado un numero determine si es par o impar.
        //        System.out.println("ingrese un numero para determinar si es par o impar ");
        //        int x = leer.nextInt();
        //        if (x % 2 == 0) {
        //            System.out.println("el numero es par");
        //        } else {
        //            System.out.println(" el numero es impar ");
        //        }
        //        Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
        //pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
        //investigar la función equals() en Java.
        //        System.out.println(" ingrese una frase");
        //        String frase = leer.next();
        //        if (frase.equalsIgnoreCase("eureka")) {
        //            System.out.println(" la frase es igual a eureka");
        //        } else {
        //            System.out.println(" la frase no es igual a eureka");
        //        }
        //    Realizar un programa que solo permita introducir solo frases o palabras de 8 de
        //largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
        //un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
        //imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
        //        System.out.println(" ingrese una frase que tenga 8 caracteres ");
        //        String frase = leer.next();
        //        if (frase.length()==8) {
        //            System.out.println("correcto");
        //        }else{
        //            System.out.println("incorrecto");
        //        }
        //    Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
        //frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
        //pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
        //“INCORRECTO”. Nota: investigar la función Substring y equals() de Java
        //        System.out.println("ingrese un frase");
        //        String frase = leer.next();
        //        if (frase.substring(0, 1).equalsIgnoreCase("a")) {
        //            System.out.println("correcto");
        //        } else {
        //            System.out.println("incorrecto");
        //
        //        }
        //    Considera que estás desarrollando una web para una empresa que fabrica motores
        //(suponemos que se trata del tipo de motor de una bomba para mover fluidos).
        //Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
        //El programa debe mostrar lo siguiente:
        //o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
        //bomba de agua”.
        //o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
        //bomba de gasolina”.
        //o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
        //bomba de hormigón”.
        //o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
        //bomba de pasta alimenticia”.
        //o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
        //existe un valor válido para tipo de bomba”
        //        System.out.println("ingrese el tipo de motor");
        //        int tipoMotor = leer.nextInt();
        //        switch (tipoMotor) {
        //            case 1:
        //                System.out.println("La bomba es una bomba de agua");
        //                break;
        //            case 2:
        //                System.out.println("la bomba es una bomba de gasolina");
        //                break;
        //            case 3:
        //                System.out.println("la bomba es una bomba de hormigon");
        //                break;
        //            case 4:
        //                System.out.println("la bomba es una bombva de pasta alimenticia");
        //                break;
        //            default:
        //                System.out.println("no existe una opcion valida para opcion ingresada");
        //        }
        //    . Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
        //la nota se pedirá de nuevo hasta que la nota sea correcta. 
        //        System.out.println(" ingrese una nota entre 0 y 10 ");
        //        int nota = leer.nextInt();
        //        while (nota > 10 || nota < 0) {
        //            System.out.println("error ingrese nota entre 0 y 10");
        //            nota = leer.nextInt();
        //        }
        //        System.out.println(" la nota ingresada es correcta");
        //3. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
        //solicite números al usuario hasta que la suma de los números introducidos supere el
        //límite inicial. 
        //        System.out.println(" ingrese numero limite");
        //        int limite = leer.nextInt();
        //        int nr1;
        //        int nr2 = 0;
        //        do {
        //            System.out.println("ingrese numeros hasta llegar al limite ");
        //            nr1 = leer.nextInt();
        //            nr2 = nr2 + nr1;
        //            System.out.println(nr2);
        //        } while (nr2 < limite);
        //    Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
        //salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
        //deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
        //número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
        //        System.out.println("ingrese numeros");
        //        int nr = leer.nextInt();
        //        int cont = 1;
        //        int nr1 = nr;
        //        while (nr != 0 && cont < 20) {
        //
        //            System.out.println("ingrese otro numero");
        //            nr = leer.nextInt();
        //            if (nr > 0) {
        //                nr1 = nr1 + nr;
        //                cont++;
        //
        //            } else {
        //                cont++;
        //            }
        //
        //        }
        //        if (nr == 0) {
        //            System.out.println("se capturo el numero es 0");
        //
        //        }
        //        System.out.println("la suma de los numero es: " + nr1);
//         Generar una matriz de 3×3 con números aleatorios sin repetirse.
        int matriz[][] = new int[3][3];

        //i = filas y j = columnas
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz.length; j++) {
//
//                matriz[i][j] = (int) (Math.random() * 10);
//                if (matriz[i][j] == matriz[i][j]) {
//                    matriz[i][j] = (int) (Math.random() * 10);
//                }
//                System.out.print(matriz[i][j] + " ");
//
//            }
//            System.out.println("");
//        }
        int aux = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                aux = aux + 1;
                matriz[i][j] = aux;

            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j == 2) {
                    System.out.println(matriz[i][j]);
                } else {
                    System.out.print(matriz[i][j] + "|");
                }
            }
        }
    }
}
