/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.entities;

/**
 * Clase bean de la entidad Categorias.
 * 
 * @author Diego
 */
public class Categorias {
    private int ID;
    private String descripcion;

    /**
     * Constructor sin parámetros.
     */
    public Categorias() {
    }

    /**
     * Constructor parametrizado.
     * @param descripcion
     */
    public Categorias(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Getter que devuelve el ID
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Setter que accede al Id
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Getter que devuelve la descripción.
     * @return descripcion.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter que accede la descripción.
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return getDescripcion();
    }
    
}
