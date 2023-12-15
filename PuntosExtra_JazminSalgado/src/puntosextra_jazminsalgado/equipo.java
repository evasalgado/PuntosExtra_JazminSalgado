/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntosextra_jazminsalgado;

import java.util.Random;

/**
 *
 * @author evaja
 */
public class equipo {
    private String nombre;
    private int puntos;

    public equipo() {
    }

    public equipo(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        Random alea = new Random();
        puntos = alea.nextInt(1,20);
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return   nombre ;
    }
    
    
}
