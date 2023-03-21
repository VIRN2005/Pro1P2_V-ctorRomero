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
public class ComeLinea extends Thread {

    private Zombies zombiesg;
    private boolean flag = true;
    private Juego juego;
    private final int linea;

    public ComeLinea(Juego jgo, Zombies zo, int lin) {
        super();
        zombiesg = zo;
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
            if (!juego.plantas1.isEmpty()) {
                Zombies zombie = zombiesg;
                if (zombie != null) {
                    if (!juego.plantas1.isEmpty()) {
                        for (Plants planta : juego.plantas1) {
                            //System.out.println("Planta X:" + planta.getGm().getLabel().getX() + " ,Zombie X: " + juego.zombie1.get(0).getZombie().getX());

                            //System.out.println("Zombie X: " + zombie.getZombie().getX() + " , Planta X:" + planta.getCas().getX());
                            if (zombie.getZombie().getX() <= planta.getCas().getX()) {
                              //  System.out.println("Zombie X: " + zombie.getZombie().getX() + " , Planta X:" + planta.getCas().getX());
                                zombie.getMover().setAtacando(true);
                                planta.receiveDamage(zombie.attackPower);
                                try {
                                    Thread.sleep(2000);
                                } catch (Exception e) {

                                }
                                if (planta.health <= 0) {
                                    zombie.getMover().setAtacando(false);
                                    planta.destruir();
                                    juego.plantas1.remove(planta);

                                }
                            }
                        }
                    }

                }

            }
        } catch (Exception e) {
        }
    juego.getAventura().repaint();

    }

    private void linea2() {
        try {
            if (!juego.plantas2.isEmpty()) {
                Zombies zombie = zombiesg;
                if (zombie != null) {
                    if (!juego.plantas2.isEmpty()) {
                        for (Plants planta : juego.plantas2) {
                            //System.out.println("Planta X:" + planta.getGm().getLabel().getX() + " ,Zombie X: " + juego.zombie1.get(0).getZombie().getX());

                            //System.out.println("Zombie X: " + zombie.getZombie().getX() + " , Planta X:" + planta.getCas().getX());
                            if (zombie.getZombie().getX() <= planta.getCas().getX()) {
                               // System.out.println("Zombie X: " + zombie.getZombie().getX() + " , Planta X:" + planta.getCas().getX());
                                zombie.getMover().setAtacando(true);
                                planta.receiveDamage(zombie.attackPower);
                                try {
                                    Thread.sleep(2000);
                                } catch (Exception e) {

                                }
                                if (planta.health <= 0) {
                                    zombie.getMover().setAtacando(false);
                                    planta.destruir();
                                    juego.plantas2.remove(planta);

                                }
                            }
                        }
                    }

                }

            }
        } catch (Exception e) {
        }
    juego.getAventura().repaint();

    }

    private void linea3() {
        try {
            if (!juego.plantas3.isEmpty()) {
                Zombies zombie = zombiesg;
                if (zombie != null) {
                    if (!juego.plantas3.isEmpty()) {
                        for (Plants planta : juego.plantas3) {
                            //System.out.println("Planta X:" + planta.getGm().getLabel().getX() + " ,Zombie X: " + juego.zombie1.get(0).getZombie().getX());

                            //System.out.println("Zombie X: " + zombie.getZombie().getX() + " , Planta X:" + planta.getCas().getX());
                            if (zombie.getZombie().getX() <= planta.getCas().getX()) {
                                //System.out.println("Zombie X: " + zombie.getZombie().getX() + " , Planta X:" + planta.getCas().getX());
                                zombie.getMover().setAtacando(true);
                                planta.receiveDamage(zombie.attackPower);
                                try {
                                    Thread.sleep(2000);
                                } catch (Exception e) {

                                }
                                if (planta.health <= 0) {
                                    zombie.getMover().setAtacando(false);
                                    planta.destruir();
                                    juego.plantas3.remove(planta);

                                }
                            }
                        }
                    }

                }

            }
        } catch (Exception e) {
        }
    juego.getAventura().repaint();
        
    }

    private void linea4() {
        try {
            if (!juego.plantas4.isEmpty()) {
                Zombies zombie = zombiesg;
                if (zombie != null) {
                    if (!juego.plantas4.isEmpty()) {
                        for (Plants planta : juego.plantas4) {
                            //System.out.println("Planta X:" + planta.getGm().getLabel().getX() + " ,Zombie X: " + juego.zombie1.get(0).getZombie().getX());

                            //System.out.println("Zombie X: " + zombie.getZombie().getX() + " , Planta X:" + planta.getCas().getX());
                            if (zombie.getZombie().getX() <= planta.getCas().getX()) {
                                //System.out.println("Zombie X: " + zombie.getZombie().getX() + " , Planta X:" + planta.getCas().getX());
                                zombie.getMover().setAtacando(true);
                                planta.receiveDamage(zombie.attackPower);
                                try {
                                    Thread.sleep(2000);
                                } catch (Exception e) {

                                }
                                if (planta.health <= 0) {
                                    zombie.getMover().setAtacando(false);
                                    planta.destruir();
                                    juego.plantas4.remove(planta);

                                }
                            }
                        }
                    }

                }

            }
        } catch (Exception e) {
        }
    juego.getAventura().repaint();

    }

    private void linea5() {
        try {
            if (!juego.plantas5.isEmpty()) {
                Zombies zombie = zombiesg;
                if (zombie != null) {
                    if (!juego.plantas5.isEmpty()) {
                        for (Plants planta : juego.plantas5) {
                            //System.out.println("Planta X:" + planta.getGm().getLabel().getX() + " ,Zombie X: " + juego.zombie1.get(0).getZombie().getX());

                            //System.out.println("Zombie X: " + zombie.getZombie().getX() + " , Planta X:" + planta.getCas().getX());
                            if (zombie.getZombie().getX() <= planta.getCas().getX()) {
                                //System.out.println("Zombie X: " + zombie.getZombie().getX() + " , Planta X:" + planta.getCas().getX());
                                zombie.getMover().setAtacando(true);
                                planta.receiveDamage(zombie.attackPower);
                                try {
                                    Thread.sleep(2000);
                                } catch (Exception e) {

                                }
                                if (planta.health <= 0) {
                                    zombie.getMover().setAtacando(false);
                                    planta.destruir();
                                    juego.plantas5.remove(planta);

                                }
                            }
                        }
                    }

                }

            }
        } catch (Exception e) {
        }
    juego.getAventura().repaint();
        
    }

}
