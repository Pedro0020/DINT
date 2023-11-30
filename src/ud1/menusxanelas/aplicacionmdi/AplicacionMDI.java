/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ud1.menusxanelas.aplicacionmdi;

/**
 *
 * @author neo
 */
public class AplicacionMDI extends javax.swing.JFrame {

    private VentanaProductos ventanaProductos;
    private VentanaClientes ventanaClientes;
    private VentanaVentasMod ventanaInsertar;
    private VentanaBackUp ventanaBackUp;
    private VentanaInformacion ventanaInfo;
    private VentanaVentasClientes ventanaVentasCliente;
    private VentanaVentasArticulos ventanaVentasArticulos;

    /**
     * Creates new form AplicacionMDI
     */
    public AplicacionMDI() {
        ventanaInsertar = null;
        ventanaVentasCliente = null;
        ventanaVentasArticulos = null;
        ventanaInfo = null;
        ventanaBackUp = null;
        ventanaProductos = null;
        ventanaClientes = null;
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

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProductos = new javax.swing.JMenu();
        menuClientes = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemCl = new javax.swing.JMenuItem();
        jMenuItemPr = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        getContentPane().add(escritorio, java.awt.BorderLayout.CENTER);

        menuProductos.setText("Productos");
        menuProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProductosMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuProductos);

        menuClientes.setText(" Clientes");
        menuClientes.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuClientesMenuSelected(evt);
            }
        });
        menuClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuClientesMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuClientes);

        jMenu1.setText("Ventas");

        jMenuItem1.setText("Insertar/Actualizar");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItemCl.setText("Ventas por Cliente");
        jMenuItemCl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemClMouseClicked(evt);
            }
        });
        jMenuItemCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCl);

        jMenuItemPr.setText("Ventas por Producto");
        jMenuItemPr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemPrMouseClicked(evt);
            }
        });
        jMenuItemPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPrActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemPr);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("BackUp ");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Info");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuClientesMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuClientesMenuSelected

    }//GEN-LAST:event_menuClientesMenuSelected

    private void menuClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuClientesMouseClicked
        if (ventanaClientes == null || !ventanaClientes.isVisible()) {
            ventanaClientes = new VentanaClientes();
            this.escritorio.add(ventanaClientes);
            ventanaClientes.show();
        }
    }//GEN-LAST:event_menuClientesMouseClicked

    private void menuProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductosMouseClicked
        if (ventanaProductos == null || !ventanaProductos.isVisible()) {
            ventanaProductos = new VentanaProductos();
            this.escritorio.add(ventanaProductos);
            ventanaProductos.show();
        }
    }//GEN-LAST:event_menuProductosMouseClicked

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked

    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (ventanaInsertar == null || !ventanaInsertar.isVisible()) {
            ventanaInsertar = new VentanaVentasMod();
            this.escritorio.add(ventanaInsertar);
            ventanaInsertar.show();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        if (ventanaBackUp == null || !ventanaBackUp.isVisible()) {
            ventanaBackUp = new VentanaBackUp();
            this.escritorio.add(ventanaBackUp);
            ventanaBackUp.show();
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        if (ventanaInfo == null || !ventanaInfo.isVisible()) {
            ventanaInfo = new VentanaInformacion();
            this.escritorio.add(ventanaInfo);
            ventanaInfo.show();
        }
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuItemClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClActionPerformed
        if (ventanaVentasCliente == null || !ventanaVentasCliente.isVisible()) {
            ventanaVentasCliente = new VentanaVentasClientes();
            this.escritorio.add(ventanaVentasCliente);
            ventanaVentasCliente.show();
        }
    }//GEN-LAST:event_jMenuItemClActionPerformed

    private void jMenuItemClMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemClMouseClicked
//
    }//GEN-LAST:event_jMenuItemClMouseClicked

    private void jMenuItemPrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemPrMouseClicked
        //
    }//GEN-LAST:event_jMenuItemPrMouseClicked

    private void jMenuItemPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPrActionPerformed
        if (ventanaVentasArticulos == null || !ventanaVentasArticulos.isVisible()) {
            ventanaVentasArticulos = new VentanaVentasArticulos();
            this.escritorio.add(ventanaVentasArticulos);
            ventanaVentasArticulos.show();
        }
    }//GEN-LAST:event_jMenuItemPrActionPerformed

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
            java.util.logging.Logger.getLogger(AplicacionMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplicacionMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplicacionMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplicacionMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AplicacionMDI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCl;
    private javax.swing.JMenuItem jMenuItemPr;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuProductos;
    // End of variables declaration//GEN-END:variables
}
