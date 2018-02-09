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
    public void createFactura() {
        
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
        factura.addDetalleFactura(detalleFactura);
        
        
        if (daoFactura.createFactura(factura)) {
            System.out.println("Salvo com sucesso!");
        } else {
            fail("Erro ao salvar!");
        }
    }
    
    @Test
    public void readFactura() {
        FacturasDAO dao = new FacturasDAO();
        
        for (DetalleFactura f : dao.readFacturaDisplay()) {
            System.out.println("Ticket ID: " + f.getFactura().getTicketID()+" " 
                    + "Producto: "+f.getProducto()
                            .getDescripcion()+" "+"Nombre Cliente: "
                    + f.getFactura().getCliente().getNombre() +" "+f.getFactura().getCliente().getApellido());
        }
    }
}
