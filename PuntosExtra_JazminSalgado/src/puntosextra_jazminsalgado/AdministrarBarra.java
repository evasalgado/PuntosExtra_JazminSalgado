/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntosextra_jazminsalgado;

import java.awt.Color;
import javax.swing.JProgressBar;

/**
 *
 * @author evaja
 */
public class AdministrarBarra extends Thread {

    private JProgressBar barra;
    private int num;
    private Color color;
    private boolean avanzar;
    private boolean vive;

    public AdministrarBarra(JProgressBar barra, int num, Color color) {
        this.barra = barra;
        this.num = num;
        this.color = color;
        avanzar = true;
        vive = true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                barra.setForeground(color);
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == 100) {
                    vive = false;
                }
            }
            try {
                Thread.sleep(10 * num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
