package pro1p2_víctorromero;

import java.awt.event.MouseEvent;
import java.lang.*;
import java.lang.System.Logger.Level;
import java.util.Random;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Girasol extends Plants {

    private int produccion;
    private SolGirasol soles;
    private Timer timer;
    private JLabel sol;

    public Girasol() {
        super();
    }

    public Girasol(Intro intr, Casilla ca, String name, int sunCost, int health, int attackPower, int li) {
        super(intr, ca, name, sunCost, health, attackPower, 25, li);
        producirSoles();
    }

    public Girasol(int produccion, Timer timer) {
        this.produccion = produccion;
        this.timer = timer;
        //timer = new Timer();
    }

    private void producirSoles() {

        sol = new javax.swing.JLabel();
        sol.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/Sun2.png"))); // NOI18N
        sol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sol.setVisible(false);
        sol.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClicked(evt);
            }

            private void MouseClicked(MouseEvent evt) {
                getIntro().gameplay.clickSol();
                sol.setVisible(false);
            }
        });

        getIntro().Adventure_Game.getContentPane().add(sol, new org.netbeans.lib.awtextra.AbsoluteConstraints(getCas().getX()+40, getCas().getY()+50, 110, 100), 0);
        soles = new SolGirasol(sol, true, getCas().getX(), getCas().getY());
        soles.start();
    }

//    private class ProduccionSoleTask extends TimerTask {
//
//        @Override
//        public void run() {
//            produccion += 25; // Cada 10 segundos, el girasol produce 25 soles
//            // System.out.println("El girasol ha producido 25 soles. Total: " + soles);
//        }
//    }
    public Girasol(int produccion, String name, int sunCost, int health, int attackPower) {
        super();
        this.produccion = produccion;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

    public void action() {
        try {
            Thread.sleep(20000);

            Random random = new Random();
            int pos = random.nextInt(plantLabel.getWidth()) + plantLabel.getX();
            GeneradorSol gs = new GeneradorSol();
            gs.run();
        } catch (InterruptedException ex) {
        }
    }
    @Override
    public void destruir() {
        if (getGm() != null) {
            getGm().setFlag(false);
        }
        //intro = null;
        getCas().setIcon(null);
        getCas().plantaenCasilla = Juego.TipoPlanta.NINGUNO;
        
        //cas = null;
        //gm = null;
        soles.setStart(false);
        soles = null;
        sol.setVisible(false);
    }
}
