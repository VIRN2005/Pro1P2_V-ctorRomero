package pro1p2_víctorromero;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SolGirasol extends Thread{

    private JLabel sol;
    private boolean start;
    private Random rand = new Random();
    private int xg;
    private int yg;
    public SolGirasol() {
        super();
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public SolGirasol(JLabel sol, boolean start, int px, int py) {
        super();
        xg = px;
        yg = py;
        this.sol = sol;
        this.start = start;
    }

    @Override
    public void run() {
        while (start) {

            int x = xg ;
            int y = yg;

            try {
                Thread.sleep(9000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SolGirasol.class.getName()).log(Level.SEVERE, null, ex);
            }
            sol.setVisible(start);
            sol.setLocation(x+40, y+50);

//            System.out.println("x" + x);
//            System.out.println("y" + y);
        }
    }

}
