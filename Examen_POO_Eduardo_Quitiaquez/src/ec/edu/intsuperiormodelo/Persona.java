/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperiormodelo;

import java.util.Date;

/**
 *
 * @author EDUARDO QUITIAQUEZ
 */
public class Persona {
    
    private String nombre;
    private Date fechaNacimiento;
  
    
    public Persona(){
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad(){
        int edad = fechaNacimiento.getYear();
        return edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\n"
                + "Tiene la edad de: " + getedad();
    }
    

        
    }


