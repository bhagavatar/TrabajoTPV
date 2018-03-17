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
 * Clase que realiza las acciones de Usuários y Login..
 * @author Diego
 */
public class AccionesUsuarios {
    PanelUsuarios panelUsuarios;
    DialogLogin dialogLogin;

    /**
     * Variable estatica que guarda el nombre de usuário de la session.
     */
    public static String nombreUsuario; 

    /**
     * Constructor que recibe PanelUsuarios.
     * @param panelUsuarios
     */
    public AccionesUsuarios(PanelUsuarios panelUsuarios) {
        this.panelUsuarios = panelUsuarios;
    }
    
    /**
     * Constructor que recibe el Dialogo de Login
     * @param dialogLogin
     */
    public AccionesUsuarios(DialogLogin dialogLogin){
        this.dialogLogin = dialogLogin;
     }
    
    /**
     * Método que recupera informacion del Panel de Usuários y crea Usuários 
     * en la BBDD.
     */
    public void guardarUsuarios() {
        UsuariosDAO dao = new UsuariosDAO();
        Usuarios usuario = new Usuarios();
        usuario.setLogin(panelUsuarios.getTxtLogin().getText().trim());
        usuario.setContrasena(panelUsuarios.getTxtContrasena().getText().trim());
        dao.createUsuarios(usuario);
    }
    
    /**
     * Método que recupera los datos de Usuários de la BBDD y los muestra en 
     * la tabla de usuários.
     */
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
    
    /**
     * Método que lee información de los campos de texto del PanelUsuarios y
     * permite modificar los usuários en la BBDD.
     */
    public void updateUsuarios(){
        UsuariosDAO dao = new UsuariosDAO();
        Usuarios usuario = new Usuarios();
        
        int id = Integer.parseInt(panelUsuarios.getTxtIDUsuario().getText());
        
        usuario.setId(id);
        usuario.setLogin(panelUsuarios.getTxtLoginEditar().getText().trim());
        usuario.setContrasena(panelUsuarios.getTxtContrasenaEditar().getText().trim());
        
        dao.update(usuario);
        
    }
    
    /**
     * Método que lee información de los campos de texto del PanelUsuarios y
     * permite eliminar los usuários de la BBDD.
     */
    public void deleteUsuarios(){
        UsuariosDAO dao = new UsuariosDAO();
        Usuarios usuario = new Usuarios();
        
        int id = Integer.parseInt(panelUsuarios.getTxtIDUsuario().getText());
        
        usuario.setId(id);
        dao.deleteUsuarios(usuario);
    }

    /**
     * Método que hace la autenticación de login de usuário y devuelve un 
     * boolean true si los dados están correctos.
     * @return check
     */
    public boolean checkLogin(){
        boolean check = false;
        UsuariosDAO daoLogin = new UsuariosDAO();
        String login = dialogLogin.getTxtLogin().getText();
        char[] contrasena = dialogLogin.getTxtContrasena().getPassword();
        Usuarios usuarioLogin = new Usuarios();
        usuarioLogin = daoLogin.checkLoginDAO(login, contrasena);
        if(usuarioLogin != null){
            check = true;
            nombreUsuario = usuarioLogin.getLogin();
        }    
        return check;
    }
}
