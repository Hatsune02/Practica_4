package com.navi.Lectura;


import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class GuardarObjetos {

    public static String directorio = System.getProperty("user.dir");

    public static void main(String[] args) {

        //abrirObjeto("un carro del juego", "carro");
    }


    public static void GuardarObjetos(Object objeto){

        /*JFileChooser guardar = new JFileChooser();
        guardar.showSaveDialog(null);
        guardar.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        File archivo = guardar.getSelectedFile();

         */

        File archivo = new File(directorio + "/Avion");
        File archivo1 = new File(directorio + "/Aeropuerto");


        archivo.mkdir();
        archivo1.mkdir();

        try{
            String archivos[] = archivo.list();

            ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream(archivo.getPath()+ "." + "objeto"));

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
