/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntosextra_jazminsalgado;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author evaja
 */
public class AdministrarEquipo {
    private ArrayList<equipo> e = new ArrayList<>();
    private File f = null;

    public AdministrarEquipo(String path) {
        f = new File(path);
    }

    public ArrayList<equipo> getE() {
        return e;
    }

    public void setE(ArrayList<equipo> e) {
        this.e = e;
    }

    public File getF() {
        return f;
    }

    public void setF(File f) {
        this.f = f;
    }

    @Override
    public String toString() {
        return "AdministrarEquipo{" + "e=" + e ;
    }
    public void setEquipo(equipo tim){
        this.e.add(tim);
    }
    public void cargar(){
        try {
            e=new ArrayList<>();
            equipo temp;
            if (f.exists()) {
                FileInputStream entrada 
                        = new FileInputStream(f);
                ObjectInputStream objeto 
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp=(equipo)objeto.readObject())!=null) {                        
                       e.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void escribir(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw=new FileOutputStream(f);
            bw=new ObjectOutputStream(fw);
            for (equipo t : e) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
