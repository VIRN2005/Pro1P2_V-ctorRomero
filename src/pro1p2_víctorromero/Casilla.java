package pro1p2_víctorromero;

import javax.swing.JLabel;

public class Casilla extends JLabel {

    private MoveZombies mz;
    private DisparoLanzaguisantes dl;

    public Casilla(MoveZombies mz, DisparoLanzaguisantes dl) {
        this.mz = mz;
        this.dl = dl;
    }

    private void verificarShoot() {
        if (mz.getX() < dl.getX()) {
            mz.run();
            dl.run();
        }
    }

}
