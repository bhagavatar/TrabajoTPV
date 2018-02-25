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
import es.hauptman.vista.PanelVentas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class AccionesProductos {
    PanelProductos panelProductos;
    PanelVentas panelVentas;
    

    public AccionesProductos(PanelProductos panel) {
        this.panelProductos = panel;
        
    }

    public AccionesProductos(PanelVentas panelVentas) {
        this.panelVentas = panelVentas;
    }
    
    
    public void guardarProductos(){
        
        Categorias categoria = new Categorias();
        categoria = (Categorias) panelProductos.getCboCatProd().getSelectedItem();
        categoria.setID(categoria.getID());
        
        Productos producto = new Productos();
        producto.setDescripcion(panelProductos.getTxtProducto().getText().trim());
        producto.setCantidadStock(Integer.parseInt(panelProductos.getTxtCtd().
                getText().trim()));
        producto.setPrecio(Double.parseDouble(panelProductos.getTxtPrecio().
                getText().trim()));
        
        producto.setCategoria(categoria);
        
        ProductosDAO dao = new ProductosDAO();
        dao.createProductos(producto);
    }
    
    public void readListaProductos(){
        DefaultTableModel model = (DefaultTableModel) 
                panelProductos.getTablaProductos().getModel();
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
    
    public void getLastCreatedProduct(){
        DefaultTableModel model = (DefaultTableModel) 
                panelProductos.getTablaProductos().getModel();
        ProductosDAO dao = new ProductosDAO();
        Productos producto = new Productos();
        int recienCreado = dao.getKey();
        producto.setID(recienCreado);
        
        for(Productos p : dao.readProductosById(producto))
            model.addRow(new Object[]{
                p.getCategoria().getID(),
                p.getCategoria().getDescripcion(),
                p.getID(),
                p.getDescripcion(),
                p.getCantidadStock(),
                p.getPrecio()
            });
        
    }
    
    public void readProdCatID(){
        
        DefaultTableModel model = (DefaultTableModel) panelProductos
                .getTablaProductos().getModel();
        model.setNumRows(0);
        Categorias categoria = new Categorias();
        categoria = (Categorias) panelProductos.getCboSearchCat().getSelectedItem();
        
        ProductosDAO dao = new ProductosDAO();
        
        for (Productos p : dao.readProductosByCatId(categoria)) {
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
    
    public void readAccionesProdByID(){
        
        DefaultTableModel model = (DefaultTableModel) panelProductos
                .getTablaProductos().getModel();
        model.setNumRows(0);
        Productos producto = new Productos();
        producto = (Productos) panelProductos.getCboSearchProd().getSelectedItem();
        
        ProductosDAO dao = new ProductosDAO();
        
        for (Productos p : dao.readProductosById(producto)) {
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
    
    public void readProdCombo(){
        
        ProductosDAO dao = new ProductosDAO();
        Productos producto = new Productos();
        panelProductos.getCboSearchProd().removeAllItems();
        DefaultComboBoxModel<Object> model = 
                new DefaultComboBoxModel<>(new String[] {"<Producto>"});
        //model.insertElementAt("<Producto>", 0);
        panelProductos.getCboSearchProd().setModel(model);
        
        for (Productos p : dao.readProductos()){
            panelProductos.getCboSearchProd().addItem(p);
        }    
    }
    
    public void editaProducto(){
        
        Categorias categoria = new Categorias();
        categoria.setID(Integer.parseInt(panelProductos.getTxtIdCat().getText()));
        
        Productos producto = new Productos();
        producto.setID(Integer.parseInt(panelProductos.getTxtIdProd().getText().trim()));
        producto.setDescripcion(panelProductos.getTxtProducto().getText().trim());
        producto.setCantidadStock(Integer.parseInt(panelProductos.getTxtCtd().
                getText().trim()));
        producto.setPrecio(Double.parseDouble(panelProductos.getTxtPrecio().
                getText().trim()));
        
        producto.setCategoria(categoria);
        
        ProductosDAO dao = new ProductosDAO();
        dao.update(producto);
        
    }
    //FIXME
    public void updateQdtVenta(){
        ProductosDAO dao = new ProductosDAO();
        List<Productos> listaProd = new ArrayList<>();
        
        for (Productos p : panelVentas.getListaProductosVenta()){
            p.setCantidadStock(p.getCantidadStock() - p.getCantidadComprada());
            listaProd.add(p);
        }
        
       dao.updateCantidad(listaProd);
        
    }
    
    public void eliminaProducto(){
        Productos producto = new Productos();
        ProductosDAO dao = new ProductosDAO();
        producto.setID(Integer.parseInt(panelProductos.getTxtIdProd().getText().trim()));
        dao.delete(producto);
    }
}
