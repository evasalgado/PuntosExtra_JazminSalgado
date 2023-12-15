/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntosextra_jazminsalgado;

import java.util.ArrayList;

/**
 *
 * @author evaja
 */
public class torneo {
    private String nombre;
    private ArrayList<equipo> equipos = new ArrayList<>();
    private ArrayList<partido> partidos = new ArrayList<>();

    public torneo() {
    }

    public torneo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<partido> partidos) {
        this.partidos = partidos;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
}
