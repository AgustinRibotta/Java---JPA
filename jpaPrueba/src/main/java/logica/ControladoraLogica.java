package logica;

import persistencia.ControladoraPersistencia;

public class ControladoraLogica {

    ControladoraPersistencia controladoPersistencia = new ControladoraPersistencia();

    public void CreateAlumno (Alumno alumno) {
        controladoPersistencia.crearAlumno(alumno);
    }    
        
        
}
