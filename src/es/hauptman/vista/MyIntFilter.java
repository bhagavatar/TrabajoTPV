/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.vista;

import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

/**
 * Classe que usa el DocumentFilter para que el campo de texto del PanelVentas 
 * solo accepte integer.
 * @author Diego
 */
public class MyIntFilter extends DocumentFilter{
    PanelVentas panel;

    public MyIntFilter(PanelVentas panel) {
        this.panel = panel;
    }
    
    
     @Override
   public void insertString(FilterBypass fb, int offset, String string,
         AttributeSet attr) throws BadLocationException {

      Document doc = fb.getDocument();
      StringBuilder sb = new StringBuilder();
      sb.append(doc.getText(0, doc.getLength()));
      sb.insert(offset, string);

      if (test(sb.toString())) {
         super.insertString(fb, offset, string, attr);
      } else {
         // warn the user and don't allow the insert
          JOptionPane.showMessageDialog(panel, "Por favor solo números enteros.");
      }
   }

   private boolean test(String text) {
      try {
         if(text.trim().isEmpty()){
             return true;
         }
         Integer.parseInt(text);
         return true;
      } catch (NumberFormatException e) {
         return false;
      }
   }

   @Override
   public void replace(FilterBypass fb, int offset, int length, String text,
         AttributeSet attrs) throws BadLocationException {

      Document doc = fb.getDocument();
      StringBuilder sb = new StringBuilder();
      sb.append(doc.getText(0, doc.getLength()));
      sb.replace(offset, offset + length, text);

      if (test(sb.toString())) {
         super.replace(fb, offset, length, text, attrs);
      } else {
         // warn the user and don't allow the insert
         JOptionPane.showMessageDialog(panel, "Por favor solo números enteros.");
      }

   }

   @Override
   public void remove(FilterBypass fb, int offset, int length)
         throws BadLocationException {
      Document doc = fb.getDocument();
      StringBuilder sb = new StringBuilder();
      sb.append(doc.getText(0, doc.getLength()));
      sb.delete(offset, offset + length);

      if(sb.toString().length() == 0) { 
          super.replace(fb, offset, length, "", null);
      }  else if (test(sb.toString())) { 
          super.remove(fb, offset, length);
      }  else { 
            // warn the user and don't allow the insert  
            JOptionPane.showMessageDialog(panel, "Por favor solo números enteros.");
      }

   }
}
