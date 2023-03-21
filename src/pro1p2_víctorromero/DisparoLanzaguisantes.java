package pro1p2_víctorromero;

import javax.swing.JLabel;

public class DisparoLanzaguisantes extends Thread {

    private JLabel label;
    private JLabel labelPlanta;
    private int x;
    private int y;
    private boolean flag;

    public DisparoLanzaguisantes() {
        super();
    }

    public DisparoLanzaguisantes(JLabel label, JLabel labelPlanta, int x, int y) {
        super();
        this.label = label;
        this.labelPlanta = labelPlanta;
        this.x = x;
        this.y = y;
        this.flag = true;
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

    public JLabel getLabelPlanta() {
        return labelPlanta;
    }

    public void setLabelPlanta(JLabel labelPlanta) {
        this.labelPlanta = labelPlanta;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i += 3) {
            label.setLocation((labelPlanta.getX() + 80) + i, (labelPlanta.getY()) + 50);
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
            label.setLocation((labelPlanta.getX() + 80), (labelPlanta.getY()) + 50);
            if (!flag) {
                return;
            }
        }
    }
}
