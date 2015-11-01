package Interface;

import Inside.*;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 * @author Sergio Segura
 * @version beta
 */

public class Registro extends javax.swing.JFrame {

    Botones bot = new Botones();
    Logica log = new Logica();
    
    static Connection cn;
    static Statement st;
    static ResultSet rs;
    
    String consulta;
    
    String fecha = "";
    
    boolean modoAvaluoOn = false;
    
    public Registro() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        UtilizarCombox();
    }
    
    public void GenerarConsulta()
    {
        String ID = Logica.generateID(cnombre.getText());
         
        if (modoAvaluoOn==false)
        {
            consulta = "INSERT INTO CLIENTES VALUES ("
                    + "'" + ID + "',"
                    + "'" + fecha + "',"
                    + "upper('" + cnombre.getText() + "'),"
                    + "upper('" + clugar.getText()+ "'),"
                    + "'" + ctel.getText() + "',"
                    + "'" + careaLote.getText() + "',"
                    + "'" + careaConst.getText() + "',"
                    + "'" + cprecio.getText() + "',"    
                    + "upper('" + ccorreo.getText() + "'),"
                    + "upper('" + cotrosDatos.getText() + "'))";
        }
        else
        {
           consulta = "INSERT INTO CLIENTES VALUES ("
                    + "'" + ID + "',"
                    + "'" + fecha + "',"
                    + "upper('" + cnombre.getText() + "'),"
                    + "' - ',"
                    + "' - ',"
                    + "' - ',"
                    + "' - ',"
                    + "' - ',"
                    + "' - ',"
                    + "' - ')";
        }
        System.out.println(consulta);
     }

    public void UtilizarCombox()
    {
        String[] Dias = {"01","02","03","04","05","06","07","08","09","10","11","12"
                         ,"13","14","15","16","17","18","19","20","21","22"
                         ,"23","24","25","26","27","28","29","30","31"};
        
        String[] Meses = {"01","02","03","04","05","06","07","08","09","10","11","12"};
        
        String[] Annos = {"2015","2016","2017","2018","2019","2020","2021","2022"};
        
        jCDias.setModel(new DefaultComboBoxModel(Dias));
        
        jCMeses.setModel(new DefaultComboBoxModel(Meses));
        
        jCAnnos.setModel(new DefaultComboBoxModel(Annos));
    }
    
    public void concatenarFecha() 
    {
        String dia = jCDias.getSelectedItem().toString();
        String mes = jCMeses.getSelectedItem().toString();
        String anno =jCAnnos.getSelectedItem().toString();
        
        fecha = dia+"/"+mes+"/"+anno;
    }
    
    public void ingresoEnTabla()
    {
        try
        {
           cn = Logica.Enlace(cn);
           rs=Logica.EnlEst(rs,consulta);
           JOptionPane.showMessageDialog(null, "Datos guardados");
           this.setVisible(false);
           rs.close();
           cn.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos \n "+e);
        }
    }
   
    private void analisisPrecio ()
    {
        char simbolo = (cprecio.getText()).charAt(0);
        if( simbolo == '$')
        {
            String listo =Logica.conversionColones(cprecio.getText());
            cprecio.setText(listo);
        }
    }
    
    public void modoAvaluo ()
    {
        if (jRNo.isSelected()==true)
        {
            ccorreo.setEditable(false);
            ccorreo.setText("<No editable>");
            
            careaConst.setEditable(false);
            careaConst.setText("<No editable>");
            
            careaLote.setEditable(false);
            careaLote.setText("<No editable>");
            
            cprecio.setEditable(false);
            cprecio.setText("<No editable>");
                    
            clugar.setEditable(false);
            clugar.setText("<No editable>");
            
            cotrosDatos.setEditable(false);
            cotrosDatos.setText("<No editable>");
            
            modoAvaluoOn=true;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGOpciones = new javax.swing.ButtonGroup();
        botAdministrar = new javax.swing.JButton();
        Bot_MenuPrincipal1 = new javax.swing.JButton();
        botBusqueda = new javax.swing.JButton();
        botEstadisticas = new javax.swing.JButton();
        botInformacion = new javax.swing.JButton();
        cprecio = new javax.swing.JTextField();
        ccorreo = new javax.swing.JTextField();
        cnombre = new javax.swing.JTextField();
        careaConst = new javax.swing.JTextField();
        clugar = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        cotrosDatos = new javax.swing.JTextField();
        careaLote = new javax.swing.JTextField();
        ctel = new javax.swing.JFormattedTextField();
        jCAnnos = new javax.swing.JComboBox();
        jCDias = new javax.swing.JComboBox();
        jCMeses = new javax.swing.JComboBox();
        jRNo = new javax.swing.JRadioButton();
        jRSi = new javax.swing.JRadioButton();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botAdministrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botAdministrar.png"))); // NOI18N
        botAdministrar.setBorderPainted(false);
        botAdministrar.setContentAreaFilled(false);
        botAdministrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAdministrarActionPerformed(evt);
            }
        });
        getContentPane().add(botAdministrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 333, 230, 40));

        Bot_MenuPrincipal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botMenuPrincipal.png"))); // NOI18N
        Bot_MenuPrincipal1.setBorderPainted(false);
        Bot_MenuPrincipal1.setContentAreaFilled(false);
        Bot_MenuPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot_MenuPrincipal1ActionPerformed(evt);
            }
        });
        getContentPane().add(Bot_MenuPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 18, 180, 170));

        botBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botBusqueda.png"))); // NOI18N
        botBusqueda.setBorderPainted(false);
        botBusqueda.setContentAreaFilled(false);
        botBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botBusquedaActionPerformed(evt);
            }
        });
        getContentPane().add(botBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 230, 40));

        botEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botEstadisticas.png"))); // NOI18N
        botEstadisticas.setBorderPainted(false);
        botEstadisticas.setContentAreaFilled(false);
        botEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEstadisticasActionPerformed(evt);
            }
        });
        getContentPane().add(botEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 230, 40));

        botInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botInformacion.png"))); // NOI18N
        botInformacion.setBorderPainted(false);
        botInformacion.setContentAreaFilled(false);
        botInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botInformacionActionPerformed(evt);
            }
        });
        getContentPane().add(botInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 230, 40));

        cprecio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cprecio.setText("¢");
        cprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cprecioActionPerformed(evt);
            }
        });
        getContentPane().add(cprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 443, 150, 30));

        ccorreo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ccorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ccorreo.setText("@");
        ccorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccorreoActionPerformed(evt);
            }
        });
        getContentPane().add(ccorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 160, 30));

        cnombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cnombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cnombre.setText("nombre apellidos ");
        cnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnombreActionPerformed(evt);
            }
        });
        getContentPane().add(cnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 210, 30));

        careaConst.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        careaConst.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        careaConst.setText("m2");
        careaConst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                careaConstActionPerformed(evt);
            }
        });
        getContentPane().add(careaConst, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 150, 30));

        clugar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        clugar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clugar.setText("Ciudad, dirrecion");
        clugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clugarActionPerformed(evt);
            }
        });
        getContentPane().add(clugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 150, 30));

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botGuardar.png"))); // NOI18N
        guardar.setBorderPainted(false);
        guardar.setContentAreaFilled(false);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 140, 40));

        cotrosDatos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cotrosDatos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cotrosDatos.setText("-");
        cotrosDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotrosDatosActionPerformed(evt);
            }
        });
        getContentPane().add(cotrosDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 443, 140, 30));

        careaLote.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        careaLote.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        careaLote.setText("m2");
        careaLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                careaLoteActionPerformed(evt);
            }
        });
        getContentPane().add(careaLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 360, 140, 30));

        try {
            ctel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ctel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ctel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctelActionPerformed(evt);
            }
        });
        getContentPane().add(ctel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 130, 30));

        jCAnnos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016" }));
        jCAnnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCAnnosActionPerformed(evt);
            }
        });
        getContentPane().add(jCAnnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 70, -1));

        jCDias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "2", "3", "4" }));
        getContentPane().add(jCDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 50, -1));

        jCMeses.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        getContentPane().add(jCMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 50, -1));

        bGOpciones.add(jRNo);
        jRNo.setContentAreaFilled(false);
        jRNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRNoMouseClicked(evt);
            }
        });
        getContentPane().add(jRNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, -1, -1));

        bGOpciones.add(jRSi);
        jRSi.setSelected(true);
        jRSi.setContentAreaFilled(false);
        getContentPane().add(jRSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, -1, -1));

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/baseRegistro.png"))); // NOI18N
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctelActionPerformed

    private void careaLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_careaLoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_careaLoteActionPerformed

    private void cotrosDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cotrosDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cotrosDatosActionPerformed

    private void clugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clugarActionPerformed

    private void careaConstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_careaConstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_careaConstActionPerformed

    private void cnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnombreActionPerformed

    private void ccorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccorreoActionPerformed

    private void botEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEstadisticasActionPerformed
        bot.abrirEstadisticas();
        this.setVisible(false);
    }//GEN-LAST:event_botEstadisticasActionPerformed

    private void cprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cprecioActionPerformed

    private void botBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botBusquedaActionPerformed
        bot.abrirBusqueda();
        this.setVisible(false);
    }//GEN-LAST:event_botBusquedaActionPerformed

    private void botInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botInformacionActionPerformed
        bot.abrirInformacion();
        this.setVisible(false);
    }//GEN-LAST:event_botInformacionActionPerformed

    private void botAdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAdministrarActionPerformed
        bot.abrirAdministrar();
        this.setVisible(false);
    }//GEN-LAST:event_botAdministrarActionPerformed

    private void Bot_MenuPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot_MenuPrincipal1ActionPerformed
        bot.abrirMenuPrincipal();
        this.setVisible(false);
    }//GEN-LAST:event_Bot_MenuPrincipal1ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        analisisPrecio();
        concatenarFecha();
        GenerarConsulta();
        ingresoEnTabla();
        log.pregunta("¿Desea registrar otro cliente?");
    }//GEN-LAST:event_guardarActionPerformed

    private void jCAnnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAnnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCAnnosActionPerformed

    private void jRNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRNoMouseClicked
        modoAvaluo();
    }//GEN-LAST:event_jRNoMouseClicked

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bot_MenuPrincipal1;
    private javax.swing.JLabel Wallpaper;
    private javax.swing.ButtonGroup bGOpciones;
    private javax.swing.JButton botAdministrar;
    private javax.swing.JButton botBusqueda;
    private javax.swing.JButton botEstadisticas;
    private javax.swing.JButton botInformacion;
    private javax.swing.JTextField careaConst;
    private javax.swing.JTextField careaLote;
    private javax.swing.JTextField ccorreo;
    private javax.swing.JTextField clugar;
    private javax.swing.JTextField cnombre;
    private javax.swing.JTextField cotrosDatos;
    private javax.swing.JTextField cprecio;
    private javax.swing.JFormattedTextField ctel;
    private javax.swing.JButton guardar;
    private javax.swing.JComboBox jCAnnos;
    private javax.swing.JComboBox jCDias;
    private javax.swing.JComboBox jCMeses;
    private javax.swing.JRadioButton jRNo;
    private javax.swing.JRadioButton jRSi;
    // End of variables declaration//GEN-END:variables
}
