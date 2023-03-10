/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexiones.Conexion;
import Conexiones.Procedimientos;
import java.sql.CallableStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Finanzas_CDMX
 */
public class BienvenidaA extends javax.swing.JFrame {

    /**
     * Creates new form BienvenidaU
     */
    public BienvenidaA() {
        initComponents();
        TxtUsuario.setText(LogueoA.Admin);
        cargarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnUsuarios = new javax.swing.JButton();
        BtnServicios = new javax.swing.JButton();
        BtnSillas = new javax.swing.JButton();
        BtnBebidas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        NumEventos = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        NumEventosFuturos = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        NumPersonas = new javax.swing.JLabel();
        BtnPaquetes = new javax.swing.JButton();
        BtnMontaje = new javax.swing.JButton();
        BtnPlatilllo = new javax.swing.JButton();
        BtnMantel = new javax.swing.JButton();
        BtnPago = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 48)); // NOI18N
        jLabel1.setText("??Bienvenido!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        TxtUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TxtUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 147, 48));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("A continuaci??n tienes las siguientes opciones...");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        BtnUsuarios.setText("Usuarios");
        BtnUsuarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(BtnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 90, -1));

        BtnServicios.setText("Servicios ");
        BtnServicios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnServiciosActionPerformed(evt);
            }
        });
        getContentPane().add(BtnServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 90, -1));

        BtnSillas.setText("Sillas");
        BtnSillas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSillasActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 70, -1));

        BtnBebidas.setText("Bebidas");
        BtnBebidas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBebidasActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 80, -1));

        jPanel2.setBackground(new java.awt.Color(251, 231, 228));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Roboto Slab Medium", 0, 16)); // NOI18N
        jLabel3.setText("Eventos atendidos:");

        NumEventos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        NumEventos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(NumEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumEventos, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        jPanel3.setBackground(new java.awt.Color(251, 231, 228));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Roboto Slab Medium", 0, 16)); // NOI18N
        jLabel4.setText("Eventos por atender:");

        NumEventosFuturos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        NumEventosFuturos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        NumEventosFuturos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(NumEventosFuturos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumEventosFuturos, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, 100));

        jPanel4.setBackground(new java.awt.Color(251, 231, 228));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Roboto Slab Medium", 0, 16)); // NOI18N
        jLabel5.setText("Personas atendidas:");

        NumPersonas.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        NumPersonas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(NumPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, -1, 100));

        BtnPaquetes.setText("Paquetes");
        BtnPaquetes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPaquetesActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPaquetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 80, -1));

        BtnMontaje.setText("Montajes");
        BtnMontaje.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnMontaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMontajeActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMontaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 90, -1));

        BtnPlatilllo.setText("Platillos");
        BtnPlatilllo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnPlatilllo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlatillloActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPlatilllo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 80, -1));

        BtnMantel.setText("Manteleria");
        BtnMantel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnMantel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMantelActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMantel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 100, -1));

        BtnPago.setText("Pago");
        BtnPago.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPagoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 60, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/fondog.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 820, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBebidasActionPerformed
        AdministraBebidas AB = new AdministraBebidas();
        AB.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnBebidasActionPerformed

    private void BtnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnServiciosActionPerformed
        AdministraServicios AS = new AdministraServicios();
        AS.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnServiciosActionPerformed

    private void BtnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsuariosActionPerformed
        AdministraUsuarios AU =new AdministraUsuarios();
        AU.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnUsuariosActionPerformed

    private void BtnSillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSillasActionPerformed
        AdministraSillas AS = new AdministraSillas();
        AS.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnSillasActionPerformed

    private void BtnPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPaquetesActionPerformed
        AdministraPaquetes AS = new AdministraPaquetes();
        AS.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnPaquetesActionPerformed

    private void BtnMontajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMontajeActionPerformed
        AdministraMontaje AS = new AdministraMontaje();
        AS.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnMontajeActionPerformed

    private void BtnPlatillloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlatillloActionPerformed
        AdministraPlatillos AS = new AdministraPlatillos();
        AS.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnPlatillloActionPerformed

    private void BtnMantelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMantelActionPerformed
        AdministraMantel AS = new AdministraMantel();
        AS.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnMantelActionPerformed

    private void BtnPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPagoActionPerformed
        AdministrarPagos AS = new AdministrarPagos();
        AS.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnPagoActionPerformed

    private void cargarDatos(){
        String dato="";
        try{
            dato=Procedimientos.CR_EVENTOS_REALI();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        NumEventos.setText(dato);
        
        try{
            dato=Procedimientos.CR_EVENTOS_FALT();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        NumEventosFuturos.setText(dato);
        
        
        try{
            dato=Procedimientos.CR_PERSONAS_REALI();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        NumPersonas.setText(dato);
        
    }
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
            java.util.logging.Logger.getLogger(BienvenidaA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BienvenidaA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BienvenidaA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BienvenidaA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BienvenidaA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBebidas;
    private javax.swing.JButton BtnMantel;
    private javax.swing.JButton BtnMontaje;
    private javax.swing.JButton BtnPago;
    private javax.swing.JButton BtnPaquetes;
    private javax.swing.JButton BtnPlatilllo;
    private javax.swing.JButton BtnServicios;
    private javax.swing.JButton BtnSillas;
    private javax.swing.JButton BtnUsuarios;
    private javax.swing.JLabel NumEventos;
    private javax.swing.JLabel NumEventosFuturos;
    private javax.swing.JLabel NumPersonas;
    private javax.swing.JLabel TxtUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
