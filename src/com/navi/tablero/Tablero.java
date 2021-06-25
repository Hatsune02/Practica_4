package com.navi.tablero;

import com.navi.tablero.casillas.Casilla;
import com.navi.tablero.casillas.CasillaNula;

public class Tablero {
    private int x;
    private int y;
    private Casilla[][] casillas;

    public Tablero(int x, int y){
        this.x = x;
        this.y = y;
        casillas = new Casilla[x][y];
         llenarTablero();
    }

    public void llenarTablero(){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                casillas[j][i] = new CasillaNula();
            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Casilla[][] getCasillas() {
        return casillas;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCasillas(Casilla[][] casillas) {
        this.casillas = casillas;
    }
}
