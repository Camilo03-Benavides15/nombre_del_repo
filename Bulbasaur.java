package com.example.miprimeraapp.ejercicioPokemon.model;

public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy bulbasaur y este es mi ataque placaje");
    }

    @Override
    public void atacarAraniaso() {
        System.out.println("Soy bulbasaur y este es mi ataque arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy bulbasaur y este es mi ataque mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy bulbasaur y este es mi ataque drenado de sangre");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy bulbasaur y este es mi ataque paralizante");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy bulbasaur y este es mi ataque hojas afiladas");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy bulbasaur y este es mi ataque latigazo de cepa");
    }
}
