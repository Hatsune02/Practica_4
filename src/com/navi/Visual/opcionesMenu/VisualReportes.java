package com.navi.Visual.opcionesMenu;

import com.navi.jugador.ArregloPlayer;
import com.navi.tablero.Tablero;

import javax.swing.*;
import java.awt.*;

public class VisualReportes extends JPanel {

    String[] nombreColumnas = {"ID", "Nombre", "Apellidos", "Partidas Jugadas", "Partidas Ganadas", "Partidas Perdidas"};

    Object[][] datosFila;

    public VisualReportes(){

    }

    public void llenarFilas(){
        if(ArregloPlayer.cantidadPlayers > 0){
            datosFila = new Object[ArregloPlayer.cantidadPlayers][6];
            for (int i = 0; i < ArregloPlayer.cantidadPlayers; i++) {
                datosFila[i][0] = ArregloPlayer.jugadores[i].getId();
                datosFila[i][1] = ArregloPlayer.jugadores[i].getNombre();
                datosFila[i][2] = ArregloPlayer.jugadores[i].getApellido();
                datosFila[i][3] = ArregloPlayer.jugadores[i].getPartidasJugadas();
                datosFila[i][4] = ArregloPlayer.jugadores[i].getPartidasWin();
                datosFila[i][5] = ArregloPlayer.jugadores[i].getPartidasLose();

            }
            JTable tablaJugadores = new JTable(datosFila, nombreColumnas);
            modificarTabla(tablaJugadores);
            JScrollPane scroll = new JScrollPane(tablaJugadores);
            scroll.setPreferredSize(new Dimension(650,300));
            add(scroll, BorderLayout.CENTER);
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay ningun jugador");
            datosFila = new Object[][]{{"", "", "" , "", "", ""}};

            JTable tablaJugadores = new JTable(datosFila, nombreColumnas);
            modificarTabla(tablaJugadores);
            JScrollPane scroll = new JScrollPane(tablaJugadores);
            scroll.setPreferredSize(new Dimension(650,300));
            add(scroll, BorderLayout.CENTER);
        }

    }

    public void modificarTabla(JTable tabla){
        tabla.getColumnModel().getColumn(0).setPreferredWidth(5);
        tabla.getColumnModel().getColumn(0).setResizable(false);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(73);
        tabla.getColumnModel().getColumn(1).setResizable(false);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(72);
        tabla.getColumnModel().getColumn(2).setResizable(false);
        tabla.getColumnModel().getColumn(3).setResizable(false);
        tabla.getColumnModel().getColumn(4).setResizable(false);
        tabla.getColumnModel().getColumn(5).setResizable(false);
    }

}
