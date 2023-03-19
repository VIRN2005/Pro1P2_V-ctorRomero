/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1p2_víctorromero;

import java.awt.event.ComponentListener;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author
 */
public class Juego {

    private Intro aventura;
    //Coords
    private int xMouse;
    private int yMouse;
    private int cantSoles = 100;

    //Thread Cracion de Soles
    GeneradorSol gs;
    Thread t2 = new Thread(gs);

    ArrayList<Plants> plantas = new ArrayList<>();
    ArrayList<Zombies> zombie = new ArrayList<>();

    public Juego(Intro aven) {
        aventura = aven;
        generarsol();
    }

    public int getCantSoles() {
        return cantSoles;
    }

    public void setCantSoles(int cantSoles) {
        this.cantSoles = cantSoles;
    }

    private void generarsol(){
        GeneradorSol gs = new GeneradorSol(aventura.Sol1, true);
        t2 = new Thread(gs);
        t2.start();        
        VerifPlants();
    }
    
    public void clickSol(){
        int soles = getCantSoles();
        soles+=25;
        setCantSoles(soles);
        aventura.jTextField2.setText(soles + "");

        aventura.Sol1.setVisible(false);
        VerifPlants();        
    }
    public void creanLanzaguisantes() {

    }

    public void creanGirasol() {

    }

    public void creanCherryBomb() {

    }

    public void creaZombie() {

    }

    public void VerifPlants() {
        if (cantSoles >= 100) {
            aventura.Panel_Lanzaguisantes3.setEnabled(true);
        } else {
            aventura.Panel_Lanzaguisantes3.setEnabled(false);
        }
        if (cantSoles >= 50) {
            aventura.Panel_Lanzaguisantes2.setEnabled(true);
        } else {
            aventura.Panel_Lanzaguisantes2.setEnabled(false);
        }
        if (cantSoles >= 150) {
            aventura.Panel_Lanzaguisantes4.setEnabled(true);
        } else {
            aventura.Panel_Lanzaguisantes4.setEnabled(false);
        }
        
    }
}
