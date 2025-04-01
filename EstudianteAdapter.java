package GestionDeNotas.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.miprimeraapp.R;

import java.util.List;

import GestionDeNotas.model.Estudiante;

public class EstudianteAdapter extends ArrayAdapter<Estudiante> {
    public EstudianteAdapter(Context context, List<Estudiante> estudiantes) {
        super(context, 0, estudiantes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtener el objeto estudiante actual
        Estudiante estudiante = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listaestudiante, parent, false);
        }

        // Vincular vistas
        TextView txtNombre = convertView.findViewById(R.id.txtNombre);
        TextView txtEdad = convertView.findViewById(R.id.txtEdad);

        // Asignar datos
        txtNombre.setText(estudiante.getNombre());
        txtEdad.setText("Edad: " + estudiante.getEdad());

        return convertView;
    }
}