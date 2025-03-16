package com.example.miprimeraapp.ejercicioPokemon.model;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy squirtle y este es mi ataque placaje");
    }

    @Override
    public void atacarAraniaso() {
        System.out.println("Soy squirtle y este es mi ataque arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy squirtle y este es mi ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy squirtle y este es mi ataque hidrobomba");

    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy squirtle y este es mi ataque de burbuja");

    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy squirtle y este es mi ataque pistola de agua");

    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy squirtle y este es mi ataque hidropulso");

    }
}
