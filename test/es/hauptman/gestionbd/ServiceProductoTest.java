/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.gestionbd;

import es.hauptman.entities.Productos;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego
 */
public class ServiceProductoTest {
    
    public ServiceProductoTest() {
    }

    @Test
    public void listar() {
        
        ServiceProducto dao = new ServiceProducto();
        
        for (Productos p: dao.findAll()) {
            System.out.println("Descripcion Producto: "+p.getDescripcion()
                    +"Descripcion Categoria: "+p.getCategoria().getDescripcion());
        }
    }
    
}
