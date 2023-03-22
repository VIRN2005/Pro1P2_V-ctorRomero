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
public class Juego_Survival {

    public static enum TipoPlanta {
        GUISANTE,
        GIRASOL,
        CHERRYBOMB,
        NINGUNO
    }

    private Intro survival;
    private final GenerarZombies genZombies;

    public Intro getSurvival() {
        return survival;
    }

    public void setSurvival(Intro survival) {
        this.survival = survival;
    }

    //Coords
    private int lines;
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
//    protected ArrayList<Plants> plantas4 = new ArrayList<>();
//    protected ArrayList<Zombies> zombie4 = new ArrayList<>();
//    protected ArrayList<Plants> plantas5 = new ArrayList<>();
//    protected ArrayList<Zombies> zombie5 = new ArrayList<>();

    public Juego_Survival(Intro surv) {
        lines = 3;
        survival = surv;
        generarsol();
        genZombies = new GenerarZombies(null, lines);
        Iniciar();

    }

    public int getCantSoles() {
        return cantSoles;
    }

    public void setCantSoles(int cantSoles) {
        this.cantSoles = cantSoles;
        survival.jTextField3.setText(cantSoles + "");
    }

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    private void generarsol() {
        gs = new GeneradorSol(survival.Sol2, true);
        t2 = new Thread(gs);
        t2.start();
        VerifPlants();
    }

    public void clickSol() {
        int soles = getCantSoles();
        soles += 25;
        setCantSoles(soles);
        survival.jTextField3.setText(soles + "");

        //aventura.Sol1.setIcon(null);
        survival.Sol1.setVisible(false);
        VerifPlants();
    }

    public void clickSolp(JLabel s) {
        int soles = getCantSoles();
        soles += 25;
        setCantSoles(soles);
        survival.jTextField3.setText(soles + "");

        //s.setIcon(null);
        VerifPlants();
    }

    public void creanLanzaguisantes(Casilla ca) {
        int soles = getCantSoles();
        soles -= 100;
        setCantSoles(soles);
        VerifPlants();
        Lanzaguisantes guisante = new Lanzaguisantes(survival, ca, "Lanza guisante", 100, 125, 25, ca.getY());
        guisante.crearSpot();
        switch (ca.getY()) {
            case 160 ->
                plantas1.add(guisante);
            case 260 ->
                plantas2.add(guisante);
            case 360 ->
                plantas3.add(guisante);
        }

    }

    public void creanGirasol(Casilla ca) {
        int soles = getCantSoles();
        soles -= 50;
        setCantSoles(soles);
        VerifPlants();
        Girasol girasol = new Girasol(survival, ca, "Girasol", 100, 125, 25, ca.getY());
        switch (ca.getY()) {
            case 160 ->
                plantas1.add(girasol);
            case 260 ->
                plantas2.add(girasol);
            case 360 ->
                plantas3.add(girasol);
        }

    }

//    public void creanCherryBomb() {
//        int soles = getCantSoles();
//        soles -= 150;
//        setCantSoles(soles);
//        VerifPlants();
//    }

    public void creaZombieNormal(int linea) {
        int ycord = 260;
        switch (linea) {
            case 1 ->
                ycord = 160;
            case 2 ->
                ycord = 260;
            case 3 ->
                ycord = 360;
        }
        ZombieBasico basico = new ZombieBasico(survival, ycord);
        basico.salirAlCampo();
        switch (linea) {
            case 1 ->
                zombie1.add(basico);
            case 2 ->
                zombie2.add(basico);
            case 3 ->
                zombie3.add(basico);
        }

        System.out.println("Sale sombie normal en linea " + linea);

    }

    public void creaZombieCono(int linea) {
        int ycord = 260;
        switch (linea) {
            case 1 ->
                ycord = 160;
            case 2 ->
                ycord = 260;
            case 3 ->
                ycord = 360;
        }
        ZombieCaraCono cono = new ZombieCaraCono(survival, ycord);
        cono.salirAlCampo();
        switch (linea) {
            case 1 ->
                zombie1.add(cono);
            case 2 ->
                zombie2.add(cono);
            case 3 ->
                zombie3.add(cono);
        }
        System.out.println("Sale sombie Cono en linea " + linea);

    }

    public void VerifPlants() {
        if (cantSoles >= 100) {
            survival.Panel_Lanzaguisantes5.setEnabled(true);
        } else {
            survival.Panel_Lanzaguisantes5.setEnabled(false);
        }
        if (cantSoles >= 50) {
            survival.Panel_Lanzaguisantes6.setEnabled(true);
        } else {
            survival.Panel_Lanzaguisantes6.setEnabled(false);
        }

    }

    private void Iniciar() {
        genZombies.start();
    }
}
