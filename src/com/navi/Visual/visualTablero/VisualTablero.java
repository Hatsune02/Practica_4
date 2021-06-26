package com.navi.Visual.visualTablero;

import com.navi.tablero.Tablero;
import com.navi.tablero.casillas.CasillaNula;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisualTablero extends JPanel implements ActionListener{
    Tablero tablero = new Tablero(5,5);

    int n = 5;
    int m = 5;

    JPanel panel2 = new JPanel();
    JButton pescar = new JButton("Pescar");
    JButton sembrar = new JButton("Siembra");


    public VisualTablero(JPanel panel) {

        PintarBoton(pescar);
        PintarBoton(sembrar);

        setLayout(new BorderLayout());

        JPanel panel1 = new JPanel(new GridLayout());


        add(panel1, BorderLayout.NORTH);

        panel2.setLayout(new GridLayout(tablero.getX(), tablero.getY()));

        for (int i = 0; i < (tablero.getX() * tablero.getY()) ; i++) {

            ponerCasilla();

        }

        add(panel2, BorderLayout.CENTER);

        JPanel panel3 = new JPanel();

        panel3.add(pescar);
        panel3.add(sembrar);


        add(panel3, BorderLayout.SOUTH);

        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.GRAY);
        panel3.setBackground(Color.GRAY);
        panel4.setBackground(Color.GRAY);
        panel5.setBackground(Color.GRAY);
        add(panel4, BorderLayout.EAST);
        add(panel5, BorderLayout.WEST);

    }

    private void ponerCasilla(){
        VisualCasillas panel;

        panel = new VisualCasillas(new CasillaNula());
        panel.setBackground(Color.GREEN);

        panel2.add(panel);
    }

    public void PintarBoton(JButton boton){
        boton.setBackground(Color.BLACK);
        boton.setForeground(Color.WHITE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
