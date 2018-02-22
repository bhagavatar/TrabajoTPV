/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.acciones;

import es.hauptman.entities.Categorias;
import es.hauptman.gestionbd.CategoriasDAO;
import es.hauptman.vista.PanelProductos;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class AccionesCategorias {
    PanelProductos panel;

    public AccionesCategorias(PanelProductos panel) {
        this.panel = panel;
    }
    
    public void readCboAccionesCategorias(){
        CategoriasDAO dao = new CategoriasDAO();
        Categorias categoria = new Categorias();
        panel.getCboCatProd().removeAllItems();
        panel.getCboSearchCat().removeAllItems();
        DefaultComboBoxModel<Object> model1 = new DefaultComboBoxModel<>(new String[]{"<Categoria>"});
        DefaultComboBoxModel<Object> model2 = new DefaultComboBoxModel<>(new String[]{"<Categoria>"});
        panel.getCboCatProd().setModel(model1);
        panel.getCboSearchCat().setModel(model2);
        
        
        for (Categorias c : dao.readCategoria()){
            panel.getCboCatProd().addItem(c);
            panel.getCboSearchCat().addItem(c);
        }    
    }
    
    public void readAllCategorias(){
        Categorias categoria = new Categorias();
        CategoriasDAO dao = new CategoriasDAO();
        DefaultTableModel model = (DefaultTableModel) panel.getTablaProductos().getModel();
        model.setNumRows(0);
        
        for (Categorias c : dao.readCategoria())
            model.addRow(new Object[]{
                c.getID(),
                c.getDescripcion()
            });
            
    }
    
    public void createAccionesCategorias(){
        CategoriasDAO dao = new CategoriasDAO();
        Categorias categoria = new Categorias();
        categoria.setDescripcion(panel.getTxtCategoria().getText().trim());
        dao.createCategoria(categoria);
    }
    
    public void updateAccionesCategorias(){
        CategoriasDAO dao = new CategoriasDAO();
        Categorias categoria = new Categorias();
        categoria.setDescripcion(panel.getTxtCategoria().getText().trim());
        categoria.setID(Integer.valueOf(panel.getTxtIdCat().getText().trim()));
        dao.update(categoria);
        
    }
    
    public void deleteAccionesCategorias(){
        CategoriasDAO dao = new CategoriasDAO();
        Categorias categoria = new Categorias();
        categoria.setID(Integer.valueOf(panel.getTxtIdCat().getText().trim()));
        dao.delete(categoria);
        
    }
    
    
}
