package com.argpro.pronostico.model;

public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private ResultadoEnum resultado;

    public Pronostico(Partido partido) {
        this.partido = partido;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public ResultadoEnum getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoEnum resultado) {
        this.resultado = resultado;
    }

    public int puntos() throws TeamNotFound {
        if (getPartido().resultado(getEquipo()) == getResultado()) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Apuesta: " + getEquipo().getNombre() + " - " + getResultado();
    }
}