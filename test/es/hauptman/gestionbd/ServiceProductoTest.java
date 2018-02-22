/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.gestionbd;

import es.hauptman.entities.Categorias;
import es.hauptman.entities.Productos;
import es.hauptman.vista.PanelProductos;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Diego
 */
public class ServiceProductoTest {
    
    PanelProductos panel;
    
    public ServiceProductoTest(PanelProductos panel) {
        this.panel = panel;
    }

    @Test
    @Ignore
    public void listar() {
        
        ProductosDAO dao = new ProductosDAO();
        
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
        producto.setDescripcion("cafe test");
        producto.setCantidadStock(20);
        producto.setPrecio(10);
        producto.setCategoria(categoria);

        ProductosDAO dao = new ProductosDAO();

        if (dao.createProductos(producto)) {
            System.out.println("Salvo com sucesso!");
        } else {
            fail("Erro ao salvar!");
        }

    }
    
    @Test
    public void testComboBox() {
        
        Categorias categoria = new Categorias();
        categoria = (Categorias) panel.getCboCatProd().getSelectedItem();
        System.out.println(categoria.getID());
    }
    
}
