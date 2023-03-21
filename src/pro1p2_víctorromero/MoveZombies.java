package pro1p2_víctorromero;

import javax.swing.JLabel;

public class MoveZombies extends Thread {

    private JLabel label;
    private Zombies zombie;
    private int x;
    private int y;
    private boolean flag;
    private boolean atacando = false;

    public MoveZombies() {
    }

    public MoveZombies(JLabel label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
        this.flag = true;
    }

    public boolean isAtacando() {
        return atacando;
    }

    public void setAtacando(boolean atacando) {
        this.atacando = atacando;
    }

    public Zombies getZombie() {
        return zombie;
    }

    public void setZombie(Zombies zombie) {
        this.zombie = zombie;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void run() {
        while (flag) {
            for (int i = 0; i < 850; i += 2) {

                if (this.atacando) {
                    //this.getZombie().getZombie().setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/zombieEating.gif")));
                    i -= 2;
                    //this.getZombie().getZombie().setIcon(this.getZombie().getIconoAtaque());
                } else {
                    //this.getZombie().getZombie().setIcon(this.getZombie().getIconoNormal());
                }
                this.label.setLocation(960 - i, this.y);
//
//                if (!this.zombie.nombre.contains("Zombie Basico")) {
//                    if(!this.getZombie().isCambio()){
//                    this.getZombie().cambiar();
//                    }
//                }
                try {
                    Thread.sleep(90);
                } catch (Exception e) {

                }
            }
            //this.label.setLocation(960, this.y);
        }
    }
}
