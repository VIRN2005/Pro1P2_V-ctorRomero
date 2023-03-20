/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1p2_víctorromero;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author IFRST
 */
public class Tutorial extends Thread implements Serializable{
   
    private static final long SerialVersionUID = 66;
    private transient JPanel gamepanel = new JPanel();
    private JLabel finalWave = new JLabel();
    private ArrayList<Zombies> zombies = new ArrayList();
    private ArrayList<Plants> plants = new ArrayList();
    private ProgressBar p = new ProgressBar();
    private int cont = 0;

    public Tutorial() {
        super();
    }

    public Tutorial(JPanel game, JLabel Wave, ProgressBar bar) {
        super();
        this.gamepanel = game;
        this.finalWave = Wave;
        this.p = bar;

    }

    public JLabel getFinalWave() {
        return finalWave;
    }

    public void setFinalWave(JLabel Wave) {
        this.finalWave = Wave;
    }

    public JPanel getGamepanel() {
        return gamepanel;
    }

    public void setGamepanel(JPanel gamepanel) {
        this.gamepanel = gamepanel;
    }

    public ArrayList<Zombies> getZombies() {
        return zombies;
    }

    public void setZombies(ArrayList<Zombies> zombies) {
        this.zombies = zombies;
    }

    public ArrayList<Plants> getPlants() {
        return plants;
    }

    public void setPlants(ArrayList<Plants> plants) {
        this.plants = plants;
    }

    public void run() {
        if (cont == 0) {
            for (int i = 0; i < 5; i++) {
                Zombies z = new ZombieBasico(gamepanel, 800, 210);
                z.setPlantas(plants);
                z.setZombies(zombies);

                zombies.add(z);

            }
            cont++;
        }
        try {

            p.setLimit(3);
            if (!p.isAlive()) {
                p.start();
                Thread.sleep(15000);
            }
            int a = 0;
            zombies.get(0).start();
            while (a < 5) {
                Thread.sleep(100);
                if (zombies.get(a).getHealth()<= 0) {
                    if (a < 2) {
                        a++;
                        zombies.get(a).start();
                    } else {
                        Thread.sleep(8000);
                        //final wave
                        finalWave.setVisible(true);
                        Thread.sleep(2000);
                        finalWave.setVisible(false);
                        a++;
                        zombies.get(a).start();
                        a++;
                        zombies.get(a).start();
                    }

                }
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(Tutorial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

