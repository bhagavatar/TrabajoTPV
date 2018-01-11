/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.gestionbd;

import es.hauptman.entities.Categorias;
import es.hauptman.entities.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Diego
 */
public class ProductosDAO {

    private Connection conn = null;

    public ProductosDAO() {
        conn = GestionSQL.getConnection();
    }

    public boolean createProductos(Productos producto) {

        String sql = "INSERT INTO productos (nombreProducto, cantidadStock, "
                + "precio, categorias_id) VALUES (?,?,?,?)";

        PreparedStatement query = null;

        try {
            query = conn.prepareStatement(sql /*,Statement.RETURN_GENERATED_KEYS*/);//Not sure if I have to use the return generated keys
            query.setString(1, producto.getDescripcion());
            query.setInt(2, producto.getCantidad());
            query.setDouble(3, producto.getPrecio());
            //Aquí recupero el Id de la Categorias atraves de la foreign key.
            query.setInt(4, producto.getCategoria().getID());
            query.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT + ex);
            return false;
        } finally {
            GestionSQL.closedConnection(conn, query);
        }
    }
    
    public List<Productos> readProductos(){
        
        String sql = "SELECT * FROM view_productocategoria";
        
        PreparedStatement query = null;
        ResultSet rs = null;
        
        List<Productos> productos = new ArrayList<>();
        
        try {
            
            query = conn.prepareStatement(sql);
            rs = query.executeQuery();
            
            while (rs.next()) {                
                Productos producto = new Productos();
                producto.setID(rs.getInt("prod_id"));
                producto.setDescripcion(rs.getString("nombreProducto"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setCantidad(rs.getInt("cantidadStock"));
                
                
                Categorias categoria = new Categorias();
                categoria.setID(rs.getInt(rs.getInt("id_cat")));
                categoria.setDescripcion(rs.getString("descripcion"));
                
                producto.setCategoria(categoria);
                
                productos.add(producto);
            }
            
                    } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT +ex);
        }finally {
            GestionSQL.closedConnection(conn, query, rs);
        }
        return productos;
    }
    
    public HashMap<String, Productos> readProdVentas(){
        
        String sql = "SELECT nombreProducto, precio, id_cat, descripcion FROM view_productocategoria";
        
        PreparedStatement query = null;
        ResultSet rs = null;
        
        HashMap<String, Productos> productos = new HashMap<>();
        
        try {
            query = conn.prepareStatement(sql);
            rs = query.executeQuery();
            
            while (rs.next()) {  
                String descripcionProd = rs.getString("nombreProducto");
                Productos producto = new Productos();
                producto.setDescripcion(descripcionProd);
                producto.setPrecio(rs.getDouble("precio"));
                
                productos.put(descripcionProd, producto);
                
            }
        } catch (SQLException ex) {
            
            System.err.println(IErrors.ERROR_SQL_STATEMENT +ex);
            
        }finally {
            
            GestionSQL.closedConnection(conn, query, rs);
        }
        return productos;
    }
    
    
    public boolean update(Productos producto){
        
        String sql = "UPDATE productos SET nombreProducto = ?, "
                + "cantidadStock = ?, precio = ?, categorias_id = ?, "
                + "WHERE id = ?";
        
        PreparedStatement query = null;
        
        try {
            query = conn.prepareStatement(sql);
            query.setString(1, producto.getDescripcion());
            query.setInt(2, producto.getCantidad());
            query.setDouble(3, producto.getPrecio());
            query.setInt(4, producto.getCategoria().getID());
            query.setInt(5, producto.getID());
            query.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT +ex);
            return false;
        }finally {
            GestionSQL.closedConnection(conn, query);
        }
    }
    
    public boolean delete(Productos producto){
        
        String sql = "DELETE FROM productos WHERE id = ?";
        
        PreparedStatement query = null;
        
        try {
            query = conn.prepareStatement(sql);
            query.setInt(1, producto.getID());
            query.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT +ex);
            return false;
        }finally {
            GestionSQL.closedConnection(conn, query);
        }
    }
}
