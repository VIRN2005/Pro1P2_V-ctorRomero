package pro1p2_víctorromero;

import javax.swing.JLabel;

public class Lanzaguisantes extends Plants {

    private Intro intro;
    private Casilla cas;
    private int x;
    private int y;
    private JLabel spot;
    private DisparoLanzaguisantes gm;

    public Lanzaguisantes() {
        super();
    }
    public Lanzaguisantes(Intro intr, Casilla ca, String name, int sunCost, int health, int attackPower) {
        super();
        this.intro = intr;
        cas = ca; 
    }
    public Lanzaguisantes(Intro intr, int x, int y, JLabel spot, String name, int sunCost, int health, int attackPower) {
        super();
        this.intro = intr;
        this.x = x;
        this.y = y;
        this.spot = spot;
    }

    public void crearSpot(){
        spot = new JLabel();
        spot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/Pea.png")));
        intro.Adventure_Game.getContentPane().add(spot, new org.netbeans.lib.awtextra.AbsoluteConstraints(cas.getX(), cas.getY(), 50, -1),1);
        gm = new DisparoLanzaguisantes(spot, cas, cas.getX(), cas.getY());
        
        gm.start();
    }
    public Intro getIntro() {
        return intro;
    }

    public void setIntro(Intro intro) {
        this.intro = intro;
    }

    public Casilla getCas() {
        return cas;
    }

    public void setCas(Casilla cas) {
        this.cas = cas;
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
