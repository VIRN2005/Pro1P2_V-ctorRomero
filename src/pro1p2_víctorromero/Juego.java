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

    static enum TipoPlanta {
        GUISANTE,
        GIRASOL,
        CHERRYBOMB,
        NINGUNO
    }

    private Intro aventura;
    //Coords
    private int xMouse;
    private int yMouse;
    private int cantSoles = 100;
    protected TipoPlanta plantar = TipoPlanta.NINGUNO;

    //Thread Cracion de Soles
    GeneradorSol gs;
    Thread t2 = new Thread(gs);

    protected ArrayList<Plants> plantas = new ArrayList<>();
    protected ArrayList<Zombies> zombie = new ArrayList<>();

    public Juego(Intro aven) {
        aventura = aven;
        generarsol();
    }

    public int getCantSoles() {
        return cantSoles;
    }

    public void setCantSoles(int cantSoles) {
        this.cantSoles = cantSoles;
        aventura.jTextField2.setText(cantSoles + "");
    }

    private void generarsol() {
        gs = new GeneradorSol(aventura.Sol1, true);
        t2 = new Thread(gs);
        t2.start();
        VerifPlants();
    }

    public void clickSol() {
        int soles = getCantSoles();
        soles += 25;
        setCantSoles(soles);
        aventura.jTextField2.setText(soles + "");

        aventura.Sol1.setVisible(false);
        VerifPlants();
    }

    public void creanLanzaguisantes(Casilla ca) {
        int soles = getCantSoles();
        soles -= 100;
        setCantSoles(soles);
        VerifPlants();
        Lanzaguisantes guisante = new Lanzaguisantes(aventura, ca, "Lanza guisante", 100, 125, 25);
        guisante.crearSpot();

        plantas.add(guisante);
    }

    public void creanGirasol() {
        int soles = getCantSoles();
        soles -= 50;
        setCantSoles(soles);
        VerifPlants();
    }

    public void creanCherryBomb() {
        int soles = getCantSoles();
        soles -= 150;
        setCantSoles(soles);
        VerifPlants();
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
