/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.acciones.ventas;

import es.hauptman.entities.Productos;
import es.hauptman.gestionbd.ProductosDAO;
import java.util.HashMap;

/**
 *
 * @author Diego
 */
public class AccionesProductos {
    
    private ProductosDAO dao = new ProductosDAO();
    //Creaamos el HashMap
    private HashMap <String, Productos> productosVenta = new HashMap<>();

    public AccionesProductos() {
        
        productosVenta = dao.readProdVentas();
        
    }
    
    public HashMap <String, Productos> getProductosVenta() {
        return productosVenta;
    }
}
