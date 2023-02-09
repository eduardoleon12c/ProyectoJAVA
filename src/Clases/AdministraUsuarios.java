/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexiones.Conexion;
import Conexiones.Procedimientos;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdministraUsuarios extends javax.swing.JFrame {

    String ID;
    public static String IDEvento;
    public AdministraUsuarios() {
        initComponents();
        TxtUsuario.setText(LogueoA.Admin);
        cargarTabla();   
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
        BtnVolver = new javax.swing.JButton();
        BtnEliminaU = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxteIDE = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblEventosU = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel1.setText("Administra Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        TxtUsuario.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 24)); // NOI18N
        TxtUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 180, 40));

        BtnVolver.setText("Volver");
        BtnVolver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 70, -1));

        BtnEliminaU.setText("Eliminar");
        BtnEliminaU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnEliminaU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminaUActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEliminaU, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 450, 80, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Slab Medium", 0, 16)); // NOI18N
        jLabel2.setText("Introduzca ID Usuario que desea eliminar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));
        getContentPane().add(TxteIDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 160, -1));

        TblEventosU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TblEventosU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Usuario", "Username", "Nombre", "Apellido Paterno", "Apellido Materno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblEventosU);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 860, 230));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/fondog.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        BienvenidaA BA =new BienvenidaA();
        BA.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void BtnEliminaUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminaUActionPerformed
        IDEvento=TxteIDE.getText();
        try{
            Procedimientos.BAJA_USU(IDEvento);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        cargarTabla();
    }//GEN-LAST:event_BtnEliminaUActionPerformed

    private void cargarTabla(){
        int i=0,columnas;
        DefaultTableModel modeloTabla = (DefaultTableModel) TblEventosU.getModel();
        modeloTabla.setRowCount(0);
        try{
            CallableStatement TEU = Conexion.getConexion().prepareCall("{call TODOS_USU}");
            
            ResultSet rs = TEU.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            
            while(rs.next()){
                Object[] fila = new Object[columnas];
                for(i=0;i<columnas;i++){
                    fila[i] = rs.getObject(i+1);
                }
                modeloTabla.addRow(fila);
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
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
            java.util.logging.Logger.getLogger(AdministraUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministraUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministraUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministraUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministraUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminaU;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JTable TblEventosU;
    private javax.swing.JLabel TxtUsuario;
    private javax.swing.JTextField TxteIDE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}