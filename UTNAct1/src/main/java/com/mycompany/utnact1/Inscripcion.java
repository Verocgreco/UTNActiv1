package com.mycompany.utnact1;

public class Inscripcion {

    private Alumno alumno;
    private Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public Inscripcion() {
    }

    public boolean exitosa() {
        //la materia no posee correlativas
        if (materia.getCorrelativas()==null|| materia.getCorrelativas().isEmpty()) {
            
            return true;
        }
        //el alumno no tiene materias aprobadas
        if(alumno.getMatAprob()==null|| alumno.getMatAprob().isEmpty()){
            return false;
        }
        //recorro la lista de correlativas, y compruebo si todas están
        //contenidas en la lista de mat aprobadas por el alumno
        for (Materia correl : materia.getCorrelativas()) {
            if(!alumno.getMatAprob().contains(correl))
                return false;
            }
        return true;
    }
}
