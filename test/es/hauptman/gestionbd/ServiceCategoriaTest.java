/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.gestionbd;

import es.hauptman.entities.Categoria;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego
 */
public class ServiceCategoriaTest {
    
    public ServiceCategoriaTest() {
    }

    @Test
    public void list() {
        
        ServiceCategoria dao = new ServiceCategoria();
        
        dao.readCategoria().forEach((c) -> {
            System.out.println("Descripción: "+c.getDescripcion());
        });
    }
    
}
