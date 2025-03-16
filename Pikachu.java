package com.example.miprimeraapp.ejercicioPokemon.model;

import android.util.Log;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy pikachu y estoy atacando placaje");
    }

    @Override
    public void atacarAraniaso() {
        System.out.println("Soy pikachu y estoy atacando arañaso");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy pikachu y estoy atacando mordisco");

    }

    @Override
    public void atacarImpacTrueno() {
        Log.e("Pikachu", " Soy pikachu este es mi ataque impacto del dios trueño");
    }

    @Override
    public void atacarPuñoTrueno() {
        System.out.println("Soy pikachu y este es mi ataque del super puño electrico");
    }

    @Override
    public void atacarRayoTrueno() {
        System.out.println("Soy pikachu y este es mi ataque del rayo de poseidon");
    }

    @Override
    public void atacarRayoCarha() {
        System.out.println("Soy pikachu y este es mi ataque rayocarcha");
    }
}
