/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FACTURAS;

/**
 *
 * @author Ariel
 */
public class Usuario {
    
   String nombre; 
   String ID; 
   String contra; 
   String user_name; 

    public Usuario() {
    }

    public Usuario(String nombre, String ID, String contra, String user_name) {
        this.nombre = nombre;
        this.ID = ID;
        this.contra = contra;
        this.user_name = user_name;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", ID=" + ID + ", contra=" + contra + ", user_name=" + user_name + '}';
    }
   
   
    
}
