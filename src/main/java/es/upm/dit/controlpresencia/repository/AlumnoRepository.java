package es.upm.dit.controlpresencia.repository;
import org.springframework.data.repository.CrudRepository;

import es.upm.dit.controlpresencia.models.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, String>{
}
