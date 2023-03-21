package pro1p2_víctorromero;

import java.lang.*;
import java.lang.System.Logger.Level;
import java.util.Random;
import java.util.TimerTask;
import javax.swing.Timer;

public class Girasol extends Plants {

    private int produccion;
    private Timer timer;

    public Girasol() {
        super();
    }

    public Girasol(int produccion, Timer timer) {
        this.produccion = produccion;
        this.timer = timer;
        //timer = new Timer();
    }

    private class ProduccionSoleTask extends TimerTask {
        @Override
        public void run() {
            produccion += 25; // Cada 10 segundos, el girasol produce 25 soles
           // System.out.println("El girasol ha producido 25 soles. Total: " + soles);
        }
    }
    
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

    public void action(){
        try {
            Thread.sleep(20000);
       
            Random random = new Random();
            int pos = random.nextInt(plantLabel.getWidth()) + plantLabel.getX();
            GeneradorSol gs = new GeneradorSol();
            gs.run();
        } catch (InterruptedException ex) {
        }
    }
}
