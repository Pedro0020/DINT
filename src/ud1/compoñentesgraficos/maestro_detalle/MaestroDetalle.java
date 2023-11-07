/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ud1.compoñentesgraficos.maestro_detalle;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import ud1.compoñentesgraficos.Articulo;
import ud1.compoñentesgraficos.BBDD;
import ud1.compoñentesgraficos.Venta;

/**
 *
 * @author neo
 */
public class MaestroDetalle extends javax.swing.JFrame {

    private DefaultTableModel modeloArticulos;
    private DefaultTableModel modeloVentas;
    private BBDD basedatos;

    /**
     * Creates new form Tarefa10
     */
    public MaestroDetalle() {
        initComponents();
        basedatos = new BBDD();
        modeloArticulos = new DefaultTableModel();
        modeloVentas = new DefaultTableModel();
        this.jTable4.setModel(modeloArticulos);
        this.jTable5.setModel(modeloVentas);
        modeloArticulos.addColumn("Código");
        modeloArticulos.addColumn("Artículo");
        modeloArticulos.addColumn("Unidad");
        modeloArticulos.addColumn("Cantidad");
        modeloArticulos.addColumn("Precio");
        modeloArticulos.addColumn("Importe");
        modeloArticulos.addColumn("Seleccion");
        for (Articulo a : this.basedatos.obtenerArticulos()) {
            modeloArticulos.addRow(new String[]{a.getCodigo(), a.getArticulo(), a.getUnidad(), a.getCantidad() + "", a.getPrecio() + "", a.getImporte() + ""});

        }
        modeloVentas.addColumn("Código");
        modeloVentas.addColumn("Fecha");
        modeloVentas.addColumn("Codigo Cliente");
        modeloVentas.addColumn("Nombre");
        modeloVentas.addColumn("Cantidad");
        modeloVentas.addColumn("Precio");
        modeloVentas.addColumn("Importe Venta");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbMod1 = new javax.swing.JLabel();
        lMod2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnEliminarVentaSelecionada = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        textCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textFecha = new javax.swing.JTextField();
        textCantidad = new javax.swing.JTextField();
        textPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        btnAñadirVenta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setPreferredSize(new java.awt.Dimension(587, 165));

        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jTable4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable4KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel4.setMaximumSize(new java.awt.Dimension(587, 165));
        jPanel4.setMinimumSize(new java.awt.Dimension(587, 165));
        jPanel4.setPreferredSize(new java.awt.Dimension(587, 165));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jLabel1.setText("Movimientos del Artículo:");

        jLabel2.setText("Código y nombre del articulo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lbMod1)
                .addGap(134, 134, 134)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(lMod2)
                .addContainerGap(350, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lbMod1)
                    .addComponent(lMod2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel6.setPreferredSize(new java.awt.Dimension(587, 165));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jPanel8.setRequestFocusEnabled(false);

        btnEliminarVentaSelecionada.setText("Eliminar Venta Seleccionada");
        btnEliminarVentaSelecionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentaSelecionadaActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setAutoscrolls(true);
        jPanel7.setMaximumSize(new java.awt.Dimension(649, 169));
        jPanel7.setMinimumSize(new java.awt.Dimension(649, 100));
        jPanel7.setPreferredSize(new java.awt.Dimension(500, 165));

        textCodigo.setPreferredSize(new java.awt.Dimension(100, 23));
        textCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo");

        jLabel4.setText("Fecha");

        jLabel5.setText("Cantidad");

        jLabel6.setText("Precio");

        textFecha.setPreferredSize(new java.awt.Dimension(100, 23));

        textCantidad.setPreferredSize(new java.awt.Dimension(100, 23));

        textPrecio.setPreferredSize(new java.awt.Dimension(100, 23));

        jLabel7.setText("Código Cliente");

        jLabel8.setText("Nombre Cliente");

        txtCodigoCliente.setPreferredSize(new java.awt.Dimension(100, 23));
        txtCodigoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoClienteActionPerformed(evt);
            }
        });

        txtNombreCliente.setPreferredSize(new java.awt.Dimension(100, 23));

        btnAñadirVenta.setText("Añadir Venta");
        btnAñadirVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirVentaActionPerformed(evt);
            }
        });

        jButton1.setText("Modificar Venta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(39, 39, 39)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAñadirVenta)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadirVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton1))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(btnEliminarVentaSelecionada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnEliminarVentaSelecionada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.add(jPanel8);

        getContentPane().add(jPanel6, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarVentaSelecionadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaSelecionadaActionPerformed
        this.modeloVentas.removeRow(this.jTable5.getSelectedRow());
        this.textCodigo.setText("");
        this.textFecha.setText("");
        this.textCantidad.setText("");
        this.textPrecio.setText("");
        this.txtCodigoCliente.setText("");
        this.txtNombreCliente.setText("");
    }//GEN-LAST:event_btnEliminarVentaSelecionadaActionPerformed

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigoActionPerformed

    private void txtCodigoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoClienteActionPerformed

    private void jTable4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable4KeyPressed
    }//GEN-LAST:event_jTable4KeyPressed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        this.lMod2.setText((this.jTable4.getValueAt(jTable4.getSelectedRow(), 0)
                + ", " + this.jTable4.getValueAt(jTable4.getSelectedRow(), 1)));
        this.lbMod1.setText(jTable5.getRowCount()+"");
       this.modeloVentas.setRowCount(0);
        actualizarTabla5();
    }//GEN-LAST:event_jTable4MouseClicked

    public void actualizarTabla5() {
        for (Venta v : this.basedatos.obtenerVentas()) {
            if (v.getCodArt().equals((String) this.jTable4.getValueAt(jTable4.getSelectedRow(), 0))) {
                modeloVentas.addRow(new String[]{v.getCodigo(), v.getFecha(), v.getCodCli(),
                    this.basedatos.obtenerClientePorDNI(v.getCodCli()).getNombre(),
                    v.getCantidad() + "", v.getPrecio() + "", (v.getPrecio() * v.getCantidad()) + ""});
            }
        }
    }

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked

        this.textCodigo.setText((String) this.jTable5.getValueAt(jTable5.getSelectedRow(), 0));
        this.textFecha.setText((String) this.jTable5.getValueAt(jTable5.getSelectedRow(), 1));
        this.textCantidad.setText((String) this.jTable5.getValueAt(jTable5.getSelectedRow(), 4));
        this.textPrecio.setText((String) this.jTable5.getValueAt(jTable5.getSelectedRow(), 5));
        this.txtCodigoCliente.setText((String) this.jTable5.getValueAt(jTable5.getSelectedRow(), 2));
        this.txtNombreCliente.setText((String) this.jTable5.getValueAt(jTable5.getSelectedRow(), 3));
    }//GEN-LAST:event_jTable5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!txtCodigoCliente.getText().isEmpty() && !txtNombreCliente.getText().isEmpty()
                && !textCantidad.getText().isEmpty() && !textCodigo.getText().isEmpty()
                && !textFecha.getText().isEmpty() && !textPrecio.getText().isEmpty()
                && jTable4.getSelectedRow() > -1 && jTable5.getSelectedRow() > -1) {

            Venta v = new Venta(textCodigo.getText(),
                    textFecha.getText(),
                    txtCodigoCliente.getText() + "",
                    (String) jTable4.getValueAt(jTable4.getSelectedRow(), NORMAL),
                    Integer.parseInt(textCantidad.getText()),
                    Integer.parseInt(textPrecio.getText()));
            this.basedatos.actualizarVenta((String) jTable5.getValueAt(jTable5.getSelectedRow(), 0), v);
            this.modeloVentas.setRowCount(0);
            actualizarTabla5();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAñadirVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirVentaActionPerformed
        boolean cont = true;
        if (!txtCodigoCliente.getText().isEmpty() && !txtNombreCliente.getText().isEmpty()
                && !textCantidad.getText().isEmpty() && !textCodigo.getText().isEmpty()
                && !textFecha.getText().isEmpty() && !textPrecio.getText().isEmpty()) {

            Venta v = new Venta(textCodigo.getText(),
                    textFecha.getText(),
                    txtCodigoCliente.getText() + "",
                    (String) jTable4.getValueAt(jTable4.getSelectedRow(), NORMAL),
                    Integer.parseInt(textCantidad.getText()),
                    Integer.parseInt(textPrecio.getText()));
            for (Venta vent : this.basedatos.obtenerVentas()) {

                if (vent.getCodigo().equals(v.getCodigo()) && vent.getCodArt().equals((String) this.jTable4.getValueAt(jTable4.getSelectedRow(), 0))) {
                    cont = false;
                }

            }
            if (cont) {
                this.basedatos.agregarVenta(v);
                this.modeloVentas.setRowCount(0);
                actualizarTabla5();
            }
        }
     }//GEN-LAST:event_btnAñadirVentaActionPerformed

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
            java.util.logging.Logger.getLogger(MaestroDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaestroDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaestroDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaestroDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaestroDetalle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirVenta;
    private javax.swing.JButton btnEliminarVentaSelecionada;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JLabel lMod2;
    private javax.swing.JLabel lbMod1;
    private javax.swing.JTextField textCantidad;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textFecha;
    private javax.swing.JTextField textPrecio;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
