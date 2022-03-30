package mx.com.soporteservitec.sistema.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.soporteservitec.sistema.model.Tiendas;
import mx.com.soporteservitec.sistema.repository.RepositoryTiendas;

@RestController
@RequestMapping("/api")
public class ControllerTiendas {
	@Autowired
	RepositoryTiendas repoTiendas;
	@GetMapping("/tiendas")
	public ResponseEntity<List<Tiendas>> getAllTiendas(@RequestParam(required=false)String nombre){
		try {
			List<Tiendas> tiendas = new ArrayList<Tiendas>();
			if(nombre==null)
				repoTiendas.findAll().forEach(tiendas::add);
			else
				repoTiendas.findByNombre(nombre).forEach(tiendas::add);
			if(tiendas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(tiendas,HttpStatus.OK);
			
		}catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
