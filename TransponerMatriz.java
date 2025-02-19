// Ejercicio #8

public class TransponerMatriz {
    public static void main(String[] args) {
        int[][] matriz3x3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] transpuesta = transponerMatriz(matriz3x3);
        System.out.println( " Matriz transpuesta: ");
        mostrarMatriz(transpuesta);
    }
    public static int[][] transponerMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int k = 0; k < columnas; k++) {
                transpuesta[k][i] = matriz[i][k];
            }
        }
        return transpuesta;
    }
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.println( elemento + " " );
            }
            System.out.println();
        }
    }

}
