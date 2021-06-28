package com.navi.Lectura;


import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class LeerObjetos {


    public static void main(String[] args) {
        
    }

    public static void abrirObjeto(String carpeta){

        //Abrir archivos binarios con la opción de elegir el archivo
        //JFileChooser cargar = new JFileChooser();

        //FileNameExtensionFilter filtro = new FileNameExtensionFilter(descripcion,extension);
        //cargar.setFileFilter(filtro);
        //cargar.showOpenDialog(null);
        //cargar.setFileSelectionMode(JFileChooser.APPROVE_OPTION);

        String directorio1 = GuardarObjetos.directorio + "/"+carpeta;
        File archivoo = new File(directorio1); //Abrir con dirección directa
        //File archivoo = cargar.getSelectedFile();
        String[] archivos=archivoo.list();

        try{
            ObjectInputStream lector;
            System.out.println("Archivos:"+archivos.length);

            for (int i = 0; i < archivos.length; i++) {
                String archivo = archivos[i];
                //lector = new ObjectInputStream(new FileInputStream(cargar.getSelectedFile()+"/"+archivo));
                lector = new ObjectInputStream(new FileInputStream(archivoo.getPath()+"/"+archivo));

                lector.close();

            }

        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo");
            System.out.println(ex);
        }
    }

}
