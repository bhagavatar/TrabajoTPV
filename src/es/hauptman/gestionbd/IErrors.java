package es.hauptman.gestionbd;

/**
 * Interfaz con los mensajes de error de SQL.
 *
 * @author Diego
 */
public interface IErrors {

    /**
     * Error en la sentencia.
     */
    public static final String ERROR_SQL_STATEMENT
            = "Error al ejecutar la sentencia SQL.";
    /**
     * Error cerrar conexión.
     */
    public static final String ERROR_SQL_CLOSE_CONNECTION
            = "Error al cerrar la sentencia o conexión.";
    /**
     * Error driver.
     */
    public static final String ERROR_SQL_DRIVER
            = "No se encontró la clase para iniciar la conexión.";
    /**
     * Error abrir conexión.
     */
    public static final String ERROR_SQL_OPEN_CONNECTION
            = "Error al iniciar la conexión de MySQL.";
}
