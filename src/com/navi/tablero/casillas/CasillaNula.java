package com.navi.tablero.casillas;

import com.navi.jugador.Player;

public class CasillaNula extends Casilla{


    public CasillaNula(int x, int y, int numeroCasilla) {
        super(x, y, numeroCasilla);
    }

    @Override
    public void accion(Player jugador) {

    }
}
