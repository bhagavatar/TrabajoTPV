/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.acciones;

import es.hauptman.entities.Usuarios;
import es.hauptman.gestionbd.UsuariosDAO;
import es.hauptman.principal.DialogLogin;
import es.hauptman.vista.PanelUsuarios;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author mundaka
 */
public class AccionesUsuarios {
    PanelUsuarios panelUsuarios;
    DialogLogin dialogLogin;

    public AccionesUsuarios(PanelUsuarios panelUsuarios) {
        this.panelUsuarios = panelUsuarios;
    }
    
    public AccionesUsuarios(DialogLogin dialogLogin){
        this.dialogLogin = dialogLogin;
     }
    
    
    public void guardarUsuarios() {
        UsuariosDAO dao = new UsuariosDAO();
        Usuarios usuario = new Usuarios();
        usuario.setLogin(panelUsuarios.getTxtLogin().getText().trim());
        usuario.setContrasena(panelUsuarios.getTxtContrasena().getText().trim());
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
    
    public void updateUsuarios(){
        UsuariosDAO dao = new UsuariosDAO();
        Usuarios usuario = new Usuarios();
        
        int id = Integer.parseInt(panelUsuarios.getTxtIDUsuario().getText());
        
        usuario.setId(id);
        usuario.setLogin(panelUsuarios.getTxtLogin().getText().trim());
        usuario.setContrasena(panelUsuarios.getTxtContrasena().getText().trim());
        
        dao.update(usuario);
        
    }
    
    public void deleteUsuarios(){
        UsuariosDAO dao = new UsuariosDAO();
        Usuarios usuario = new Usuarios();
        
        int id = Integer.parseInt(panelUsuarios.getTxtIDUsuario().getText());
        
        usuario.setId(id);
        dao.deleteUsuarios(usuario);
    }
    
    public boolean checkLogin(){
        boolean check = false;
        UsuariosDAO daoLogin = new UsuariosDAO();
        String login = dialogLogin.getTxtLogin().getText();
        char[] contrasena = dialogLogin.getTxtContrasena().getPassword();
        if(daoLogin.checkLoginDAO(login, contrasena))
            check = true;
        return check;
    }
}
