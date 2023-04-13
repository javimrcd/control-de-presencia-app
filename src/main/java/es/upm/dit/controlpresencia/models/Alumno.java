package es.upm.dit.controlpresencia.models;
import java.util.Arrays.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alumno {
    @Id
    private String DNI;
    private String email;
    private String password;
    private String direccionMAC;



    // Constructores
    public Alumno() {}
    public Alumno(String dNI, String email, String password, String direccionMAC) {
        DNI = dNI;
        this.email = email;
        this.password = password;
        this.direccionMAC = direccionMAC;
    }

    // Métodos accesores y modificadores
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getDireccionMAC() {
        return direccionMAC;
    }
    public void setDireccionMAC(String direccionMAC) {
        this.direccionMAC = direccionMAC;
    }

    // HashCode() y equals()
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
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
        Alumno other = (Alumno) obj;
        if (DNI == null) {
            if (other.DNI != null)
                return false;
        } else if (!DNI.equals(other.DNI))
            return false;
        return true;
    }

}