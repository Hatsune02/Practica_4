package com.navi.tablero.casillas;

import com.navi.jugador.Player;

public class Retrocede extends Casilla{
    public int posicion;
    public Retrocede(int x, int y, int posicion, int numeroCasilla) {
        super(x, y, numeroCasilla);
        this.posicion = posicion;
    }

    @Override
    public void accion(Player jugador) {

    }
}
