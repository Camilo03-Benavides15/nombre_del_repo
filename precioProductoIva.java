//ejercicio #1 clase 6

import java.util.Scanner;

public class precioProductoIva {

    private static final double IVA = 0.21;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el precio del producto: ");
        double precio = scanner.nextDouble();

        double precioConIVA = precio + (precio * IVA);

        System.out.println("El precio final con IVA es: " + precioConIVA);

    }
}
