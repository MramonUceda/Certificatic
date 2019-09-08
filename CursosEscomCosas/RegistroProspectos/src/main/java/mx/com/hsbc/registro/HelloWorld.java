package mx.com.hsbc.registro;

import javax.jws.WebService;

@WebService
public interface HelloWorld {

	public String RegistroAlumno(String alumno, String boleta );

	public String sayHi(String string);
	 

}

