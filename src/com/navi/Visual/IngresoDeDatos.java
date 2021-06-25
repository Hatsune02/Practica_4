package com.navi.Visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IngresoDeDatos extends JPanel implements ActionListener{

    JButton aceptar = new JButton("Aceptar");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JTextField name2 = new JTextField(JTextField.CENTER);
    JTextField nick2 = new JTextField(JTextField.CENTER);
    JLabel name1 = new JLabel("Nombre ", JLabel.CENTER);
    JLabel nick1 = new JLabel("Nick Name ", JLabel.CENTER);
    JLabel texto = new JLabel("Ingresa tu nombre y tu nick", JLabel.CENTER);




    public IngresoDeDatos(JFrame ventana) {

        setLayout(new BorderLayout());
        setBackground(Color.GRAY);
        panel1.setBackground(Color.GRAY);
        panel2.setBackground(Color.GRAY);

        panel1.setLayout(new GridLayout(2,2));

        texto.setForeground(Color.WHITE);


        panel1.add(name1);
        panel1.add(name2);
        panel1.add(nick1);
        panel1.add(nick2);

        add(panel1, BorderLayout.NORTH);


        add(texto, BorderLayout.CENTER);

        panel2.add(aceptar);

        add(panel2, BorderLayout.SOUTH);

        aceptar.setBackground(Color.black);
        aceptar.setForeground(Color.WHITE);

        aceptar.addActionListener(this);

    }



    @Override
    public void actionPerformed(ActionEvent e) {


        Menu ventana = new Menu(this);


        if(e.getSource() == aceptar){

            this.remove(panel1);
            this.remove(panel2);
            this.remove(texto);
            this.add(ventana);
            SwingUtilities.updateComponentTreeUI(this);

        }

    }

}
