package pro1p2_víctorromero;

import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CherryBomb extends Plants {

    private int radioExplosion;

    public CherryBomb() {
    }

//    public CherryBomb() {
//        super();
//    }

//    public CherryBomb(int x, int y, JPanel panel, JLabel spot) {
//       // super();
//        this.sunCost = 150;
//        this.attackPower = 300;
//        this.radioExplosion = radioExplosion;
//        this.panel = panel;
//        this.panel = panel;
//        this.plantLabel = new JLabel();
//
//    }

    public int getRadioExplosion() {
        return radioExplosion;
    }

    public void setRadioExplosion(int radioExplosion) {
        this.radioExplosion = radioExplosion;
    }

    public void action() {
        for (Zombies z : zombies) {
            z.receiveDamage(z.getAttackPower());
            z.getZombieJl().setVisible(false);
        }
        this.attackPower = 0;
    }
}
