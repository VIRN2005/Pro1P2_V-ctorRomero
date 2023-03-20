package pro1p2_víctorromero;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ZombieBasico extends Zombies {
    private Intro intro;
    private JLabel zombie;
    private MoveZombies mover;
    private int ycord;
    
    public ZombieBasico(Intro intr, int cor) {
        intro = intr;
        ycord = cor;
    }
    public ZombieBasico() {
    }

    public ZombieBasico(JPanel pan, int x, int y) {
        super();
        name = "Zombie Basico";
        health = 150;
        attackPower = 100;

        game = pan;
    }

    @Override
    public void attack(Plants p) {
        p.receiveDamage(attackPower);

        if (p.getHealth() <= 0) {
            plantas.remove(p);
        }
    }
    public void salirAlCampo(){
        zombie = new JLabel();
        zombie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/Zombie1.gif")));
        zombie.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);        
        intro.Adventure_Game.getContentPane().add(zombie, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, ycord, 140, 130),0);
        mover = new MoveZombies(zombie, 910, ycord);
        mover.start();
    }

}
