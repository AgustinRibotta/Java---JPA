package com.mycompany.jpaprueba;

import java.util.ArrayList;
import java.util.Date;
import logica.Alumno;
import logica.ControladoraLogica;

public class JpaPrueba {

    public static void main(String[] args) {
        
        ControladoraLogica control = new ControladoraLogica();
        
        Alumno alumno = new Alumno(32, "Agustin", "Ribotta", new Date());
        
        control.createAlumno(alumno);

//        control.eliminarAlumno(15);

//        alumno.setApellido("Roberto");
//        control.editarAlumno(alumno);

        Alumno alu = control.traeAlumno(16);
        System.out.println(alu.toString());
        
        ArrayList <Alumno> listaAlumnos = control.traertListaAlumnos();
        
        for (Alumno al : listaAlumnos){
            System.err.println(al);
        }
    }
}
