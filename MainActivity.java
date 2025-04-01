package GestionDeNotas.view;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.miprimeraapp.R;

import java.util.List;

import GestionDeNotas.controller.EstudianteController;
import GestionDeNotas.model.Estudiante;

public class MainActivity extends AppCompatActivity {

    private EstudianteController estudianteController;
    private ListView listView;
    private EstudianteAdapter estudianteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_maingn);

        estudianteController = new EstudianteController(this);
        ListView listView = findViewById(R.id.listaEstudiantes);

        List<Estudiante> estudiantes = estudianteController.obtenerEstudiantes();

        EstudianteAdapter adapter;
        adapter = new EstudianteAdapter(this, estudiantes);
        listView.setAdapter(adapter);

    }
}