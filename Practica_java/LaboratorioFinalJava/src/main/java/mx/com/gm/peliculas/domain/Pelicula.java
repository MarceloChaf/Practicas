package mx.com.gm.peliculas.domain;

import java.io.Serializable;

public class Pelicula implements Serializable {
    private String name;

    public Pelicula() {
    }

    public Pelicula(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  this.name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
