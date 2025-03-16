package com.example.miprimeraapp.ejercicioPokemon.model;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy charmander y este es mi ataque placaje");
    }

    @Override
    public void atacarAraniaso() {
        System.out.println("Soy charmander y este es mi ataque arañazo");

    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy charmander y este es mi ataque mordisco");

    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy charmander y este es mi ataque puño de fuego");

    }

    @Override
    public void atacarLanzaLLamas() {
        System.out.println("Soy charmander y este es mi ataque  lanzallamas");

    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy charmander y este es mi ataque de ascuas");

    }
}
