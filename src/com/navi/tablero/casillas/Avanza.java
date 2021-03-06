package com.navi.tablero.casillas;

import com.navi.Visual.visualTablero.VisualCasillas;
import com.navi.Visual.visualTablero.VisualTablero;
import com.navi.jugador.Player;
import com.navi.tablero.Tablero;

public class Avanza extends Casilla{
    public int posicion;
    public Avanza(int x, int y, int posicion, int numeroCasilla) {
        super(x, y, numeroCasilla);
        this.posicion = posicion;
    }

    @Override
    public void accion(Player jugador) {
        boolean encontrado = false;
        Casilla[][] tablero = VisualTablero.tablero.getCasillas();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if(tablero[i][j].getNumeroCasilla() == jugador.casillaActual.referencia.getNumeroCasilla() + posicion){

                    jugador.colocarJugador(VisualTablero.casillasVisuales[i][j]);
                    encontrado = true;
                    break;
                }
            }
            if(encontrado){
                break;
            }
        }
    }
}
