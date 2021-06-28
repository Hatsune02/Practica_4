package com.navi.Visual.visualTablero;

import com.navi.tablero.Tablero;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisualTablero extends JFrame implements ActionListener{
    Tablero tablero = new Tablero(5,6);
    int x = 0;
    int y = 0;
    int numeroCasillas = 1;
    JPanel panelNorte = new JPanel(new GridLayout());
    JPanel panelSur = new JPanel();
    JPanel panelEste = new JPanel();
    JPanel panelOeste = new JPanel();
    JPanel panelTablero = new JPanel();
    JLabel dado1 = new JLabel();
    JLabel dado2 = new JLabel();
    static JLabel tiempo = new JLabel("", SwingConstants.RIGHT);
    JButton tirarDados = new JButton("Tirar Dados");

    public void marco(){
        this.setSize(1000,600);
        this.setLocationRelativeTo(null);
        this.crearElementos();
        this.setTitle("Serpientes y Escaleras");
        this.setVisible(true);
    }

    public void crearElementos() {
        //x = tablero.getX() - 1;
        y = tablero.getY() - 1;

        tablero.correrTiempo();
        tiempo.setText("Tiempo de Partida: " + tablero.tiempoActual + "    ");
        tiempo.setForeground(Color.WHITE);
        PintarBoton(tirarDados);

        tablero.casillaPierdeTurno(2,3);
        tablero.casillaTiraDados(3,2);
        tablero.casillaAvanzar(0,1,3);

        panelTablero.setLayout(new GridLayout(tablero.getY(),tablero.getX()));
        for (int i = 0; i < (tablero.getX()*tablero.getY()); i++) {
            ponerCasilla();
        }
        panelNorte.add(tiempo);
        panelSur.add(tirarDados);
        panelNorte.setBackground(Color.GRAY);
        panelSur.setBackground(Color.GRAY);
        panelEste.setBackground(Color.GRAY);
        panelOeste.setBackground(Color.GRAY);
        panelTablero.setBackground(Color.GRAY);

        this.getContentPane().add(panelTablero, BorderLayout.CENTER);
        this.getContentPane().add(panelNorte, BorderLayout.NORTH);
        this.getContentPane().add(panelSur, BorderLayout.SOUTH);
        this.getContentPane().add(panelEste, BorderLayout.EAST);
        this.getContentPane().add(panelOeste, BorderLayout.WEST);

    }

    private void ponerCasilla(){
        VisualCasillas panel;
        panel = new VisualCasillas(tablero.getCasillas()[y][x]);
        panel.setBorder(new LineBorder(Color.BLACK));
        panelTablero.add(panel);
        x++;
        if(x == tablero.getX()){
            x = 0;
            y--;
        }
    }

    public void PintarBoton(JButton boton){
        boton.setBackground(Color.BLACK);
        boton.setForeground(Color.WHITE);
    }

    public static void setHP(int tiempoActual){
        tiempo.setText("Tiempo de Partida: " + tiempoActual + "    ");
        SwingUtilities.updateComponentTreeUI(tiempo);
    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
