package mx.com.ipn.compraETS;

import javax.jws.WebService;


@WebService
public interface servicioETS {
	
	
	
	public String RegistroAlumno(String alumno, String boleta );
	public String GeneraFicha(String materias, int cantidad);
	
	 
}
