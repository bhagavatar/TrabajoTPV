/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.entities;

/**
 * Clase bean de la entidad DetallesFactura que define las propriedades de los
 * detalles de las facturas.
 * @author Diego
 */
public class DetalleFactura {
    
    private double subtotal;
    private double precio;
    private double descuento;
    private Productos producto;
    private Categorias categoria;
    private Facturas factura;
    private int cantidadComprada;

    /**
     * Constructor sin parámetros.
     */
    public DetalleFactura() {
    }

    /**
     * Getter de subtotal.
     * @return subtotal.
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * Setter de subtotal.
     * @param subtotal
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
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
     * Getter de producto.
     * @return producto.
     */
    public Productos getProducto() {
        return producto;
    }

    /**
     * Setter de producto.
     * @param producto
     */
    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    /**
     * Getter de factura.
     * @return factura
     */
    public Facturas getFactura() {
        return factura;
    }

    /**
     * Setter de factura.
     * @param factura
     */
    public void setFactura(Facturas factura) {
        this.factura = factura;
    }

    /**
     * Getter de cantidadComprada.
     * @return cantidadComprada.
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
     * Getter de descuento.
     * @return descuento
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * Setter de descuento.
     * @param descuento
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * Getter de categoria.
     * @return categoria.
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
    
    
    
}
