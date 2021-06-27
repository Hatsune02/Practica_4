package com.navi.jugador;

import javax.swing.*;

public class ArregloPlayer {
    public static Player[] jugadores = new Player[6];
    public static int cantidadPlayers = 0;

    public static void agregarPlayers(String nombre, String apellido){
        if(cantidadPlayers < 6){
            jugadores[cantidadPlayers] = new Player((cantidadPlayers + 1), nombre, apellido);
            JOptionPane.showMessageDialog(null, "Se ha creado un jugador con:\nid: " + jugadores[cantidadPlayers].getID() + "\nnombre: " + jugadores[cantidadPlayers].getNOMBRE() + "\napellidos: " + jugadores[cantidadPlayers].getAPELLIDO());
            cantidadPlayers++;
        }
        else{
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar 6 jugadores ");
        }

    }
}
