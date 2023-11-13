

package com.mycompany.utnact1;

import java.util.TreeSet;


public class UTNAct1 {

    public static void main(String[] args) {
        Materia matematica = new Materia();
        matematica.setNombre("Matematica");
        Materia matematica2 = new Materia();
        matematica2.setNombre("Matematica 2");
        Materia analisis1 = new Materia();
        analisis1.setNombre("Analisis 1");
        TreeSet<Materia>correlAnalisis = new TreeSet<>();
        correlAnalisis.add(matematica);
        correlAnalisis.add(matematica2);
        analisis1.setCorrelativas(correlAnalisis);
        
        Alumno alu = new Alumno();
        TreeSet<Materia> aprobadas= new TreeSet<>();
        aprobadas.add(matematica);
        aprobadas.add(matematica2);
        alu.setMatAprob(aprobadas);
        
        Inscripcion insc1 = new Inscripcion(alu, analisis1);
        if(insc1.exitosa()){
            System.out.println("Inscripción exitosa");
        }else{
            System.out.println("No reune las correlativas");
        }
      
    }
}
