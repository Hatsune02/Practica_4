package com.navi.Visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pantalla extends JFrame implements ActionListener, Pintar{

    JPanel panelCentral = new JPanel();
    JPanel panelJugar = new JPanel();
    JPanel panelCrearJugador = new JPanel();
    JPanel panelReportes = new JPanel();
    JPanel panelSalir = new JPanel();
    JButton botonJugar = new JButton();
    JButton botonCrearJugador = new JButton();
    JButton botonReportes = new JButton();
    JButton botonSalir = new JButton();

    JPanel panelRegresar = new JPanel();
    JButton botonRegresar = new JButton();
    JLabel menu = new JLabel("", SwingConstants.CENTER);

    public void marco(){
        this.setSize(500,350);
        this.setLocationRelativeTo(null);
        this.crearElementos();
        this.setTitle("Serpientes y Escaleras");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    private void crearElementos() {

        menu.setLayout(new BorderLayout());
        menu.setFont(new Font("Open Sans", 3, 25));
        menu.setText("<html><br/>______________MENÚ_____________<br/><br/></html>");
        panelCentral.setLayout(new GridLayout(5,1));

        botonJugar.setPreferredSize(new Dimension(140,30));
        botonCrearJugador.setPreferredSize(new Dimension(140,30));
        botonReportes.setPreferredSize(new Dimension(140,30));
        botonSalir.setPreferredSize(new Dimension(140,30));
        botonRegresar.setPreferredSize(new Dimension(140,30));

        botonJugar.setText("JUGAR");
        botonCrearJugador.setText("Crear Jugador");
        botonReportes.setText("Reportes");
        botonSalir.setText("Salir");
        botonRegresar.setText("Regresar");
        botonRegresar.setVisible(false);

        pintarBoton(botonJugar);
        pintarBoton(botonCrearJugador);
        pintarBoton(botonReportes);
        pintarBoton(botonSalir);
        pintarBoton(botonRegresar);

        panelJugar.add(botonJugar);
        panelCrearJugador.add(botonCrearJugador);
        panelReportes.add(botonReportes);
        panelSalir.add(botonSalir);
        panelRegresar.add(botonRegresar);

        panelCentral.add(menu);
        panelCentral.add(panelJugar);
        panelCentral.add(panelCrearJugador);
        panelCentral.add(panelReportes);
        panelCentral.add(panelSalir);

        this.getContentPane().add(panelCentral, BorderLayout.CENTER);
        this.getContentPane().add(panelRegresar, BorderLayout.SOUTH);

        botonJugar.addActionListener(this);
        botonCrearJugador.addActionListener(this);
        botonReportes.addActionListener(this);
        botonSalir.addActionListener(this);
        botonRegresar.addActionListener(this);
    }

    @Override
    public void pintarBoton(JButton boton) {
        boton.setBackground(Color.black);
        boton.setForeground(Color.WHITE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonJugar){
            JOptionPane.showMessageDialog(null,"JUGARRRRR");
        }
        else if(e.getSource() == botonCrearJugador){
            JOptionPane.showMessageDialog(null,"CREARRRRR");
        }
        else if(e.getSource() == botonReportes){
            JOptionPane.showMessageDialog(null,"RRRRRREPORTES");
        }
        else if(e.getSource() == botonSalir){
            JOptionPane.showMessageDialog(null,"SALIRRRRR");
        }
        else if(e.getSource() == botonRegresar){
            JOptionPane.showMessageDialog(null,"REGRESARRRRRR");
        }
    }


}
