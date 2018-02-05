/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.gestionbd;

import es.hauptman.entities.Clientes;
import es.hauptman.entities.DetalleFactura;
import es.hauptman.entities.Facturas;
import es.hauptman.entities.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
            if(factura.getCliente().getId() != 0){
                queryFactura.setInt(3, factura.getCliente().getId());
            } else {
                queryFactura.setNull(3, Types.INTEGER);
            }
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
    
    public List<Facturas> readFacturaDisplay(){
        
        String sql = "SELECT * FROM view_facturadisplay";
        PreparedStatement query = null;
        ResultSet rs = null;
        
        List<Facturas> facturas = new ArrayList<>();
        
        try {
            query = conn.prepareStatement(sql);
            rs = query.executeQuery();
            
            while(rs.next()){
                Facturas factura = new Facturas();
                factura.setTicketID(rs.getInt("ticket_id"));
                factura.setTotal(rs.getDouble("total_compra"));
                
                DetalleFactura detalleFactura = new DetalleFactura();
                detalleFactura.setSubtotal(rs.getDouble("subtotal"));
                detalleFactura.setCantidadComprada(rs.getInt("cantidad_comprada"));
                
                Productos producto = new Productos();
                producto.setDescripcion(rs.getString("nombreProducto"));
                producto.setPrecio(rs.getDouble("precio"));
                
                Clientes cliente = new Clientes();
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                
                detalleFactura.setProducto(producto);
                factura.setDetalleFactura(detalleFactura);
                factura.setCliente(cliente);
                
                facturas.add(factura);
                
            }
        
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT +ex);
        }finally {
            GestionSQL.closedConnection(conn, query, rs);
        }
        return facturas;
    }
}
