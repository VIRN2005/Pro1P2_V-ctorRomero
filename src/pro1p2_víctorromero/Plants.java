package pro1p2_víctorromero;

import java.awt.EventQueue;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Plants extends Thread implements Serializable {

    protected String nombre;
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
    private int ycord;
    private DisparoLanzaguisantes gm = null;
    private RevisaLinea revisaLinea1;
    private RevisaLinea revisaLinea2;
    private RevisaLinea revisaLinea3;
    private RevisaLinea revisaLinea4;
    private RevisaLinea revisaLinea5;

    public Plants() {
    }

    public Plants(Intro intr, Casilla ca, String lname, int sunCost, int health, int attackPower, int costoSoles, int li) {
        this.intro = intr;
        cas = ca;
        ycord = li;
        this.nombre = lname;
        this.sunCost = sunCost;
        this.health = health;
        this.attackPower = attackPower;
        this.CostoSoles = costoSoles;
        revisar();
    }

    public Plants(String lname, int sunCost, int health, int attackPower, JPanel panel, int CostoSoles) {
        this.nombre = lname;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "Plants{" + "name=" + nombre + "\n"
                + "sunCost=" + sunCost + "\n"
                + "health=" + health + "\n"
                + "attackPower=" + attackPower + '}';
    }

    public void attackZombie(Zombies zombie) {
        zombie.receiveDamage(this.attackPower);
        System.out.println(this.nombre + " ha atacado a " + zombie.getName() + " por " + this.attackPower + " puntos de daño.");
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
        System.out.println(this.nombre + " ha recibido " + damage + " puntos de daño.");
        if (this.health <= 0) {
            System.out.println(this.nombre + " ha muerto.");
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
        System.out.println("pro1p2_víctorromero.Plants.revisar():"+ycord); 
        if (intro.getGameplay().getLines() == 5) {
            int lin = 0;
            switch (ycord) {
                case 60 ->
                    lin = 1;
                case 160 ->
                    lin = 2;
                case 260 ->
                    lin = 3;
                case 360 ->
                    lin = 4;
                case 460 ->
                    lin = 5;

            }
            if (lin == 1) {
                revisaLinea1 = new RevisaLinea(intro.getGameplay(), this, 1);
                revisaLinea1.start();
            }
            if (lin == 2) {
                revisaLinea2 = new RevisaLinea(intro.getGameplay(), this, 2);
                revisaLinea2.start();
            }
            if (lin == 3) {
                revisaLinea3 = new RevisaLinea(intro.getGameplay(), this, 3);
                revisaLinea3.start();
            }
            if (lin == 4) {
                revisaLinea4 = new RevisaLinea(intro.getGameplay(), this, 4);
                revisaLinea4.start();
            }
            if (lin == 5) {
                revisaLinea5 = new RevisaLinea(intro.getGameplay(), this, 5);
                revisaLinea5.start();
            }
        }
    }
}
