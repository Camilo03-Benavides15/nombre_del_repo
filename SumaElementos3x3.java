// Ejercicio #5

public class SumaElementos3x3 {
    public static void main(String[] args) {
        int[][] matriz3x3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int suma = sumaElemento( matriz3x3 );
        System.out.println( " La suma de todos los elementos de la matriz 3x3 es: " + suma );
    }
    public static int sumaElemento(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                suma += elemento;
            }
        }
        return suma;
    }
}
