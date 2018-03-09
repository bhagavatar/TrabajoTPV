/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.acciones;

import es.hauptman.entities.Clientes;
import es.hauptman.entities.DetalleFactura;
import es.hauptman.entities.Facturas;
import es.hauptman.entities.Productos;
import es.hauptman.gestionbd.FacturasDAO;
import es.hauptman.vista.DialogDescuento;
import es.hauptman.vista.DialogFactura;
import es.hauptman.vista.PanelGestVentas;
import es.hauptman.vista.PanelVentas;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class AccionesFacturas {
    PanelVentas panel;
    DialogFactura dialog;
    PanelGestVentas panelGestVentas;
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.GERMANY);

    public AccionesFacturas(PanelVentas panel) {
        this.panel = panel;
    }

    public AccionesFacturas(DialogFactura dialog) {
        this.dialog = dialog;
    }

    public AccionesFacturas(PanelGestVentas panelGestVentas) {
        this.panelGestVentas = panelGestVentas;
    }
        
    public void guardarDetalleFactura(){
        
        //DetalleFactura detalleFactura = new DetalleFactura();
        DetalleFactura detalleFactura;
        Facturas factura = new Facturas();
        Productos producto = new Productos();
        Clientes cliente = new Clientes();
        
        if(!panel.getTxtIDCliente().getText().equals("")){
             cliente.setId(Integer.parseInt(panel.getTxtIDCliente().getText()));
         } 
        
        
        factura.setCliente(cliente);
        factura.setTotal(panel.getSumPrecio());
        if(!panel.getTxtDesc().getText().equals("")){
            double descuento = Double.parseDouble(panel.getTxtDesc().getText());
            factura.setDescuento(descuento/100);
            factura.setTotalConDesc(DialogDescuento.valorPrecioDesc);
        }
        FacturasDAO daoFactura = new FacturasDAO();
        
        DefaultTableModel model = (DefaultTableModel) panel.getTablaVentas().getModel();
        
        for (Productos p : panel.getListaProductosVenta()) {
            detalleFactura = new DetalleFactura();
            detalleFactura.setProducto(p);
            factura.addDetalleFactura(detalleFactura);
        }
        
        daoFactura.createFactura(factura);
    }
    
    public void displayFactura(){
        
        DefaultTableModel model = (DefaultTableModel)dialog
                .getTblDisplayFactura().getModel();
        model.setNumRows(0);
        DetalleFactura detalleFactura = new DetalleFactura();
        
        FacturasDAO dao = new FacturasDAO();
        
        //Recorre la lista del DAO
        for (DetalleFactura f : dao.readFacturaDisplay()) {
            //Añade los valores de la base de datos a la tabla
            model.addRow(new Object[]{
            f.getProducto().getDescripcion(),
            f.getProducto().getCantidadComprada(),
            f.getProducto().getPrecio(),
            f.getSubtotal(),
        });
            //Añade los valores de la base de datos a las etiquetas y campo de texto.
            dialog.getLblNumFactura().setText(String.valueOf(dao.getKey()));
            dialog.getLblClienteNombre().setText(f.getFactura().getCliente().getNombre());
            dialog.getLblClienteApellido().setText(f.getFactura().getCliente().getApellido());
            dialog.getTxtSubtotal().setText(currencyFormatter.format(f.getFactura().getTotal()));
            //FIXME
            if (f.getFactura().getDescuento() != 0){
                //FIXME
                dialog.getTxtTotal().setText(currencyFormatter.format(DialogDescuento.valorPrecioDesc));
                dialog.getTxtDesc().setText(String.valueOf(f.getFactura().getDescuento() * 100));
                
            } else if (f.getFactura().getDescuento() == 0){
                dialog.getTxtTotal().setText(currencyFormatter.format(f.getFactura().getTotal()));
            }
        }
    }
    
    public void searchFactura(int ticketID, int clienteID, String fecha, 
            String nombreCliente, double descuento) {
        
        DefaultTableModel model = (DefaultTableModel) panelGestVentas
                .getTblFacturas().getModel();
        model.setNumRows(0);
        
        FacturasDAO dao = new FacturasDAO();
        //Facturas factura = new Facturas();
        
        for (Facturas f : dao.readFacturaByParameters(ticketID, clienteID, fecha, nombreCliente, descuento)) {
            model.addRow(new Object[]{
            f.getTicketID(),
            f.getCliente().getId(),
            f.getCliente().getNombre(),
            f.getCliente().getApellido(),
            f.getFecha(),
            f.getDescuento(),
            f.getTotal(),
            f.getTotalConDesc()
        });
            
            panelGestVentas.getTxtDetalleIDFactura().setText(String.valueOf(f.getTicketID()));
            
        }
    }
    
       public void getAllFactura() {
        
        DefaultTableModel model = (DefaultTableModel) panelGestVentas
                .getTblFacturas().getModel();
        model.setNumRows(0);
        
        FacturasDAO dao = new FacturasDAO();
        //Facturas factura = new Facturas();
        
        for (Facturas f : dao.readAllFactura()) {
            model.addRow(new Object[]{
            f.getTicketID(),
            f.getCliente().getId(),
            f.getCliente().getNombre(),
            f.getCliente().getApellido(),
            f.getFecha(),
            f.getDescuento(),
            f.getTotal(),
            f.getTotalConDesc()
        });
            
            panelGestVentas.getTxtDetalleIDFactura().setText(String.valueOf(f.getTicketID()));
            
        }
    }
    
    public void getDetalleFactura(int ticketID) {
        
        DefaultTableModel model = (DefaultTableModel)panelGestVentas
                .getTblDetalleFactura().getModel();
        model.setNumRows(0);
        
        FacturasDAO dao = new FacturasDAO();
        DetalleFactura detalleFactura = new DetalleFactura();
        
        //Recorre la lista del DAO
        for (DetalleFactura f : dao.readDetalleFactura(ticketID)) {
            //Añade los valores de la base de datos a la tabla
            model.addRow(new Object[]{
            f.getProducto().getDescripcion(),
            f.getProducto().getCantidadComprada(),
            f.getProducto().getPrecio(),
            f.getSubtotal(),
        });
            
           panelGestVentas.getTxtDetalleNombre().setText(f.getFactura().getCliente().getNombre());
           panelGestVentas.getTxtDetalleApellido().setText(f.getFactura().getCliente().getApellido());
           panelGestVentas.getTxtDetalleTotalCompra().setText(String.valueOf(f.getFactura().getTotal()));
        }
    }
}
