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
public class deporte {
    private ArrayList<torneo> torneos = new ArrayList<>();
    private int periodo;

    public deporte() {
    }

    public deporte(int periodo) {
        this.periodo = periodo;
    }

    public ArrayList<torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<torneo> torneos) {
        this.torneos = torneos;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "deporte{" + "torneos=" + torneos + ", periodo=" + periodo + '}';
    }
    
    
}
