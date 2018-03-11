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
 * Clase que realiza las acciones de Productos.
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
    
    /**
     * Guarda un producto en la base de datos.
     */
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
    
    /**
     * Recupera los productos de la base de datos y los muestra en la JTable 
     * del PanelProductos.
     */
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
    
    /**
     * Metodo que recupera el ID del último Producto creado.
     */
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
    
    /**
     * Método que recupera una Categoria del ComboBox en la clase PanelProductos
     * y muestra sus productos asociados en la JTable.
     */
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
    
    /**
     * Método que recupera un Producto desde el ComboBox en la clase 
     * PanelProductos y lo muestra en la JTable.
     */
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
    
    /**
     * Recupera los productos de la base de datos y los muestra en el ComboBox 
     * de la clase PanelProductos.
     */
    public void readProdCombo(){
        
        ProductosDAO dao = new ProductosDAO();
        Productos producto = new Productos();
        panelProductos.getCboSearchProd().removeAllItems();
        DefaultComboBoxModel<Object> model = 
                new DefaultComboBoxModel<>(new String[] {"<Producto>"});
        panelProductos.getCboSearchProd().setModel(model);
        
        for (Productos p : dao.readProductos()){
            panelProductos.getCboSearchProd().addItem(p);
        }    
    }
    
    /**
     * Método que gestiona la actualizacion los valores de los productos en la base de 
     * datos através de su ID desde la clase PanelProductos.
     */
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

    /**
     * Método que gestiona la actualización en la base de datos la cantidad en 
     * stock del producto vendido através de la clase PanelVentas.
     */
    public void updateQdtVenta(){
        ProductosDAO dao = new ProductosDAO();
        List<Productos> listaProd = new ArrayList<>();
        
        for (Productos p : panelVentas.getListaProductosVenta()){
            p.setCantidadStock(p.getCantidadStock() - p.getCantidadComprada());
            listaProd.add(p);
        }
        
       dao.updateCantidad(listaProd);
        
    }
    
    /**
     * Elimina un producto de base de datos através de su ID desde la clase 
     * PanelProductos.
     */
    public void eliminaProducto(){
        Productos producto = new Productos();
        ProductosDAO dao = new ProductosDAO();
        producto.setID(Integer.parseInt(panelProductos.getTxtIdProd().getText().trim()));
        dao.delete(producto);
    }
}
