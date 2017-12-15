/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.acciones.ventas;

import es.hauptman.vista.PanelVentas;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class AccionesProductos {
    
    private String [] arrayCafes = {"Café Largo", "Café Corto","Cortado", 
        "Café con Leche", "Capuccino", "Carajillo"};
    private String [] arrayInfusiones = {"Té Negro", "Té con Leche", 
        "Chai Latte", "Menta", "Manzanilla"};
    private String [] arrayChocolates = {"Chocolate Suizo", "Taza Grande", 
        "Taza Pequeña"};
    private String [] arrayZumos = {"Natural de Naranja", "Piña", 
        "Melocotón"};
    private HashMap <String, String[]> valoresProd = new HashMap<String, String[]>();
    
    private String[] cafeLargo = new String[]
    {"1",arrayCafes[0],"-","1.00","1.00"};
    private String[] cafeCorto = new String[]
    {"1",arrayCafes[1],"-","0.08","0.80"};
    private String[] cafeCortado = new String[]
    {"1",arrayCafes[2],"-","0.40","0.40"};
    private String[] cafeConLeche = new String[]
    {"1",arrayCafes[3],"-","2.00","2.00"};
    private String[] capuccino = new String[]
    {"1",arrayCafes[4],"-","3.00","3.00"};
    private String[] carajillo = new String[]
    {"1",arrayCafes[5],"-","3.50","3.50"};

    public AccionesProductos() {
        
        valoresProd.put(arrayCafes[0],cafeLargo);
        valoresProd.put(arrayCafes[1],cafeCorto);
        valoresProd.put(arrayCafes[2],cafeCortado);
        valoresProd.put(arrayCafes[3],cafeConLeche);
        valoresProd.put(arrayCafes[4],capuccino);
        valoresProd.put(arrayCafes[5],carajillo);
    }

    public HashMap<String, String[]> getValoresProd() {
        return valoresProd;
    }
    
    
}
