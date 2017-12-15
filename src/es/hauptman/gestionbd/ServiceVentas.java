/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.gestionbd;

import es.hauptman.vista.PanelClientes;
import es.hauptman.vista.PanelVentas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class ServiceVentas {
    private final PanelVentas panel;
    private DefaultTableModel tabla;
    private final String SELECT = "SELECT nombreProducto, precio FROM productos";

    public ServiceVentas(PanelVentas panel) {
        this.panel = panel;
    }
    
    /**
     * Método que carga los valores de la tabla y la incializa.
     */
    public void cargaTabla() {
        tabla = new DefaultTableModel(new String[]{
            "Cant.", "Descripción", "Dto.", "Precio", "Subtotal"}, 0);
        panel.getTablaVentas().setModel(tabla);
        panel.getPanelTablaVentas().setViewportView(panel.getTablaVentas());
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
            "Cant.", "Descripción", "Dto.", "Precio", "Subtotal"}, 0);
        try {
            conn = GestionSQL.getConnection();
            query = conn.prepareStatement(SELECT);
            ResultSet rs = query.executeQuery();
            while (rs.next()){
                String a = rs.getString("Cant.");
                String b = rs.getString("Descripción");
                String c = rs.getString("Dto.");
                String d = rs.getString("Precio");
                String e = rs.getString("Subtotal");      
                tabla.addRow(new Object[]{a,b,c,d,e,});
                panel.getTablaVentas().setModel(tabla);
                panel.getPanelTablaVentas().setViewportView(panel
                        .getTablaVentas());
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
