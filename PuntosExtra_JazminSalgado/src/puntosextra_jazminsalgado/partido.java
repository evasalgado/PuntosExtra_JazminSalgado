/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntosextra_jazminsalgado;

/**
 *
 * @author evaja
 */
public class partido {
    private String equipo1;
    private String equipo2;
    private int puntaje1;
    private int puntaje2;

    public partido() {
    }

    public partido(String equipo1, String equipo2, int puntaje1, int puntaje2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.puntaje1 = puntaje1;
        this.puntaje2 = puntaje2;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public int getPuntaje1() {
        return puntaje1;
    }

    public void setPuntaje1(int puntaje1) {
        this.puntaje1 = puntaje1;
    }

    public int getPuntaje2() {
        return puntaje2;
    }

    public void setPuntaje2(int puntaje2) {
        this.puntaje2 = puntaje2;
    }

    @Override
    public String toString() {
        return  equipo1 +  equipo2;
    }
    
    
}
