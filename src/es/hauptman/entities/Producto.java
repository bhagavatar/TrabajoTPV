/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.entities;

/**
 *
 * @author Diego
 */
public class Producto {
    private int ID;
    private double precio;
    private String descripcion;
    private int cantidad;
    private double descuento;
    private double subtotal;
    private Categoria categoria;
    
    
    public Producto() {
    }

    /**
     * Constructor parametrizado sin la Categoria
     * @param precio
     * @param descripcion
     * @param cantidad
     * @param descuento
     * @param subtotal
     */
    public Producto(int precio, String descripcion, int cantidad, 
            double descuento, double subtotal) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.subtotal = subtotal;
    }
    
    /**
     * Constructor parametrizado con la Categoria.
     * @param precio
     * @param descripcion
     * @param cantidad
     * @param descuento
     * @param subtotal
     * @param categoria
     */
    public Producto(int precio, String descripcion, int cantidad, 
            double descuento, double subtotal, Categoria categoria) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.subtotal = subtotal;
        this.categoria = categoria;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "ID=" + ID + ", precio=" + precio + ", "
                + "descripcion=" + descripcion + ", cantidad=" + cantidad 
                + ", descuento=" + descuento + ", subtotal=" + subtotal 
                + ", categoria=" + categoria + '}';
    }
    
    }
