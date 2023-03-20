package pro1p2_víctorromero;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GeneradorSol implements Runnable {

    private JLabel sol;
    private boolean start;
    private Random rand = new Random();

    public GeneradorSol() {
    }

    public GeneradorSol(JLabel sol, boolean start) {
        this.sol = sol;
        this.start = start;
    }

    @Override
    public void run() {
        while (start) {

            int x = rand.nextInt(600) + 200;
            int y = rand.nextInt(500);

            try {
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GeneradorSol.class.getName()).log(Level.SEVERE, null, ex);
            }
            sol.setLocation(x, 0);
            sol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/Sun2.png")));
            for (int i = 0; i < y; i++) {
                sol.setLocation(x, i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GeneradorSol.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            System.out.println("x" + x);
            System.out.println("y" + y);
        }
    }

}
