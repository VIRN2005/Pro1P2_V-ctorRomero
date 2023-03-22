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
public class Juego_Tutorial {

    public static enum TipoPlanta {
        GUISANTE,
        GIRASOL,
        CHERRYBOMB,
        NINGUNO
    }

    private Intro tutorial;
    private final GenerarZombies genZombies;

    public Intro getTutorial() {
        return tutorial;
    }

    public void setTutorial(Intro tutorial) {
        this.tutorial = tutorial;
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

    public Juego_Tutorial(Intro tut) {
        lines = 1;
        tutorial = tut;
        generarsol();
        genZombies = new GenerarZombies(null, lines);
        Iniciar();
    }

    public int getCantSoles() {
        return cantSoles;
    }

    public void setCantSoles(int cantSoles) {
        this.cantSoles = cantSoles;
        tutorial.jLabel1.setText(cantSoles + "");
    }

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    private void generarsol() {
        gs = new GeneradorSol(tutorial.Sol, true);
        t2 = new Thread(gs);
        t2.start();
        VerifPlants();
    }

    public void clickSol() {
        int soles = getCantSoles();
        soles += 25;
        setCantSoles(soles);
        tutorial.jLabel1.setText(soles + "");

        //aventura.Sol1.setIcon(null);
        tutorial.Sol.setVisible(false);
        VerifPlants();
    }

    public void clickSolp(JLabel s) {
        int soles = getCantSoles();
        soles += 25;
        setCantSoles(soles);
        tutorial.jLabel1.setText(soles + "");

        //s.setIcon(null);
        VerifPlants();
    }

    public void creanLanzaguisantes(Casilla ca) {
        int soles = getCantSoles();
        soles -= 100;
        setCantSoles(soles);
        VerifPlants();
        Lanzaguisantes guisante = new Lanzaguisantes(tutorial, ca, "Lanza guisante", 100, 125, 25, ca.getY());
        guisante.crearSpot();
        switch (ca.getY()) {
            case 260 ->
                plantas1.add(guisante);
        }

    }

    public void creaZombieNormal(int linea) {
        int ycord = 260;
        switch (linea) {
            case 1 ->
                ycord = 260;
        }
        ZombieBasico basico = new ZombieBasico(tutorial, ycord);
        basico.salirAlCampo();
        switch (linea) {
            case 1 ->
                zombie1.add(basico);
        }

        System.out.println("Sale sombie normal en linea " + linea);

    }

    public void VerifPlants() {
        if (cantSoles >= 100) {
            tutorial.Panel_Lanzaguisantes5.setEnabled(true);
        } else {
            tutorial.Panel_Lanzaguisantes5.setEnabled(false);
        }
    }

    private void Iniciar() {
        genZombies.start();
    }
}
