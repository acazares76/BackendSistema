package mx.com.soporteservitec.sistema.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.soporteservitec.sistema.model.clientes;
import mx.com.soporteservitec.sistema.repository.clientesRepository;

@RestController
@RequestMapping("/api")
public class clientesController {
	@Autowired
	clientesRepository repClientes;
	public ResponseEntity<List<clientes>> getAllClientes(@RequestParam(required = false) String nombre){
	
		try {
			List<clientes> cliente = new ArrayList<clientes>();
			if(nombre == null)
				repClientes.findAll().forEach(cliente::add);
			else
				repClientes.findByNombre(nombre).forEach(cliente::add);
		}catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return null;
		
		
	}
}
