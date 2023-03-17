package pro1p2_víctorromero;

import javax.swing.JLabel;

public class MoveZombies extends Thread{

    private JLabel label;
    private Zombies zombie;
    private int x;
    private int y;
    private boolean flag;
    

    public MoveZombies() {
    }

    public MoveZombies(JLabel label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
        this.flag = true;
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
            for (int i = 0; i < 500; i++) {
                label.setLocation(960 - i, 240);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {

                }
            }
            label.setLocation(960, 240);
        }
    }
}
