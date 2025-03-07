// Ejercicio #7 clase 6
import java.util.Scanner;

public class ArregloNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número para la posición " + i + ":");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Índice y valor correspondiente:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        scanner.close();
    }
}