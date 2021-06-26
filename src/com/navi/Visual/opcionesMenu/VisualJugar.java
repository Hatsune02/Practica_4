package com.navi.Visual.opcionesMenu;

import com.navi.Visual.Pintar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisualJugar extends JPanel implements ActionListener, Pintar {
    JPanel panelCargarTexto = new JPanel();
    JButton botonCargarTexto = new JButton();

    public VisualJugar(){
        botonCargarTexto.setText("Cargar el tablero");
        panelCargarTexto.add(botonCargarTexto);
        pintarBoton(botonCargarTexto);

        add(panelCargarTexto);

        botonCargarTexto.addActionListener(this);
    }

    @Override
    public void pintarBoton(JButton boton) {
        boton.setBackground(Color.black);
        boton.setForeground(Color.WHITE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonCargarTexto){

        }
    }
}
