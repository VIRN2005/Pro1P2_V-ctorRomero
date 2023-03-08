package pro1p2_víctorromero;

import javax.swing.JLabel;

public class GameManager_Threads implements Runnable {

    private JLabel label;

    public GameManager_Threads() {
    }

    public GameManager_Threads(JLabel label) {
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
                label.setLocation(390 + i, 290);
                try {
                    Thread.sleep(2);
                } catch (Exception e) {
                    
                }
            }
            label.setLocation(390, 290);
        }

    }
}
