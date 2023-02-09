/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexiones.Conexion;
import Conexiones.Procedimientos;
import java.awt.Image;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdministraMontaje extends javax.swing.JFrame {

    String Nombre,  ID, Descripcion, Img;
    
    public AdministraMontaje() {
        initComponents();
        cargarPaquete();
        
    }
    
    private void cargarPaquete(){
        int i=0,columnas;
        DefaultTableModel modeloTabla = (DefaultTableModel) TblMon.getModel();
        modeloTabla.setRowCount(0);
        try{
            CallableStatement TEU = Conexion.getConexion().prepareCall("{call TODOS_MONTAJES()}");
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblMon = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        TxteID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtaDescripcion = new javax.swing.JTextArea();
        TxteNombre = new javax.swing.JTextField();
        BtnAlta = new javax.swing.JButton();
        BtnBaja = new javax.swing.JButton();
        BtnCambios = new javax.swing.JButton();
        BtnVolver = new javax.swing.JButton();
        TxtImg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 48)); // NOI18N
        jLabel1.setText("ADMINISTRAR MONTAJES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        TblMon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TblMon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "DESCRIPCION", "MONTAJE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TblMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblMonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblMon);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 117, -1, 170));

        jPanel1.setBackground(new java.awt.Color(251, 231, 228));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxteID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxteIDActionPerformed(evt);
            }
        });
        jPanel1.add(TxteID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 170, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Slab Medium", 0, 16)); // NOI18N
        jLabel2.setText("ID: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Slab Medium", 0, 16)); // NOI18N
        jLabel3.setText("DESCRIPCIÓN:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Slab Medium", 0, 16)); // NOI18N
        jLabel4.setText("NOMBRE:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        TxtaDescripcion.setColumns(20);
        TxtaDescripcion.setRows(5);
        jScrollPane2.setViewportView(TxtaDescripcion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 243, 69));

        TxteNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxteNombreActionPerformed(evt);
            }
        });
        jPanel1.add(TxteNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 410, 228));

        BtnAlta.setText("ALTA");
        BtnAlta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAltaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 70, -1));

        BtnBaja.setText("BAJA");
        BtnBaja.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 70, -1));

        BtnCambios.setText("CAMBIOS");
        BtnCambios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCambiosActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, 90, -1));

        BtnVolver.setText("Volver");
        BtnVolver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 80, -1));

        TxtImg.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(TxtImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 200, 180));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/fondog.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxteIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxteIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxteIDActionPerformed

    private void TxteNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxteNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxteNombreActionPerformed

    private void BtnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAltaActionPerformed
        ID=TxteID.getText();
        Nombre=TxteNombre.getText();
        Descripcion=TxtaDescripcion.getText();
        
        try{
            Procedimientos.ALTA_MONTAJE(Nombre, Descripcion);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        cargarPaquete();
        
        JOptionPane.showMessageDialog(null, "Se ha dado de alta exitosamente");
    }//GEN-LAST:event_BtnAltaActionPerformed

    private void BtnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaActionPerformed
        ID=TxteID.getText();
        Nombre=TxteNombre.getText();
        Descripcion=TxtaDescripcion.getText();
        
        try{
            Procedimientos.BAJA_MONTAJE(ID);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        cargarPaquete();
        
        JOptionPane.showMessageDialog(null, "Se ha dado de baja exitosamente");
        
    }//GEN-LAST:event_BtnBajaActionPerformed

    private void BtnCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCambiosActionPerformed
        ID=TxteID.getText();
        Nombre=TxteNombre.getText();
        Descripcion=TxtaDescripcion.getText();
        
        try{
            Procedimientos.CAMB_MONTAJE(ID,Nombre, Descripcion);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        cargarPaquete();
        
        JOptionPane.showMessageDialog(null, "Se ha cambiado exitosamente");
    }//GEN-LAST:event_BtnCambiosActionPerformed

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        BienvenidaA BA = new BienvenidaA();
        BA.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void TblMonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblMonMouseClicked
        int filaseleccionada=TblMon.rowAtPoint(evt.getPoint());
        String Imagen=TblMon.getValueAt(filaseleccionada, 0).toString();
        
        if(Imagen=="001"){
            ImageIcon wallpaper = new ImageIcon("src/Iconos/escuela.jpeg");
            Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(TxtImg.getWidth(), TxtImg.getHeight(), Image.SCALE_DEFAULT));
            TxtImg.setIcon(icono);
        }else if(Imagen=="002"){
            ImageIcon wallpaper = new ImageIcon("src/Iconos/cocktail.png");
            Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(TxtImg.getWidth(), TxtImg.getHeight(), Image.SCALE_DEFAULT));
            TxtImg.setIcon(icono);
        }else if(Imagen=="003"){
            ImageIcon wallpaper = new ImageIcon("src/Iconos/auditorio.jpeg");
            Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(TxtImg.getWidth(), TxtImg.getHeight(), Image.SCALE_DEFAULT));
            TxtImg.setIcon(icono);
        }else if(Imagen=="004"){
            ImageIcon wallpaper = new ImageIcon("src/Iconos/herradura.jpeg");
            Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(TxtImg.getWidth(), TxtImg.getHeight(), Image.SCALE_DEFAULT));
            TxtImg.setIcon(icono);
        }else if(Imagen=="005"){
            ImageIcon wallpaper = new ImageIcon("src/Iconos/espiga.webp");
            Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(TxtImg.getWidth(), TxtImg.getHeight(), Image.SCALE_DEFAULT));
            TxtImg.setIcon(icono);
        }else if(Imagen=="006"){
            ImageIcon wallpaper = new ImageIcon("src/Iconos/mesaredonda.jpeg");
            Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(TxtImg.getWidth(), TxtImg.getHeight(), Image.SCALE_DEFAULT));
            TxtImg.setIcon(icono);
        }else if(Imagen=="007"){
            ImageIcon wallpaper = new ImageIcon("src/Iconos/medialuna.jpeg");
            Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(TxtImg.getWidth(), TxtImg.getHeight(), Image.SCALE_DEFAULT));
            TxtImg.setIcon(icono);
        }else if(Imagen=="008"){
            ImageIcon wallpaper = new ImageIcon("src/Iconos/imperial.jpeg");
            Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(TxtImg.getWidth(), TxtImg.getHeight(), Image.SCALE_DEFAULT));
            TxtImg.setIcon(icono);
        }else if(Imagen=="009"){
            ImageIcon wallpaper = new ImageIcon("src/Iconos/banquete.jpeg");
            Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(TxtImg.getWidth(), TxtImg.getHeight(), Image.SCALE_DEFAULT));
            TxtImg.setIcon(icono);
        }
        
        
        /*ImageIcon wallpaper = new ImageIcon("src/Iconos/");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(TxtImg.getWidth(), TxtImg.getHeight(), Image.SCALE_DEFAULT));
        TxtImg.setIcon(icono);*/
        
    }//GEN-LAST:event_TblMonMouseClicked

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
            java.util.logging.Logger.getLogger(AdministraMontaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministraMontaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministraMontaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministraMontaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministraMontaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlta;
    private javax.swing.JButton BtnBaja;
    private javax.swing.JButton BtnCambios;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JTable TblMon;
    private javax.swing.JLabel TxtImg;
    private javax.swing.JTextArea TxtaDescripcion;
    private javax.swing.JTextField TxteID;
    private javax.swing.JTextField TxteNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
