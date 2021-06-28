package com.navi.Lectura;


import com.navi.jugador.Player;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class GuardarObjetos {

    public static String directorio = System.getProperty("user.dir");

    public static void main(String[] args) {
        Player jugador = new Player(1,"Juan","Sierra");
        GuardarObjetos(jugador);
        //abrirObjeto("un carro del juego", "carro");
    }


    public static void GuardarObjetos(Object objeto){

        /*JFileChooser guardar = new JFileChooser();
        guardar.showSaveDialog(null);
        guardar.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        File archivo = guardar.getSelectedFile();

         */
        File archivo = new File(directorio + "/Jugadores");
        archivo.mkdir();

        System.out.println(directorio);
        System.out.println(archivo.getPath());

        try{
            String archivos[] = archivo.list();
            ObjectOutputStream fichero;

            if(objeto instanceof Player){
                fichero = new ObjectOutputStream(new FileOutputStream(archivo.getPath()+ "/"+ ((Player) objeto).getNOMBRE() +"." + "jugador"));
            }
            else{
                fichero = null;
            }

            //ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream(archivo.getPath()+ "." + "avion"));
            //ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream(archivo.getPath()));

            fichero.writeObject(objeto);
            fichero.close();

        }catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar, ponga nombre al archivo");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar en la salida");
            System.out.println(ex);
        }
    }
}
