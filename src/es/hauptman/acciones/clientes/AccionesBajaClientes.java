
package es.hauptman.acciones.clientes;

import es.hauptman.entities.Clientes;
import es.hauptman.gestionbd.ServiceClientes;
import es.hauptman.vista.PanelClientes;



/**
 * Clase que realiza las acciones asociadas al panel de baja.
 * 
 * @author Diego
 */
public class AccionesBajaClientes {
    private final PanelClientes panel;

    /**
     * Constructor de la clase.
     * 
     * @param panel PanelBajaClientes del que deberá manejar los eventos.
     * Le pasamos la instancia del panel para poder acceder a los componentes.
     */

    public AccionesBajaClientes(PanelClientes panel) {
        this.panel = panel;
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
        ServiceClientes service = new ServiceClientes();
        service.deleteCliente(cliente);
        
    }

}
