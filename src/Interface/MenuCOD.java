package Interface;

import Inside.Botones;
import Inside.Logica;

/**
 * @author Sergio Segura
 */

public class MenuCOD extends javax.swing.JFrame {

    Botones bot = new Botones();
    Logica log = new Logica();
    
    public MenuCOD() {
        initComponents();
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

        BotRegistro = new javax.swing.JButton();
        BotBusqueda = new javax.swing.JButton();
        BotAdministracion = new javax.swing.JButton();
        BotEstadisticas = new javax.swing.JButton();
        BotInformacion = new javax.swing.JButton();
        Bot_MenuPrincipal = new javax.swing.JButton();
        botRegistrar = new javax.swing.JButton();
        botBusqueda = new javax.swing.JButton();
        botAdministrar = new javax.swing.JButton();
        botEstadisticas = new javax.swing.JButton();
        botInformacion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Wallpaper = new javax.swing.JLabel();

        BotRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botRegistar.png"))); // NOI18N
        BotRegistro.setBorderPainted(false);
        BotRegistro.setContentAreaFilled(false);
        BotRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotRegistroActionPerformed(evt);
            }
        });

        BotBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botBusqueda.png"))); // NOI18N
        BotBusqueda.setBorderPainted(false);
        BotBusqueda.setContentAreaFilled(false);
        BotBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotBusquedaActionPerformed(evt);
            }
        });

        BotAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botAdministrar.png"))); // NOI18N
        BotAdministracion.setBorderPainted(false);
        BotAdministracion.setContentAreaFilled(false);
        BotAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotAdministracionActionPerformed(evt);
            }
        });

        BotEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botEstadisticas.png"))); // NOI18N
        BotEstadisticas.setBorderPainted(false);
        BotEstadisticas.setContentAreaFilled(false);
        BotEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotEstadisticasActionPerformed(evt);
            }
        });

        BotInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botInformacion.png"))); // NOI18N
        BotInformacion.setBorderPainted(false);
        BotInformacion.setContentAreaFilled(false);
        BotInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotInformacionActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bot_MenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botMenuPrincipal.png"))); // NOI18N
        Bot_MenuPrincipal.setBorderPainted(false);
        Bot_MenuPrincipal.setContentAreaFilled(false);
        Bot_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot_MenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(Bot_MenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 25, 180, 170));

        botRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botRegistar.png"))); // NOI18N
        botRegistrar.setBorderPainted(false);
        botRegistrar.setContentAreaFilled(false);
        botRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 230, 40));

        botBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botBusqueda.png"))); // NOI18N
        botBusqueda.setBorderPainted(false);
        botBusqueda.setContentAreaFilled(false);
        botBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botBusquedaActionPerformed(evt);
            }
        });
        getContentPane().add(botBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 230, 40));

        botAdministrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botAdministrar.png"))); // NOI18N
        botAdministrar.setBorderPainted(false);
        botAdministrar.setContentAreaFilled(false);
        botAdministrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAdministrarActionPerformed(evt);
            }
        });
        getContentPane().add(botAdministrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 230, 40));

        botEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botEstadisticas.png"))); // NOI18N
        botEstadisticas.setBorderPainted(false);
        botEstadisticas.setContentAreaFilled(false);
        botEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEstadisticasActionPerformed(evt);
            }
        });
        getContentPane().add(botEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 230, 40));

        botInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botInformacion.png"))); // NOI18N
        botInformacion.setBorderPainted(false);
        botInformacion.setContentAreaFilled(false);
        botInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botInformacionActionPerformed(evt);
            }
        });
        getContentPane().add(botInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 230, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bot_conozcoCod.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 460, 170, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bot_realizarBusqueda.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setDefaultCapable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 170, 40));

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/baseMenuCod.png"))); // NOI18N
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotRegistroActionPerformed

    }//GEN-LAST:event_BotRegistroActionPerformed

    private void BotBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotBusquedaActionPerformed

    private void BotAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotAdministracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotAdministracionActionPerformed

    private void BotEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotEstadisticasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotEstadisticasActionPerformed

    private void BotInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotInformacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotInformacionActionPerformed

    private void Bot_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot_MenuPrincipalActionPerformed
        bot.abrirMenuPrincipal();
        this.setVisible(false);
    }//GEN-LAST:event_Bot_MenuPrincipalActionPerformed

    private void botRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRegistrarActionPerformed
        bot.abrirRegistar();
        this.setVisible(false);
    }//GEN-LAST:event_botRegistrarActionPerformed

    private void botBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botBusquedaActionPerformed
        bot.abrirBusqueda();
        this.setVisible(false);
    }//GEN-LAST:event_botBusquedaActionPerformed

    private void botAdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAdministrarActionPerformed
        bot.abrirBusqueda();
        this.setVisible(false);
    }//GEN-LAST:event_botAdministrarActionPerformed

    private void botEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEstadisticasActionPerformed
        bot.abrirEstadisticas();
        this.setVisible(false);
    }//GEN-LAST:event_botEstadisticasActionPerformed

    private void botInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botInformacionActionPerformed
        bot.abrirInformacion();
        this.setVisible(false);
    }//GEN-LAST:event_botInformacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        log.codRecibido();
        log.escogerTipo();
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        bot.abrirBusqueda();
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCOD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotAdministracion;
    private javax.swing.JButton BotBusqueda;
    private javax.swing.JButton BotEstadisticas;
    private javax.swing.JButton BotInformacion;
    private javax.swing.JButton BotRegistro;
    private javax.swing.JButton Bot_MenuPrincipal;
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JButton botAdministrar;
    private javax.swing.JButton botBusqueda;
    private javax.swing.JButton botEstadisticas;
    private javax.swing.JButton botInformacion;
    private javax.swing.JButton botRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
