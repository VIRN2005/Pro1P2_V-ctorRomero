package pro1p2_víctorromero;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Zombies extends Thread implements Serializable {

    private ComeLinea comeLinea1;
    private ComeLinea comeLinea2;
    private ComeLinea comeLinea3;
    private ComeLinea comeLinea4;
    private ComeLinea comeLinea5;

    private ImageIcon iconoNormal;
    private ImageIcon iconoAtaque;
    private boolean cambio = false;
    protected String nombre;
    protected int health;
//    int x;
//    int y;
    private Intro intro;
    private JLabel zombie;
    private MoveZombies mover;
    private int ycord;
    protected int attackPower;
    protected ArrayList<Plants> plantas = new ArrayList();
    protected ArrayList<Zombies> zombies = new ArrayList();
    protected JLabel zombieJl = new JLabel();
    protected JPanel game;
    private static final long SerialVersionUID = 777;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zombies(Intro intr, int cor) {
        intro = intr;
        ycord = cor;
        revisar();
    }

    public ImageIcon getIconoNormal() {
        return iconoNormal;
    }

    public void setIconoNormal(ImageIcon iconoNormal) {
        this.iconoNormal = iconoNormal;
    }

    public ImageIcon getIconoAtaque() {
        return iconoAtaque;
    }

    public void setIconoAtaque(ImageIcon iconoAtaque) {
        this.iconoAtaque = iconoAtaque;
    }

    public boolean isCambio() {
        return cambio;
    }

    public void setCambio(boolean cambio) {
        this.cambio = cambio;
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

    public ArrayList<Plants> getPlantas() {
        return plantas;
    }

    public void setPlantas(ArrayList<Plants> plantas) {
        this.plantas = plantas;
    }

    public ArrayList<Zombies> getZombies() {
        return zombies;
    }

    public void setZombies(ArrayList<Zombies> zombies) {
        this.zombies = zombies;
    }

    public JLabel getZombieJl() {
        return zombieJl;
    }

    public void setZombieJl(JLabel zombieJl) {
        this.zombieJl = zombieJl;
    }

    public JPanel getGame() {
        return game;
    }

    public void setGame(JPanel game) {
        this.game = game;
    }

    public Intro getIntro() {
        return intro;
    }

    public void setIntro(Intro intro) {
        this.intro = intro;
    }

    public JLabel getZombie() {
        return zombie;
    }

    public void setZombie(JLabel zombie) {
        this.zombie = zombie;
    }

    public MoveZombies getMover() {
        return mover;
    }

    public void setMover(MoveZombies mover) {
        this.mover = mover;
    }

    public int getYcord() {
        return ycord;
    }

    public void setYcord(int ycord) {
        this.ycord = ycord;
    }

    public abstract void attack(Plants p);

    @Override
    public String toString() {
        return "Zombies{" + "name=" + nombre + "\n"
                + "health=" + health + "\n"
                + "attackPower=" + attackPower + '}';
    }

    public void attackPlant(Plants plant) {
        plant.setHealth(plant.getHealth() - this.attackPower);
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println(this.nombre + " ha muerto.");
        }
    }
//    public void attack(Plants p) {
//        p.receiveDamage(attackPower);
//
//        if (p.getHealth() <= 0) {
//            plantas.remove(p);
//        }
//    }

    public void salirAlCampo() {

    }

    public void destruir() {

        mover.setFlag(false);
        mover.setZombie(null);
        zombie.setVisible(false);
        zombie = null;
    }

    public void cambiar() {
        if (health <= 150) {
            this.setIconoNormal(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/Zombie1.gif")));
            this.setIconoAtaque(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/zombieEating.gif")));
            cambio = true;
        }
    }

    private void revisar() {
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
                comeLinea1 = new ComeLinea(intro.getGameplay(), this, 1);
                comeLinea1.start();
            }
            if (lin == 2) {
                comeLinea2 = new ComeLinea(intro.getGameplay(), this, 2);
                comeLinea2.start();
            }
            if (lin == 3) {
                comeLinea3 = new ComeLinea(intro.getGameplay(), this, 3);
                comeLinea3.start();
            }
            if (lin == 4) {
                comeLinea4 = new ComeLinea(intro.getGameplay(), this, 4);
                comeLinea4.start();
            }
            if (lin == 5) {
                comeLinea5 = new ComeLinea(intro.getGameplay(), this, 5);
                comeLinea5.start();
            }

        }
    }
}
