//package pro1p2_víctorromero;

//import java.awt.Color;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.io.Serializable;
//import java.util.ArrayList;
//import javax.swing.JLabel;
//import javax.swing.JPanel;

/**
 *
 * @author HP
 */
//public class Click extends JLabel implements Serializable {
//
//    private transient JPanel panel;
//    private ArrayList<Plants> placedPlants = new ArrayList();
//    private ArrayList<Zombies> zombies = new ArrayList();
//    private final static long SerialVersionUID = 432;
//
//    private JLabel sunCount = new JLabel();
//    private int plantSelected = 0;
//
//    public Click() {
//        this.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                place(sunCount, plantSelected);
//            }
//        });
//    }
//
////    public ClickeablePlant(JPanel panel, ArrayList<Plant> placedPlants, ArrayList<Zombie> zombies) {
////        this.panel = panel;
////        this.placedPlants = placedPlants;
////        this.zombies = zombies;
////        this.addMouseListener(new MouseAdapter() {
////            public void mouseClicked(MouseEvent e) {
//////                place(sunCount, plantSelected);
////            }
////        });
////    }
//
//    public Click(JPanel panel, int x, int y, int width, int height, JLabel sunCount) {
//        this.panel = panel;
//        this.setBounds(x, y, width, height);
//        this.sunCount = sunCount;
//        this.setVisible(true);
//
//        this.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                place(sunCount, plantSelected);
//
//            }
//        });
//    }
//
//    public JPanel getPanel() {
//        return panel;
//    }
//
//    public void setPanel(JPanel panel) {
//        this.panel = panel;
//    }
//
//    public ArrayList<Plants> getPlacedPlants() {
//        return placedPlants;
//    }
//
//    public void setPlacedPlants(ArrayList<Plants> placedPlants) {
//        this.placedPlants = placedPlants;
//    }
//
//    public ArrayList<Zombies> getZombies() {
//        return zombies;
//    }
//
//    public void setZombies(ArrayList<Zombies> zombies) {
//        this.zombies = zombies;
//    }
//
//    public JLabel getSunCount() {
//        return sunCount;
//    }
//
//    public void setSunCount(JLabel sunCount) {
//        this.sunCount = sunCount;
//    }
//
//    public int getPlantSelected() {
//        return plantSelected;
//    }
//
//    public void setPlantSelected(int plantSelected) {
//        this.plantSelected = plantSelected;
//    }
//
////    public void place(JLabel x1, int plantSelected) {
////        int x = Integer.parseInt(x1.getText());
////        if (isEnabled()) {
////            if (plantSelected == 1 && x >= 100) {
////                this.setEnabled(false);
////
////                Plants p = new Lanzaguisantes(panel, this.getX(), this.getY(), (JLabel) this, "Lanzaguisantes", 100, 300, 25);
////                p.setZombies(zombies);
////                placedPlants.add(p);
////                p.start();
////                x -= 100;
////            } else if (plantSelected == 2 && x >= 50) {
////                this.setEnabled(false);
////                Plants p = new SunFlower(panel, this.getX(), this.getY(), (JLabel) this, sunCount);
////                p.setZombies(zombies);
////                placedPlants.add(p);
////
////                p.start();
////                x -= 50;
////            } else if (plantSelected == 3 && x >= 150) {
////                this.setEnabled(false);
////                x -= 150;
////                Plant p = new CherryBomb(panel, this.getX(), this.getY(), (JLabel) this);
////                p.setZombies(zombies);
////                placedPlants.add(p);
////                p.start();
////            }
////            x1.setText(Integer.toString(x));
////
////        }
////
////    }
//}
