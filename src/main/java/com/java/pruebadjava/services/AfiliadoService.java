package com.java.pruebadjava.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.pruebadjava.entities.Afiliados;
import com.java.pruebadjava.repositories.AfiliadoRepository;

@Service
public class AfiliadoService{
	
	@Autowired
	private AfiliadoRepository afiliadoRepository;
	
	public List<Afiliados> getAfiliados(){
		List<Afiliados> afiliados = new ArrayList<>();
		afiliados = this.afiliadoRepository.findAll();
		return afiliados;
	}
	
	public Afiliados addAfiliado(Afiliados afiliado) {
		this.afiliadoRepository.save(afiliado);
		return afiliado;
	}
	
	public Afiliados updateAfiliado(Afiliados afiliado) {
		this.afiliadoRepository.save(afiliado);
		return afiliado;
	}
	
	public Afiliados deleteAfiliado(String id) {
		Afiliados afiliado = null;
		for (int i = 0; i < this.getAfiliados().size(); i++) {
			if(this.getAfiliados().get(i).getId().equals(id)) {
				afiliado = this.getAfiliados().get(i);
			}
			break;
		}
		if(afiliado != null) {
			this.afiliadoRepository.delete(afiliado);
		}
		return afiliado;
	}
		
}
