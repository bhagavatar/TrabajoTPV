
package es.hauptman.gestionbd;


import es.hauptman.entities.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que implementa los métodos de interacción con la base de datos.
 * 
 * @author Diego
 */
public class ClientesDAO {
    //Sentencias SQL para insertar, eliminar y modificar los clientes en la 
    //base de datos.
    private final String INSERT = "INSERT INTO clientes (nombre, apellido, "
            + "telefono, direccion, cp, ciudad, provincia) VALUES (?,?,?,?,?,?,?)";
    private final String DELETE = "DELETE FROM clientes WHERE id = ? "
            + "AND nombre = ? AND apellido = ?";
    private final String UPDATE = "UPDATE clientes SET nombre = ?, apellido = ?,"
            + " telefono = ?, direccion = ?, cp = ?, ciudad = ?, provincia = ? "
            + "WHERE id = ? ";
    
    Connection conn = null;     

    public ClientesDAO() {
        conn = GestionSQL.getConnection();
    }
     
    /**
     * Método para insertar un cliente en la base de datos. Inserta el cliente
     * y le asigna un ID autoincremental en la base de datos
     * 
     * @param cliente
     */
    public void createCliente (Clientes cliente) {
        
        PreparedStatement query = null;
        
        try {
            query = conn.prepareStatement(INSERT, 
                    Statement.RETURN_GENERATED_KEYS);
            query.setString(1, cliente.getNombre());
            query.setString(2, cliente.getApellido());
            query.setString(3, cliente.getTelefono());
            query.setString(4, cliente.getDireccion());
            query.setString(5, cliente.getCodpostal());
            query.setString(6, cliente.getCiudad());
            query.setString(7, cliente.getProvincia());
            query.execute();
            ResultSet rs = query.getGeneratedKeys();
            while(rs.next()) {
                cliente.setId(rs.getInt(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE,
                    IErrors.ERROR_SQL_STATEMENT, ex);
        } finally {
            GestionSQL.closedConnection(conn, query);
        }
    }
    
    public List<Clientes> readCliente() {
        
        PreparedStatement query = null;
        ResultSet rs = null;
        
        List<Clientes> clientes = new ArrayList<>();
        
        try {
            query = conn.prepareStatement("SELECT * from clientes");
            rs = query.executeQuery();
            
            while (rs.next()) {
                
                Clientes cliente = new Clientes();
                
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setCodpostal(rs.getString("cp"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setProvincia(rs.getString("provincia"));
                clientes.add(cliente);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, 
                    IErrors.ERROR_SQL_STATEMENT, ex);
        } finally {
            GestionSQL.closedConnection(conn, query, rs);
        }
        return clientes;
    }
    
    /**
     * Método para eliminar un cliente de la base de datos. Para eliminar hay
     * rellenar los campos id y nombre del cliente.
     * 
     * @param cliente
     */
    public void deleteCliente (Clientes cliente) {
        PreparedStatement query = null;
        Connection conn = null;
        try {
            conn = GestionSQL.getConnection();
            query = conn.prepareStatement(DELETE);
            query.setInt(1, cliente.getId());
            query.setString(2, cliente.getNombre());
            query.setString(3, cliente.getApellido());
            query.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE,
                    IErrors.ERROR_SQL_STATEMENT, ex);
        } finally {
            GestionSQL.closedConnection(conn, query);
        } 
    }
    
    /**
     * Método para modificar un cliente en la base de datos. Modifica el cliente 
     * utilizando el ID como filtro/condición.
     * 
     * @param cliente
     */
    public void updateCliente (Clientes cliente){
        PreparedStatement query = null;
        Connection conn = null;
        try {
            conn = GestionSQL.getConnection();
            query = conn.prepareStatement(UPDATE);
            query.setString(1, cliente.getNombre());
            query.setString(2, cliente.getApellido());
            query.setString(3, cliente.getTelefono());
            query.setString(4, cliente.getDireccion());
            query.setString(5, cliente.getCodpostal());
            query.setString(6, cliente.getCiudad());
            query.setString(7, cliente.getProvincia());
            query.setInt(8, cliente.getId());
            query.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE,
                    IErrors.ERROR_SQL_STATEMENT, ex);
        } finally {
            GestionSQL.closedConnection(conn, query);
        } 
    }
}
    
    
    

