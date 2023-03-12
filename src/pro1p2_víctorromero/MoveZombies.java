package pro1p2_víctorromero;

import javax.swing.JLabel;

public class MoveZombies implements Runnable{

    private JLabel label;

    public MoveZombies() {
    }

    public MoveZombies(JLabel label) {
        this.label = label;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    @Override
    public void run() {
        while (true) {
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
