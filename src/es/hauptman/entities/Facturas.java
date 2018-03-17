/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.entities;

import java.util.ArrayList;
import java.util.List;



/**
 * Clase bean de la entidad Facturas.
 * @author Diego
 */
public class Facturas {
    
    private int ticketID;
    private Clientes cliente;
    private double descuento;
    private double total;
    private double totalConDesc;
    private String fecha;
    private DetalleFactura detalleFactura;
    private List<DetalleFactura> listDetalleFacturas;
    
    /**
     * Constructor sin parametros que inicializa el Array 
     * listDetalleFacturas.
     */
    public Facturas() {
        listDetalleFacturas = new ArrayList<DetalleFactura>();
    }

    /**
     * Constructor parametrizado.
     * @param ticketID
     */
    public Facturas(int ticketID) {
        this.ticketID = ticketID;
    }
    
    /**
     * Getter de ticketID.
     * @return ticketID
     */
    public int getTicketID() {
        return ticketID;
    }

    /**
     * Setter de ticketID
     * @param ticketID
     */
    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    /**
     * Getter de cliente
     * @return cliente
     */
    public Clientes getCliente() {
        return cliente;
    }

    /**
     * Setter de cliente
     * @param cliente
     */
    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
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
     * Getter de total.
     * @return total.
     */
    public double getTotal() {
        return total;
    }

    /**
     * Setter de total.
     * @param total
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /** 
     * Getter de totalConDesc.
     * @return totalConDesc.
     */
    public double getTotalConDesc() {
        return totalConDesc;
    }

    /**
     * Setter de totalConDesc
     * @param totalConDesc
     */
    public void setTotalConDesc(double totalConDesc) {
        this.totalConDesc = totalConDesc;
    }
    
    /**
     * Getter de fecha
     * @return fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Setter de fecha.
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Getter de detalleFactura.
     * @return detalleFactura.
     */
    public DetalleFactura getDetalleFactura() {
        return detalleFactura;
    }

    /**
     * Getter de detalleFactura.
     * @param detalleFactura
     */
    public void setDetalleFactura(DetalleFactura detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    /**
     * Getter de listDetalleFacturas.
     * @return listDetalleFacturas
     */
    public List<DetalleFactura> getListDetalleFacturas() {
        return listDetalleFacturas;
    }

    /**
     * Setter de listDetalleFacturas.
     * @param listDetalleFacturas
     */
    public void setListDetalleFacturas(List<DetalleFactura> listDetalleFacturas) {
        this.listDetalleFacturas = listDetalleFacturas;
    }
    
    /**
     * Metodo que define los detalles de una factura los anade en la ArrayList
     * listDetalleFacturas.
     * @param detalleFactura
     */
    public void addDetalleFactura(DetalleFactura detalleFactura){
        
        detalleFactura.setFactura(this);
        listDetalleFacturas.add(detalleFactura);
        
    }
}
