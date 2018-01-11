
package es.hauptman.acciones.clientes;
import es.hauptman.entities.Clientes;
import es.hauptman.gestionbd.ClientesDAO;
import es.hauptman.vista.PanelClientes;




/*Le pasamos la instancia de la
     * ventana que creamos para poder acceder a los componentes de la interfaz
     * gráfica.
*/
/**
 * Clase que realiza las acciones asociadas al panel de alta. 
 * 
 * @author Diego
 */
public class AccionesAltaClientes {
    
    private final PanelClientes panel;
    
    /**
     * Constructor de la clase
     * 
     * @param panel PanelClientes del que deberá manejar los eventos.
     * Le pasamos la instancia del panel para poder acceder a los componentes.
     */
    public AccionesAltaClientes(PanelClientes panel) {
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
        ClientesDAO service = new ClientesDAO();
        service.createCliente(cliente);    
    }
}
    
    

