/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.acciones;

import es.hauptman.entities.Productos;
import es.hauptman.gestionbd.ProductosDAO;
import java.util.HashMap;

/**
 *
 * @author Diego
 */
public class AccionesVentas {
    private ProductosDAO dao = new ProductosDAO();
    private HashMap <String, Productos> productosVenta = new HashMap<>();

    public AccionesVentas() {
        productosVenta = dao.readProdVentas();
    }
    
    public HashMap <String, Productos> getProductosVenta() {
        return productosVenta;
    }
    
    
    
}
