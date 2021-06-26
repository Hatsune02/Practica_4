package com.navi.Visual.visualTablero;

import com.navi.tablero.casillas.Casilla;

import javax.swing.*;

public class VisualCasillas extends JPanel {
    Casilla referencia;
    public VisualCasillas(Casilla referencia){
        this.referencia = referencia;
    }
}
