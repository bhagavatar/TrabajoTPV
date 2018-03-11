/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.gestionbd;

import es.hauptman.entities.Categorias;
import es.hauptman.entities.Productos;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Clase de acceso a la base de datos para la entidad Productos.
 * @author Diego
 */
public class ProductosDAO {

    private Connection conn = null;
    private static int key;
    
    /**
     * Getter que retorna el ID del último producto creado.
     * @return
     */
    public int getKey() {
        return key;
    }

    /**
     * Constructor que inicializa la conexion con la BBDD.
     */
    public ProductosDAO() {
        conn = GestionSQL.getConnection();
    }

    /**
     * rea un nuevo producto en la BBDD.
     * @param producto
     * @return
     */
    public boolean createProductos(Productos producto) {

        String sql = "INSERT INTO productos (nombreProducto, cantidadStock, "
                + "precio, categorias_id) VALUES (?,?,?,?)";

        PreparedStatement query = null;
        ResultSet rs =null;

        try {
            query = conn.prepareStatement(sql ,Statement.RETURN_GENERATED_KEYS);
            query.setString(1, producto.getDescripcion());
            query.setInt(2, producto.getCantidadStock());
            query.setDouble(3, producto.getPrecio());
            //Aquí recupero el Id de la Categorias atraves de la foreign key.
            query.setInt(4, producto.getCategoria().getID());
            query.executeUpdate();
            rs = query.getGeneratedKeys();
            rs.next();
            key = rs.getInt(1);
            
            return true;
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT + ex);
            return false;
        } finally {
            GestionSQL.closedConnection(conn, query, rs);
        }
    }
    
    /**
     * Recupera todos los productos de la BBDD.
     * @return ArrayList productos.
     */
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
                producto.setCantidadStock(rs.getInt("cantidadStock"));
                
                
                Categorias categoria = new Categorias();
                categoria.setID(rs.getInt("id_cat"));
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
    
    /**
     * Método que recupera los productos de la BBDD y los guarda en un HashMap 
     * que recibirá como llave el nombre del producto que está definido en los botones del PanelVentas.
     * @return HashMap productos.
     */
    public HashMap<String, Productos> readProdVentas(){
        
        String sql = "SELECT prod_id, nombreProducto, precio, cantidadStock, id_cat, "
                + "descripcion FROM view_productocategoria";
        
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
                producto.setCantidadStock(rs.getInt("cantidadStock"));
                
                productos.put(descripcionProd, producto);
                
                Categorias categoria = new Categorias();
                categoria.setID(rs.getInt("id_cat"));
                producto.setCategoria(categoria);
                producto.setID(rs.getInt("prod_id"));
                
            }
        } catch (SQLException ex) {
            
            System.err.println(IErrors.ERROR_SQL_STATEMENT +ex);
            
        }finally {
            
            GestionSQL.closedConnection(conn, query, rs);
        }
        return productos;
    }
    
    /**
     * Recupera todos los productos de una determinada Categoria atraves del ID 
     * de una categoria.
     * @param categoria
     * @return ArrayList listaProductos.
     */
    public List<Productos> readProductosByCatId(Categorias categoria){
        
        String sql = "SELECT * FROM  view_productocategoria WHERE categorias_id = ?";
        
        List<Productos> listaProductos = new ArrayList<>();
        
        PreparedStatement query = null;
        ResultSet rs = null;
        
        try {
            query = conn.prepareStatement(sql);
            query.setInt(1, categoria.getID());
            rs = query.executeQuery();
            
            while(rs.next()){
                Productos producto = new Productos();
                producto.setID(rs.getInt("prod_id"));
                producto.setDescripcion(rs.getString("nombreProducto"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setCantidadStock(rs.getInt("cantidadStock"));
                categoria.setID(rs.getInt("id_cat"));
                categoria.setDescripcion(rs.getString("descripcion"));
                
                producto.setCategoria(categoria);
                
                listaProductos.add(producto);
            }
            
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT +ex);
            
        }finally {
            GestionSQL.closedConnection(conn, query, rs);
        }
        
        return listaProductos;
        
    }
    
    /**
     * Recupera un producto de la BBDD por su ID.
     * @param producto
     * @return
     */
    public List<Productos> readProductosById(Productos producto){
        
        String sql = "SELECT * FROM  view_productocategoria WHERE prod_id = ?";
        
        List<Productos> listaProductos = new ArrayList<>();
        
        PreparedStatement query = null;
        ResultSet rs = null;
        
        try {
            query = conn.prepareStatement(sql);
            query.setInt(1, producto.getID());
            rs = query.executeQuery();
            
            while(rs.next()){
                
                producto.setID(rs.getInt("prod_id"));
                producto.setDescripcion(rs.getString("nombreProducto"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setCantidadStock(rs.getInt("cantidadStock"));
                Categorias categoria = new Categorias();
                categoria.setID(rs.getInt("id_cat"));
                categoria.setDescripcion(rs.getString("descripcion"));
                
                producto.setCategoria(categoria);
                
                listaProductos.add(producto);
            }
            
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT +ex);
            
        }finally {
            GestionSQL.closedConnection(conn, query, rs);
        }
        
        return listaProductos;
        
    }
    
    /**
     * Actualiza un Producto en la BBDD atraves de su ID.
     * @param producto
     * @return
     */
    public boolean update(Productos producto){
        
        String sql = "UPDATE productos SET nombreProducto = ?, "
                + "cantidadStock = ?, precio = ?, "
                + "categorias_id = ? WHERE id = ? ";
        
        PreparedStatement query = null;
        
        try {
            query = conn.prepareStatement(sql);
            query.setString(1, producto.getDescripcion());
            query.setInt(2, producto.getCantidadStock());
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
    
    /**
     * Actualiza la cantidad de los productos vendidos en la BBDD.
     * @param listaProd
     * @return
     */
    public boolean updateCantidad(List<Productos> listaProd){
        
        String sql = "UPDATE productos SET cantidadStock = ? WHERE id = ? ";
        
        PreparedStatement query = null;
        
        try {
            query = conn.prepareStatement(sql);
            
            for(Productos p : listaProd){
            query.setInt(1, p.getCantidadStock());
            query.setInt(2, p.getID());
            query.addBatch();
            
            }
            query.executeBatch();
            return true;
            
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT +ex);
            return false;
        }finally {
            GestionSQL.closedConnection(conn, query);
        }
    }
    
    /**
     * Elimina un producto de la BBDD atraves de su ID.
     * @param producto
     * @return valor booleano.
     */
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
