/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1p2_víctorromero;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IFRST
 */
public class Administrador {

    private File pausa;
    private ArrayList<Plants> plantas = new ArrayList();
    private ArrayList<Zombies> zombies = new ArrayList();
    private ArrayList<Thread> others = new ArrayList();

    private int op = 0;
    private String value = "";

    public Administrador() {
    }

    public Administrador(String path) {
        this.pausa = new File(path);
    }

    public File getPausa() {
        return pausa;
    }

    public void setPausa(File pausa) {
        this.pausa = pausa;
    }

    public ArrayList<Plants> getPlantas() {
        return plantas;
    }

    public void setPlantas(ArrayList<Plants> plantas) {
        this.plantas = plantas;
    }

    public ArrayList<Zombies> getZombies() {
        return zombies;
    }

    public void setZombies(ArrayList<Zombies> zombies) {
        this.zombies = zombies;
    }

    public ArrayList<Thread> getOthers() {
        return others;
    }

    public void setOthers(ArrayList<Thread> others) {
        this.others = others;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public void save() {
        try {

            FileOutputStream fo = new FileOutputStream(pausa, false);
            try {
                ObjectOutputStream output = new ObjectOutputStream(fo);
                output.writeObject(op);
                output.writeObject(value);
                for (Plants planta : plantas) {
                    output.writeObject(planta);
                }

                for (Zombies zombie : zombies) {
                    output.writeObject(zombie);
                }

                for (Thread other : others) {
                    output.writeObject(other);
                }

                output.flush();
                output.close();
                fo.close();
            } catch (IOException ex) {
                Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (Exception ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void load() throws IOException {
        if (pausa.exists()) {
            try {
                FileInputStream in = new FileInputStream(pausa);

                try {
                    ObjectInputStream input = new ObjectInputStream(in);
                    Object temp;
                    while ((temp = input.readObject()) != null) {
                        if (temp instanceof Integer) {
                            op = (int) temp;
                        } else if (temp instanceof Plants) {
                            plantas.add((Plants) temp);
                        } else if (temp instanceof Zombies) {
                            zombies.add((Zombies) temp);
                        } else if (temp instanceof Thread) {
                            others.add((Thread) temp);
                        } else if (temp instanceof String) {
                            value = (String) temp;
                        }

                        in.close();
                        input.close();
                    }
                } catch (EOFException ex) {

                } catch (Exception e) {

                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void reset() {
        try {
            FileOutputStream out = new FileOutputStream(pausa, false);
            ObjectOutputStream output = new ObjectOutputStream(out);
            output.writeObject(0);
            output.flush();
            output.close();
            out.close();
        } catch (Exception ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
