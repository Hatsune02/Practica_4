package com.navi.tablero.casillas;

import com.navi.jugador.Player;

public class Avanza extends Casilla{
    public int posicion;
    public Avanza(int x, int y, int posicion) {
        super(x, y);
        this.posicion = posicion;
    }

    @Override
    public void accion(Player jugador) {

    }
}
