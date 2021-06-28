package com.navi.Lectura;


import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public class LecturaTexto {

    static String[][] tablero = new String[1000][];
    static String[][] casillasAvanzar = new String[1000][];
    static int cantidadCasillasAvanzar = 0;
    static String[][] casillasRetroceder = new String[1000][];
    static int cantidadCasillasRetroceder = 0;
    static String[][] casillasPierdeTurno = new String[1000][];
    static int cantidadCasillasPierdeTurno = 0;
    static String[][] casillasTiraDados = new String[1000][];
    static int cantidadCasillasTiraDados = 0;
    static String[][] casillasSubida = new String[1000][];
    static int cantidadCasillasSubida = 0;
    static String[][] casillasBajada = new String[1000][];
    static int cantidadCasillasBajada = 0;


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

        int contador = 0;
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura != null)  {
                contador++;
                String cont = " " + contador;
                String datos[] = probar(lectura, cont);
                switch (datos[0]){
                    case "tablero":
                        tablero[0] = datos;
                        break;
                    case "pierdeturno":
                        casillasPierdeTurno[cantidadCasillasAvanzar] = datos;
                        cantidadCasillasPierdeTurno++;
                        break;
                    case "tiradados":
                        casillasTiraDados[cantidadCasillasTiraDados] = datos;
                        cantidadCasillasTiraDados++;
                        break;
                    case "avanza":
                        casillasAvanzar[cantidadCasillasAvanzar] = datos;
                        cantidadCasillasAvanzar++;
                        break;
                    case "retrocede":
                        casillasRetroceder[cantidadCasillasRetroceder] = datos;
                        cantidadCasillasRetroceder++;
                        break;
                    case "subida":
                        casillasSubida[cantidadCasillasSubida] = datos;
                        cantidadCasillasSubida++;
                        break;
                    case "bajada":
                        casillasBajada[cantidadCasillasBajada] = datos;
                        cantidadCasillasBajada++;
                        break;

                }
                System.out.println(lectura);
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
