/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.acciones;

import es.hauptman.entities.Clientes;
import es.hauptman.gestionbd.ClientesDAO;
import es.hauptman.vista.PanelClientes;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que realiza las acciones asociadas a los Clientes.
 * 
 * @author Diego
 */
public class AccionesClientes {
    
    private final PanelClientes panel;

    public AccionesClientes(PanelClientes panel) {
        this.panel = panel;
    }
    
    /**
     * Método que recupera los valores del formulario y los guarda en la
     * base de datos.
     */
    public void guardarCliente() {
        Clientes cliente = new Clientes();
        cliente.setNombre(panel.getTxtNombreAlta().getText());
        cliente.setApellido(panel.getTxtApellidoAlta().getText());
        cliente.setCiudad(panel.getTxtCiudadAlta().getText());
        cliente.setCodpostal(panel.getTxtCPAlta().getText());
        cliente.setDireccion(panel.getTxtDireccionAlta().getText());
        cliente.setTelefono(panel.getTxtTelefonoAlta().getText());
        cliente.setProvincia(panel.getTxtProvinciaAlta().getText());
        ClientesDAO dao = new ClientesDAO();
        dao.createCliente(cliente);    
    }
    
    /**
     * Método que recupera los valores del formulário de baja y los elimina de
     * la base de datos.
     */
    public void eliminarCliente() {
        Clientes cliente = new Clientes();
        cliente.setId(Integer.parseInt(panel.getTxtIDBaja().getText()));
        cliente.setNombre(panel.getTxtNombreBaja().getText());
        cliente.setApellido(panel.getTxtApellidoBaja().getText());
        ClientesDAO service = new ClientesDAO();
        service.deleteCliente(cliente);
        
    }
    
      /**
     * Método que recupera los valores de formulário para modificarlos en la 
     * base de datos.
     */
    public void editarCliente() {
        Clientes cliente = new Clientes();
        cliente.setId(Integer.parseInt(panel.getTxtIdEdita().getText()));
        cliente.setNombre(panel.getTxtNombreEdita().getText());
        cliente.setApellido(panel.getTxtApellidoEdita().getText());
        cliente.setCiudad(panel.getTxtCiudadEdita().getText());
        cliente.setCodpostal(panel.getTxtCPEdita().getText());
        cliente.setDireccion(panel.getTxtDireccionEdita().getText());
        cliente.setTelefono(panel.getTxtTelefonoEdita().getText());
        cliente.setProvincia(panel.getTxtProvinciaEdita().getText());
        
        ClientesDAO service = new ClientesDAO();
        service.updateCliente(cliente);
    }
    
     public void readTblClientes(){
        
        DefaultTableModel model = (DefaultTableModel) panel.getTblCliente().getModel();
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
    
}

