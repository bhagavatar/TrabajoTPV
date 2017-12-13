
package es.hauptman.gestionbd;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que establece la conexión con la Base de Datos.
 * 
 * @author Diego
 */
public class GestionSQL {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SERVER = "jdbc:mysql://localhost:3306/";
    private static final String DATABASE = "tpv?useSSL=false";
    private static final String USERNAME = "tpv_user";
    private static final String PASSWORD = "tpvpwd";
    /**
     * Constructor mínimo.
     */
    public GestionSQL () {
        super();
    }
    
    /**
     * Método para recuperar una conexión a la base de datos.
     * 
     * @return java.sql.Connection conexión o null.
     */
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(SERVER + DATABASE,
                    USERNAME, PASSWORD);
            return conn;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionSQL.class.getName()).log(Level.SEVERE,
                    IErrors.ERROR_SQL_DRIVER, ex);
        } 
        catch (SQLException ex) {
           Logger.getLogger(GestionSQL.class.getName()).log(Level.SEVERE,
                    IErrors.ERROR_SQL_OPEN_CONNECTION, ex);
        }
        return null;
    } 
}


