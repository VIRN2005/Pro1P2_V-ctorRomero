/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1p2_víctorromero;

import java.awt.event.ComponentListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author
 */
public class Juego {


    public static enum TipoPlanta {
        GUISANTE,
        GIRASOL,
        CHERRYBOMB,
        NINGUNO
    }

    private final Intro aventura;
    private final GenerarZombies genZombies;
    //Coords

    private int cantSoles = 100;
    protected TipoPlanta plantar = TipoPlanta.NINGUNO;

    //Thread Cracion de Soles
    GeneradorSol gs;
    Thread t2 = new Thread(gs);

    protected ArrayList<Plants> plantas1 = new ArrayList<>();
    protected ArrayList<Zombies> zombie1 = new ArrayList<>();
    protected ArrayList<Plants> plantas2 = new ArrayList<>();
    protected ArrayList<Zombies> zombie2 = new ArrayList<>();
    protected ArrayList<Plants> plantas3 = new ArrayList<>();
    protected ArrayList<Zombies> zombie3 = new ArrayList<>();
    protected ArrayList<Plants> plantas4 = new ArrayList<>();
    protected ArrayList<Zombies> zombie4 = new ArrayList<>();
    protected ArrayList<Plants> plantas5 = new ArrayList<>();
    protected ArrayList<Zombies> zombie5 = new ArrayList<>();

    public Juego(Intro aven) {
        aventura = aven;
        generarsol();
        genZombies = new GenerarZombies(this,5);
        Iniciar();
        
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

        aventura.Sol1.setIcon(null);
        VerifPlants();
    }

    public void creanLanzaguisantes(Casilla ca) {
        int soles = getCantSoles();
        soles -= 100;
        setCantSoles(soles);
        VerifPlants();
        Lanzaguisantes guisante = new Lanzaguisantes(aventura, ca, "Lanza guisante", 100, 125, 25);
        guisante.crearSpot();
        switch (ca.getY()) {
            case 60 -> plantas1.add(guisante);
            case 160 -> plantas2.add(guisante);
            case 260 -> plantas3.add(guisante);
            case 360 -> plantas4.add(guisante);
            case 460 -> plantas5.add(guisante);

        }

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

    public void creaZombieNormal(int linea) {
        int ycord = 260;
        switch (linea) {
            case 1 -> ycord = 60;
            case 2 -> ycord = 160;
            case 3 -> ycord = 260;
            case 4 -> ycord = 360;
            case 5 -> ycord = 460;
        }        
        ZombieBasico basico = new ZombieBasico(aventura,ycord);
        basico.salirAlCampo();
        switch (linea) {
            case 1 -> zombie1.add(basico);
            case 2 -> zombie2.add(basico);
            case 3 -> zombie3.add(basico);
            case 4 -> zombie4.add(basico);
            case 5 -> zombie5.add(basico);
        }
        
                        System.out.println("Sale sombie normal en linea "+linea);

    }
    public void creaZombieCono(int linea) {
        int ycord = 260;
        switch (linea) {
            case 1 -> ycord = 60;
            case 2 -> ycord = 160;
            case 3 -> ycord = 260;
            case 4 -> ycord = 360;
            case 5 -> ycord = 460;
        }        
        ZombieBasico basico = new ZombieBasico(aventura,ycord);
        basico.salirAlCampo();
        switch (linea) {
            case 1 -> zombie1.add(basico);
            case 2 -> zombie2.add(basico);
            case 3 -> zombie3.add(basico);
            case 4 -> zombie4.add(basico);
            case 5 -> zombie5.add(basico);
        }
                           System.out.println("Sale sombie Cono en linea "+linea);

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
    private void Iniciar() {
        genZombies.start();
    }    
}
