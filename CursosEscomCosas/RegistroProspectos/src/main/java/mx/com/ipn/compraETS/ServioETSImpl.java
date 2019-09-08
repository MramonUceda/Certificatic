package mx.com.ipn.compraETS;

import javax.jws.WebService;

@WebService(endpointInterface = "mx.com.ipn.compraETS.servicioETS")
public class ServioETSImpl implements servicioETS {

	@Override
	public String RegistroAlumno(String alumno, String boleta) {
		String mensaje = ("Registro de: " + alumno + "No. Boleta: " + boleta);
		return mensaje;
	}

	@Override
	public String GeneraFicha(String materias, int cantidad) {
		String mensaje = "Materias: " + materias + "Cantidad: " + cantidad;
		return mensaje;
	}


}
