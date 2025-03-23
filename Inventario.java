package GestionDeProductos.model;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    // Método para agregar al inventario
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para listar todos los productos del inventario
    public List<Producto> listarProductos() {
        return productos;
    }
}