package com.navi.jugador;

import com.navi.Visual.visualTablero.VisualCasillas;
import java.io.Serializable;

public class Player implements Serializable {
    private final int ID;
    private final String NOMBRE;
    private final String APELLIDO;
    private int partidasJugadas = 0;
    private int partidasWin = 0;
    private int partidasLose = 0;
    VisualCasillas actual;

    public Player(int id, String nombre, String apellido){
        this.ID = id;
        this.NOMBRE = nombre;
        this.APELLIDO = apellido;
    }



    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public void setPartidasWin(int partidasWin) {
        this.partidasWin = partidasWin;
    }

    public void setPartidasLose(int partidasLose) {
        this.partidasLose = partidasLose;
    }

    public int getID() {
        return ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getAPELLIDO() {
        return APELLIDO;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public int getPartidasWin() {
        return partidasWin;
    }

    public int getPartidasLose() {
        return partidasLose;
    }
}
