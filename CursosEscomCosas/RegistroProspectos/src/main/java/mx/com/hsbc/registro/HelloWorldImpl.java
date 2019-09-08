
package mx.com.hsbc.registro;

import javax.jws.WebService;

@WebService(endpointInterface = "mx.com.hsbc.registro.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String RegistroAlumno(String alumno, String boleta) {
		// TODO Auto-generated method stub
		String mensaje = "Alumno:" + alumno + "Boleta: " + boleta;
		return mensaje;
	}

	@Override
	public String sayHi(String string) {
		// TODO Auto-generated method stub
		String mensaje=("Hola" + string);
		return mensaje ;
	}


}
