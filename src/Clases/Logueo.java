/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexiones.Conexion;
import Conexiones.Procedimientos;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Finanzas_CDMX
 */
public class Logueo extends javax.swing.JFrame {

    String Usu,Contra;
    public static String Usuario;
    public static String IDUsuario;
    //static String Usuario;
    public Logueo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnLogin = new javax.swing.JButton();
        BtnAtras = new javax.swing.JButton();
        TxtpPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxteUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BtnLogin.setText("Login");
        BtnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(BtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, 100, -1));

        BtnAtras.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BtnAtras.setText("Atras");
        BtnAtras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 90, -1));

        TxtpPassword.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(TxtpPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 360, -1));

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 56)); // NOI18N
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logo.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 210, 170));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/contra2.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 60, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/usuario2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 390, 60, 50));

        TxteUsuario.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        TxteUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxteUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TxteUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 360, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/fondog.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed

        LoginR.LR.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        Conexion con = new Conexion();
        con.getConexion();
        //Usuario=TxtUsuario.getText();
        IDUsuario="nada";
        Usu=TxteUsuario.getText();
        Contra= new String(TxtpPassword.getPassword());
        
        try{
            IDUsuario=Procedimientos.OBTEN_USU(Usu, Contra);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        if (IDUsuario.contentEquals("nada"))
            JOptionPane.showMessageDialog(null, "Problema con usuario y/o contraseña"+IDUsuario);
        else{
            JOptionPane.showMessageDialog(null, "Ingreso con"+IDUsuario);
            BU.setVisible(true);
            this.setVisible(false);
        }

        Usuario=Usu;
    
    }//GEN-LAST:event_BtnLoginActionPerformed

    private void TxteUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxteUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxteUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                L.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnLogin;
    private javax.swing.JTextField TxteUsuario;
    private javax.swing.JPasswordField TxtpPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

public static Logueo L = new Logueo();
public static DatosEventoU DE = new DatosEventoU();
public static BienvenidaU BU = new BienvenidaU();

}