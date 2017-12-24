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
public class ProductosTableView {
    private int precio;
    private String descripcion;
    private double cantidad;
    private double descuento;
    private double subtotal;

    public ProductosTableView(int precio, String descripcion, double cantidad, 
            double descuento, double subtotal) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.subtotal = subtotal;
    }
    
    

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
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

    @Override
    public String toString() {
        return "ProductosTableView{" + "precio=" + precio + ", descripcion=" 
                + descripcion + ", cantidad=" + cantidad + ", descuento=" 
                + descuento + ", subtotal=" + subtotal + '}';
    }
    
    
    }