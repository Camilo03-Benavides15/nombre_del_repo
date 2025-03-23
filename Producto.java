package GestionDeProductos.model;

// Clase Producto
public class Producto {
    private String nombre;
    private Categoria categoria;

    public Producto(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
