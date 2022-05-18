package com.java.pruebadjava.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.pruebadjava.entities.Afiliados;
import com.java.pruebadjava.services.AfiliadoService;

@RestController
@RequestMapping("/afiliado")
public class ControllerAfiliado {

	@Autowired
	private AfiliadoService afiliadoService;
	
	@GetMapping("/get")
	public List<Afiliados> getAfiliado(){
		return this.afiliadoService.getAfiliados();
	}
	
	@PostMapping("/addAfiliado")
	public Afiliados addAfiliado(@RequestBody Afiliados afiliado) {
		return this.afiliadoService.addAfiliado(afiliado);
	}
	
	@PutMapping(path = "/updateAfiliado")
	public Afiliados updateAfiliado(@RequestBody Afiliados afiliado) {
		return this.afiliadoService.updateAfiliado(afiliado);
	}
	
	@DeleteMapping("/deleteAfiliado")
	public Afiliados deleteAfiliado(@RequestParam("id") String id) {
		return this.afiliadoService.deleteAfiliado(id);
	}
}
