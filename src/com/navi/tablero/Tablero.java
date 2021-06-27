package com.navi.tablero;

import com.navi.Visual.visualTablero.VisualTablero;
import com.navi.tablero.casillas.*;

public class Tablero implements Runnable{
    public int tiempoActual = 0;
    private int x;
    private int y;
    private Casilla[][] casillas;

    public Tablero(int x, int y){
        this.x = x;
        this.y = y;
        casillas = new Casilla[y][x];
        llenarTablero();
    }

    public void llenarTablero(){
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                casillas[i][j] = new CasillaNula(j,i);
            }
        }
    }

    public void casillaAvanzar(int x, int y, int posicion){
        casillas[y][x] = new Avanza(x, y , posicion);
    }

    public void casillaRetroceder(int x, int y, int posicion){
        casillas[y][x] = new Retrocede(x,y, posicion);
    }

    public void casillaPierdeTurno(int x, int y){
        casillas[y][x] = new PierdeTurno(x,y);
    }

    public void casillaTiraDados(int x, int y){
        casillas[y][x] = new TiraDados(x,y);
    }

    public void casillaSubir(int x, int y, int xFinal, int yFinal){
        casillas[y][x] = new Subida(x,y,xFinal,yFinal);
    }

    public void casillaBajar(int x, int y, int xFinal, int yFinal){
        casillas[y][x] = new Bajada(x,y,xFinal,yFinal);
    }

    public void correrTiempo(){
        tiempoActual = 0;
        Thread t = new Thread(this);
        t.start();
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

    @Override
    public void run() {
        while (tiempoActual < 1000){
            tiempoActual++;
            VisualTablero.setHP(tiempoActual);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }
}
