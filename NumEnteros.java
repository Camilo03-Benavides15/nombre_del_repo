// Ejercicio #8 clase 6

import java.util.Scanner;

public class NumEnteros {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numeros = new int[10]; // Creamos un arreglo para guardar 10 números
            int contarPositivos = 0;
            int contarNegativos = 0;
            int contarCeros = 0;

            // Pedir 10 números enteros positivos
            System.out.println("Por favor, ingrese 10 números enteros (pueden ser positivos o negativos):");
            for (int i = 0; i < 10; i++) {
                int num;
                do {
                    System.out.print("Número " + (i + 1) + ": ");
                    num = scanner.nextInt();
                    if (num < 0) {
                        System.out.println("Por favor, ingrese un número positivo.");
                    }
                } while (num < 0); // Repetir mientras el número sea negativo
                numeros[i] = num; // Guardar el número en el arreglo
            }

            // Contar positivos, negativos y ceros
            for (int num : numeros) {
                if (num > 0) {
                    contarPositivos++;
                } else if (num < 0) {
                    contarNegativos++;
                } else {
                    contarCeros++;
                }
            }

            // Mostrar los resultados
            System.out.println("Números positivos: " + contarPositivos);
            System.out.println("Números negativos: " + contarNegativos);
            System.out.println("Ceros: " + contarCeros);
        }
    }


