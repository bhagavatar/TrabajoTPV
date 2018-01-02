/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.gestionbd;

import es.hauptman.entities.Categoria;
import es.hauptman.entities.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class ServiceProducto {

    private Connection conn = null;

    public ServiceProducto() {
        conn = GestionSQL.getConnection();
    }

    public boolean save(Productos producto) {

        String sql = "INSERT INTO productos (nombreProducto, cantidadStock, "
                + "precio, categorias_id) VALUES (?,?,?,?)";

        PreparedStatement query = null;

        try {
            query = conn.prepareStatement(sql);
            query.setString(1, producto.getDescripcion());
            query.setInt(2, producto.getCantidad());
            query.setDouble(3, producto.getPrecio());
            //Aquí recupero el Id del objecto Categoria insertando una 
            //Foreign Key a partir de este objeto
            query.setInt(4, producto.getCategoria().getID());
            query.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT + ex);
            //Logger.getLogger(ServiceCategoria.class.getName()).log(Level.SEVERE, 
            //IErrors.ERROR_SQL_STATEMENT, ex);
            return false;
        } finally {
            GestionSQL.closedConnection(conn, query);
        }
    }
    
    public List<Productos> findAll(){
        
        String sql = "SELECT  p.id as prod_id, nombreProducto, categorias_id, "
                + "precio, cantidadStock, c.id as id_cat, descripcion "
                + "FROM tpv.productos p inner join "
                + "categorias c on c.id = p.categorias_id";
        
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
                
                
                Categoria categoria = new Categoria();
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
}
