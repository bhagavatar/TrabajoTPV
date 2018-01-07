/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.acciones.ventas;

import es.hauptman.entities.Producto;
import java.util.HashMap;

/**
 *
 * @author Diego
 */
public class AccionesProductos {
    //Arrays de las llaves de Categorias para el HashMap.
    private String [] arrayCafes = {"Café Largo", "Café Corto","Cortado","Café con Leche", "Capuccino", "Carajillo"};
    private String [] arrayInfusiones = {"Té Negro", "Té con Leche", "Chai Latte", "Menta", "Manzanilla"};
    private String [] arrayChocolates = {"Chocolate Suizo", "Taza Grande", "Taza Pequeña"};
    private String [] arrayZumos = {"Natural de Naranja", "Piña","Melocotón"};
    
    //Creaamos el HashMap
    private HashMap <String, Object[]> valoresProd = new HashMap<String, Object[]>();
    private HashMap <String, Producto> valoresProdView = new HashMap<String, Producto>();
    
    
    
    //VALORES
    
    //Arrays con los valores de Cafes
    
    private Object[] cafeLargo = new Object[] {1,arrayCafes[0],"-", 1.00, 1.00};
    private Object[] cafeCorto = new Object[] {1,arrayCafes[1],"-",0.80,0.80};
    private Object[] cafeCortado = new Object[] {"1",arrayCafes[2],"-","0.40","0.40"};
    private Object[] cafeConLeche = new Object[] {"1",arrayCafes[3],"-","2.00","2.00"};
    private Object[] capuccino = new Object[] {"1",arrayCafes[4],"-","3.00","3.00"};
    private Object[] carajillo = new Object[] {"1",arrayCafes[5],"-","3.50","3.50"};
    
    //Arrays valores Infusiones
    private String[] teNegro = new String[] {"1",arrayInfusiones[0],"-","0.80", "0.80"};
    private String[] teLeche = new String[] {"1",arrayInfusiones[1],"-","1.00", "1.00"};
    private String[] chaiLatte = new String[] {"1",arrayInfusiones[2],"-","2.00", "2.00"};
    private String[] teMenta = new String[] {"1",arrayInfusiones[3],"-","0.80", "0.80"};
    private String[] teManzanilla = new String[] {"1",arrayInfusiones[4],"-","0.80", "0.80"};
    
    //Arrays valores Chocolates
    private String[] chocolateSuizo = new String[] {"1",arrayChocolates[0],"-","2.00","2.00"};
    private String[] chocolateGrande = new String[] {"1",arrayChocolates[1],"-","1.50","1.50"};
    private String[] chocolatePequeno = new String[] {"1",arrayChocolates[2],"-","1.00","1.00"};
    
    //Arrays valores Zumos
    private String[] zumoNaranja = new String[] {"1",arrayZumos[0],"-","1.00", "1.00"};
    private String[] zumoPina = new String[] {"1",arrayZumos[1],"-","0.80", "0.80"};
    private String[] zumoMelocoton = new String[] {"1",arrayZumos[2],"-","0.80", "0.80"};
    
    public AccionesProductos() {
        
        valoresProdView.put(arrayCafes[0], new Producto(1, "Café Largo", 1, 0, 1.00));
        valoresProdView.put(arrayCafes[1], new Producto(1, "Café Corto", 0, 2.00, 2.00));
        
        //Insertar cafes en el HashMap
        valoresProd.put(arrayCafes[0],cafeLargo);
        valoresProd.put(arrayCafes[1],cafeCorto);
        valoresProd.put(arrayCafes[2],cafeCortado);
        valoresProd.put(arrayCafes[3],cafeConLeche);
        valoresProd.put(arrayCafes[4],capuccino);
        valoresProd.put(arrayCafes[5],carajillo);
        
        
        //Insertar Infusiones en el HashMap
        valoresProd.put(arrayInfusiones[0],teNegro);
        valoresProd.put(arrayInfusiones[1],teLeche);
        valoresProd.put(arrayInfusiones[2],chaiLatte);
        valoresProd.put(arrayInfusiones[3],teMenta);
        valoresProd.put(arrayInfusiones[4],teManzanilla);
        
        //Insertar Chocolates en el HashMap
        valoresProd.put(arrayChocolates[0],chocolateSuizo);
        valoresProd.put(arrayChocolates[1],chocolateGrande);
        valoresProd.put(arrayChocolates[2],chocolatePequeno);
        
        //Insertar Zumos en el HashMap
        valoresProd.put(arrayZumos[0],zumoNaranja);
        valoresProd.put(arrayZumos[1],zumoPina);
        valoresProd.put(arrayZumos[2],zumoMelocoton);
        
    }

    public HashMap<String, Object[]> getValoresProd() {
        return valoresProd;
    }

    public HashMap<String, Producto> getValoresProdView() {
        return valoresProdView;
    }
    
}
