package persistencia;

import logica.Alumno;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.io.Serializable;
import java.util.List;

public class AlumnoJpaController implements Serializable {
    
    private final EntityManager em;

    // Constructor que crea un EntityManager desde la unidad de persistencia definida en persistence.xml
    public AlumnoJpaController() {
        this.em = Persistence.createEntityManagerFactory("pruebaJPAPU").createEntityManager();
    }


    // Método para crear un nuevo Alumno
    public void create(Alumno alumno) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(alumno); // Persistir el alumno en la base de datos
            transaction.commit(); // Confirmar la transacción
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback(); // Deshacer la transacción si ocurre un error
            }
            throw e; // Propagar la excepción
        }
    }

    // Método para actualizar un Alumno existente
    public void edit(Alumno alumno) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(alumno); // Actualizar la entidad alumno en la base de datos
            transaction.commit(); // Confirmar la transacción
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback(); // Deshacer la transacción si ocurre un error
            }
            throw e; // Propagar la excepción
        }
    }

    // Método para eliminar un Alumno
    public void destroy(int id) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Alumno alumno = em.find(Alumno.class, id); // Buscar el alumno por su id
            if (alumno != null) {
                em.remove(alumno); // Eliminar el alumno
            }
            transaction.commit(); // Confirmar la transacción
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback(); // Deshacer la transacción si ocurre un error
            }
            throw e; // Propagar la excepción
        }
    }

    // Método para encontrar un Alumno por su id
    public Alumno findAlumno(int id) {
        return em.find(Alumno.class, id); // Buscar alumno por id
    }

    // Método para obtener todos los alumnos
    public List<Alumno> findAlumnoEntities() {
        return em.createQuery("SELECT a FROM Alumno a", Alumno.class).getResultList(); // Obtener todos los alumnos
    }

    // Método para contar cuántos alumnos existen
    public int getAlumnoCount() {
        Long count = em.createQuery("SELECT COUNT(a) FROM Alumno a", Long.class).getSingleResult();
        return count.intValue(); // Retorna la cantidad de alumnos
    }
    
    // Método para cerrar el EntityManager
    public void close() {
        em.close();
    }
}
