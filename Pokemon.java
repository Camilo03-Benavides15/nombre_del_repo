package com.example.miprimeraapp.ejercicioPokemon.model;

public abstract class Pokemon {
    public int numPokedex;
   public String nombre;
   public double peso;
   public String sexo;
   public String temporada;
    public String tipo;

    public abstract void atacarPlacaje();
    public abstract void atacarAraniaso();
    public abstract void atacarMordisco();

}
