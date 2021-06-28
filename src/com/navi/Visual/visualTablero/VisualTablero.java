package com.navi.Visual.visualTablero;

import com.navi.jugador.ArregloPlayer;
import com.navi.tablero.Tablero;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisualTablero extends JFrame implements ActionListener{
    public static Tablero tablero;
    public static VisualCasillas[][] casillasVisuales;
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
    JTextField informacion = new JTextField("", SwingConstants.CENTER);
    JButton tirarDados = new JButton("Tirar Dados");

    public void marco(){
        this.setSize(1000,600);
        this.setLocationRelativeTo(null);
        this.crearElementos();
        this.setTitle("Serpientes y Escaleras");
        this.setVisible(true);
    }

    public void crearElementos() {

        y = tablero.getY() - 1;
        casillasVisuales = new VisualCasillas[tablero.getY()][tablero.getX()];
        panelSur.setLayout(new GridLayout());
        informacion.setPreferredSize(new Dimension(200, 50));
        tablero.correrTiempo();
        tiempo.setText("Tiempo de Partida: " + tablero.tiempoActual + "    ");
        tiempo.setForeground(Color.WHITE);
        PintarBoton(tirarDados);
        tirarDados.setPreferredSize(new Dimension(150,35));
        tablero.casillaAvanzar(0,0,3);

        panelTablero.setLayout(new GridLayout(tablero.getY(),tablero.getX()));
        for (int i = 0; i < (tablero.getX()*tablero.getY()); i++) {
            ponerCasilla();
        }
        ArregloPlayer.jugadores[0].setActual(casillasVisuales[0][0]);
        ArregloPlayer.jugadores[0].colocarJugador(casillasVisuales[0][0]);

        panelNorte.add(tiempo);
        panelSur.add(tirarDados);
        panelSur.add(informacion);
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

        tirarDados.addActionListener(this);
    }

    private void ponerCasilla(){

        casillasVisuales[y][x] = new VisualCasillas(tablero.getCasillas()[y][x]);
        casillasVisuales[y][x].setBorder(new LineBorder(Color.BLACK));
        panelTablero.add(casillasVisuales[y][x]);
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

    public int generaNumeroR(int minimo, int maximo) {

        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == tirarDados){
            int n = generaNumeroR(1, 6);
            informacion.setText("El numero del dado es " + n);
        }
    }

}
