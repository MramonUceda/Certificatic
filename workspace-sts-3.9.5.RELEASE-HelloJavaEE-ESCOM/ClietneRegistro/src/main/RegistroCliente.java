package main;

import com.castillo.jaxws.clientes.Cliente;
import com.castillo.jaxws.clientes.Clientes;
import com.castillo.jaxws.clientes.ClientesImplService;

public class RegistroCliente {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Clientes clientes = new ClientesImplService().getClientesImplPort();
		Cliente  clienteNuevo = new Cliente();
		
		clienteNuevo.setId(Integer.parseInt(args[0]));
		clienteNuevo.setNombre(args[1]);
		clienteNuevo.setApellido(args[2]);
		
		//agregando cliente
		
		clientes.agregarCliente(clienteNuevo);
		

	}

}
