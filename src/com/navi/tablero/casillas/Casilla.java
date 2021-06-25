package com.navi.tablero.casillas;

import com.navi.jugador.Player;

public abstract class Casilla {
    protected int x;
    protected int y;
    public Player jugador = null;

    public Casilla(){

    }

    public abstract void accion();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
