package persistencia;

import java.util.ArrayList;
import java.util.List;
import logica.Alumno;

public class ControladoraPersistencia {

    // Instanciamos el controlador de persistencia para interactuar con la base de datos
    AlumnoJpaController aluJpa = new AlumnoJpaController();

    public void crearAlumno(Alumno alumno) {
        aluJpa.create(alumno);
    }

    public void eliminarAlumno(int id) {
        aluJpa.destroy(id);
    }

    public void editarAlumno(Alumno alumno) {
        aluJpa.edit(alumno);
    }

    public Alumno trearAlumno(int id) {
        return aluJpa.findAlumno(id);
    }

    public ArrayList<Alumno> trearListaAlumnos() {
        
//      Convertimos la lista que nos devuelve en aluJpa en Array List
        List<Alumno> listita = aluJpa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(listita);
        
        return listaAlumnos;
    }
}
