/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1p2_víctorromero;

import java.util.ArrayList;

/**
 *
 * @author pc2
 */
public class RevisaLinea extends Thread {

    private boolean flag = true;
    private Juego juego;
    private final int linea;
    private Plants plants;

    public RevisaLinea(Juego jgo, Plants pla, int lin) {
        super();
        plants = pla;
        juego = jgo;
        linea = lin;
    }

    @Override
    public void run() {
        while (flag) {
            try {
                Thread.sleep(15);
            } catch (Exception e) {

            }
            switch (linea) {
                case 1:
                    linea1();
                    break;
                case 2:
                    linea2();
                    break;
                case 3:
                    linea3();
                    break;
                case 4:
                    linea4();
                    break;
                case 5:
                    linea5();
                    break;
            }
        }

    }

    private void linea1() {
        try {
            if (!juego.zombie1.isEmpty()) {
                Plants planta = plants;
                if (planta != null) {

                    if (planta.getGm() == null && planta.getHealth() > 0) {
                        try {
                            Thread.sleep(2100);
                        } catch (Exception e) {

                        }
                        if (!juego.zombie1.isEmpty()) {
                            planta.spot.setVisible(true);
                            //System.out.println("Crear disparo: " + planta.getCas().getX() + " , " + planta.getCas().getY());
                            planta.setGm(new DisparoLanzaguisantes(planta.spot, planta.getCas(), planta.getCas().getX(), planta.getCas().getY()));
                            planta.getGm().start();
                        }
                    } else {
                        if (planta.getGm() != null) {
                            if (!planta.getGm().isFlag()) {
                                planta.setGm(null);
                                planta.spot.setVisible(false);

                            }
                        }
                    }
                    if (planta.getGm() != null) {
                        //System.out.println("Planta X:" + planta.getGm().getLabel().getX() + " ,Zombie X: " + juego.zombie1.get(0).getZombie().getX());

                        if (planta.getGm().getLabel().getX() - 60 >= juego.zombie1.get(0).getZombie().getX() && planta.getGm().isFlag()) {
                            planta.getGm().setFlag(false);
                            planta.spot.setVisible(false);
                            planta.setGm(null);
                            juego.zombie1.get(0).receiveDamage(planta.getAttackPower());
                            System.out.println("Plant Atack:" + planta.getAttackPower() + " ,Zombie health: " + juego.zombie1.get(0).health);
                            if (juego.zombie1.get(0).health <= 0) {
                                juego.zombie1.get(0).destruir();
                                juego.zombie1.remove(0);
                            }

                        }
                    }
                }
            } else {
                for (Plants planta : juego.plantas1) {

                    planta.setGm(null);

                }

            }
//        if (!juego.plantas1.isEmpty()) {
//            for (Zombies zombie : juego.zombie1) {
//                for (Plants planta : juego.plantas1) {
//                //System.out.println("Planta X:" + planta.getGm().getLabel().getX() + " ,Zombie X: " + juego.zombie1.get(0).getZombie().getX());
//                    
//                   System.out.println("Zombie X: " + zombie.getZombie().getX()+" , Planta X:" + planta.getCas().getX());
//                    if (zombie.getZombie().getX() <= planta.getCas().getX()) {
//                       System.out.println("Zombie X: " + zombie.getZombie().getX()+" , Planta X:" + planta.getCas().getX());
//                    zombie.getMover().setAtacando(true);
//                        planta.receiveDamage(zombie.attackPower);
//                        if (planta.health <= 0) {
//                            planta.destruir();
//                            juego.plantas1.remove(planta);
//                        }                        
//                    }
//                }
//                
//            }
//            
//        }
        } catch (Exception e) {
            if (plants.getGm() != null) {
                if (!plants.getGm().isFlag()) {
                    plants.setGm(null);
                    plants.spot.setVisible(false);
                }
            }
        }
        juego.getAventura().repaint();
    }

    private void linea2() {
    }

    private void linea3() {
    }

    private void linea4() {
    }

    private void linea5() {
    }

}
