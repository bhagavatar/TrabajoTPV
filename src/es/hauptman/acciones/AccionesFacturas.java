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
import es.hauptman.vista.PanelGestFacturas;
import es.hauptman.vista.PanelVentas;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 * Clase con las acciones relacionada a la Factura y sus detalles.
 * 
 * @author Diego
 */
public class AccionesFacturas {
    PanelVentas panel;
    DialogFactura dialog;
    PanelGestFacturas panelGestVentas;
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.GERMANY);
    DecimalFormat formatDecimal = new DecimalFormat("0.00");

    /**
     * Constructor que recibe PanlVentas.
     * @param panel
     */
    public AccionesFacturas(PanelVentas panel) {
        this.panel = panel;
    }

    /**
     * Constructor que recibe el Diálogo de Factura.
     * @param dialog
     */
    public AccionesFacturas(DialogFactura dialog) {
        this.dialog = dialog;
    }

    /**
     * Constructor que recibe el Panel de Gestón de Facuras.
     * @param panelGestVentas
     */
    public AccionesFacturas(PanelGestFacturas panelGestVentas) {
        this.panelGestVentas = panelGestVentas;
    }
        
    /**
     * Guarda los detalles de una factura en la base de datos.
     */
    public void guardarDetalleFactura(){
        
        DetalleFactura detalleFactura;
        Facturas factura = new Facturas();
        Productos producto = new Productos();
        Clientes cliente = new Clientes();
        
        //Validacion de campo de texto vacio.
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
    
    /**
     * Recupera los detalles de la factura recien creada en el panel de ventas 
     * y muestra en el DilogFactura.
     */
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
            formatDecimal.format(f.getProducto().getPrecio()),
            formatDecimal.format(f.getSubtotal()),
        });
            //Añade los valores de la base de datos a las etiquetas y campo de texto.
            dialog.getLblNumFactura().setText(String.valueOf(dao.getKey()));
            dialog.getLblClienteNombre().setText(f.getFactura().getCliente().getNombre());
            dialog.getLblClienteApellido().setText(f.getFactura().getCliente().getApellido());
            dialog.getTxtSubtotal().setText(currencyFormatter.format(f.getFactura().getTotal()));
            if (f.getFactura().getDescuento() != 0){

                dialog.getTxtTotal().setText(currencyFormatter.format(DialogDescuento.valorPrecioDesc));
                dialog.getTxtDesc().setText(String.valueOf(f.getFactura().getDescuento() * 100));
                
            } else if (f.getFactura().getDescuento() == 0){
                dialog.getTxtTotal().setText(currencyFormatter.format(f.getFactura().getTotal()));
            }
        }
    }
    
    /**
     * Método que permite recuperar las facturas de la BBDD através de 
     * distintos parametros de busqueda y mostrarlos en la tabla de Facturas..
     * @param ticketID
     * @param clienteID
     * @param fecha
     * @param nombreCliente
     * @param descuento
     */
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
            formatDecimal.format(f.getDescuento()),
            formatDecimal.format(f.getTotal()),
            formatDecimal.format(f.getTotalConDesc())
        });
            
            panelGestVentas.getTxtDetalleIDFactura().setText(String.valueOf(f.getTicketID()));
            
        }
    }
    
    /**
     * Recupera todas las facturas y las muestra en la tabla de Facturas 
     * del PanelGestVentas. 
     */
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
            formatDecimal.format(f.getDescuento()),
            formatDecimal.format(f.getTotal()),
            formatDecimal.format(f.getTotalConDesc())
        });
            
            panelGestVentas.getTxtDetalleIDFactura().setText(String.valueOf(f.getTicketID()));
            
        }
    }
    
    /**
     * Recupera los detalles de una factura de la BBDD por el ID y los muestra 
     * en la tabla de detalles del PanelGestVentas.
     * @param ticketID
     */
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
            formatDecimal.format(f.getProducto().getPrecio()),
            formatDecimal.format(f.getSubtotal()),
        });
            
           panelGestVentas.getTxtDetalleNombre().setText(f.getFactura().getCliente().getNombre());
           panelGestVentas.getTxtDetalleApellido().setText(f.getFactura().getCliente().getApellido());
           panelGestVentas.getTxtSubTotal().setText(currencyFormatter.format(f.getFactura().getTotal()));
           panelGestVentas.getTxtDetalleTotalCompra().setText(currencyFormatter.format(f.getFactura().getTotalConDesc()));
        }
    }
    
    /**
     * Elimina una factura de la base de datos.
     */
    public void eliminaFactura() {
        FacturasDAO dao = new FacturasDAO();
        Facturas factura = new Facturas();
        factura.setTicketID(Integer.parseInt(panelGestVentas.getTxtDetalleIDFactura().getText().trim()));
        dao.deleteFactura(factura);
        
    }
}
