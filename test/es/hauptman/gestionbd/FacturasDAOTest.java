/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.gestionbd;

import es.hauptman.entities.Categorias;
import es.hauptman.entities.DetalleFactura;
import es.hauptman.entities.Facturas;
import es.hauptman.entities.Productos;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Diego
 */
public class FacturasDAOTest {
    
    public FacturasDAOTest() {
    }

    @Test
    @Ignore
    public void insertFactura() {
        
        Facturas factura = new Facturas();
        
        factura.setTotal(3.00);
        
        
        FacturasDAO dao = new FacturasDAO();
        
        if (dao.createFactura(factura)) {
            System.out.println("Salvo com sucesso!");
        } else {
            fail("Erro ao salvar!");
        }
    }
    
    @Test
    @Ignore
    public void insertDetalleFactura() {
        DetalleFactura detalleFactura = new DetalleFactura();
        Facturas factura = new Facturas();
        Productos producto = new Productos();
        Categorias categoria = new Categorias();
        FacturasDAO daoFactura = new FacturasDAO();
        
        daoFactura.createFactura(factura);
        factura.setTicketID(daoFactura.getKey());
        producto.setID(1);
        categoria.setID(1);
        
        
        detalleFactura.setFactura(factura);
        detalleFactura.setProducto(producto);
        detalleFactura.setCategoria(categoria);
        detalleFactura.setCantidadComprada(2);
        detalleFactura.setSubtotal(2.00);
        
        
        FacturasDAO dao = new FacturasDAO();
        
        if (dao.createFactura(factura)) {
            System.out.println("Salvo com sucesso!");
        } else {
            fail("Erro ao salvar!");
        }
    }
    
    @Test
    public void Factura() {
        
        FacturasDAO dao = new FacturasDAO();
        
        DetalleFactura detalleFactura = new DetalleFactura();
        Facturas factura = new Facturas();
        Productos producto = new Productos();
        Categorias categoria = new Categorias();
        FacturasDAO daoFactura = new FacturasDAO();
        
        producto.setID(1);
        categoria.setID(1);
        producto.setCategoria(categoria);
        
        detalleFactura.setProducto(producto);
        detalleFactura.setCategoria(categoria);
        detalleFactura.setCantidadComprada(2);
        detalleFactura.setSubtotal(2.00);
        
        factura.addDetalleFactura(detalleFactura);
        //FIXME nao pode colocar 2x o mesmo item
        //factura.addDetalleFactura(detalleFactura);
        
        
        if (daoFactura.createFactura(factura)) {
            System.out.println("Salvo com sucesso!");
        } else {
            fail("Erro ao salvar!");
        }
    }
}
