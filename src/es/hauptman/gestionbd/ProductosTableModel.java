/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.gestionbd;

import es.hauptman.entities.Productos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Diego
 */
public class ProductosTableModel extends AbstractTableModel{
    private List<Productos> datos = new ArrayList<>();
    private String[] columnas = {"Categoria", "Producto","Cantidad","Precio"};
    private ProductosDAO dao = new ProductosDAO();
    
    @Override
    public String getColumnName(int column){
        return columnas[column] ;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0:
                return datos.get(rowIndex).getCategoria();
            case 1:
                return datos.get(rowIndex).getDescripcion();
            case 2:
                return datos.get(rowIndex).getCantidadStock();
            case 3:
                return datos.get(rowIndex).getPrecio();
        }
        
        return null;
    }
    
    public void addRow(Productos p){
        this.datos.add(p);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int rowIndex){
        this.datos.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
