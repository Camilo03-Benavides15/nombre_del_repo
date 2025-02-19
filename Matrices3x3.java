// Ejercicio #1

public class Matrices3x3 {
    public static void main(String[] args) {
        int[][] matriz3x3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println( "Matriz 3x3: ");
        mostrarMatriz(matriz3x3);
    }
    public static void  mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.println( elemento + " " );
            }
            System.out.println();
        }
    }
}
