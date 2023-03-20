package pro1p2_víctorromero;

import javax.swing.JPanel;

public class ZombieBasico extends Zombies {

    public ZombieBasico() {
    }

    public ZombieBasico(JPanel pan, int x, int y) {
        super();
        name = "Zombie Basico";
        health = 150;
        attackPower = 100;

        game = pan;
    }

}
