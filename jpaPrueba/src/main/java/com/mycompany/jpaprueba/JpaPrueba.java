package com.mycompany.jpaprueba;

import java.util.Date;
import logica.Alumno;
import logica.ControladoraLogica;

public class JpaPrueba {

    public static void main(String[] args) {
        
        ControladoraLogica control = new ControladoraLogica();
        
        Alumno alumno = new Alumno(17, "Agustin", "Ribotta", new Date());
        
        control.createAlumno(alumno);

//        control.eliminarAlumno(15);

        alumno.setApellido("Roberto");
        control.editarAlumno(alumno);
        
        
    }
}
