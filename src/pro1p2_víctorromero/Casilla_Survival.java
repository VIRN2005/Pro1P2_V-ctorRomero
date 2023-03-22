package pro1p2_víctorromero;

import javax.swing.JLabel;

public class Casilla_Survival extends JLabel {


    private final Intro gameBoard;
    public Juego.TipoPlanta plantaenCasilla_Survival = null;

    public Casilla_Survival(Intro gb) {
        gameBoard = gb;
        this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MouseMoved(evt);
            }
        });
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClicked(evt);
            }
        });

    }





    private void MouseMoved(java.awt.event.MouseEvent evt) {
        if (plantaenCasilla_Survival == null) {
            switch (gameBoard.gameplay2.plantar) {
                case GUISANTE ->
                    this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/ANIMACION3_LanzaGuisantes.gif")));
                case GIRASOL ->
                    this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/Girasol (1).gif")));
            }
        }

    }

    private void MouseExited(java.awt.event.MouseEvent evt) {
        if (plantaenCasilla_Survival == null) {
            switch (gameBoard.gameplay.plantar) {
                case GUISANTE, GIRASOL->
                    this.setIcon(null);
            }
        }

    }

    private void MouseClicked(java.awt.event.MouseEvent evt) {
        if (plantaenCasilla_Survival == null) {
            switch (gameBoard.gameplay2.plantar) {
                case GUISANTE -> {
                    this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/ANIMACION3_LanzaGuisantes.gif")));
                    plantaenCasilla_Survival = Juego.TipoPlanta.GUISANTE;
                    gameBoard.gameplay2.creanLanzaguisantes(null);
                    gameBoard.Panel_Lanzaguisantes5.setBorder(null);
                }
                case GIRASOL -> {
                    this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/Girasol (1).gif")));
                    plantaenCasilla_Survival = Juego.TipoPlanta.GIRASOL;
                    gameBoard.gameplay2.creanGirasol(null);
                    gameBoard.Panel_Lanzaguisantes6.setBorder(null);
                }
            }
            gameBoard.gameplay2.plantar=Juego_Survival.TipoPlanta.NINGUNO;
        }
    }
}
