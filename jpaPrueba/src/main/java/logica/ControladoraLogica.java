package logica;

import persistencia.ControladoraPersistencia;

public class ControladoraLogica {

    ControladoraPersistencia controladoPersistencia = new ControladoraPersistencia();

    public void createAlumno (Alumno alumno) {
        controladoPersistencia.crearAlumno(alumno);
    }    
        
    public void eliminarAlumno (int id) {
        controladoPersistencia.eliminarAlumno(id);
    }

    public void editarAlumno (Alumno alumno) {
        controladoPersistencia.editarAlumno(alumno);
    }
}
