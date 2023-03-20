/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1p2_víctorromero;

import java.util.Random;

/**
 *
 * @author pc2
 */
public class GenerarZombies extends Thread {

    private Juego juego;
    private int lineas;
    private int linea;
    private int last;

    private boolean flag;
    private int numZombiesNormal = 10;
    private int numZombiesCono = 6;
    private int numZombiesNormalOrda = 6;
    private int numZombiesConoOrda = 4;
    private int coutZombiesNormal = 10;
    private int coutZombiesCono = 6;
    private int coutZombiesNormalOrda = 6;
    private int coutZombiesConoOrda = 4;

    private int numMaximoZombies = 3;
    private int tiempoEsperaMaximo = 12 * 3000;
    private int tiempoEsperaNormal = 6 * 3000;

    public GenerarZombies(Juego jgo, int lin) {
        juego = jgo;
        lineas = lin;
        if (lin == 1) {
            numZombiesCono = 0;
            numZombiesNormal -= 4;
        }
        if (lin == 2) {
            numZombiesCono -= 2;
            numZombiesNormal -= 3;
        }
        flag = true;
    }

    @Override
    public void run() {

        while (flag) {
            try {
                Thread.sleep(Espera() + 8000);
            } catch (Exception e) {

            }
            if (numZombiesNormal + numZombiesCono > 0) {
                if (numZombiesNormal == 0) {
                    GenerarZombieCono();
                } else {
                    if (numZombiesCono == 0) {
                        GenerarZombieNormal();
                    } else {
                        int tipoz = TipoZombie();
                        if (tipoz == 1) {
                            GenerarZombieNormal();
                        } else {
                            GenerarZombieCono();
                        }

                    }
                }
            } else {
                flag = false;
            }

            //label.setLocation((labelPlanta.getX() + 80) + i, (labelPlanta.getY()) + 50);
            //label.setLocation((labelPlanta.getX() + 80), (labelPlanta.getY()) + 50);
        }
        GenerarOrda();
    }

    private int Espera() {
        Random rand1 = new Random();
        int espera;
        if (coutZombiesNormal + coutZombiesCono >= 3) {
            espera = rand1.nextInt(tiempoEsperaMaximo);
        } else {
            espera = rand1.nextInt(tiempoEsperaNormal);
        }
        return espera;
    }

    private int Linea() {
        while (true) {
            Random rand1 = new Random();
            int retval;
            if (lineas == 1) {
                return 3;
            } else {
                retval = rand1.nextInt(lineas) + 1;
            }
            if (last != retval) {
                last = retval;
                return retval;
            }
        }
    }

    private int TipoZombie() {
        Random rand1 = new Random();
        int tipo;
        tipo = rand1.nextInt(100);
        int retval;
        if (coutZombiesCono == 0) {
            if (tipo < 60) {
                retval = 1;
            } else {
                retval = 2;
            }
        } else {
            if (coutZombiesCono > 1) {
                if (tipo < 80) {
                    retval = 1;
                } else {
                    retval = 2;
                }

            } else {
                retval = 1;
            }
        }

        return retval;
    }

    private void GenerarZombieNormal() {
        numZombiesNormal -= 1;
        coutZombiesNormal += 1;
        juego.creaZombieNormal(Linea());
    }

    private void GenerarZombieCono() {
        numZombiesCono -= 1;
        coutZombiesCono += 1;
        juego.creaZombieCono(Linea());
    }

    private void GenerarOrda() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
