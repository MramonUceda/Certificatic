package main;

import com.castillo.jaxws.clientes.Cliente;
import com.castillo.jaxws.clientes.Clientes;
import com.castillo.jaxws.clientes.ClientesImplService;

public class TestRegistro {
	public static void main(String[] args) {
	
		
		
		clienteNuevo.setId(Integer.parseInt(args[0]));
		clienteNuevo.setNombre(args[1]);
		clienteNuevo.setApellido(args[2]);
		
		//agregando cliente
		
		clientes.agregarCliente(clienteNuevo);
	}

}
