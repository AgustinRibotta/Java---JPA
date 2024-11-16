package com.mycompany.jpaprueba;

import java.util.Date;
import logica.Alumno;
import logica.ControladoraLogica;

public class JpaPrueba {

    public static void main(String[] args) {
        
        ControladoraLogica control = new ControladoraLogica();
        
        Alumno alumno = new Alumno(16, "Agustin", "Ribotta", new Date());
        
        control.CreateAlumno(alumno);
        
    }
}
