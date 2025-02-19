// Ejercicio #4

public class MultiplicacionMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2},
                {3, 4}
        };
        int escalar = 4;

        int[][] resultado = MultiplicacionPorEscalar(matriz, escalar);
        System.out.println(" Matriz multiplicacion por " + escalar + ":");
        mostrarMatriz(resultado);
    }
    public static  int[][] MultiplicacionPorEscalar(int[][] matriz, int escalar) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int k = 0; k < columnas; k++ ) {
                resultado[i][k] = matriz[i][k] * escalar;
            }
        }
        return resultado;
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
