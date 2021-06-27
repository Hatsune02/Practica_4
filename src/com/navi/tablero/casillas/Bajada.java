package com.navi.tablero.casillas;

import com.navi.jugador.Player;

public class Bajada extends Casilla{
    public int xFinal;
    public int yFinal;
    public Bajada(int x, int y, int xFinal, int yFinal) {
        super(x, y);
        this.xFinal = xFinal;
        this.yFinal = yFinal;
    }

    @Override
    public void accion(Player jugador) {

    }
}
