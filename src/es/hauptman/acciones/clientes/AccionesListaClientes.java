
package es.hauptman.acciones.clientes;


import es.hauptman.entities.Clientes;
import es.hauptman.gestionbd.ServiceClientes;
import es.hauptman.vista.PanelClientes;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que realiza las acciones asociadas al panel de listar.
 * 
 * @author Diego
 */
public class AccionesListaClientes {
    
    private final PanelClientes panel;
    private DefaultTableModel tabla;
    //String con la sentencia SQL utilizada en el método actualizarTabla()
    private final String SELECT = "SELECT * FROM clientes";

    /**
     * Constructor de la clase.
     * 
     * @param panel PanelListaClientes del que deberá manejar los eventos.
     * Le pasamos la instancia del panel para poder acceder a los componentes.
     */
    public AccionesListaClientes(PanelClientes panel) {
        this.panel = panel;
    }
    
    public void readTblClientes(){
        
        DefaultTableModel model = (DefaultTableModel) panel.getTblCliente().getModel();
        model.setNumRows(0);
        ServiceClientes dao = new ServiceClientes();
        
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
