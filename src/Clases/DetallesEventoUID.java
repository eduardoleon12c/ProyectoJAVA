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


public class DetallesEventoUID extends javax.swing.JFrame {

    String ID;
    
    public DetallesEventoUID() {
        ID = Clases.EventosUsuario.IDEvento;
        initComponents();
        
        cargarTablaEvento(ID);
        cargarTablaTotal(ID);
        cargarTablaDeuda(ID);
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
        TblEvento = new javax.swing.JTable();
        BtnAtras = new javax.swing.JButton();
        BtnBebidas = new javax.swing.JButton();
        BtnMenu = new javax.swing.JButton();
        BtnContrataciones = new javax.swing.JButton();
        BtnCambEvento = new javax.swing.JButton();
        BtnElimEvento = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TblDeuda = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TblTotal = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel1.setText("Detalles de Evento");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        TblEvento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TblEvento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Evento", "Tipo Evento", "Hora Inicio", "Hora Fin", "Fecha", "Num. Personas", "Playlist", "Nombre Paquete", "Horas de Servicio", "Tiempos Comida", "Material Mantel", "Color Mantel", "Imagen", "Montaje", "Descripcion", "Imagen", "Sillas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblEvento);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1240, 130));

        BtnAtras.setText("Atras");
        BtnAtras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 70, -1));

        BtnBebidas.setText("Mostrar Bebidas");
        BtnBebidas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBebidasActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 140, -1));

        BtnMenu.setText("Mostrar Menú");
        BtnMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 120, -1));

        BtnContrataciones.setText("Mostrar Contrataciones");
        BtnContrataciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnContrataciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContratacionesActionPerformed(evt);
            }
        });
        getContentPane().add(BtnContrataciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 190, -1));

        BtnCambEvento.setText("Modificar Detalles de Evento");
        BtnCambEvento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCambEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCambEventoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCambEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 220, -1));

        BtnElimEvento.setText("Eliminar Evento");
        BtnElimEvento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnElimEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElimEventoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnElimEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 260, 130, -1));

        TblDeuda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TblDeuda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Dinero a Pagar", "% Pagado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(TblDeuda);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 368, 94));

        TblTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TblTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Costo Total E"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(TblTotal);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 291, 85));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/fondog.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        EventosUsuario EU = new EventosUsuario();
        EU.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void BtnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBebidasActionPerformed
        BebidasEventoU BEU = new BebidasEventoU();
        BEU.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnBebidasActionPerformed

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        MenuEventoU MEU = new MenuEventoU();
        MEU.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnMenuActionPerformed

    private void BtnCambEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCambEventoActionPerformed
        ModificarDetallesEventoU MDEU = new ModificarDetallesEventoU();
        MDEU.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnCambEventoActionPerformed

    private void BtnElimEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElimEventoActionPerformed
        try{
            Procedimientos.BAJA_EVENTO(ID);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se elimino");
        }
        JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
        EventosUsuario EU = new EventosUsuario();
        EU.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnElimEventoActionPerformed

    private void BtnContratacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContratacionesActionPerformed
        ContratacionesU CU = new ContratacionesU();
        CU.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnContratacionesActionPerformed

    
    private void cargarTablaEvento(String IDEVENTO){
        int i=0,columnas;
        DefaultTableModel modeloTabla = (DefaultTableModel) TblEvento.getModel();
        //DefaultTableModel modeloTabla = (DefaultTableModel)TblPaquete.getModel();
        modeloTabla.setRowCount(0);
        try{
            CallableStatement TEU = Conexion.getConexion().prepareCall("{call EVENTO_ID(?)}");
            TEU.setString(1, IDEVENTO);
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
    
    private void cargarTablaTotal(String IDEVENTO){
        int i=0,columnas;
        DefaultTableModel modeloTabla = (DefaultTableModel) TblTotal.getModel();
        //DefaultTableModel modeloTabla = (DefaultTableModel)TblPaquete.getModel();
        modeloTabla.setRowCount(0);
        try{
            CallableStatement TEU = Conexion.getConexion().prepareCall("{call CR_EVENTO(?)}");
            TEU.setString(1, IDEVENTO);
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
    
    private void cargarTablaDeuda(String IDEVENTO){
        int i=0,columnas;
        DefaultTableModel modeloTabla = (DefaultTableModel) TblDeuda.getModel();
        //DefaultTableModel modeloTabla = (DefaultTableModel)TblPaquete.getModel();
        modeloTabla.setRowCount(0);
        try{
            CallableStatement TEU = Conexion.getConexion().prepareCall("{call CR_EVENTO_DEUDA(?)}");
            TEU.setString(1, IDEVENTO);
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
            java.util.logging.Logger.getLogger(DetallesEventoUID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetallesEventoUID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetallesEventoUID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetallesEventoUID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetallesEventoUID().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnBebidas;
    private javax.swing.JButton BtnCambEvento;
    private javax.swing.JButton BtnContrataciones;
    private javax.swing.JButton BtnElimEvento;
    private javax.swing.JButton BtnMenu;
    private javax.swing.JTable TblDeuda;
    private javax.swing.JTable TblEvento;
    private javax.swing.JTable TblTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}