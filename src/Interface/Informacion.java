package Interface;

import Inside.Botones;

/**
 * @author Sergio Segura
 */

public class Informacion extends javax.swing.JFrame {

    Botones bot = new Botones();
    
    public Informacion() 
    {
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

        Bot_MenuPrincipal = new javax.swing.JButton();
        botRegistrar = new javax.swing.JButton();
        botBusqueda = new javax.swing.JButton();
        botAdministrar = new javax.swing.JButton();
        botEstadisticas = new javax.swing.JButton();
        botInformacion = new javax.swing.JButton();
        Wallpaper = new javax.swing.JLabel();

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

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/baseGenerica.png"))); // NOI18N
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bot_MenuPrincipal;
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JButton botAdministrar;
    private javax.swing.JButton botBusqueda;
    private javax.swing.JButton botEstadisticas;
    private javax.swing.JButton botInformacion;
    private javax.swing.JButton botRegistrar;
    // End of variables declaration//GEN-END:variables
}
