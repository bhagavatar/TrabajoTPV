/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.gestionbd;

import es.hauptman.entities.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que accede a los datos de usuarios en la BBDD.
 * @author Diego
 */
public class UsuariosDAO {
    private Connection conn = null;
    private static int key;
    
     /**
     * Constructor que inicializa la conexion con la BBDD.
     */
    public UsuariosDAO() {
        conn = GestionSQL.getConnection();
    }
    
    /**
     * Getter que devuelve el ID del último usuario creado.
     * @return
     */
    public int getKey() {
        return key;
    }
    
    /**
     * Crea un nuevo producto en la BBDD.
     * @param usuario
     * @return
     */
    public boolean createUsuarios(Usuarios usuario) {

        String sql = "INSERT INTO usuarios (login, contrasena) VALUES (?,?)";

        PreparedStatement query = null;
        ResultSet rs =null;

        try {
            query = conn.prepareStatement(sql ,Statement.RETURN_GENERATED_KEYS);
            query.setString(1, usuario.getLogin());
            query.setString(2, usuario.getContrasena());
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
     *
     * @return
     */
    public List<Usuarios> readUsuarios() {

        String sql = "SELECT * FROM usuarios";
        
        List<Usuarios> usuariosList = new ArrayList<>();

        PreparedStatement query = null;
        ResultSet rs =null;

        try {
            query = conn.prepareStatement(sql);
            rs = query.executeQuery();
            while(rs.next()){
                Usuarios usuario = new Usuarios();
                usuario.setId(rs.getInt("id"));
                usuario.setLogin(rs.getString("login"));
                usuario.setContrasena(rs.getString("contrasena"));
                usuariosList.add(usuario);
            
            }
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT + ex);
        } finally {
            GestionSQL.closedConnection(conn, query, rs);
        }
        return usuariosList;
    }
    
    /**
     *
     * @param usuario
     * @return
     */
    public boolean update(Usuarios usuario){
        
        String sql = "UPDATE usuarios SET login = ?, contrasena = ? WHERE id = ? ";
        
        PreparedStatement query = null;
        
        try {
            query = conn.prepareStatement(sql);
            query.setString(1, usuario.getLogin());
            query.setString(2, usuario.getContrasena());
            query.setInt(3, usuario.getId());
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
     *
     * @param usuario
     * @return
     */
    public boolean deleteUsuarios(Usuarios usuario){
        String sql = "DELETE FROM usuarios WHERE id = ?";
        
        PreparedStatement query = null;
        
        try {
            query = conn.prepareStatement(sql);
            query.setInt(1, usuario.getId());
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
     *
     * @param login
     * @param contrasena
     * @return
     */
    public boolean checkLoginDAO(String login, char[] contrasena){
        String sql = "SELECT * FROM usuarios WHERE login = ? AND contrasena = ?";
        PreparedStatement query = null;
        ResultSet rs =null;
        boolean check = false;
        
        
        try {
            query = conn.prepareStatement(sql);
            query.setString(1, login);
            query.setString(2, String.valueOf(contrasena));
            rs = query.executeQuery();
            
            if(rs.next())
                check = true;
            
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT + ex);
        } finally {
            GestionSQL.closedConnection(conn, query, rs);
        }   
        
        return check;
    
    }
    
    /**
     *
     * @param login
     * @param contrasena
     * @return
     */
    public Usuarios checkLoginDAOteste(String login, char[] contrasena){
        String sql = "SELECT * FROM usuarios WHERE login = ? AND contrasena = ?";
        PreparedStatement query = null;
        ResultSet rs =null;
        Usuarios usuario = null;
        
        try {
            query = conn.prepareStatement(sql);
            query.setString(1, login);
            query.setString(2, String.valueOf(contrasena));
            rs = query.executeQuery();
            
            if(rs.next()){
                int id = rs.getInt("id");
                usuario = new Usuarios();
                usuario.setId(id);
                usuario.setLogin(login);
            }
                
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT + ex);
        } finally {
            GestionSQL.closedConnection(conn, query, rs);
        }   
        
        return usuario;
    
    }
}
