/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.entities;

/**
 * Clase bean de la entidad Productos.
 * @author Diego
 */
public class Productos {
    private int ID;
    private double precio;
    private String descripcion;
    private int cantidadStock;
    private int cantidadComprada;
    private double subtotal;
    private Categorias categoria;
    
    /**
     * Constructor sin parametros.
     */
    public Productos() {
    }

    /**
     * Getter de ID
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Constructor parametrizado.
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    
    /**
     * Getter de precio.
     * @return precio.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Setter de precio.
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     *
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter de descripción.
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Getter de cantidadStock.
     * @return cantidadStock.
     */
    public int getCantidadStock() {
        return cantidadStock;
    }

    /**
     * Setter de cantidadStock
     * @param cantidadStock
     */
    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    /**
     * Getter de cantidadComprada
     * @return
     */
    public int getCantidadComprada() {
        return cantidadComprada;
    }

    /**
     * Setter de cantidadComprada
     * @param cantidadComprada
     */
    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }
    
    /**
     * Getter de subtotal.
     * @return subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * Setter de subtotal
     * @param subtotal
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * Getter de categoria
     * @return categoria
     */
    public Categorias getCategoria() {
        return categoria;
    }

    /**
     * Setter de categoria.
     * @param categoria
     */
    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
    
    /**
     * Método que retorna un array de Object, sirve para insertar las 
     * líneas (row) en la tabla 
     * del PanelVentas.
     * @return Object[] rowProducto
     */
    public Object[] getRow() {
        //FIXME descuento
        Object[] rowProducto = new Object[] {
            cantidadComprada,
            descripcion,
            precio, 
            subtotal = precio * cantidadComprada
        };
        return rowProducto;
    }
    
    @Override
    public String toString() {
        return getDescripcion();
    }
    
    }
