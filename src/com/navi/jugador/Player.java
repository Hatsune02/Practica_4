package com.navi.jugador;

import com.navi.Visual.visualTablero.VisualCasillas;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class Player implements Serializable {
    private final int ID;
    private final String NOMBRE;
    private final String APELLIDO;
    private int partidasJugadas = 0;
    private int partidasWin = 0;
    private int partidasLose = 0;
    public VisualCasillas casillaActual;
    JButton botonPlayer = new JButton();
    public boolean turno = true;

    public Player(int id, String nombre, String apellido){
        this.ID = id;
        this.NOMBRE = nombre;
        this.APELLIDO = apellido;
        //botonPlayer.setPreferredSize(new Dimension(20,20));
        botonPlayer.setText(nombre.substring(0,2));
    }

    public void colocarJugador(VisualCasillas actual){
        casillaActual.panelCentral.remove(botonPlayer);
        casillaActual = actual;
        casillaActual.panelCentral.add(botonPlayer);
        casillaActual.referencia.accion(this);
        /*
        if(turno){
            tirarDados();
        }
        else{
            turno = true;
        }

         */
    }

    public void setActual(VisualCasillas actual) {
        this.casillaActual = actual;
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
