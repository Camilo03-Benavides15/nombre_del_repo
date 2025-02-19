// Ejercicio #6

public class NumerosParesContar3x3 {
    public static void main(String[] args) {
        int[][] matriz3x3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int numPares = contarNumPares( matriz3x3);
        System.out.println( " Cantidad de numeros pares en la matriz 3x3: " + numPares);
    }
    public static int contarNumPares( int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if ( elemento % 2 == 0) {
                    contador++;
                }
            }
        }
        return contador;
    }
}