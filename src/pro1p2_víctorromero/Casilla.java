package pro1p2_víctorromero;

import javax.swing.JLabel;

public class Casilla extends JLabel {

    private MoveZombies mz;
    private DisparoLanzaguisantes dl;
    private Intro gameBoard;
    protected Juego.TipoPlanta plantaenCasilla = null;

    public Casilla(Intro gb) {
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

    public Casilla(MoveZombies mz, DisparoLanzaguisantes dl) {
        this.mz = mz;
        this.dl = dl;
    }

    private void verificarShoot() {
        if (mz.getX() < dl.getX()) {
            mz.run();
            dl.run();
        }
    }

    private void MouseMoved(java.awt.event.MouseEvent evt) {
        if (plantaenCasilla == null) {
            switch (gameBoard.gameplay.plantar) {
                case GUISANTE ->
                    this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/ANIMACION3_LanzaGuisantes.gif")));
                case GIRASOL ->
                    this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/Girasol (1).gif")));
                case CHERRYBOMB ->
                    this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/plants-vs-zombies-cherry-bomb.gif")));
            }
        }

    }

    private void MouseExited(java.awt.event.MouseEvent evt) {
        if (plantaenCasilla == null) {
            switch (gameBoard.gameplay.plantar) {
                case GUISANTE, GIRASOL, CHERRYBOMB ->
                    this.setIcon(null);
            }
        }

    }

    private void MouseClicked(java.awt.event.MouseEvent evt) {
        if (plantaenCasilla == null) {
            switch (gameBoard.gameplay.plantar) {
                case GUISANTE -> {
                    this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/ANIMACION3_LanzaGuisantes.gif")));
                    plantaenCasilla = Juego.TipoPlanta.GUISANTE;
                    gameBoard.gameplay.creanLanzaguisantes(this);
                    gameBoard.Panel_Lanzaguisantes3.setBorder(null);
                }
                case GIRASOL -> {
                    this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/Girasol (1).gif")));
                    plantaenCasilla = Juego.TipoPlanta.GIRASOL;
                    gameBoard.gameplay.creanGirasol();
                    gameBoard.Panel_Lanzaguisantes2.setBorder(null);
                }
                case CHERRYBOMB -> {
                    this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/plants-vs-zombies-cherry-bomb.gif")));
                    plantaenCasilla = Juego.TipoPlanta.CHERRYBOMB;
                    gameBoard.gameplay.creanCherryBomb();
                    gameBoard.Panel_Lanzaguisantes4.setBorder(null);
                }
            }
            gameBoard.gameplay.plantar=Juego.TipoPlanta.NINGUNO;
        }
    }
}
