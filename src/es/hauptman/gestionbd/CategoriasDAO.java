/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.gestionbd;

import es.hauptman.entities.Categorias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase de acceso a la base de datos para la entidad Categorias.
 * @author Diego
 */
public class CategoriasDAO {
    
    private Connection conn = null;

    /**
     * Constructor que inicializa la conexion a la BBDD
     */
    public CategoriasDAO() {
        conn = GestionSQL.getConnection();
    }
    
    /**
     * Crea una Categoria en la base de datos.
     * @param categoria 
     * @return un valor booleano 
     */
    public boolean createCategoria(Categorias categoria){
        
        String sql = "INSERT INTO categorias (descripcion) VALUES (?)";
        
        PreparedStatement query = null;
        
        try {
            query = conn.prepareStatement(sql);
            query.setString(1, categoria.getDescripcion());
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
     * Recupera todas las Categorias de la base de datos.
     * @return ArrayList categorias.
     */
    public List<Categorias> readCategoria(){
        
        String sql = "SELECT * FROM categorias";
        
        PreparedStatement query = null;
        ResultSet rs = null;
        
        List<Categorias> categorias = new ArrayList<>();
        
        try {
            
            query = conn.prepareStatement(sql);
            rs = query.executeQuery();
            
            while (rs.next()) {                
                Categorias categoria = new Categorias();
                categoria.setDescripcion(rs.getString("descripcion"));
                categoria.setID(rs.getInt("id"));
                categorias.add(categoria);
            }
            
                    } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT +ex);
        }finally {
            GestionSQL.closedConnection(conn, query, rs);
        }
        return categorias;
    }
    
    /**
     * Actuliza una categoria en la BBDD por su ID.
     * @param categoria
     * @return un valor booleano.
     */
    public boolean update(Categorias categoria){
        
        String sql = "UPDATE categorias SET descripcion = ? WHERE id = ?";
        
        PreparedStatement query = null;
        
        try {
            query = conn.prepareStatement(sql);
            query.setString(1, categoria.getDescripcion());
            query.setInt(2, categoria.getID());
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
     * Elimina una Categoria de la BBDD por su ID.
     * @param categoria
     * @return valor booleano.
     */
    public boolean delete(Categorias categoria){
        
        String sql = "DELETE FROM categorias WHERE id = ?";
        
        PreparedStatement query = null;
        
        try {
            query = conn.prepareStatement(sql);
            query.setInt(1, categoria.getID());
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
