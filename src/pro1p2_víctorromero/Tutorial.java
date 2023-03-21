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
public class Tutorial extends Thread implements Serializable {

    private transient JPanel game = new JPanel();
    private JLabel HordaFinal = new JLabel();
    private ArrayList<Zombies> zombies = new ArrayList();
    private ArrayList<Plants> plants = new ArrayList();
    private ProgressBar bar = new ProgressBar();
    private int cont = 0;
    private static final long SerialVersionUID = 66;

    public Tutorial() {
        super();
    }

    public Tutorial(JPanel game, JLabel Wave, ProgressBar bar) {
        super();
        this.game = game;
        this.HordaFinal = Wave;
        this.bar = bar;

    }

    public JLabel getFinalWave() {
        return HordaFinal;
    }

    public void setFinalWave(JLabel Wave) {
        this.HordaFinal = Wave;
    }

    public JPanel getGamepanel() {
        return game;
    }

    public void setGamepanel(JPanel gamepanel) {
        this.game = gamepanel;
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
//        if (cont == 0) {
//            for (int i = 0; i < 5; i++) {
////                Zombies z = new ZombieBasico(game, 800, 210);
//                z.setPlantas(plants);
//                z.setZombies(zombies);
//
//                zombies.add(z);
//
//            }
//            cont++;
//        }
//        try {
//            bar.setLimit(3);
//            if (!bar.isAlive()) {
//                bar.start();
//                Thread.sleep(15000);
//            }
//            int zom = 0;
//            zombies.get(0).start();
//            while (zom < 5) {
//                Thread.sleep(100);
//                if (zombies.get(zom).getHealth() <= 0) {
//                    if (zom < 2) {
//                        zom++;
//                        zombies.get(zom).start();
//                    } else {
//                        Thread.sleep(8000);
//                        //final wave
//                        HordaFinal.setVisible(true);
//                        Thread.sleep(2000);
//                        HordaFinal.setVisible(false);
//                        zom++;
//                        zombies.get(zom).start();
//                        zom++;
//                        zombies.get(zom).start();
//                    }
//
//                }
//            }
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Tutorial.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
