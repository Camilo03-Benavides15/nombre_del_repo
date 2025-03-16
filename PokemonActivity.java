package com.example.miprimeraapp.ejercicioPokemon.view;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.miprimeraapp.R;
import com.example.miprimeraapp.ejercicioPokemon.model.Bulbasaur;
import com.example.miprimeraapp.ejercicioPokemon.model.Charmander;
import com.example.miprimeraapp.ejercicioPokemon.model.Pikachu;
import com.example.miprimeraapp.ejercicioPokemon.model.Squirtle;

public class PokemonActivity extends AppCompatActivity {
    Pikachu pikachuObjeto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pokemon);

        pikachuObjeto = new Pikachu();
        pikachuObjeto.numPokedex = 25;
        pikachuObjeto.nombre =" Pikachu Autonomo";
        pikachuObjeto.peso = 2.5;
        pikachuObjeto.sexo = "Macho";
        pikachuObjeto.temporada = "Primera";
        pikachuObjeto.tipo ="Electrico" ;

        pikachuObjeto.atacarImpacTrueno();


        Pikachu pikachu = new Pikachu();
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        Squirtle squirtle = new Squirtle();

        pikachu.atacarPlacaje();
        pikachu.atacarImpacTrueno();
        pikachu.atacarPuñoTrueno();
        pikachu.atacarRayoTrueno();
        pikachu.atacarRayoCarha();

        bulbasaur.atacarPlacaje();
        bulbasaur.atacarDrenaje();
        bulbasaur.atacarParalizar();
        bulbasaur.atacarHojaAfilada();
        bulbasaur.atacarLatigoCepa();

        charmander.atacarAraniaso();
        charmander.atacarAscuas();
        charmander.atacarLanzaLLamas();
        charmander.atacarPunioFuego();

        squirtle.atacarMordisco();
        squirtle.atacarBurbuja();
        squirtle.atacarHidrobomba();
        squirtle.atacarHidropulso();
        squirtle.atacarPistolaAgua();
    }
}
