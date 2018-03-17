
package es.hauptman.entities;

/**
 * Clase bean de la entidad Clientes.
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
    public Clientes(int id, String nombre, String apellido, String direccion, 
            String ciudad, String provincia, String telefono, 
            String codpostal) {    
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

    /**
     * Getter del apellido.
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Setter del apellido.
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Getter de direccion del cliente
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * setter de la dirección.
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Getter de ciudad.
     * @return ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Setter de ciudad.
     * @param ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Getter de província.
     * @return província
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Setter de provincia
     * @param provincia.
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * Getter de telefono.
     * @return telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Setter de telefono.
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Getter de codigo postal.
     * @return cod postal.
     */
    public String getCodpostal() {
        return codpostal;
    }

    /**
     * Setter de codigo postal.
     * @param codpostal
     */
    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    @Override
    public String toString() {
        return id + " - " + nombre;
    }

    
}
