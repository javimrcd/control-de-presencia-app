package es.upm.dit.controlpresencia.models;
import java.util.Arrays.*;

import javax.persistence.Entity;
import javax.persistence.Id;


import java.time.LocalDateTime;


@Entity
public class ExamenPropuesto {
    @Id
    private String id_examen_propuesto;
    private String asignatura;
    private LocalDateTime fecha_hora_inicio;
    private LocalDateTime fecha_hora_fin;
    private Tipo tipo_examen;
    public enum Tipo{
        PARCIAL, FINAL, RECUPERACION;
        private Tipo() {
        }
    }
    private String aula;
    
    // Constructores
    public ExamenPropuesto() {}
    public ExamenPropuesto(String id_examen_propuesto, String asignatura, LocalDateTime fecha_hora_inicio,
            LocalDateTime fecha_hora_fin, Tipo tipo_examen, String aula) {
        this.id_examen_propuesto = id_examen_propuesto;
        this.asignatura = asignatura;
        this.fecha_hora_inicio = fecha_hora_inicio;
        this.fecha_hora_fin = fecha_hora_fin;
        this.tipo_examen = tipo_examen;
        this.aula = aula;
    }


    // Métodos accesores y modificadores
    public String getId_examen_propuesto() {
        return id_examen_propuesto;
    }
    public void setId_examen_propuesto(String id_examen_propuesto) {
        this.id_examen_propuesto = id_examen_propuesto;
    }
    public String getAsignatura() {
        return asignatura;
    }
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    public LocalDateTime getFecha_hora_inicio() {
        return fecha_hora_inicio;
    }
    public void setFecha_hora_inicio(LocalDateTime fecha_hora_inicio) {
        this.fecha_hora_inicio = fecha_hora_inicio;
    }
    public LocalDateTime getFecha_hora_fin() {
        return fecha_hora_fin;
    }
    public void setFecha_hora_fin(LocalDateTime fecha_hora_fin) {
        this.fecha_hora_fin = fecha_hora_fin;
    }
    public Tipo getTipo_examen() {
        return tipo_examen;
    }
    public void setTipo_examen(Tipo tipo_examen) {
        this.tipo_examen = tipo_examen;
    }
    public String getAula() {
        return aula;
    }
    public void setAula(String aula) {
        this.aula = aula;
    }

    
    // HashCode() y equals()
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_examen_propuesto == null) ? 0 : id_examen_propuesto.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ExamenPropuesto other = (ExamenPropuesto) obj;
        if (id_examen_propuesto == null) {
            if (other.id_examen_propuesto != null)
                return false;
        } else if (!id_examen_propuesto.equals(other.id_examen_propuesto))
            return false;
        return true;
    }
    
}
