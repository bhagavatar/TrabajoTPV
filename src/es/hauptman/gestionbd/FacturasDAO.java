/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.gestionbd;

import es.hauptman.entities.DetalleFactura;
import es.hauptman.entities.Facturas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Diego
 */
public class FacturasDAO {
    private Connection conn = null;
    private int key;

    public FacturasDAO() {
        conn = GestionSQL.getConnection();
    }

    public int getKey() {
        return key;
    }
     
    public boolean createFactura (Facturas factura){
        
        String sqlFactura = "INSERT INTO factura (fecha, total_compra, clientes_id) VALUES (?,?,?)";
        PreparedStatement queryFactura = null;
        ResultSet rs = null;
        
        try {
            
            
            queryFactura = conn.prepareStatement(sqlFactura ,Statement.RETURN_GENERATED_KEYS);
            
            queryFactura.setTimestamp(1, new Timestamp(new Date().getTime()));
            queryFactura.setDouble(2, factura.getTotal());
            //queryFactura.setInt(3, factura.getCliente().getId());
            queryFactura.executeUpdate();
            queryFactura.getGeneratedKeys();
            
            rs = queryFactura.getGeneratedKeys();    
            rs.next();  
            key = rs.getInt(1);
            factura.setTicketID(key);
            
          
            
            for (DetalleFactura df : factura.getListDetalleFacturas()) {
                
                PreparedStatement queryDetalle = null;
                String sqlDetalle = "INSERT INTO detalle_factura (factura_ticket_id, productos_id, "
                + "productos_categorias_id, cantidad_comprada, subtotal) VALUES (?,?,?,?,?)";
        
                queryDetalle = conn.prepareStatement(sqlDetalle);
                queryDetalle.setInt(1, df.getFactura().getTicketID());
                queryDetalle.setInt(2, df.getProducto().getID());
                queryDetalle.setInt(3, df.getProducto().getCategoria().getID());
                queryDetalle.setInt(4, df.getProducto().getCantidadComprada());
                queryDetalle.setDouble(5, df.getProducto().getSubtotal());
                queryDetalle.executeUpdate();
        }
            return true;
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT + ex);
            return false;
        } finally {
            GestionSQL.closedConnection(conn, queryFactura, rs);
        }
    }
}
