package es.upm.dit.controlpresencia.models;
import java.time.LocalDateTime;
import java.sql.Blob;
import java.util.Arrays.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class ExamenHecho {
    @Id
    private String id_examenHecho;
    private String id_examen_propuesto;
    private String alumno;
    private String direccionMAC_examenHecho;
    private LocalDateTime fecha_hora_inicio_examen_hecho;
    private LocalDateTime fecha_hora_fin_examen_hecho;
    @Lob
    private Blob imagen;
   


    // Constructores
    public ExamenHecho() {}
    public ExamenHecho(String id_examenHecho, String id_examen_propuesto, String alumno,
            String direccionMAC_examenHecho, LocalDateTime fecha_hora_inicio_examen_hecho,
            LocalDateTime fecha_hora_fin_examen_hecho, Blob imagen) {
        this.id_examenHecho = id_examenHecho;
        this.id_examen_propuesto = id_examen_propuesto;
        this.alumno = alumno;
        this.direccionMAC_examenHecho = direccionMAC_examenHecho;
        this.fecha_hora_inicio_examen_hecho = fecha_hora_inicio_examen_hecho;
        this.fecha_hora_fin_examen_hecho = fecha_hora_fin_examen_hecho;
        this.imagen = imagen;
    }

    
    // Métodos accesores y modificadores
    public String getId_examenHecho() {
        return id_examenHecho;
    }
    public void setId_examenHecho(String id_examenHecho) {
        this.id_examenHecho = id_examenHecho;
    }
    public String getId_examen_propuesto() {
        return id_examen_propuesto;
    }
    public void setId_examen_propuesto(String id_examen_propuesto) {
        this.id_examen_propuesto = id_examen_propuesto;
    }
    public String getAlumno() {
        return alumno;
    }
    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }
    public String getDireccionMAC_examenHecho() {
        return direccionMAC_examenHecho;
    }
    public void setDireccionMAC_examenHecho(String direccionMAC_examenHecho) {
        this.direccionMAC_examenHecho = direccionMAC_examenHecho;
    }
    public LocalDateTime getFecha_hora_inicio_examen_hecho() {
        return fecha_hora_inicio_examen_hecho;
    }
    public void setFecha_hora_inicio_examen_hecho(LocalDateTime fecha_hora_inicio_examen_hecho) {
        this.fecha_hora_inicio_examen_hecho = fecha_hora_inicio_examen_hecho;
    }
    public LocalDateTime getFecha_hora_fin_examen_hecho() {
        return fecha_hora_fin_examen_hecho;
    }
    public void setFecha_hora_fin_examen_hecho(LocalDateTime fecha_hora_fin_examen_hecho) {
        this.fecha_hora_fin_examen_hecho = fecha_hora_fin_examen_hecho;
    }
    public Blob getImagen() {
        return imagen;
    }
    public void setImagen(Blob imagen) {
        this.imagen = imagen;
    }

    
    // HashCode() y equals()
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_examenHecho == null) ? 0 : id_examenHecho.hashCode());
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
        ExamenHecho other = (ExamenHecho) obj;
        if (id_examenHecho == null) {
            if (other.id_examenHecho != null)
                return false;
        } else if (!id_examenHecho.equals(other.id_examenHecho))
            return false;
        return true;
    }
    




    
    
   

}