/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.acciones;

import es.hauptman.entities.Categorias;
import es.hauptman.entities.Productos;
import es.hauptman.gestionbd.ProductosDAO;
import es.hauptman.vista.PanelProductos;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class AccionesProductos {
    PanelProductos panel;
    

    public AccionesProductos(PanelProductos panel) {
        this.panel = panel;
        
    }
    
    public void guardarProductos(){
        
        Categorias categoria = new Categorias();
        categoria.setID(Integer.parseInt(panel.getTxtIdCat().getText()));
        
        Productos producto = new Productos();
        producto.setDescripcion(panel.getTxtProducto().getText());
        producto.setCantidadStock(Integer.parseInt(panel.getTxtCtd().getText()));
        producto.setPrecio(Double.parseDouble(panel.getTxtPrecio().getText()));
        
        
        producto.setCategoria(categoria);
        
        ProductosDAO dao = new ProductosDAO();
        dao.createProductos(producto);
    }
    
    public void readListaProductos(){
        DefaultTableModel model = (DefaultTableModel) 
                panel.getTablaProductos().getModel();
        model.setNumRows(0);
        
        ProductosDAO dao = new ProductosDAO();
        
        for(Productos p : dao.readProductos()){
            model.addRow(new Object[]{
                p.getCategoria().getID(),
                p.getCategoria().getDescripcion(),
                p.getID(),
                p.getDescripcion(),
                p.getCantidadStock(),
                p.getPrecio()
            });
        }
    }
    
    public void editaProducto(){
        
        Categorias categoria = new Categorias();
        categoria.setID(Integer.parseInt(panel.getTxtIdCat().getText()));
        
        Productos producto = new Productos();
        producto.setID(Integer.parseInt(panel.getTxtIdProd().getText()));
        producto.setDescripcion(panel.getTxtProducto().getText());
        producto.setCantidadStock(Integer.parseInt(panel.getTxtCtd().getText()));
        producto.setPrecio(Double.parseDouble(panel.getTxtPrecio().getText()));
        
        producto.setCategoria(categoria);
        
        ProductosDAO dao = new ProductosDAO();
        dao.update(producto);
        
    }
    
    public void eliminaProducto(){
        Productos producto = new Productos();
        ProductosDAO dao = new ProductosDAO();
        producto.setID(Integer.parseInt(panel.getTxtIdProd().getText()));
        dao.delete(producto);
    }
}
