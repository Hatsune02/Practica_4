package com.navi.Visual;

import com.navi.tablero.casillas.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel implements ActionListener{

    int n = 5;
    int m = 5;

    JPanel panel2 = new JPanel();
    JButton pescar = new JButton("Pescar");
    JButton sembrar = new JButton("Siembra");

    static JLabel hp = new JLabel();


    public Menu(JPanel panel) {

        PintarBoton(pescar);
        PintarBoton(sembrar);

        setLayout(new BorderLayout());

        JPanel panel1 = new JPanel(new GridLayout());

        panel1.add(hp);

        add(panel1, BorderLayout.NORTH);

        panel2.setLayout(new GridLayout(0, 5));

        for (int i = 0; i < (n*m) ; i++) {

            ponerBoton();

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

    private void ponerBoton(){

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
