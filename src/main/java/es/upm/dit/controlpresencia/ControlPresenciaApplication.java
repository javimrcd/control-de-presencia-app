package es.upm.dit.controlpresencia;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.time.LocalDateTime;

import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


import es.upm.dit.controlpresencia.models.Alumno;
import es.upm.dit.controlpresencia.models.ExamenHecho;
import es.upm.dit.controlpresencia.models.ExamenPropuesto;
import es.upm.dit.controlpresencia.models.ExamenPropuesto.Tipo;

import es.upm.dit.controlpresencia.repository.AlumnoRepository;
import es.upm.dit.controlpresencia.repository.ExamenHechoRepository;
import es.upm.dit.controlpresencia.repository.ExamenPropuestoRepository;







@SpringBootApplication
public class ControlPresenciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlPresenciaApplication.class, args);
	}

	@Component
	class dataLoader implements CommandLineRunner{
		@Autowired
		private AlumnoRepository alumnoRepository;
		@Autowired
		private ExamenPropuestoRepository examenPropuestoRepository;
		@Autowired
		private ExamenHechoRepository examenHechoRepository;


		@Override
		public void run(String... args) throws Exception {

			Alumno a1 = new Alumno();
			a1.setDNI("51703330D");
			a1.setEmail("javier.martinez.ranz@alumnos.upm.es");
			a1.setPassword("1234");
			a1.setDireccionMAC("00-00");
			alumnoRepository.save(a1);

			Alumno a2 = new Alumno();
			a2.setDNI("42612221C");
			a2.setEmail("mariofbarredo@alumnos.upm.es");
			a2.setPassword("abcde");
			a2.setDireccionMAC("00-11");
			alumnoRepository.save(a2);
			
			ExamenPropuesto eP1 = new ExamenPropuesto();
			eP1.setId_examen_propuesto("1");
			eP1.setAsignatura("ISST");
			eP1.setFecha_hora_inicio(LocalDateTime.of(2023, 4, 13, 9, 30));
			eP1.setFecha_hora_fin(LocalDateTime.of(2023, 4, 13, 11, 00));
			eP1.setTipo_examen(Tipo.PARCIAL);
			eP1.setAula("A-305");
			examenPropuestoRepository.save(eP1);


			ExamenHecho eH1 = new ExamenHecho();
			eH1.setId_examenHecho("01");
			eH1.setId_examen_propuesto("1");
			eH1.setAlumno("51703330D");
			eH1.setDireccionMAC_examenHecho("00-11");
			eH1.setFecha_hora_inicio_examen_hecho(LocalDateTime.of(2023, 4, 13, 9, 30));
			eH1.setFecha_hora_fin_examen_hecho(LocalDateTime.of(2023, 4, 13, 11, 00));
			Blob imagenBlob_eH1 = img2Blob("javi1");
			eH1.setImagen(imagenBlob_eH1);
			examenHechoRepository.save(eH1);

		}
	}



	public Blob img2Blob(String img) throws IOException, SerialException, SQLException {
        File file = new File("C:/Users/javie/Pictures/Camera Roll/"+img+".jpg");
        FileInputStream inputStream = new FileInputStream(file);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int bytesRead = -1;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
        byte[] imageBytes = outputStream.toByteArray();
        Blob imagenBlob = new javax.sql.rowset.serial.SerialBlob(imageBytes);
        inputStream.close();
        return imagenBlob;

    }

}