// Ejercicio 5 clase 6
import java.util.Scanner;

public class DiaLaboral {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce un día de la semana:");
            String dia = scanner.nextLine().toLowerCase();

            switch (dia) {
                case "lunes":
                case "martes":
                case "miércoles":
                case " jueves ":
                case "viernes ":
                    System.out.println(dia + " es un día laboral.");
                    break;
                case "sábado":
                case "domingo":
                    System.out.println(dia + " no es un día laboral.");
                    break;
                default:
                    System.out.println("Día inválido. Por favor, introduce un día de la semana válido.");
                    break;
            }

            scanner.close();
        }
    }

