/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pro1p2_víctorromero;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author IFRST
 */
public class Intro extends javax.swing.JFrame {

    /**
     * Creates new form Intro
     */
    public Intro() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EA_Presents = new javax.swing.JFrame();
        Presents = new javax.swing.JLabel();
        PresentsBlack = new javax.swing.JLabel();
        EA_VR = new javax.swing.JLabel();
        EA_VRBlack = new javax.swing.JLabel();
        PressBlack = new javax.swing.JLabel();
        Press = new javax.swing.JLabel();
        PvZ_Logo = new javax.swing.JLabel();
        Lanzaguisantes = new javax.swing.JLabel();
        Girasol = new javax.swing.JLabel();
        GamePlay = new javax.swing.JLabel();
        Main_Screen = new javax.swing.JFrame();
        Adventure = new javax.swing.JLabel();
        Tutorial = new javax.swing.JLabel();
        Survival = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        jt_Name = new javax.swing.JTextField();
        RickRoll = new javax.swing.JLabel();
        MainScreen = new javax.swing.JLabel();
        Tutorial1 = new javax.swing.JLabel();
        Tutorial_Game = new javax.swing.JFrame();
        LG2 = new javax.swing.JLabel();
        LG3 = new javax.swing.JLabel();
        LG4 = new javax.swing.JLabel();
        LG5 = new javax.swing.JLabel();
        LG6 = new javax.swing.JLabel();
        LG7 = new javax.swing.JLabel();
        LG8 = new javax.swing.JLabel();
        LG9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LG1 = new javax.swing.JLabel();
        Panel_Lanzaguisantes = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SunBoard = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PanelSup_Plants = new javax.swing.JPanel();
        PanelInf_Plants = new javax.swing.JPanel();
        Tutorial_Background = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        VR_Presents = new javax.swing.JLabel();
        VR_PresentsBlack = new javax.swing.JLabel();
        VR = new javax.swing.JLabel();
        TapToStart = new javax.swing.JLabel();
        Pantalla = new javax.swing.JLabel();

        EA_Presents.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Presents.setFont(new java.awt.Font("Have Heart Two", 0, 70)); // NOI18N
        Presents.setForeground(new java.awt.Color(255, 255, 255));
        Presents.setText("Presents");
        EA_Presents.getContentPane().add(Presents, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 190, 60));

        PresentsBlack.setFont(new java.awt.Font("Have Heart Two", 0, 70)); // NOI18N
        PresentsBlack.setForeground(new java.awt.Color(0, 0, 0));
        PresentsBlack.setText("Presents");
        EA_Presents.getContentPane().add(PresentsBlack, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 190, 80));

        EA_VR.setBackground(new java.awt.Color(255, 0, 0));
        EA_VR.setFont(new java.awt.Font("Ghostphobia", 1, 80)); // NOI18N
        EA_VR.setForeground(new java.awt.Color(255, 153, 0));
        EA_VR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EA_VR.setText("EA & VR ");
        EA_VR.setToolTipText("");
        EA_VR.setMaximumSize(new java.awt.Dimension(780, 550));
        EA_VR.setMinimumSize(new java.awt.Dimension(780, 550));
        EA_Presents.getContentPane().add(EA_VR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 420, 70));

        EA_VRBlack.setBackground(new java.awt.Color(255, 0, 0));
        EA_VRBlack.setFont(new java.awt.Font("Ghostphobia", 1, 80)); // NOI18N
        EA_VRBlack.setForeground(new java.awt.Color(0, 0, 0));
        EA_VRBlack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EA_VRBlack.setText("EA & VR ");
        EA_VRBlack.setToolTipText("");
        EA_Presents.getContentPane().add(EA_VRBlack, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 400, 70));

        PressBlack.setBackground(new java.awt.Color(0, 255, 0));
        PressBlack.setFont(new java.awt.Font("Ghostphobia", 1, 40)); // NOI18N
        PressBlack.setForeground(new java.awt.Color(0, 0, 0));
        PressBlack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PressBlack.setText("PRESS TO CONTINUE");
        EA_Presents.getContentPane().add(PressBlack, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 370, 50));

        Press.setBackground(new java.awt.Color(0, 255, 0));
        Press.setFont(new java.awt.Font("Ghostphobia", 1, 40)); // NOI18N
        Press.setForeground(new java.awt.Color(255, 255, 0));
        Press.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Press.setText("PRESS TO CONTINUE");
        EA_Presents.getContentPane().add(Press, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 380, 50));

        PvZ_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/Plants_vs_Zombies_logo.png"))); // NOI18N
        PvZ_Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PvZ_Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PvZ_LogoMouseClicked(evt);
            }
        });
        EA_Presents.getContentPane().add(PvZ_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 410, 240));

        Lanzaguisantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/ANIMACION_LanzaGuisantes.gif"))); // NOI18N
        EA_Presents.getContentPane().add(Lanzaguisantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 30, 590, 530));

        Girasol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/Girasol.gif"))); // NOI18N
        EA_Presents.getContentPane().add(Girasol, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, -20, 280, 540));

        GamePlay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GamePlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/Gameplay.jpg"))); // NOI18N
        EA_Presents.getContentPane().add(GamePlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 560));

        Main_Screen.setMaximumSize(new java.awt.Dimension(700, 500));
        Main_Screen.setPreferredSize(new java.awt.Dimension(800, 600));
        Main_Screen.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Adventure.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Main_Screen.getContentPane().add(Adventure, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 260, 70));

        Tutorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tutorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TutorialMouseClicked(evt);
            }
        });
        Main_Screen.getContentPane().add(Tutorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 260, 70));

        Survival.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Main_Screen.getContentPane().add(Survival, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 220, 70));

        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        Main_Screen.getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 160, 50));

        jt_Name.setBackground(new java.awt.Color(55, 47, 0));
        jt_Name.setFont(new java.awt.Font("Ghostphobia", 0, 18)); // NOI18N
        jt_Name.setForeground(new java.awt.Color(255, 255, 255));
        jt_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_Name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jt_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_NameActionPerformed(evt);
            }
        });
        Main_Screen.getContentPane().add(jt_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 240, 30));

        RickRoll.setBackground(new java.awt.Color(105, 99, 67));
        RickRoll.setFont(new java.awt.Font("Ghostphobia", 0, 18)); // NOI18N
        RickRoll.setForeground(new java.awt.Color(204, 204, 0));
        RickRoll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RickRoll.setText("If this is not you... click here");
        RickRoll.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        RickRoll.setOpaque(true);
        RickRoll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RickRollMouseClicked(evt);
            }
        });
        Main_Screen.getContentPane().add(RickRoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 250, 30));

        MainScreen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/MainScreen5.jpg"))); // NOI18N
        Main_Screen.getContentPane().add(MainScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));
        Main_Screen.getContentPane().add(Tutorial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 260, 70));

        Tutorial_Game.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LG2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LG2MouseReleased(evt);
            }
        });
        Tutorial_Game.getContentPane().add(LG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 120, 130));
        Tutorial_Game.getContentPane().add(LG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 120, 130));
        Tutorial_Game.getContentPane().add(LG4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 120, 130));
        Tutorial_Game.getContentPane().add(LG5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 120, 130));
        Tutorial_Game.getContentPane().add(LG6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 120, 130));
        Tutorial_Game.getContentPane().add(LG7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 120, 130));
        Tutorial_Game.getContentPane().add(LG8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 120, 130));
        Tutorial_Game.getContentPane().add(LG9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, 120, 130));

        jPanel1.setOpaque(false);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        LG1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(LG1);

        Tutorial_Game.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 110, 140));

        Panel_Lanzaguisantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/PeaShooter.PNG"))); // NOI18N
        Panel_Lanzaguisantes.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        Panel_Lanzaguisantes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_LanzaguisantesMouseDragged(evt);
            }
        });
        Panel_Lanzaguisantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_LanzaguisantesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_LanzaguisantesMouseReleased(evt);
            }
        });
        Tutorial_Game.getContentPane().add(Panel_Lanzaguisantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 59, 100, 70));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/Zombie1.gif"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Tutorial_Game.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 220, 120, 130));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/Sun2.png"))); // NOI18N
        Tutorial_Game.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 110, 100));

        SunBoard.setBackground(new java.awt.Color(55, 47, 0));
        SunBoard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        SunBoard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(255, 255, 153));
        jTextField1.setFont(new java.awt.Font("Ghostphobia", 1, 45)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("100");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        SunBoard.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 90, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 153));
        jLabel2.setOpaque(true);
        SunBoard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 10, 110, 40));

        Tutorial_Game.getContentPane().add(SunBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 170, 60));

        PanelSup_Plants.setBackground(new java.awt.Color(55, 47, 0));
        PanelSup_Plants.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Tutorial_Game.getContentPane().add(PanelSup_Plants, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 100, 500));

        PanelInf_Plants.setBackground(new java.awt.Color(86, 86, 2));
        PanelInf_Plants.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tutorial_Game.getContentPane().add(PanelInf_Plants, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, 520));

        Tutorial_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/Backyard_Tutorial.jpg"))); // NOI18N
        Tutorial_Game.getContentPane().add(Tutorial_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 620));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tutorial_Game.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 110, 110));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/ANIMACION3_LanzaGuisantes.gif"))); // NOI18N
        Tutorial_Game.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plants vs Zombies (VR Edition)");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VR_Presents.setBackground(new java.awt.Color(0, 0, 0));
        VR_Presents.setFont(new java.awt.Font("Have Heart Two", 0, 70)); // NOI18N
        VR_Presents.setForeground(new java.awt.Color(255, 255, 255));
        VR_Presents.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VR_Presents.setText("Presents");
        getContentPane().add(VR_Presents, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 40));

        VR_PresentsBlack.setFont(new java.awt.Font("Have Heart Two", 0, 70)); // NOI18N
        VR_PresentsBlack.setForeground(new java.awt.Color(0, 0, 0));
        VR_PresentsBlack.setText("Presents");
        getContentPane().add(VR_PresentsBlack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 40));

        VR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/VRLogo.png"))); // NOI18N
        getContentPane().add(VR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 90));

        TapToStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/TapToStart2.jpg"))); // NOI18N
        TapToStart.setText("jLabel3");
        TapToStart.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        TapToStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TapToStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TapToStartMouseClicked(evt);
            }
        });
        getContentPane().add(TapToStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 670, 60));

        Pantalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p2_víctorromero/Images/Main_Screen.jpg"))); // NOI18N
        getContentPane().add(Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TapToStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TapToStartMouseClicked
        this.setVisible(false);
        EA_Presents.setVisible(true);
        EA_Presents.pack();
        EA_Presents.setLocationRelativeTo(this);
    }//GEN-LAST:event_TapToStartMouseClicked

    private void PvZ_LogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PvZ_LogoMouseClicked
        EA_Presents.setVisible(false);
        Main_Screen.setVisible(true);
        Main_Screen.pack();
        Main_Screen.setLocationRelativeTo(this);
    }//GEN-LAST:event_PvZ_LogoMouseClicked

    private void RickRollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RickRollMouseClicked
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Intro.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                Logger.getLogger(Intro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_RickRollMouseClicked

    private void jt_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_NameActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void TutorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TutorialMouseClicked
        Main_Screen.setVisible(false);
        Tutorial_Game.setVisible(true);
        Tutorial_Game.pack();
        Tutorial_Game.setLocationRelativeTo(this);
    }//GEN-LAST:event_TutorialMouseClicked

    private void Panel_LanzaguisantesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_LanzaguisantesMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_Panel_LanzaguisantesMousePressed

    private void Panel_LanzaguisantesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_LanzaguisantesMouseDragged
        Panel_Lanzaguisantes.getX();
        int x = evt.getXOnScreen();
        Panel_Lanzaguisantes.getY();
        int y = evt.getYOnScreen();

        Panel_Lanzaguisantes.setLocation(x - (4 * xMouse), y - (4 * yMouse));
    }//GEN-LAST:event_Panel_LanzaguisantesMouseDragged

    private void Panel_LanzaguisantesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_LanzaguisantesMouseReleased
        Panel_Lanzaguisantes.setLocation(40, 59);
        if (LG1.setLocation(xMouse, yMouse) == LG1) {
            LG1.setIcon(new ImageIcon("C:\\Víctor\\- UNITEC\\Ing. Sistemas\\2023 - Periodo 1\\Programación II\\Proyecto\\Pro1P2_VíctorRomero\\src\\pro1p2_víctorromero\\Images\\ANIMACION3_LanzaGuisantes.gif"));
        }
        LG1.setIcon(new ImageIcon("C:\\Víctor\\- UNITEC\\Ing. Sistemas\\2023 - Periodo 1\\Programación II\\Proyecto\\Pro1P2_VíctorRomero\\src\\pro1p2_víctorromero\\Images\\ANIMACION3_LanzaGuisantes.gif"));
//        LG2.setIcon(new ImageIcon("C:\\Víctor\\- UNITEC\\Ing. Sistemas\\2023 - Periodo 1\\Programación II\\Proyecto\\Pro1P2_VíctorRomero\\src\\pro1p2_víctorromero\\Images\\ANIMACION3_LanzaGuisantes.gif"));
//        LG3.setIcon(new ImageIcon("C:\\Víctor\\- UNITEC\\Ing. Sistemas\\2023 - Periodo 1\\Programación II\\Proyecto\\Pro1P2_VíctorRomero\\src\\pro1p2_víctorromero\\Images\\ANIMACION3_LanzaGuisantes.gif"));
//        LG4.setIcon(new ImageIcon("C:\\Víctor\\- UNITEC\\Ing. Sistemas\\2023 - Periodo 1\\Programación II\\Proyecto\\Pro1P2_VíctorRomero\\src\\pro1p2_víctorromero\\Images\\ANIMACION3_LanzaGuisantes.gif"));
//        LG5.setIcon(new ImageIcon("C:\\Víctor\\- UNITEC\\Ing. Sistemas\\2023 - Periodo 1\\Programación II\\Proyecto\\Pro1P2_VíctorRomero\\src\\pro1p2_víctorromero\\Images\\ANIMACION3_LanzaGuisantes.gif"));
//        LG6.setIcon(new ImageIcon("C:\\Víctor\\- UNITEC\\Ing. Sistemas\\2023 - Periodo 1\\Programación II\\Proyecto\\Pro1P2_VíctorRomero\\src\\pro1p2_víctorromero\\Images\\ANIMACION3_LanzaGuisantes.gif"));
//        LG7.setIcon(new ImageIcon("C:\\Víctor\\- UNITEC\\Ing. Sistemas\\2023 - Periodo 1\\Programación II\\Proyecto\\Pro1P2_VíctorRomero\\src\\pro1p2_víctorromero\\Images\\ANIMACION3_LanzaGuisantes.gif"));
//        LG8.setIcon(new ImageIcon("C:\\Víctor\\- UNITEC\\Ing. Sistemas\\2023 - Periodo 1\\Programación II\\Proyecto\\Pro1P2_VíctorRomero\\src\\pro1p2_víctorromero\\Images\\ANIMACION3_LanzaGuisantes.gif"));
//        LG9.setIcon(new ImageIcon("C:\\Víctor\\- UNITEC\\Ing. Sistemas\\2023 - Periodo 1\\Programación II\\Proyecto\\Pro1P2_VíctorRomero\\src\\pro1p2_víctorromero\\Images\\ANIMACION3_LanzaGuisantes.gif"));
    }//GEN-LAST:event_Panel_LanzaguisantesMouseReleased

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
//        jLabel9.setIcon(new ImageIcon("C:\\Víctor\\- UNITEC\\Ing. Sistemas\\2023 - Periodo 1\\Programación II\\Proyecto\\Pro1P2_VíctorRomero\\src\\pro1p2_víctorromero\\Images\\ANIMACION3_LanzaGuisantes.gif"));
    }//GEN-LAST:event_jPanel1MouseEntered

    private void LG2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LG2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_LG2MouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intro().setVisible(true);
            }
        });
    }

    private void abrir_Intro() {

    }

    private int xMouse;
    private int yMouse;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adventure;
    private javax.swing.JFrame EA_Presents;
    private javax.swing.JLabel EA_VR;
    private javax.swing.JLabel EA_VRBlack;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel GamePlay;
    private javax.swing.JLabel Girasol;
    private javax.swing.JLabel LG1;
    private javax.swing.JLabel LG2;
    private javax.swing.JLabel LG3;
    private javax.swing.JLabel LG4;
    private javax.swing.JLabel LG5;
    private javax.swing.JLabel LG6;
    private javax.swing.JLabel LG7;
    private javax.swing.JLabel LG8;
    private javax.swing.JLabel LG9;
    private javax.swing.JLabel Lanzaguisantes;
    private javax.swing.JLabel MainScreen;
    private javax.swing.JFrame Main_Screen;
    private javax.swing.JPanel PanelInf_Plants;
    private javax.swing.JPanel PanelSup_Plants;
    private javax.swing.JLabel Panel_Lanzaguisantes;
    private javax.swing.JLabel Pantalla;
    private javax.swing.JLabel Presents;
    private javax.swing.JLabel PresentsBlack;
    private javax.swing.JLabel Press;
    private javax.swing.JLabel PressBlack;
    private javax.swing.JLabel PvZ_Logo;
    private javax.swing.JLabel RickRoll;
    private javax.swing.JPanel SunBoard;
    private javax.swing.JLabel Survival;
    private javax.swing.JLabel TapToStart;
    private javax.swing.JLabel Tutorial;
    private javax.swing.JLabel Tutorial1;
    private javax.swing.JLabel Tutorial_Background;
    private javax.swing.JFrame Tutorial_Game;
    private javax.swing.JLabel VR;
    private javax.swing.JLabel VR_Presents;
    private javax.swing.JLabel VR_PresentsBlack;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jt_Name;
    // End of variables declaration//GEN-END:variables

}
