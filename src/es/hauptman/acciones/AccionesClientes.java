/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.acciones;

import es.hauptman.entities.Clientes;
import es.hauptman.gestionbd.ClientesDAO;
import es.hauptman.vista.DialogDescuento;
import es.hauptman.vista.PanelClientes;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que realiza las acciones asociadas a los Clientes.
 * 
 * @author Diego
 */
public class AccionesClientes {
    
    PanelClientes panel;
    DialogDescuento dialogDesc;

    /**
     * Constructor que recibe el PanelClientes.
     * @param panel
     */
    public AccionesClientes(PanelClientes panel) {
        this.panel = panel;
    }

    /**
     * Constructor que recibe el Diálogo de Descuento.
     * @param dialogDesc
     */
    public AccionesClientes(DialogDescuento dialogDesc) {
        this.dialogDesc = dialogDesc;
    }
    
    
    
    /**
     * Método que recupera los valores del formulario y los guarda en la
     * base de datos.
     */
    public void guardarCliente() {
        Clientes cliente = new Clientes();
        cliente.setNombre(panel.getTxtNombreAlta().getText().trim());
        cliente.setApellido(panel.getTxtApellidoAlta().getText().trim());
        cliente.setCiudad(panel.getTxtCiudadAlta().getText().trim());
        cliente.setCodpostal(panel.getTxtCPAlta().getText().trim());
        cliente.setDireccion(panel.getTxtDireccionAlta().getText().trim());
        cliente.setTelefono(panel.getTxtTelefonoAlta().getText().trim());
        cliente.setProvincia(panel.getTxtProvinciaAlta().getText().trim());
        ClientesDAO dao = new ClientesDAO();
        dao.createCliente(cliente);    
    }
    
    /**
     * Método que recupera los valores del formulário de baja y los elimina de
     * la base de datos.
     */
    public void eliminarCliente() {
        Clientes cliente = new Clientes();
        cliente.setId(Integer.parseInt(panel.getTxtIDBaja().getText().trim()));
        cliente.setNombre(panel.getTxtNombreBaja().getText().trim());
        cliente.setApellido(panel.getTxtApellidoBaja().getText().trim());
        ClientesDAO service = new ClientesDAO();
        service.deleteCliente(cliente);
        
    }
    
      /**
     * Método que recupera los valores de formulário para modificarlos en la 
     * base de datos.
     */
    public void editarCliente() {
        Clientes cliente = new Clientes();
        cliente.setId(Integer.parseInt(panel.getTxtIdEdita().getText().trim()));
        cliente.setNombre(panel.getTxtNombreEdita().getText().trim());
        cliente.setApellido(panel.getTxtApellidoEdita().getText().trim());
        cliente.setCiudad(panel.getTxtCiudadEdita().getText().trim());
        cliente.setCodpostal(panel.getTxtCPEdita().getText().trim());
        cliente.setDireccion(panel.getTxtDireccionEdita().getText().trim());
        cliente.setTelefono(panel.getTxtTelefonoEdita().getText().trim());
        cliente.setProvincia(panel.getTxtProvinciaEdita().getText().trim());
        
        ClientesDAO service = new ClientesDAO();
        service.updateCliente(cliente);
    }
    
    /**
     * Recupera los clientes de la base de datos e les inserta en la JTable 
     * del PanelClientes.
     */
    public void readTblClientes(){
        
        DefaultTableModel model = (DefaultTableModel) panel.getTblCliente().
                getModel();
        model.setNumRows(0);
        ClientesDAO dao = new ClientesDAO();
        
        for(Clientes c : dao.readCliente()){
            
            model.addRow(new Object[]{
                
                c.getId(),
                c.getNombre(),
                c.getApellido(),
                c.getTelefono(),
                c.getDireccion(),
                c.getCodpostal(),
                c.getCiudad(),
                c.getProvincia()
            });
        }
    }
     
    /**
     * Recupera los Clienets de la base de datos e les inserta en el ComboBox 
     * del DialogDescuento.
     */
    public void readCboClientes(){
          DefaultComboBoxModel<Object> model = 
                new DefaultComboBoxModel<>(new String[] {"<Clientes>"});
        dialogDesc.getCboCliente().setModel(model);
         ClientesDAO dao = new ClientesDAO();
         
         for(Clientes c : dao.readCliente()){
             dialogDesc.getCboCliente().addItem(c);
         }
         
     }
     
    /**
     * Recupera el nombre y apellido del cliente por su ID para el dialogo de descuento.
     * @param cliente  
     */
    public void getClientesById(Clientes cliente){
         //Clientes cliente = new Clientes();
         ClientesDAO dao = new ClientesDAO();
         cliente = (Clientes) dialogDesc.getCboCliente().getSelectedItem();
         
         for(Clientes c : dao.readClienteById(cliente)){
             dialogDesc.getTxtNombre().setText(c.getNombre());
             dialogDesc.getTxtApellido().setText(c.getApellido());
         }
         
         
     }
    
}

