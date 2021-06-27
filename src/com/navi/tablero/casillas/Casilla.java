package com.navi.tablero.casillas;

import com.navi.jugador.Player;

import javax.swing.*;

public abstract class Casilla extends JPanel {

    protected int x;
    protected int y;

    public Casilla(int x, int y){
        this.x = x;
        this.y = y;
    }

    public abstract void accion(Player jugador);

}
