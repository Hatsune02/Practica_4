package com.navi.jugador;

import javax.swing.*;

public class ArregloPlayer {
    public static Player[] jugadores = new Player[8];
    public static int cantidadPlayers = 0;

    public static void agregarPlayers(String nombre, String apellido){
        if(cantidadPlayers < 8){
            jugadores[cantidadPlayers] = new Player((cantidadPlayers + 1), nombre, apellido);
            JOptionPane.showMessageDialog(null, "Se ha creado un jugador con:\nid: " + jugadores[cantidadPlayers].getID() + "\nnombre: " + jugadores[cantidadPlayers].getNOMBRE() + "\napellidos: " + jugadores[cantidadPlayers].getAPELLIDO());
            cantidadPlayers++;
        }
        else{
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar 8 jugadores ");
        }

    }
    public static void agregarPlayersLectura(int id, String nombre, String apellido){
        jugadores[id - 1] = new Player(id, nombre, apellido);
        cantidadPlayers++;
    }
}
