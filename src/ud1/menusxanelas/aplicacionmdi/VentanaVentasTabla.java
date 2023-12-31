/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ud1.menusxanelas.aplicacionmdi;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import ud1.BBDD;
import ud1.Venta;

/**
 *
 * @author neo
 */
public class VentanaVentasTabla extends javax.swing.JInternalFrame {

    private BBDD datos;
    private DefaultTableModel modelo;
    private javax.swing.JInternalFrame v;

    /**
     * Creates new form VentaVentasTabla
     */
    public VentanaVentasTabla( javax.swing.JInternalFrame v) {
        this.datos = BBDD.getInstance();
        this.v = v;
        ArrayList<Venta> data = this.datos.obtenerVentas();
        this.modelo = new DefaultTableModel();
        String[] columnNames = {"Codigo", "Fecha", "CodClientes", "CodArticulo",
            "Cantidad", "Precio", "Importe"};
        for (String col : columnNames) {
            this.modelo.addColumn(col);
        }
        for (Venta venta : data) {
            this.modelo.addRow(new String[]{venta.getCodigo(), venta.getFecha(),
                venta.getCodCli(), venta.getCodArt(), venta.getCantidad() + "", venta.getPrecio() + "",
                venta.getImporte() + ""});
        }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jTable1.setModel(this.modelo);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String codigo = (String) this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 0);
        if (this.v instanceof VentanaVentasMod ve) {
            ve.datosVenta(codigo);
        }

        dispose();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed

    }//GEN-LAST:event_jTable1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
