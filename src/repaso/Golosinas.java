/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Golosinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String[][] nombresGolosinas = {
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}

        };

        double[][] precio = {
            {1.1, 0.8, 1.5, 0.9},
            {1.8, 1, 1.2, 1},
            {1.8, 1.3, 1.2, 0.8},
            {1.5, 1.1, 1.1, 1.1}

        };
        int[][] cantidad = {
            {5, 5, 5, 5},
            {5, 5, 5, 5},
            {5, 5, 5, 5},
            {5, 5, 5, 5},};
//También tendrán una cantidad inicial, que en principio será de 5.
//
//Tendremos un pequeño menú con las siguientes opciones:
//
//
//Mostrar golosinas: mostrara todas las golosinas disponibles. Mostrará el código que debe introducir el usuario, el nombre y el precio. La cantidad no se mostrará.
//Rellenar golosinas: esta es una función exclusiva de un técnico por lo que nos pedirá una contraseña, si el usuario escribe “MaquinaExpendedora2017” le pedirá la posición de la golosina y la cantidad.
//Apagar maquina: sale del programa, antes de salir mostrara las ventas totales durante la ejecución del programa.
//El programa debe ser modularizado, es decir, todas las funciones que veas que sean necesarias debes crearlas, así como todas aquellas acciones que veas que se repitan. Piensa que funciones pueden ser.
//
//Las funciones deben ser lo más genéricas posibles.
//
//No se deben utilizar POO para este ejercicio.
        String resp = "0";
        double ventasTotales = 0;
        do {

            System.out.println("menu");
            System.out.println("1 pedir golos");
            System.out.println("2 mostrar golos");
            System.out.println("3 rellenar golos");
            System.out.println("4 apagar maquina");
            System.out.println(" ");

            System.out.println("Introduzca la opcion deseada");
            resp = leer.next();
            try {//no funciona por q las opciones estan como tipo de dato string
                switch (resp) {
//Pedir golosina: pedirá la posición de la golosina que quiera. Esta máquina tiene golosinas en cada posición,
//identificados por su fila y columna, que será lo que introduzca el usuario al pedir una golosina, 
//por ejemplo si el usuario teclea 20 significa que está pidiendo la golosina que está en la fila 2 
//columna 0. Cuando no haya más golosinas se le indicará al usuario. Solo puede pedir una golosina 
//y supondremos que el usuario siempre tiene dinero al elegir. Recuerda de disminuir la 
//                        cantidad la pedir.
                    case "1":
                        System.out.println("ingrese la posisicion posicion de la golosina que desea adquirir (x/y)");
                        System.out.println("coordenada x hasta 3");
                        int x = leer.nextInt();
                        System.out.println("coordenada y hasta 3");
                        int y = leer.nextInt();
//                System.out.println(cantidad[x][y] - 1);
//                for (int i = 0; i < nombresGolosinas.length; i++) {
//                    for (int j = 0; j < nombresGolosinas.length; j++) {
//                        nombresGolosinas[i][j] = nombresGolosinas[x][y];
//                    }
//                }
                        if (cantidad[x][y] == 0) {
                            System.out.println("no quedan mas: " + nombresGolosinas[x][y]);
                        } else {
                            for (int i = 0; i < cantidad.length; i++) {
                                for (int j = 0; j < cantidad.length; j++) {
                                    cantidad[i][j] = cantidad[x][y] - 1;
                                }
                            }
                            ventasTotales = ventasTotales + precio[x][y];

                            System.out.println("la golosina seleccionada es: " + nombresGolosinas[x][y].toUpperCase()
                                    + "\ny quedan: " + cantidad[x][y] + " en stock ");

                        }
                        break;
//Mostrar golosinas: mostrara todas las golosinas disponibles. 
//Mostrará el código que debe introducir el usuario, el nombre y el precio. La cantidad no se mostrará.        
                    case "2":
                        for (int i = 0; i < nombresGolosinas.length; i++) {
                            for (int j = 0; j < nombresGolosinas.length; j++) {
                                System.out.println("posicion(" + i + "/" + j + ")" + nombresGolosinas[i][j] + ", $" + precio[i][j]);
                            }
                        }
//Rellenar golosinas: esta es una función exclusiva de un técnico por lo que nos pedirá una contraseña,
//si el usuario escribe “MaquinaExpendedora2017” le pedirá la posición de la golosina y la cantidad.
                    case "3":
                        System.out.println("ingrese la contraseña para poder rellenar el producto deseado");
                        String cont = leer.next();
                        if (cont.equals("1234")) {
                            System.out.println("ingrese la posicion de la golosina q desea rellenar");
                            System.out.println("coordenada x hasta 3");
                            int z = leer.nextInt();
                            System.out.println("coordenada y hasta 3");
                            int q = leer.nextInt();
                            System.out.println("ingrese la cantidad de producto a ingresar");
                            int cantidadIngreso = leer.nextInt();
                            for (int i = 0; i < cantidad.length; i++) {
                                for (int j = 0; j < cantidad.length; j++) {
                                    cantidad[i][j] = cantidad[z][q] + cantidadIngreso;
                                }
                            }
                        } else {
                            System.out.println("Contraseña erronea");
                        }
//Apagar maquina: sale del programa, antes de salir mostrara las ventas totales durante la ejecución
//del programa.
                    case "4":
                        System.out.println("Las ventas totales del dia fueron: $" + ventasTotales);
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes escribir un numero");
                resp = leer.next();
            }
        } while (!resp.equals("4"));
        System.out.println("Fin del menu");
    }

}
