/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.vista;

import es.hauptman.acciones.AccionesClientes;
import es.hauptman.principal.FrameHome;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class PanelClientes extends javax.swing.JPanel {
    private FrameHome frame;
    private AccionesClientes accionesClientes;

    /**
     * Creates new form panelClientes
     */
    public PanelClientes(FrameHome frame) {
        
        initComponents();
        this.frame = frame;
        accionesClientes = new AccionesClientes(this);
        accionesClientes.readTblClientes();
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Getters and Setters"> 
    public JTextField getTxtIDBaja() {
        return txtIDBaja;
    }

    public void setTxtIDBaja(JTextField txtIDBaja) {
        this.txtIDBaja = txtIDBaja;
    }

    public FrameHome getFrame() {
        return frame;
    }

    public void setFrame(FrameHome frame) {
        this.frame = frame;
    }

    public JTextField getTxtApellidoAlta() {
        return txtApellidoAlta;
    }

    public void setTxtApellidoAlta(JTextField txtApellidoAlta) {
        this.txtApellidoAlta = txtApellidoAlta;
    }

    public JTextField getTxtApellidoBaja() {
        return txtApellidoBaja;
    }

    public void setTxtApellidoBaja(JTextField txtApellidoBaja) {
        this.txtApellidoBaja = txtApellidoBaja;
    }

    public JTextField getTxtApellidoEdita() {
        return txtApellidoEdita;
    }

    public void setTxtApellidoEdita(JTextField txtApellidoEdita) {
        this.txtApellidoEdita = txtApellidoEdita;
    }

    public JTextField getTxtCPAlta() {
        return txtCPAlta;
    }

    public void setTxtCPAlta(JTextField txtCPAlta) {
        this.txtCPAlta = txtCPAlta;
    }

    public JTextField getTxtCPEdita() {
        return txtCPEdita;
    }

    public void setTxtCPEdita(JTextField txtCPEdita) {
        this.txtCPEdita = txtCPEdita;
    }

    public JTextField getTxtCiudadAlta() {
        return txtCiudadAlta;
    }

    public void setTxtCiudadAlta(JTextField txtCiudadAlta) {
        this.txtCiudadAlta = txtCiudadAlta;
    }

    public JTextField getTxtCiudadEdita() {
        return txtCiudadEdita;
    }

    public void setTxtCiudadEdita(JTextField txtCiudadEdita) {
        this.txtCiudadEdita = txtCiudadEdita;
    }

    public JTextField getTxtDireccionAlta() {
        return txtDireccionAlta;
    }

    public void setTxtDireccionAlta(JTextField txtDireccionAlta) {
        this.txtDireccionAlta = txtDireccionAlta;
    }

    public JTextField getTxtDireccionEdita() {
        return txtDireccionEdita;
    }

    public void setTxtDireccionEdita(JTextField txtDireccionEdita) {
        this.txtDireccionEdita = txtDireccionEdita;
    }

    public JTextField getTxtIdEdita() {
        return txtIdEdita;
    }

    public void setTxtIdEdita(JTextField txtIdEdita) {
        this.txtIdEdita = txtIdEdita;
    }

    public JTextField getTxtNombreAlta() {
        return txtNombreAlta;
    }

    public void setTxtNombreAlta(JTextField txtNombreAlta) {
        this.txtNombreAlta = txtNombreAlta;
    }

    public JTextField getTxtNombreBaja() {
        return txtNombreBaja;
    }

    public void setTxtNombreBaja(JTextField txtNombreBaja) {
        this.txtNombreBaja = txtNombreBaja;
    }

    public JTextField getTxtNombreEdita() {
        return txtNombreEdita;
    }

    public void setTxtNombreEdita(JTextField txtNombreEdita) {
        this.txtNombreEdita = txtNombreEdita;
    }

    public JTextField getTxtProvinciaAlta() {
        return txtProvinciaAlta;
    }

    public void setTxtProvinciaAlta(JTextField txtProvinciaAlta) {
        this.txtProvinciaAlta = txtProvinciaAlta;
    }

    public JTextField getTxtProvinciaEdita() {
        return txtProvinciaEdita;
    }

    public void setTxtProvinciaEdita(JTextField txtProvinciaEdita) {
        this.txtProvinciaEdita = txtProvinciaEdita;
    }

    public JTextField getTxtTelefonoAlta() {
        return txtTelefonoAlta;
    }

    public void setTxtTelefonoAlta(JTextField txtTelefonoAlta) {
        this.txtTelefonoAlta = txtTelefonoAlta;
    }

    public JTextField getTxtTelefonoEdita() {
        return txtTelefonoEdita;
    }

    public void setTxtTelefonoEdita(JTextField txtTelefonoEdita) {
        this.txtTelefonoEdita = txtTelefonoEdita;
    }

    public JTable getTblCliente() {
        return tblCliente;
    }

    public void setTblCliente(JTable tblCliente) {
        this.tblCliente = tblCliente;
    }

    public JScrollPane getPnlTblClientes() {
        return pnlTblClientes;
    }

    public void setPnlTblClientes(JScrollPane pnlTblClientes) {
        this.pnlTblClientes = pnlTblClientes;
    }// </editor-fold>

    
     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAltaCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreAlta = new javax.swing.JTextField();
        txtApellidoAlta = new javax.swing.JTextField();
        txtTelefonoAlta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccionAlta = new javax.swing.JTextField();
        btnGuardarAlta = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtCiudadAlta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtProvinciaAlta = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCPAlta = new javax.swing.JTextField();
        panelBajaCliente = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtIDBaja = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombreBaja = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtApellidoBaja = new javax.swing.JTextField();
        btnBaja = new javax.swing.JButton();
        panelEditaCliente1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtNombreEdita = new javax.swing.JTextField();
        txtApellidoEdita = new javax.swing.JTextField();
        btnGuardarEdita = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        txtIdEdita = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtTelefonoEdita = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtDireccionEdita = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtCPEdita = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtCiudadEdita = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtProvinciaEdita = new javax.swing.JTextField();
        pnlTblClientes = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnUpdateListaCliente = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 800));

        panelAltaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guardar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 14), new java.awt.Color(0, 0, 204))); // NOI18N
        panelAltaCliente.setPreferredSize(new java.awt.Dimension(888, 250));
        panelAltaCliente.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel2.setText("Apellido:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel3.setText("Teléfono");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel6.setText("Dirección:");

        btnGuardarAlta.setForeground(new java.awt.Color(0, 0, 204));
        btnGuardarAlta.setText("Guardar");
        btnGuardarAlta.setToolTipText("");
        btnGuardarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAltaActionPerformed(evt);
            }
        });

        jLabel11.setText("Ciudad:");

        jLabel12.setText("Província:");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel14.setText("C.P.:");

        javax.swing.GroupLayout panelAltaClienteLayout = new javax.swing.GroupLayout(panelAltaCliente);
        panelAltaCliente.setLayout(panelAltaClienteLayout);
        panelAltaClienteLayout.setHorizontalGroup(
            panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAltaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardarAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(txtTelefonoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(txtCiudadAlta)
                    .addComponent(txtDireccionAlta)
                    .addComponent(txtProvinciaAlta))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        panelAltaClienteLayout.setVerticalGroup(
            panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAltaClienteLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccionAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCPAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCiudadAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtProvinciaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelBajaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 14), new java.awt.Color(0, 0, 204))); // NOI18N
        panelBajaCliente.setForeground(new java.awt.Color(0, 0, 204));
        panelBajaCliente.setPreferredSize(new java.awt.Dimension(888, 250));

        jLabel4.setText("ID:");

        jLabel5.setText("Nombre:");

        jLabel7.setText("Apellido:");

        btnBaja.setForeground(new java.awt.Color(0, 0, 204));
        btnBaja.setText("Eliminar");
        btnBaja.setPreferredSize(new java.awt.Dimension(99, 29));
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBajaClienteLayout = new javax.swing.GroupLayout(panelBajaCliente);
        panelBajaCliente.setLayout(panelBajaClienteLayout);
        panelBajaClienteLayout.setHorizontalGroup(
            panelBajaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBajaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBajaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreBaja, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtApellidoBaja, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBajaClienteLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel7)
                        .addContainerGap(96, Short.MAX_VALUE))
                    .addGroup(panelBajaClienteLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(panelBajaClienteLayout.createSequentialGroup()
                .addGroup(panelBajaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBajaClienteLayout.createSequentialGroup()
                        .addGroup(panelBajaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBajaClienteLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel4))
                            .addGroup(panelBajaClienteLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(txtIDBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnBaja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBajaClienteLayout.setVerticalGroup(
            panelBajaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBajaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIDBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidoBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelEditaCliente1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 14), new java.awt.Color(0, 0, 204))); // NOI18N
        panelEditaCliente1.setForeground(new java.awt.Color(0, 0, 204));
        panelEditaCliente1.setPreferredSize(new java.awt.Dimension(888, 250));
        panelEditaCliente1.setRequestFocusEnabled(false);

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel24.setText("Nombre:");

        jLabel25.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel25.setText("Apellido:");

        btnGuardarEdita.setForeground(new java.awt.Color(0, 0, 204));
        btnGuardarEdita.setText("Editar");
        btnGuardarEdita.setToolTipText("");
        btnGuardarEdita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEditaActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel34.setText("ID:");

        jLabel35.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel35.setText("Teléfono");

        jLabel36.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel36.setText("Dirección");

        jLabel37.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel37.setText("C.P.:");

        jLabel38.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel38.setText("Ciudad:");

        jLabel39.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel39.setText("Província:");

        javax.swing.GroupLayout panelEditaCliente1Layout = new javax.swing.GroupLayout(panelEditaCliente1);
        panelEditaCliente1.setLayout(panelEditaCliente1Layout);
        panelEditaCliente1Layout.setHorizontalGroup(
            panelEditaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditaCliente1Layout.createSequentialGroup()
                .addGroup(panelEditaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditaCliente1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel34)
                        .addGap(42, 42, 42)
                        .addComponent(txtIdEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEditaCliente1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelEditaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37)
                            .addComponent(jLabel35)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEditaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccionEdita)
                            .addComponent(txtCiudadEdita)
                            .addComponent(txtProvinciaEdita)
                            .addComponent(txtApellidoEdita)
                            .addGroup(panelEditaCliente1Layout.createSequentialGroup()
                                .addGroup(panelEditaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefonoEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCPEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 138, Short.MAX_VALUE))
                            .addComponent(btnGuardarEdita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(6, 6, 6))
        );
        panelEditaCliente1Layout.setVerticalGroup(
            panelEditaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditaCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtIdEdita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtNombreEdita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtApellidoEdita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtTelefonoEdita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtDireccionEdita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtCPEdita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtCiudadEdita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtProvinciaEdita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido ", "Teléfono", "Dirección", "C.P.", "Ciudad", "Província"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblClienteMousePressed(evt);
            }
        });
        tblCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblClienteKeyReleased(evt);
            }
        });
        pnlTblClientes.setViewportView(tblCliente);

        btnUpdateListaCliente.setForeground(new java.awt.Color(0, 0, 204));
        btnUpdateListaCliente.setText("Listar Clientes");
        btnUpdateListaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateListaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTblClientes)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelEditaCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBajaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(btnUpdateListaCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBajaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(panelAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelEditaCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateListaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(pnlTblClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAltaActionPerformed
        accionesClientes.guardarCliente();
        accionesClientes.readTblClientes();
        
        //Limpiar los campos
        txtApellidoAlta.setText("");
        txtNombreAlta.setText("");
        txtCPAlta.setText("");
        txtDireccionAlta.setText("");
        txtTelefonoAlta.setText("");
        txtProvinciaAlta.setText("");
        txtCiudadAlta.setText("");
        
        
    }//GEN-LAST:event_btnGuardarAltaActionPerformed

    private void btnGuardarEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEditaActionPerformed
        accionesClientes.editarCliente();
        accionesClientes.readTblClientes();
        
        //Limpiar los campos
        txtApellidoAlta.setText("");
        txtNombreAlta.setText("");
        txtCPAlta.setText("");
        txtDireccionAlta.setText("");
        txtTelefonoAlta.setText("");
        txtProvinciaAlta.setText("");
        txtCiudadAlta.setText("");
    }//GEN-LAST:event_btnGuardarEditaActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        accionesClientes.eliminarCliente();
        accionesClientes.readTblClientes();
        
        //Lipiar los campos
        txtApellidoBaja.setText("");
        txtNombreBaja.setText("");
        txtIDBaja.setText("");
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnUpdateListaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateListaClienteActionPerformed
        accionesClientes.readTblClientes();
        
        //Limpiar los Campos
        txtIdEdita.setText("");
        txtApellidoEdita.setText("");
        txtNombreEdita.setText("");
        txtCPEdita.setText("");
        txtDireccionEdita.setText("");
        txtTelefonoEdita.setText("");
        txtProvinciaEdita.setText("");
        txtCiudadEdita.setText("");
    }//GEN-LAST:event_btnUpdateListaClienteActionPerformed

    private void tblClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMousePressed

        DefaultTableModel model = (DefaultTableModel) tblCliente.getModel();
        if (tblCliente.getSelectedRow() != -1) {
            
            txtIdEdita.setText(model.getValueAt(tblCliente.getSelectedRow(), 0).toString());
            txtNombreEdita.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 1).toString());
            txtApellidoEdita.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 2).toString());
            txtTelefonoEdita.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 3).toString());
            txtDireccionEdita.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 4).toString());
            txtCPEdita.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 5).toString());
            txtCiudadEdita.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 6).toString());
            txtProvinciaEdita.setText(model.getValueAt(tblCliente.getSelectedRow(), 7).toString());
            
            txtIDBaja.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 0).toString());
            txtNombreBaja.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 1).toString());
            txtApellidoBaja.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 2).toString());
            
        }
    }//GEN-LAST:event_tblClienteMousePressed

    private void tblClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClienteKeyReleased

        DefaultTableModel model = (DefaultTableModel) tblCliente.getModel();
        if (tblCliente.getSelectedRow() != -1) {
            
            txtIdEdita.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 0).toString());
            txtNombreEdita.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 1).toString());
            txtApellidoEdita.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 2).toString());
            txtTelefonoEdita.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 3).toString());
            txtDireccionEdita.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 4).toString());
            txtCPEdita.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 5).toString());
            txtCiudadEdita.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 6).toString());
            txtProvinciaEdita.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 7).toString());
            
            txtIDBaja.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 0).toString());
            txtNombreBaja.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 1).toString());
            txtApellidoBaja.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 2).toString());
            
        }
    }//GEN-LAST:event_tblClienteKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnGuardarAlta;
    private javax.swing.JButton btnGuardarEdita;
    private javax.swing.JButton btnUpdateListaCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel panelAltaCliente;
    private javax.swing.JPanel panelBajaCliente;
    private javax.swing.JPanel panelEditaCliente1;
    private javax.swing.JScrollPane pnlTblClientes;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtApellidoAlta;
    private javax.swing.JTextField txtApellidoBaja;
    private javax.swing.JTextField txtApellidoEdita;
    private javax.swing.JTextField txtCPAlta;
    private javax.swing.JTextField txtCPEdita;
    private javax.swing.JTextField txtCiudadAlta;
    private javax.swing.JTextField txtCiudadEdita;
    private javax.swing.JTextField txtDireccionAlta;
    private javax.swing.JTextField txtDireccionEdita;
    private javax.swing.JTextField txtIDBaja;
    private javax.swing.JTextField txtIdEdita;
    private javax.swing.JTextField txtNombreAlta;
    private javax.swing.JTextField txtNombreBaja;
    private javax.swing.JTextField txtNombreEdita;
    private javax.swing.JTextField txtProvinciaAlta;
    private javax.swing.JTextField txtProvinciaEdita;
    private javax.swing.JTextField txtTelefonoAlta;
    private javax.swing.JTextField txtTelefonoEdita;
    // End of variables declaration//GEN-END:variables
}
