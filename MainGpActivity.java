package GestionDeProductos;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.misegundaapp.R;

import GestionDeProductos.model.Categoria;
import GestionDeProductos.model.Inventario;
import GestionDeProductos.model.Producto;

public class MainGpActivity extends AppCompatActivity {

    // Crear una instancia de Inventario
    private Inventario inventario = new Inventario();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_gp);

        // Referencias a los elementos de la interfaz
        EditText etNombreProducto = findViewById(R.id.etNombreProducto);
        EditText etCategoriaProducto = findViewById(R.id.etCategoriaProducto);
        Button btnAgregarProducto = findViewById(R.id.btnAgregarProducto);

        // Configurar el evento de clic para el botón de agregar producto
        btnAgregarProducto.setOnClickListener(v -> {
            String nombre = etNombreProducto.getText().toString();
            String categoriaNombre = etCategoriaProducto.getText().toString();

            if (!nombre.isEmpty() && !categoriaNombre.isEmpty()) {
                Categoria categoria = new Categoria(categoriaNombre);
                Producto producto = new Producto(nombre, categoria);
                inventario.agregarProducto(producto);
                // Mostrar un mensaje de confirmación
                Toast.makeText(MainGpActivity.this, "Producto agregado: " + nombre, Toast.LENGTH_SHORT).show();
            } else {
                // Mostrar un mensaje de error si faltan datos
                Toast.makeText(MainGpActivity.this, "Por favor, ingrese todos los datos", Toast.LENGTH_SHORT).show();
            }
        });

    }
}