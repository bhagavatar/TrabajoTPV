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
    private static int key;

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
            //Comprueba que si la factura no tiene cliente, inserte un valor null.
            if(factura.getCliente().getId() != 0){
                queryFactura.setInt(3, factura.getCliente().getId());
            } else {
                queryFactura.setNull(3, Types.INTEGER);
            }
            queryFactura.executeUpdate();
            //Recupera el ID autoincremental.
            queryFactura.getGeneratedKeys();
            rs = queryFactura.getGeneratedKeys();    
            rs.next();  
            key = rs.getInt(1);
            factura.setTicketID(key);
          
            //Inserta los detalles en la factura creada.
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
                queryDetalle.close();
        }
            return true;
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT + ex);
            return false;
        } finally {
            GestionSQL.closedConnection(conn, queryFactura, rs);
        }
    }
    
    /**
     * Recupera detalles de la factura que se muestran en el DialogFactura.
     * @return Lista de tipo DetalleFactura.
     */
    public List<DetalleFactura> readFacturaDisplay(){
        
        String sql = "SELECT * FROM view_facturadisplay WHERE ticket_id=?";
        PreparedStatement query = null;
        ResultSet rs = null;
        
        List<DetalleFactura> listaDetalleFacturas = new ArrayList<>();
        
        try {
            query = conn.prepareStatement(sql);
            query.setInt(1, key);
            rs = query.executeQuery();
            
            while(rs.next()){
                
                Facturas factura = new Facturas();
                factura.setTicketID(rs.getInt("ticket_id"));
                factura.setTotal(rs.getDouble("total_compra"));
            
                Clientes cliente = new Clientes();
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                factura.setCliente(cliente);
                
                Productos producto = new Productos();
                producto.setDescripcion(rs.getString("nombreProducto"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setCantidadComprada(rs.getInt("cantidad_comprada"));
                
                DetalleFactura detalleFactura = new DetalleFactura();
                detalleFactura.setProducto(producto);
                detalleFactura.setFactura(factura);
                detalleFactura.setSubtotal(rs.getDouble("subtotal"));
                
                listaDetalleFacturas.add(detalleFactura);
                factura.setListDetalleFacturas(listaDetalleFacturas);
                listaDetalleFacturas = factura.getListDetalleFacturas();
            }
        
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT +ex);
        }finally {
            GestionSQL.closedConnection(conn, query, rs);
        }
        return listaDetalleFacturas;
    }
    
    public List<Facturas> readFactura(int ticketID, int clienteID, String fecha, String nombreCliente){
        
        String sql = "SELECT * FROM view_facturaclientes WHERE ticket_id=? or clientes_id=? or fecha LIKE ? or nombre=?";
        PreparedStatement query = null;
        ResultSet rs = null;
        List<Facturas> listaFactura = new ArrayList<>();
        List<DetalleFactura> listaDetalleFacturas = new ArrayList<>();
        
         try {
             
            query = conn.prepareStatement(sql);
            query.setInt(1, ticketID);
            query.setInt(2, clienteID);
            query.setString(3, fecha + "%");
            query.setString(4, nombreCliente);
            rs = query.executeQuery();
            
            while(rs.next()){
                
                Facturas factura = new Facturas();
                factura.setTicketID(rs.getInt("ticket_id"));
                factura.setTotal(rs.getDouble("total_compra"));
                factura.setFecha(rs.getString("fecha"));
            
                Clientes cliente = new Clientes();
                cliente.setId(rs.getInt("clientes_id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                factura.setCliente(cliente);
                
                listaFactura.add(factura);
            }
        
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT +ex);
        }finally {
            GestionSQL.closedConnection(conn, query, rs);
        }
        
        return listaFactura;
    }
    
    public List<DetalleFactura> readDetalleFactura(int ticketID){
        
        String sql = "SELECT * FROM view_facturadisplay WHERE ticket_id=?";
        PreparedStatement query = null;
        ResultSet rs = null;
        
        List<DetalleFactura> listaDetalleFacturas = new ArrayList<>();
        
        try {
            query = conn.prepareStatement(sql);
            query.setInt(1, ticketID);
            rs = query.executeQuery();
            
            while(rs.next()){
                
                Facturas factura = new Facturas();
                factura.setTicketID(rs.getInt("ticket_id"));
                factura.setTotal(rs.getDouble("total_compra"));
            
                Clientes cliente = new Clientes();
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                factura.setCliente(cliente);
                
                Productos producto = new Productos();
                producto.setDescripcion(rs.getString("nombreProducto"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setCantidadComprada(rs.getInt("cantidad_comprada"));
                
                DetalleFactura detalleFactura = new DetalleFactura();
                detalleFactura.setProducto(producto);
                detalleFactura.setFactura(factura);
                detalleFactura.setSubtotal(rs.getDouble("subtotal"));
                
                listaDetalleFacturas.add(detalleFactura);
                factura.setListDetalleFacturas(listaDetalleFacturas);
                listaDetalleFacturas = factura.getListDetalleFacturas();
            }
        
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT +ex);
        }finally {
            GestionSQL.closedConnection(conn, query, rs);
        }
        return listaDetalleFacturas;
    }
}
