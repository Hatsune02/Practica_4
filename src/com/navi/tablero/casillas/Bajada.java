package com.navi.tablero.casillas;

import com.navi.Visual.visualTablero.VisualTablero;
import com.navi.jugador.Player;

public class Bajada extends Casilla{
    public int xFinal;
    public int yFinal;
    public Bajada(int x, int y, int xFinal, int yFinal, int numeroCasilla) {
        super(x, y, numeroCasilla);
        this.xFinal = xFinal;
        this.yFinal = yFinal;
    }

    @Override
    public void accion(Player jugador) {
        jugador.colocarJugador(VisualTablero.casillasVisuales[yFinal][xFinal]);

    }
}
