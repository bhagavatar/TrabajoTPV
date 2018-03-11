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
 * 
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
    
    public Facturas() {
        listDetalleFacturas = new ArrayList<DetalleFactura>();
    }

    public Facturas(int ticketID) {
        this.ticketID = ticketID;
    }
    
    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalConDesc() {
        return totalConDesc;
    }

    public void setTotalConDesc(double totalConDesc) {
        this.totalConDesc = totalConDesc;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public DetalleFactura getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(DetalleFactura detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    public List<DetalleFactura> getListDetalleFacturas() {
        return listDetalleFacturas;
    }

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
