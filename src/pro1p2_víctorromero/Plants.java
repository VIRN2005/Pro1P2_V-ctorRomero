package pro1p2_víctorromero;

import java.awt.EventQueue;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Plants extends Thread implements Serializable {

    protected String name;
    protected int sunCost;
    protected int health;
    protected int attackPower;
    protected JPanel panel;
    protected JLabel plantLabel = new JLabel();
    protected int CostoSoles;
    protected ArrayList<Zombies> zombies = new ArrayList();
    protected JLabel spot = new JLabel();
    private Intro intro;
    private Casilla cas;
    private int x;
    private int y;
    private DisparoLanzaguisantes gm = null;
    private RevisaLinea revisaLinea1;
    private RevisaLinea revisaLinea2;
    private RevisaLinea revisaLinea3;
    private RevisaLinea revisaLinea4;
    private RevisaLinea revisaLinea5;
    public Plants() {
    }

    public Plants(Intro intr, Casilla ca, String name, int sunCost, int health, int attackPower, int costoSoles) {
        this.intro = intr;
        cas = ca;

        this.name = name;
        this.sunCost = sunCost;
        this.health = health;
        this.attackPower = attackPower;
        this.CostoSoles = costoSoles;
        revisar();
    }

    public Plants(String name, int sunCost, int health, int attackPower, JPanel panel, int CostoSoles) {
        this.name = name;
        this.sunCost = sunCost;
        this.health = health;
        this.attackPower = attackPower;
        this.panel = panel;
        this.CostoSoles = CostoSoles;
    }

    public DisparoLanzaguisantes getGm() {
        return gm;
    }

    public void setGm(DisparoLanzaguisantes gm) {
        this.gm = gm;
    }

    public String getName1() {
        return name;
    }

    public Intro getIntro() {
        return intro;
    }

    public void setIntro(Intro intro) {
        this.intro = intro;
    }

    public Casilla getCas() {
        return cas;
    }

    public void setCas(Casilla cas) {
        this.cas = cas;
    }

    public void setName1(String name) {
        this.name = name;
    }

    public int getSunCost() {
        return sunCost;
    }

    public void setSunCost(int sunCost) {
        this.sunCost = sunCost;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public JLabel getPlantLabel() {
        return plantLabel;
    }

    public void setPlantLabel(JLabel plantLabel) {
        this.plantLabel = plantLabel;
    }

    public ArrayList<Zombies> getZombies() {
        return zombies;
    }

    public void setZombies(ArrayList<Zombies> zombies) {
        this.zombies = zombies;
    }

    public JLabel getSpot() {
        return spot;
    }

    public void setSpot(JLabel spot) {
        this.spot = spot;
    }

    @Override
    public String toString() {
        return "Plants{" + "name=" + name + "\n"
                + "sunCost=" + sunCost + "\n"
                + "health=" + health + "\n"
                + "attackPower=" + attackPower + '}';
    }

    public void attackZombie(Zombies zombie) {
        zombie.receiveDamage(this.attackPower);
        System.out.println(this.name + " ha atacado a " + zombie.getName() + " por " + this.attackPower + " puntos de daño.");
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
        System.out.println(this.name + " ha recibido " + damage + " puntos de daño.");
        if (this.health <= 0) {
            System.out.println(this.name + " ha muerto.");
            //run();
        }
    }

    public void destruir() {
        if (gm != null) {
            gm.setFlag(false);
        }
        //intro = null;
        cas.setIcon(null);
        cas.plantaenCasilla = Juego.TipoPlanta.NINGUNO;
        //cas = null;
        //gm = null;
        spot.setVisible(false);
    }

    public void run() {

        while (health > 0) {
            if (health <= 0) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        plantLabel.setVisible(false);
                        panel.remove(plantLabel);
                        spot.setEnabled(true);

                    }
                });
            }
        }
    }

    private void revisar() {
        if (intro.getGameplay().getLines() == 5) {
            revisaLinea1 = new RevisaLinea(intro.getGameplay(),this,1);
            revisaLinea2 = new RevisaLinea(intro.getGameplay(),this, 2);
            revisaLinea3 = new RevisaLinea(intro.getGameplay(),this, 3);
            revisaLinea4 = new RevisaLinea(intro.getGameplay(),this, 4);
            revisaLinea5 = new RevisaLinea(intro.getGameplay(),this, 5);
            revisaLinea1.start();
            revisaLinea2.start();
            revisaLinea3.start();
            revisaLinea4.start();
            revisaLinea5.start();            
        }
    }
}
