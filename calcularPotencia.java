// Ejercicio #6 clase 6
import java.util.Scanner;

public class calcularPotencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la base:");
        double base = scanner.nextDouble();

        System.out.println("Introduce el exponente:");
        int exponente = scanner.nextInt();

        double resultado;

        if (exponente > 0) {
            resultado = Math.pow(base, exponente);
            System.out.println("El resultado es: " + resultado);
        } else if (exponente == 0) {
            resultado = 1;
            System.out.println("El resultado es: " + resultado);
        } else {
            resultado = 1 / Math.pow(base, -exponente);
            System.out.println("El resultado es: " + resultado);
        }

        scanner.close();
    }
}

