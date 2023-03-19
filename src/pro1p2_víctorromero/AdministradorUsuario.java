package pro1p2_víctorromero;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdministradorUsuario {

    private File usersFile;
    private ArrayList<User> usersList = new ArrayList();

    public AdministradorUsuario() {
    }

    public AdministradorUsuario(String path) {
        usersFile = new File(path);
    }

    public File getUsersFile() {
        return usersFile;
    }

    public void setUsersFile(File usersFile) {
        this.usersFile = usersFile;
    }

    public ArrayList<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(ArrayList<User> usersList) {
        this.usersList = usersList;
    }

    public void leer() {
        usersList.clear();
        if (usersFile.exists()) {
            try {

                Scanner lea = new Scanner(usersFile);

                while (lea.hasNextLine()) {
                    String temporal = lea.nextLine();
                    String[] array = temporal.split(";");

                    User temp = new User(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2]), Integer.parseInt(array[3]));
                    usersList.add(temp);

                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdministradorUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void add() {
        try {
            FileWriter writer = new FileWriter(usersFile, true);
            BufferedWriter bw = new BufferedWriter(writer);
            for (User usuario : usersList) {
                bw.write(usuario.getNombre() + ";" + usuario.getN1() + ";" + usuario.getN2() + ";" + usuario.getN3() + "\n");

            }
            bw.flush();
            bw.close();
            writer.close();

        } catch (IOException ex) {
            Logger.getLogger(AdministradorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String toString() {
        return "Administrador de " + usersFile;
    }

}
