/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.entities;

/**
 * 
 * @author Diego
 */
public class Usuarios {
    private int id;
    private String login;
    private String contrasena;
    
    /**
     * Getter de id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter de id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter de login
     * @return login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Setter de login
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Getter de contasena
     * @return contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Setter de contrasena.
     * @param contrasena
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}

