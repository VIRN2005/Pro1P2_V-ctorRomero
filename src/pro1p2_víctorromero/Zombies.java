package pro1p2_víctorromero;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Zombies extends Thread implements Serializable {

    protected String name;
    protected int health;
//    int x;
//    int y;
    protected int attackPower;
    protected ArrayList<Plants> plantas = new ArrayList();
    protected ArrayList<Zombies> zombies = new ArrayList();
    protected JLabel zombieJl = new JLabel();
    protected JPanel game;
    private static final long SerialVersionUID = 777;

    public Zombies() {
    }

    public Zombies(String names, int health, int attackPower, JPanel game) {
        this.name = names;
        this.health = health;
        this.attackPower = attackPower;
        this.game = game;
    }

    public String getNames() {
        return name;
    }

    public void setNames(String name) {
        this.name = name;
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

    public abstract void attack(Plants p);

    @Override
    public String toString() {
        return "Zombies{" + "name=" + name + "\n"
                + "health=" + health + "\n"
                + "attackPower=" + attackPower + '}';
    }

    public void attackPlant(Plants plant) {
        plant.setHealth(plant.getHealth() - this.attackPower);
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println(this.name + " ha muerto.");
        }
    }
}
