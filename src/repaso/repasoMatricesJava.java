/*
 */
package repaso;

import java.util.Scanner;

public class repasoMatricesJava {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int[] vector = new int[matriz.length];
//      Llenar la matriz con números aleatorios.
        crearMatriz(matriz);
        //shows the array
        mostrarMatriz(matriz);
        //shows the average
        calcularPromedio(matriz);
        //shows the largest number and how many times it is repeated
        mostrarYContarMayor(matriz);
        //Shows all the odd numbers.
        mostrarImpares(matriz);
        //shows all the even numbers
        mostrarPares(matriz);
        //shows the sum of the diagonals
        sumaDiagonales(matriz);
        //shows the sum of the last row
        sumaUltimFila(matriz);
        //shows if it is a magic square
        esmagico(matriz);
        //trying another option to check if it is a magic square
        magico1(matriz, vector);
    }

    private static void crearMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("/" + matriz[i][j]);
            }
            System.out.println("");
        }
    }

    private static void calcularPromedio(int[][] matriz) {
        int suma = 0;
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma = suma + matriz[i][j];
                cont++;
            }
        }
        System.out.println("el promedio de la matriz es de : " + suma / cont + " \nla suma de los elementetos es: " + suma + " \ny la cantidad de elementos que hay en la matriz es: " + cont);
    }

    private static void mostrarYContarMayor(int[][] matriz) {
        int mayor = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }

        }
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == mayor) {
                    cont++;
                }
            }

        }
        System.out.println("The highest number is : " + mayor + "\nand it is repeated: " + cont + " times");
    }

    private static void mostrarImpares(int[][] matriz) {
        System.out.println("The odd numbers are: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] % 2 != 0) {
                    System.out.print("/" + matriz[i][j]);
                }
//                System.out.println(" ");
            }
        }
        System.out.println("");
    }

    private static void mostrarPares(int[][] matriz) {
        System.out.println("The even numbers are: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] % 2 != 1) {
                    System.out.print("/" + matriz[i][j]);
                }
            }
        }
        System.out.println("");
    }

    private static void sumaDiagonales(int[][] matriz) {
        System.out.println("The sum of the diagonals is");
        int principal = 0, secondary = 0, sumaTotal = 0;
        System.out.println("Array size: " + matriz.length);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    principal = principal + matriz[i][j];
                }
                if (i + j == matriz.length - 1) {
                    secondary = secondary + matriz[i][j];
                }
            }
        }
        System.out.println("Principal: " + principal);
        System.out.println("Secondary: " + secondary);
        System.out.println("Te whole sum is: " + (principal + secondary));
    }

    private static void sumaUltimFila(int[][] matriz) {
        int sum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == matriz.length - 1) {
                    sum = sum + matriz[i][j];
                }
            }
        }
        System.out.println("The whole sum of the last row is: " + sum);
    }

    private static void esmagico(int[][] matriz) {
        int cont = 0;
        int principal = 0;
        int secondary = 0;
        for (int i = 0; i < matriz.length; i++) {
            int sumFilas = 0;
            int sumColumnas = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumFilas = matriz[i][j];
                sumColumnas = matriz[j][i];
                if (sumFilas == sumColumnas) {
                    cont++;
                }
            }
//            System.out.println("La suma de la fila " + i + "es :" + sumFilas);
//            System.out.println("La suma de la columna " + i + "es :" + sumColumnas);
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    principal = principal + matriz[i][j];
                }
                if (i + j == matriz.length - 1) {
                    secondary = secondary + matriz[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal principal es :" + principal);
        System.out.println("La suma de la secondary diagonal is :" + secondary);

        if (cont == 6 && principal == secondary) {
            System.out.println("The array is magic");
        } else {
            System.out.println("The array isn´t magic");
        }
    }

    private static void magico1(int[][] matriz, int[] vector) {
        int sumafil = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumafil = sumafil + matriz[i][j];
                vector[i] = sumafil;
            }
            System.out.println("suma " + i + " fila " + vector[i]);
            sumafil = 0;
        }
        int cont = 0;
        for (int i = 0; i <= vector.length; i++) {
            if (vector[i] == vector[i + 1] ) {
                cont++;
            }
        }
        if (cont == 4) {
            System.out.println("las filas son iguales");
        } else {
            System.out.println("Rows aren´t equals");
        }
    }
}
