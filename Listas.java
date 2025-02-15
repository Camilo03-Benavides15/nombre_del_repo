import java.util.*;

public class Listas {
    // Ejercicio #1
    public static List<Integer> listaPotencia(int exponente, List<Integer> lista) {
        List<Integer> nuevaLista = new ArrayList<>();
        for (int num : lista) {
            nuevaLista.add((int) Math.pow(num, exponente));
        }
        return nuevaLista;
    }
    // Ejercicio #2
    public static List<Integer> listaMultiplicaciones(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> resultado = new ArrayList<>();
        int tamaño = Math.min(lista1.size(), lista2.size());
        for (int i = 0; i < tamaño; i++) {
            resultado.add(lista1.get(i) * lista2.get(i));
        }
        return resultado;
    }
    // Ejercicio #3
    public static double calcularPromedio(List<Integer> lista) {
        if (lista.isEmpty()) return 0;
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return (double) suma / lista.size();
    }
    // Ejercicio #4
    public static List<Integer> invertirLista(List<Integer> lista) {
        List<Integer> nuevaLista = new ArrayList <>(lista);
        Collections.reverse(nuevaLista);
        return nuevaLista;
    }
    // Ejercicio #5
    public static List<Integer> eliminarDuplicados(List<Integer> lista) {
        List<Integer> nuevaLista = new ArrayList<>();
        for (int num : lista) {
            if (!nuevaLista.contains(num)) {
                nuevaLista.add(num);
            }
        }
        return nuevaLista;
    }
    // Ejercicio #6
    public static Boolean estaOrdenada(List<Integer> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i) > lista.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
    // Ejercicio #7
    public static  List<Integer> combinarListas(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> nuevaLista = new ArrayList<>(lista1);
        nuevaLista.addAll(lista2);
        return nuevaLista;
    }
    // Imprimir
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> lista2 = Arrays.asList(6, 7, 8, 9, 10);

        System.out.println(" Lista potencia (4): " + listaPotencia(4, lista1));
        System.out.println(" Lista multiplicacion: " + listaMultiplicaciones(lista1, lista2));
        System.out.println(" Promedio de lista1: " + calcularPromedio(lista1));
        System.out.println(" Lista invertida: " + invertirLista(lista1));
        System.out.println(" Eliminar duplicados: " + eliminarDuplicados(Arrays.asList(1, 2, 2, 8)));
        System.out.println(" Lista 1 ordenada: " + estaOrdenada(lista1));
        System.out.println(" Listas combinadas: " + combinarListas(lista1, lista2));
    }
}