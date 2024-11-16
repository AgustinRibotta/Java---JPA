package persistencia;

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
}
