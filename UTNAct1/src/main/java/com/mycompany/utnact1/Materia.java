
package com.mycompany.utnact1;

import java.util.TreeSet;


public class Materia implements Comparable<Materia>{
    private String nombre;
    private TreeSet<Materia> correlativas;

    public Materia(String nombre, TreeSet<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    public Materia() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TreeSet<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(TreeSet<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    
    @Override
    public int compareTo(Materia otra) {
       return this.nombre.compareTo(otra.nombre);
    }
    
    
}
