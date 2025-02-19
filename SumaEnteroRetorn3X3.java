// Ejercicio #7

public class SumaEnteroRetorn3X3 {
    public static void main(String[] args) {
        int [][] maA = {
                {1, 2, 5},
                {3, 4, 6},
                {7, 6, 4}
        };
        int [][] maB = {
                {5, 6, 8},
                {7, 8, 10},
                {4, 9, 2}
        };
        int[][] resultado = sumaMatriz(maA, maB) ;
        System.out.println( " Suma de matrices 3x3: ");
        mostrarMatriz( resultado);
    }
    public static int[][] sumaMatriz(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int k = 0; k < columnas; k++) {
                resultado[i][k] = matrizA[i][k] + matrizB[i][k];
            }
        }
        return resultado;
    }
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.println( elemento + " ");
            }
            System.out.println();
        }
    }
}