package ud1.compoñentesgraficos.resumencomponentes;

import ud1.Cliente;
import ud1.BBDD;
import javax.swing.DefaultListModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author alumno
 */
public class RComponentes extends javax.swing.JFrame {

    /**
     * Creates new form RComponentes
     */
    private DefaultListModel modeloClientes;
    private BBDD basedatos;

    public RComponentes() {
        initComponents();
        basedatos = BBDD.getInstance();
        modeloClientes = new DefaultListModel();
        jList2.setModel(modeloClientes);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNorte = new javax.swing.JPanel();
        jLabelSingle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListSingle = new javax.swing.JList<>();
        jLabelMultiple = new javax.swing.JLabel();
        jScrollPaneMultiple = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButtonAceptar2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonAceptar3 = new javax.swing.JButton();
        jPanelCentro = new javax.swing.JPanel();
        jPanelBotonesCentro = new javax.swing.JPanel();
        jButtonObtenerCliente = new javax.swing.JButton();
        jButtonLimpiarLista = new javax.swing.JButton();
        jButtonBorrar1Cliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jPanelSur = new javax.swing.JPanel();
        jLabelDNI = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelNorte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelNorte.setOpaque(false);
        jPanelNorte.setPreferredSize(new java.awt.Dimension(852, 200));

        jLabelSingle.setText("SelectionModel = Single");

        jListSingle.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "A coruña ", "Lugo", "Ourense", "Pontevedra" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListSingle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListSingle);

        jLabelMultiple.setText("SelectionModel = Multiple (Un JComboBox no tiene selección multiple)");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "A coruña", "Lugo", "Ourense", "Pontevedra", "Sevilla", "Madrid", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneMultiple.setViewportView(jList1);

        jButtonAceptar2.setText("Aceptar");
        jButtonAceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptar2ActionPerformed(evt);
            }
        });

        jButtonAceptar3.setText("Aceptar");
        jButtonAceptar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNorteLayout = new javax.swing.GroupLayout(jPanelNorte);
        jPanelNorte.setLayout(jPanelNorteLayout);
        jPanelNorteLayout.setHorizontalGroup(
            jPanelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNorteLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNorteLayout.createSequentialGroup()
                        .addComponent(jLabelSingle)
                        .addGap(139, 139, 139)
                        .addComponent(jLabelMultiple))
                    .addGroup(jPanelNorteLayout.createSequentialGroup()
                        .addGroup(jPanelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelNorteLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAceptar3)
                                .addGap(68, 68, 68)
                                .addComponent(jScrollPaneMultiple, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAceptar2)))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanelNorteLayout.setVerticalGroup(
            jPanelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNorteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelNorteLayout.createSequentialGroup()
                        .addGroup(jPanelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSingle)
                            .addComponent(jLabelMultiple))
                        .addGroup(jPanelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelNorteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneMultiple, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelNorteLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButtonAceptar2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNorteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAceptar3)
                                .addGap(42, 42, 42)))))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelNorte, java.awt.BorderLayout.PAGE_START);

        jPanelCentro.setMaximumSize(new java.awt.Dimension(852, 150));
        jPanelCentro.setMinimumSize(new java.awt.Dimension(852, 150));
        jPanelCentro.setPreferredSize(new java.awt.Dimension(852, 150));

        jButtonObtenerCliente.setText("ObtenerCliente");
        jButtonObtenerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonObtenerClienteActionPerformed(evt);
            }
        });

        jButtonLimpiarLista.setText("LimpiarLista");
        jButtonLimpiarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarListaActionPerformed(evt);
            }
        });

        jButtonBorrar1Cliente.setText("Borrar 1 Cliente");
        jButtonBorrar1Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrar1ClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesCentroLayout = new javax.swing.GroupLayout(jPanelBotonesCentro);
        jPanelBotonesCentro.setLayout(jPanelBotonesCentroLayout);
        jPanelBotonesCentroLayout.setHorizontalGroup(
            jPanelBotonesCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonesCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonBorrar1Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jButtonLimpiarLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonObtenerCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanelBotonesCentroLayout.setVerticalGroup(
            jPanelBotonesCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesCentroLayout.createSequentialGroup()
                .addComponent(jButtonObtenerCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLimpiarLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBorrar1Cliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jList2);

        jLabel1.setText("Clientes");

        javax.swing.GroupLayout jPanelCentroLayout = new javax.swing.GroupLayout(jPanelCentro);
        jPanelCentro.setLayout(jPanelCentroLayout);
        jPanelCentroLayout.setHorizontalGroup(
            jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentroLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCentroLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelCentroLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelBotonesCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelCentroLayout.setVerticalGroup(
            jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCentroLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelBotonesCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanelCentro, java.awt.BorderLayout.CENTER);

        jPanelSur.setPreferredSize(new java.awt.Dimension(852, 150));
        jPanelSur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDNI.setText("DNI");
        jPanelSur.add(jLabelDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jTextFieldDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDNIActionPerformed(evt);
            }
        });
        jPanelSur.add(jTextFieldDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 110, -1));

        jLabelNombre.setText("Nombre");
        jPanelSur.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });
        jPanelSur.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 180, -1));

        jLabelDireccion.setText("Dirección");
        jPanelSur.add(jLabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));
        jPanelSur.add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 230, -1));

        jLabelTelefono.setText("Teléfono");
        jPanelSur.add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));
        jPanelSur.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 110, -1));

        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelSur.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        getContentPane().add(jPanelSur, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDNIActionPerformed

    private void jButtonObtenerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonObtenerClienteActionPerformed
        this.modeloClientes.removeAllElements();
        for (Cliente obtenerCliente : this.basedatos.obtenerClientes()) {
            modeloClientes.addElement(obtenerCliente);

        }
    }//GEN-LAST:event_jButtonObtenerClienteActionPerformed

    private void jButtonLimpiarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarListaActionPerformed
        this.modeloClientes.removeAllElements();
    }//GEN-LAST:event_jButtonLimpiarListaActionPerformed

    private void jButtonAceptar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptar3ActionPerformed
        if (jListSingle.getSelectedIndex() == -1) {
            jLabel2.setText("Ninguna provincia seleccionada");
        } else {
            this.jLabel2.setText("Ha selecionado " + this.jListSingle.getSelectedValue());

        }
    }//GEN-LAST:event_jButtonAceptar3ActionPerformed

    private void jButtonAceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptar2ActionPerformed
        if (jList1.getSelectedIndex() == 0) {
            jLabel2.setText("Ninguna provincia seleccionada");
        } else {
            StringBuilder s = new StringBuilder();
            s.append("Ha selecionado: ");
            for (String st : jList1.getSelectedValuesList()) {
                s.append(st).append(", ");

            }
            this.jLabel2.setText(s.toString());

        }

    }//GEN-LAST:event_jButtonAceptar2ActionPerformed

    private void jButtonBorrar1ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrar1ClienteActionPerformed
        int indice = jList2.getSelectedIndex();

        if (indice > -1) {
            Cliente cliente = (Cliente) modeloClientes.get(indice);
            basedatos.eliminarCliente(cliente.getDni());
            modeloClientes.remove(indice);
        }

    }//GEN-LAST:event_jButtonBorrar1ClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cliente cliente = null;
        if (jTextFieldDNI.contains(0, jTextFieldDNI.getText().length() - 1)
                && textNombre.contains(0, textNombre.getText().length() - 1)
                && jTextFieldDireccion.contains(0, jTextFieldDireccion.getText().length() - 1)
                && jTextFieldTelefono.contains(0, jTextFieldTelefono.getText().length() - 1)) {
            cliente = new Cliente(jTextFieldDNI.getText(), textNombre.getText(), jTextFieldDireccion.getText(), jTextFieldTelefono.getText());
            basedatos.agregarCliente(cliente);
            modeloClientes.addElement(cliente);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

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
            java.util.logging.Logger.getLogger(RComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RComponentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAceptar2;
    private javax.swing.JButton jButtonAceptar3;
    private javax.swing.JButton jButtonBorrar1Cliente;
    private javax.swing.JButton jButtonLimpiarLista;
    private javax.swing.JButton jButtonObtenerCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelMultiple;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSingle;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jListSingle;
    private javax.swing.JPanel jPanelBotonesCentro;
    private javax.swing.JPanel jPanelCentro;
    private javax.swing.JPanel jPanelNorte;
    private javax.swing.JPanel jPanelSur;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneMultiple;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
