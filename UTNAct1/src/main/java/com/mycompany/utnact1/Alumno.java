
package com.mycompany.utnact1;

import java.util.TreeSet;

/**
 *
 * @author veron
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private TreeSet<Materia> matAprob;

    public Alumno(String nombre, String apellido, TreeSet<Materia> matAprob) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matAprob = matAprob;
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TreeSet<Materia> getMatAprob() {
        return matAprob;
    }

    public void setMatAprob(TreeSet<Materia> matAprob) {
        this.matAprob = matAprob;
    }
    
    
  
}
