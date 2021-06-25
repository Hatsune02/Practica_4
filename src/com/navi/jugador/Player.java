package com.navi.jugador;

public class Player {
    private int id;
    private String nombre;
    private String apellido;
    private int partidasJugadas = 0;
    private int partidasWin = 0;
    private int partidasLose = 0;

    public Player(int id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public void setPartidasWin(int partidasWin) {
        this.partidasWin = partidasWin;
    }

    public void setPartidasLose(int partidasLose) {
        this.partidasLose = partidasLose;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public int getPartidasWin() {
        return partidasWin;
    }

    public int getPartidasLose() {
        return partidasLose;
    }
}
