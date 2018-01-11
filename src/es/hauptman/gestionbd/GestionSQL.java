
package es.hauptman.gestionbd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
     * Constructor.
     */
    public GestionSQL () {
        super();
    }
    
    /**
     * Método para recuperar una conexión a la base de datos.
     * 
     * @return
     */
//    public static Connection getConnection(){
//        
//        try {
//            
//            Class.forName(DRIVER);
//            return DriverManager.getConnection(SERVER + DATABASE,
//                    USERNAME, PASSWORD);
//        } 
//        catch (ClassNotFoundException ex) {
//            Logger.getLogger(GestionSQL.class.getName()).log(Level.SEVERE,
//                    IErrors.ERROR_SQL_DRIVER, ex);
//        } 
//        catch (SQLException ex) {
//           Logger.getLogger(GestionSQL.class.getName()).log(Level.SEVERE,
//                    IErrors.ERROR_SQL_OPEN_CONNECTION, ex);
//        }
//        
//    } 
    
    public static Connection getConnection(){
        
        try {
            
            Class.forName(DRIVER);
            return DriverManager.getConnection(SERVER + DATABASE, 
                    USERNAME, PASSWORD);
            
        } catch (ClassNotFoundException ex) {
            
             throw new RuntimeException(IErrors.ERROR_SQL_DRIVER, ex);
             
        } catch (SQLException ex) {
            
             throw new RuntimeException(IErrors.ERROR_SQL_OPEN_CONNECTION, ex);
        }
        
    }
    
    public static void closedConnection(Connection conn){
        
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException ex) {
                System.err.println(IErrors.ERROR_SQL_CLOSE_CONNECTION+ex);
            }
        }
    }
    
    public static void closedConnection(Connection conn, PreparedStatement query){
        
        if(query != null){
            try {
                query.close();
            } catch (SQLException ex) {
                System.err.println(IErrors.ERROR_SQL_STATEMENT+ex);
            }
        }
        
        closedConnection(conn);
    }
    
    public static void closedConnection(Connection conn, PreparedStatement query, ResultSet rs){
        
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println(IErrors.ERROR_SQL_CLOSE_CONNECTION+ex);
            }
        }
        
        closedConnection(conn, query);
    }
}


