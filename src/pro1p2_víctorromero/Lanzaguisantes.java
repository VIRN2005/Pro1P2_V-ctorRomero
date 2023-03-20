package pro1p2_víctorromero;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lanzaguisantes extends Plants {

    private JPanel paneles;
    private int x;
    private int y;
    private JLabel spot;

    public Lanzaguisantes() {
        super();
    }

    public Lanzaguisantes(JPanel paneles, int x, int y, JLabel spot, String name, int sunCost, int health, int attackPower) {
        super();
        this.paneles = paneles;
        this.x = x;
        this.y = y;
        this.spot = spot;
    }

    public JPanel getPaneles() {
        return paneles;
    }

    public void setPaneles(JPanel paneles) {
        this.paneles = paneles;
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

    public JLabel getSpot() {
        return spot;
    }

    public void setSpot(JLabel spot) {
        this.spot = spot;
    }

    
}
