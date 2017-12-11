
package es.hauptman.clientes.acciones;


import es.hauptman.gestionbd.GestionSQL;
import es.hauptman.gestionbd.IErrors;
import es.hauptman.gestionbd.ServiceClientes;
import es.hauptman.vista.PanelClientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    /**
     * Método que carga los valores de la tabla y la incializa.
     */
    public void cargaTabla() {
        tabla = new DefaultTableModel(new String[]{
            "ID", "Nombre", "Apellido", "Telefono", "Direccion", "CP", "Ciudad"
                , "Provincia"}, 0);
        panel.getTblCliente().setModel(tabla);
        panel.getPnlTblClientes().setViewportView(panel.getTblCliente());
    }
    
    /**
     * Método que refresca la tabla inicial recupera los valores de la 
     * base de datos con la sentencia SQL SELECT y luego guarda las
     * informaciones en la tabla.
     */
    public void actualizaTabla() { 
        PreparedStatement query = null;
        Connection conn = null;
        tabla = new DefaultTableModel(new String[]{
            "ID", "Nombre", "Apellido", "Telefono", "Direccion", "CP", "Ciudad"
                , "Provincia"}, 0);
        try {
            conn = GestionSQL.getConnection();
            query = conn.prepareStatement(SELECT);
            ResultSet rs = query.executeQuery();
            while (rs.next()){
                String a = rs.getString("ID");
                String b = rs.getString("Nombre");
                String c = rs.getString("Apellido");
                String d = rs.getString("Telefono");
                String e = rs.getString("Direccion");
                String f = rs.getString("CP");
                String g = rs.getString("Ciudad");      
                String h = rs.getString("Provincia");      
                tabla.addRow(new Object[]{a,b,c,d,e,f,g,h});
                panel.getTblCliente().setModel(tabla);
                panel.getPnlTblClientes().setViewportView(panel
                        .getTblCliente());
                }
        } catch (SQLException ex) {
            Logger.getLogger(ServiceClientes.class.getName()).log(Level.SEVERE,
                    IErrors.ERROR_SQL_STATEMENT, ex);
        } finally {
            try {
                query.close();
                conn.close();
            } catch (SQLException e) {
                Logger.getLogger(ServiceClientes.class.getName()).log(Level.SEVERE,
                        IErrors.ERROR_SQL_CLOSE_CONNECTION, e);
            }
        }
    }
}
