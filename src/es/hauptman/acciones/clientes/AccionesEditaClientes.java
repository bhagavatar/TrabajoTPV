
package es.hauptman.acciones.clientes;

import es.hauptman.entities.Clientes;
import es.hauptman.gestionbd.ClientesDAO;
import es.hauptman.vista.PanelClientes;



/**
 * Clase que realiza las acciones asociadas al panel de editar.
 * 
 * @author Diego
 */
public class AccionesEditaClientes {
    
    private final PanelClientes panel;

    /**
     * Constructor de la clase.
     * 
     * @param panel PanelEditaClientes del que deberá manejar los eventos.
     * Le pasamos la instancia del panel para poder acceder a los componentes.
     */
    public AccionesEditaClientes(PanelClientes panel) {
        this.panel = panel;
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
}
