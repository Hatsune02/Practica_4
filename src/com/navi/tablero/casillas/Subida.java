package com.navi.tablero.casillas;

import com.navi.jugador.Player;

public class Subida extends Casilla{
    public int xFinal;
    public int yFinal;
    public Subida(int x, int y, int xFinal, int yFinal, int numeroCasilla) {
        super(x, y, numeroCasilla);
        this.xFinal = xFinal;
        this.yFinal = yFinal;
    }

    @Override
    public void accion(Player jugador) {

    }
}
