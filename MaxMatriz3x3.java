// Ejercicio #3

public class MaxMatriz3x3 {
    public static void main(String [] args) {
        int[][] matriz3x3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int maximo = encontrarMaximo(matriz3x3);
        System.out.println( " El valor maximo en la matriz 3x3 es: " + maximo);
    }
    public static int encontrarMaximo(int[][] matriz) {
        int maximo = matriz[0][0];
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento > maximo) {
                    maximo = elemento;
                }
            }
        }
        return maximo;
    }
}
