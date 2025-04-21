import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // Método para generar StackOverflowError
    static void metodoRecursivo(int n) {
        if (n <= 0) return;
        metodoRecursivo(n - 1);
    }

    public static void main(String[] args) {
        //  Manejo de una Excepción (Checked Exception)
        try {
            FileReader file = new FileReader("archivo.txt"); // Cambia por un archivo existente
        } catch (IOException e) {
            System.out.println("¡Excepción capturada! Archivo no encontrado: " + e);
        }

        try {
            int divisor = 2; // evitar cero
            int resultado = 10 / divisor;
        } catch (ArithmeticException e) {
            System.out.println("¡Excepción capturada! División por cero: " + e);
        }

        // Evitar Error (OutOfMemoryError)
        List<int[]> lista = new ArrayList<>();
        for (int i = 0; i < 5; i++) { // Límite razonable
            lista.add(new int[500000]);
        }
        System.out.println("¡Error crítico! Memoria insuficiente: ");

        //  Evitar Error (StackOverflowError)
        try {
            metodoRecursivo(500);// Límite en Recursión
        } catch (StackOverflowError e) {
            System.out.println("¡Error crítico! Desbordamiento de pila: " + e);
        }
    }
}