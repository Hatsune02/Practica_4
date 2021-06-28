package com.navi.Lectura;


import com.navi.jugador.ArregloPlayer;
import com.navi.jugador.Player;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class LeerObjetos {
    static Player jugador;

    public static void abrirObjeto(String carpeta){

        String directorio = GuardarObjetos.directorio + "/"+carpeta;
        File archivoo = new File(directorio); //Abrir con dirección directa
        String[] archivos = archivoo.list();

        try{
            ObjectInputStream lector;

            for (int i = 0; i < archivos.length; i++) {
                String archivo = archivos[i];
                lector = new ObjectInputStream(new FileInputStream(archivoo.getPath()+"/"+archivo));
                if(carpeta.equals("Jugadores")){
                    jugador = (Player) lector.readObject();
                    ArregloPlayer.agregarPlayersLectura(jugador.getID(), jugador.getNOMBRE(), jugador.getAPELLIDO());
                }
                lector.close();

            }

        }
        catch (Exception ex){
            //JOptionPane.showMessageDialog(null, "Error al cargar el archivo");
            //System.out.println(ex);
        }
    }

}
