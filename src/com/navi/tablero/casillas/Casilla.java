package com.navi.tablero.casillas;

import com.navi.jugador.Player;

import javax.swing.*;

public abstract class Casilla extends JPanel {
    
    protected int x;
    protected int y;
    protected int numeroCasilla;

    public Casilla(int x, int y, int numeroCasilla){
        this.x = x;
        this.y = y;
        this.numeroCasilla = numeroCasilla;
    }

    public int getNumeroCasilla() {
        return numeroCasilla;
    }

    public abstract void accion(Player jugador);

}
