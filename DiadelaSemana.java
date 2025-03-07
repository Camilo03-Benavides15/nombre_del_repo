// Ejercicio #2 clase 6
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DiadelaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> dias = Arrays.asList(" Lunes ", " Martes ", " Miercoles ", " Jueves ",
                " Viernes "," Sabado ", " Domingo ");

        System.out.println(" Introduce un numero del 1 al 7: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 7) {
            System.out.println((dias.get(numero - 1)));
        }
        else {
            System.out.println(" Error numero invalido. Por favor, introduce un número del 1 al 7. ");
        }
        scanner.close();
    }
}

