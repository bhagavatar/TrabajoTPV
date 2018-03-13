/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.acciones;

import es.hauptman.entities.Usuarios;
import es.hauptman.gestionbd.UsuariosDAO;
import es.hauptman.vista.PanelUsuarios;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author mundaka
 */
public class AccionesUsuarios {
    PanelUsuarios panelUsuarios;

    public AccionesUsuarios(PanelUsuarios panelUsuarios) {
        this.panelUsuarios = panelUsuarios;
    }
    
    
    public void guardarUsuarios() {
        UsuariosDAO dao = new UsuariosDAO();
        Usuarios usuario = new Usuarios();
        usuario.setLogin(panelUsuarios.getTxtLogin().getText());
        usuario.setContrasena(panelUsuarios.getTxtContrasena().getText());
        dao.createUsuarios(usuario);
        
    
    }
    
    public void readUsuarios(){
        
        DefaultTableModel model = (DefaultTableModel) panelUsuarios.getTblUsuarios().getModel();
        model.setNumRows(0);
        
        UsuariosDAO dao = new UsuariosDAO();
        
        for(Usuarios u : dao.readUsuarios()){
            model.addRow(new Object[]{
                u.getId(),
                u.getLogin(),
                u.getContrasena()
            });
        }
        
    }
}
