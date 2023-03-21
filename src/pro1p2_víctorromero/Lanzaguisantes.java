package pro1p2_víctorromero;

import javax.swing.JLabel;

public class Lanzaguisantes extends Plants {

    public Lanzaguisantes(Intro intr, Casilla ca, String name, int sunCost, int health, int attackPower) {
        super(intr, ca, name, sunCost, health, attackPower, 25);
    }

    public void crearSpot() {
        spot = new JLabel();
        spot.setVisible(false);
        spot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/Pea.png")));
        getIntro().Adventure_Game.getContentPane().add(spot, new org.netbeans.lib.awtextra.AbsoluteConstraints(getCas().getX(), getCas().getY(), 50, -1), 1);
        //setGm(new DisparoLanzaguisantes(spot, getCas(), getCas().getX(), getCas().getY()));

    }

}
