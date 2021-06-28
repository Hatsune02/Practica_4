package com.navi.Lectura;


import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public class LecturaTexto {


    public static void main(String[] args) {
        LeerArchivos();
    }

    public static void LeerArchivos(){

        JFileChooser cargar = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Carga de datos","txt");
        cargar.setFileFilter(filtro);
        cargar.showOpenDialog(null);
        cargar.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        File archivo = cargar.getSelectedFile();
        //File archivo = new File("/home/achess/Desktop/saludos.txt");
        int contador = 0;
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura != null)  {
                contador++;
                String cont = " " + contador;
                String datos[] = probar(lectura, cont);
                switch (datos[0]){
                    case "AVION":
                        break;
                }
                //System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo");
            System.out.println(ex);
        }

    }

    public static String[] probar(String a, String linea){
        a = a+linea;
        a = a.replaceAll("\\(", ",");
        a = a.replaceAll("\\)", ",");
        String b[] = a.split(",");
        for (int i = 0; i <b.length ; i++) {
            b[i] = b[i].trim().toUpperCase();
            System.out.println(b[i]);
        }
        return b;
    }

    static boolean esNumeroInt(String valor){
        try{
            var n =Integer.parseInt(valor);
            return true;
        }
        catch(Exception ex){
            return false;
        }
    }
}
