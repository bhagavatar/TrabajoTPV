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
 * Clase que gestiona las ventas.
 * @author Diego
 */
public class AccionesVentas {
    private ProductosDAO dao = new ProductosDAO();
    //HashMap para guardar los productos recuperados de la base de datos y 
    //hacerlos disponibles para usarlos en las ventas realizadas desde la 
    //clase PanelVentas
    private HashMap <String, Productos> productosVenta = new HashMap<>();

    /**
     * Constructor que guarda los productos de la base de dados en el HashMap.
     */
    public AccionesVentas() {
        productosVenta = dao.readProdVentas();
    }
    
    /**
     * Getter del HashMap con los productos guardados.
     * @return retorna el HashMap productosVenta.
     */
    public HashMap <String, Productos> getProductosVenta() {
        return productosVenta;
    }
    
    
    
}
