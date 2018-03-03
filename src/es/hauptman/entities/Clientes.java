
package es.hauptman.entities;

/**
 * Clase que define la entidad Clientes.
 * 
 * @author Diego
 */
public class Clientes {
    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String ciudad;
    private String provincia;
    private String telefono;
    private String codpostal;
    
    
    
    /**
     * Constructor sin parámetros que define el cliente con id = 0.
     */
    public Clientes() {
        this.id = 0;
    }

    /**
     * Constructor que recibe los parámetros del formulário.
     * 
     * @param id int del ID
     * @param nombre String del nombre
     * @param apellido String del apellido
     * @param direccion String de la dirección
     * @param ciudad String de la ciudad
     * @param provincia String de la província
     * @param telefono int del teléfono
     * @param codpostal int del C.P
     */
    public Clientes(int id, String nombre, String apellido, String direccion, String ciudad, String provincia, String telefono, String codpostal) {    
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.telefono = telefono;
        this.codpostal = codpostal;
    }

    /**
     * Getter del ID del cliente.
     * 
     * @return int id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter del id del cliente.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter del nombre del cliente.
     * 
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del nombre del cliente.
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    @Override
    public String toString() {
        return id + " - " + nombre;
    }

    
}
