// Ejercicio #2

public class SumaMatrices {
    public static void main(String[] args) {
        int [][] maA = {
                {1, 2},
                {3, 4}
        };
        int [][] maB = {
                {5, 6},
                {7, 8}
        };

        int[][] resultado = sumaMatriz(maA, maB) ;
        System.out.println( " Suma de matrices 2x2: ");
        mostrarMatriz( resultado);
    }
    public static int[][] sumaMatriz(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for ( int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.println(elemento + " ");
            }
            System.out.println();
        }
    }
}
