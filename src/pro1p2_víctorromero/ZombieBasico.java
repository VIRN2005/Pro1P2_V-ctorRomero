package pro1p2_víctorromero;

import javax.swing.JLabel;

public class ZombieBasico extends Zombies {

    
    public ZombieBasico(Intro intr, int cor) {
        super(intr, cor);
        nombre = "Zombie Basico";
        health = 150;
        attackPower = 100;
    }


    @Override
    public void attack(Plants p) {
        p.receiveDamage(attackPower);

        if (p.getHealth() <= 0) {
            plantas.remove(p);
        }
    }
    @Override
    public void salirAlCampo(){
        setZombie(new JLabel());
        this.setIconoNormal(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/Zombie1.gif")));
        this.setIconoAtaque(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/zombieEating.gif")));
        getZombie().setIcon(this.getIconoNormal());
        getZombie().setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);        
        getIntro().Adventure_Game.getContentPane().add(getZombie(), new org.netbeans.lib.awtextra.AbsoluteConstraints(910, getYcord(), 140, 140),0);
        System.out.println("Sale al campo DEBUG");
        setMover(new MoveZombies(getZombie(), 910, getYcord()));
        getMover().start();
    }

}
