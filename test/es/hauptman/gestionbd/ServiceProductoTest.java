/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.gestionbd;

import es.hauptman.entities.Categorias;
import es.hauptman.entities.Productos;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Diego
 */
public class ServiceProductoTest {
    
    public ServiceProductoTest() {
    }

    @Test
    @Ignore
    public void listar() {
        
        ServiceProducto dao = new ServiceProducto();
        
        for (Productos p: dao.readProductos()) {
            System.out.println("Descripcion Producto: "+p.getDescripcion()
                    +"Descripcion Categoria: "+p.getCategoria().getDescripcion());
        }
    }
    
    
    @Test
    @Ignore
    public void inserir() {

        Categorias categoria = new Categorias();
        categoria.setID(1);

        Productos producto = new Productos();
        producto.setDescripcion("Mocaccino");
        producto.setCantidad(20);
        producto.setPrecio(10);
        producto.setCategoria(categoria);

        ServiceProducto dao = new ServiceProducto();

        if (dao.createProductos(producto)) {
            System.out.println("Salvo com sucesso!");
        } else {
            fail("Erro ao salvar!");
        }

    }
    
}
