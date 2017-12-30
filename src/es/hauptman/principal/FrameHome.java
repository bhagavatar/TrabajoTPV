/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.principal;

import es.hauptman.vista.PanelVentas;
import es.hauptman.vista.PanelClientes;
import es.hauptman.vista.PanelGestVentas;
import es.hauptman.vista.PanelProductos;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Diego
 */
public class FrameHome extends javax.swing.JFrame {
    /**
     * Creates new form frameHome
     */
    public FrameHome() {
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

        jPanel2 = new javax.swing.JPanel();
        panelContenedor = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        panelBtnHome = new javax.swing.JPanel();
        btnIniVenta = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnGestVentas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        panelBanner = new javax.swing.JPanel();
        barraMenu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        itemIniVentas = new javax.swing.JMenuItem();
        itemGesVentas = new javax.swing.JMenuItem();
        itemClientes = new javax.swing.JMenuItem();
        itemProductos = new javax.swing.JMenuItem();
        itemUsuarios = new javax.swing.JMenuItem();
        itemInicio = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelContenedor.setPreferredSize(new java.awt.Dimension(900, 800));
        panelContenedor.setLayout(new java.awt.BorderLayout());

        panelBtnHome.setLayout(new java.awt.GridLayout(2, 2));

        btnIniVenta.setLabel("Iniciar Venta");
        btnIniVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniVentaActionPerformed(evt);
            }
        });
        panelBtnHome.add(btnIniVenta);

        btnProductos.setLabel("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        panelBtnHome.add(btnProductos);

        btnGestVentas.setLabel("Gestionar Ventas");
        btnGestVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestVentasActionPerformed(evt);
            }
        });
        panelBtnHome.add(btnGestVentas);

        btnClientes.setLabel("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        panelBtnHome.add(btnClientes);

        btnUsuarios.setLabel("Usuários");

        javax.swing.GroupLayout panelBannerLayout = new javax.swing.GroupLayout(panelBanner);
        panelBanner.setLayout(panelBannerLayout);
        panelBannerLayout.setHorizontalGroup(
            panelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelBannerLayout.setVerticalGroup(
            panelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelHomeLayout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(panelBtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelHomeLayout.createSequentialGroup()
                                .addGap(284, 284, 284)
                                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 143, Short.MAX_VALUE))
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelBtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        panelContenedor.add(panelHome, java.awt.BorderLayout.CENTER);

        menu.setText("Menu");

        itemIniVentas.setText("Iniciar Ventas");
        itemIniVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIniVentasActionPerformed(evt);
            }
        });
        menu.add(itemIniVentas);

        itemGesVentas.setText("Gestionar Ventas");
        itemGesVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGesVentasActionPerformed(evt);
            }
        });
        menu.add(itemGesVentas);

        itemClientes.setText("Clientes");
        itemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClientesActionPerformed(evt);
            }
        });
        menu.add(itemClientes);

        itemProductos.setText("Productos");
        itemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProductosActionPerformed(evt);
            }
        });
        menu.add(itemProductos);

        itemUsuarios.setText("Usuários");
        itemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUsuariosActionPerformed(evt);
            }
        });
        menu.add(itemUsuarios);

        itemInicio.setText("Home");
        itemInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInicioActionPerformed(evt);
            }
        });
        menu.add(itemInicio);

        barraMenu.add(menu);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemIniVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIniVentasActionPerformed
        cargaPanel(new PanelVentas(this));
    }//GEN-LAST:event_itemIniVentasActionPerformed

    private void itemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClientesActionPerformed
        cargaPanel (new PanelClientes(this));
    }//GEN-LAST:event_itemClientesActionPerformed

    private void itemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemUsuariosActionPerformed

    private void itemGesVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGesVentasActionPerformed
        cargaPanel (new PanelGestVentas(this));
    }//GEN-LAST:event_itemGesVentasActionPerformed

    private void itemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInicioActionPerformed
        panelContenedor.removeAll();
        panelContenedor.add(panelHome, BorderLayout.CENTER);
        panelContenedor.repaint();
        pack();
    }//GEN-LAST:event_itemInicioActionPerformed

    private void btnIniVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniVentaActionPerformed
        cargaPanel (new PanelVentas(this));
    }//GEN-LAST:event_btnIniVentaActionPerformed

    private void itemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProductosActionPerformed
        cargaPanel (new PanelProductos(this));
    }//GEN-LAST:event_itemProductosActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        cargaPanel (new PanelProductos(this));
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnGestVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestVentasActionPerformed
        cargaPanel (new PanelGestVentas(this));
    }//GEN-LAST:event_btnGestVentasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        cargaPanel (new PanelClientes(this));
    }//GEN-LAST:event_btnClientesActionPerformed

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
                if ("MAC OS X".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnGestVentas;
    private javax.swing.JButton btnIniVenta;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JMenuItem itemClientes;
    private javax.swing.JMenuItem itemGesVentas;
    private javax.swing.JMenuItem itemIniVentas;
    private javax.swing.JMenuItem itemInicio;
    private javax.swing.JMenuItem itemProductos;
    private javax.swing.JMenuItem itemUsuarios;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu menu;
    private javax.swing.JPanel panelBanner;
    private javax.swing.JPanel panelBtnHome;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

//Método que carga los distintos paneles a la ventana.
    private void cargaPanel(JPanel panel){
        panelContenedor.removeAll();
        panelContenedor.add(panel, BorderLayout.CENTER);
        pack();
    }
}
